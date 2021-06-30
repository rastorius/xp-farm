# Project initialization
* :D - Rename rootProject.name in settings.gradle
* :D - Rename template package
* :D - Rename solution singleton class and its test class

# Test cases
* :D - 1 -> 0.5
* :D - 2 -> 2.0
* :D - 3 -> 4.5
* :( - 7 -> 24.5

# Implementation ideas
:D - ***get_length function***  
Input: triangle string  
Output: length of triangle's side

:D - ***t_area function***  
Calls calculate_area with get_length

:D - ***calculate_area function***  
area(1) = 0.5  
area(n + 1) = area(n) + n - 0.5