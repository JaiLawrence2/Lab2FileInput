# Lab2FileInput
This program, I put together as an assignment for my CS232 Computer Programming Class in Java. In this program, I was given a file named "lab2_input.txt" containing a list of students test scores in the range of 0-200 and I had to read the file and skip the top line of the file. The first number in the file specifies the number of grades that it contains and did not need to be included in each of the number ranged bins. Only all numbers on the next line should be counted among those ranges. My program then read in all the grades and counted up the number of students having scores in each of the following ranges: 0-24, 25-49, 50-74, 75-99, 
100-124, 125-149, 150-174, and 175-200.  Finally, my program output the score ranges and the number of scores within each range like the example below.

For example, given the sample file input ...

26
76 89 150 135 200 76 12 100 150 28 178 189 167 200 175 150 87 99 129 149 176 200 87 35 157 189

... the output should resemble the following ...
0-24: 1
25-49: 2
50-74: 0
75-99: 6
100-124: 1
125-149: 3
150-174: 5
175-200: 8
