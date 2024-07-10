# Report for Assignment 1 resit

## Project chosen

Name: pedrovgs/Algorithms

URL: https://github.com/pedrovgs/Algorithms

Number of lines of code and the tool used to count it: 6 kloc, lizard

Programming language: Java

## Coverage measurement with existing tool

The tool that I used is the built in Intellij Coverage tool. I used it on the whole/all tests folder.

![no alt](https://github.com/Jus1311/Algorithms/blob/master/images/coverage.png)

## Coverage improvement

### Individual tests

Function 1: hashCode
Test 1: binarynodetest

https://github.com/Jus1311/Algorithms/blob/master/src/main/java/com/github/pedrovgs/binarytree/BinaryNode.java
https://github.com/Jus1311/Algorithms/commit/328321eae08fe6de933d824135d3cb7f4278763e

Old Coverage:
![no alt](https://github.com/Jus1311/Algorithms/blob/master/images/Oldcoverage1%20ver1.png)
![no alt](https://github.com/Jus1311/Algorithms/blob/master/images/Oldcoverage1%20ver2.png)

New Coverage:
![no alt](https://github.com/Jus1311/Algorithms/blob/master/images/Newcoverage1%20ver1.png)
![no alt](https://github.com/Jus1311/Algorithms/blob/master/images/Newcoverage1%20ver2.png)

The reason why I have two images for each old coverage and new coverage is because the first image is the original code with ?, I just changed it to if else statement so that it's easier to understand or explain. You can see the red bar or green bar at the left side which means branch is not covered (red) and and covered (green), thus making the red bar become green means that the coverage is improved depending on how many are covered.

<State the coverage improvement with a number and elaborate on why the coverage is improved>
The reason the coverage was improved was due to the binarynodetest class increases the coverage of the hashCode function in the BinaryNode class by testing it under different conditions, which are testHashCodeWithNoChildren, testHashCodeWithChildren, and testHashCodeConsistency. The ? operator in programming is a ternary operator that acts as a shorthand for an if-else statement, so basically it means that there is 4 branches, in the old coverage, it's 0/4 which means 0% and now with the new coverage, it's 4/4 which means 100%. The testHashCodeWithNoChildren checks hash codes for nodes without kids (children nodes of a binary tree node), testHashCodeWithChildren for nodes with kids (children nodes of a binary tree node), and testHashCodeConsistency ensures same data means same hash code.

Function 2: addNodeToStack
Test 2: addnodetostacktest

https://github.com/Jus1311/Algorithms/commit/b764b5f5667554be19c5ea39b3603ca9a5344f9b
https://github.com/Jus1311/Algorithms/commit/a76f078adab88e846f50fc7aee86ab3aa1c5b4d4

Old Coverage:
![no alt](https://github.com/Jus1311/Algorithms/blob/master/images/oldcoveragefunction2.png)

New Coverage:
![no alt](https://github.com/Jus1311/Algorithms/blob/master/images/newcoveragefunction2.png)

<State the coverage improvement with a number and elaborate on why the coverage is improved>
The reason the coverage was improved was due to The addnodetostacktest class increases the coverage of the addNodeToStack function in the BinaryTreeEquals class by testing it under different conditions, which are testAddNodeToStackWithNonNullNode, and testAddNodeToStackWithNullNode. In the old coverage, it's 1/2 which means 50% and now with the new coverage, it's 2/2 which means 100%. The testAddNodeToStackWithNonNullNode ensures a non-null binary node is added to the stack, while testAddNodeToStackWithNullNode confirms the stack stays empty when trying to add a null node.

### Overall

Old Coverage:
![no alt](https://github.com/Jus1311/Algorithms/blob/master/images/coverage.png)

New Coverage:
<Provide a screenshot of the new coverage results by running the existing tool using all test modifications>

![no alt](https://github.com/Jus1311/Algorithms/blob/master/images/nfcoverage.png)
