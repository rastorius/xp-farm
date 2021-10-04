IF "%1"=="" GOTO args_count_wrong

SET TARGET_FOLDER="..\yellow-belt-katas\%1"
ECHO TARGET_FOLDER=%TARGET_FOLDER%

IF NOT EXIST "%TARGET_FOLDER%" (mkdir "%TARGET_FOLDER%") ELSE (GOTO folder_already_exists)

XCOPY /s templates\java\template "%TARGET_FOLDER%"

EXIT /b 0

:args_count_wrong
ECHO ERROR - I need exactly one command line arguments: repository name!
EXIT /b 1

:folder_already_exists
ECHO ERROR - Folder already exists: %TARGET_FOLDER%!
EXIT /b 1