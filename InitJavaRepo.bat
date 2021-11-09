IF "%1"=="" GOTO args_count_wrong
IF "%2"=="" GOTO args_count_wrong

SET GITHUB_ACCESS_TOKEN=%2
SET TARGET_FOLDER=..\yellow-belt-katas\%1
SET REMOTE_REPO=david-mark-meszaros-%1
SET GITHUB_API_URL=https://api.github.ibm.com
SET CURL_CMD=curl -H "Authorization: token %GITHUB_ACCESS_TOKEN%" -H "Accept: application/vnd.github.v3+json"
ECHO TARGET_FOLDER=%TARGET_FOLDER%

IF NOT EXIST "%TARGET_FOLDER%" (mkdir "%TARGET_FOLDER%") ELSE (GOTO folder_already_exists)

XCOPY /s templates\java\template "%TARGET_FOLDER%"

git init "%TARGET_FOLDER%"

CD "%TARGET_FOLDER%"

git add .
git commit -m "Init project"

%CURL_CMD% -X POST %GITHUB_API_URL%/orgs/xpfarm/repos -d "{\"name\":\"%REMOTE_REPO%\"}"
%CURL_CMD% -X PUT %GITHUB_API_URL%/teams/64917/repos/xpfarm/%REMOTE_REPO%
 
git remote add origin git@github.ibm.com:xpfarm/%REMOTE_REPO%.git
git push -u origin master

START /b idea64 .

EXIT /b 0

:args_count_wrong
ECHO ERROR - I need exactly 2 command line arguments: repository name and GitHub access token!
EXIT /b 1

:folder_already_exists
ECHO ERROR - Folder already exists: %TARGET_FOLDER%!
EXIT /b 1