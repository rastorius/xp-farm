# Project initialization
* :D - Rename rootProject.name in settings.gradle
* :D - Rename template package
* :D - Rename solution singleton class and its test class

# Requirements
https://www.codewars.com/kata/576757b1df89ecf5bd00073b

Return an array based on input n.
- array should have n elements  
- every element has 2n - 1 length  
- in every i element contains 2i - 1 stars, center aligned

# Plans
Pomodoro 2  
- DONE - Test cases (No input validation based on description)  
- DONE - At least 1 TDD cycle

# Test cases
- DONE - 1 -> ["*"]
- DONE - 2 -> [" * ", "***"]
- DONE- 3 -> ["  *  ", " *** ", "*****"]

# Tech debt
- DONE - Refactor to parameterized test