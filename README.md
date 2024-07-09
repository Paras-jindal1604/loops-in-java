## Java Loops 
Welcome to the Java Loops! This repository covers the various types of loops available in Java, including for, while, and do-while loops.
It includes explanations, code examples, and best practices.

## Table of Contents
1. Introduction
2. For Loop
3. While Loop
4. Do-While Loop
5. Nested Loops
6. Enhanced For Loop
7. Break and Continue
8. Patterns printing using Loops
9. Examples

## Introduction
Loops in Java are used to execute a block of code repeatedly until a specified condition is met.
They are fundamental for tasks that require repeated execution, such as iterating through arrays or collections.

## For Loop
The `for loop` is used when the number of iterations is known before entering the loop.

# Syntax
for (initialization; condition; increment/decrement) {
    // statements
}
Example : 
for (int i = 0; i < 10; i++) {
    System.out.println("Numbers from 0 to 9  " + i);
}

## While Loop
The `while loop` is used when the number of iterations is not known and depends on a condition.

# Syntax
while (condition) {
    // statements
}
Example : 
int i = 0;
while (i < 10) {
    System.out.println("Numbers from 0 to 9 " + i);
    i++;
}

## Do-While Loop
The `do-while loop` is similar to the while loop, but it guarantees at least one iteration.

# Syntax
do {
    // statements
} while (condition);
Example : 
int i = 0;
do {
    System.out.println("Numbers from 0 to 9 " + i);
    i++;
} while (i < 10);

## Nested Loops
Loops can be nested within each other to handle more complex tasks.

Example : 
for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++) {
        System.out.println("i: " + i + ", j: " + j);
    }
}

## Enhanced For Loop
The enhanced for loop, also known as the "for-each" loop, is used to iterate over arrays or collections.

# Syntax
for (type element : array/collection) {
    // statements
}
Example : 
int[] numbers = {1, 2, 3, 4, 5};
for (int number : numbers) {
    System.out.println("Number: " + number);
} 

## Break and Continue
# Break
The `break` statement exits the loop immediately.
Example : 
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break;
    }
    System.out.println("Break/exit the loop on reaching 5 " + i);
}

# Continue
The `continue` statement skips the current iteration and proceeds with the next one.
Example : 
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        continue;
    }
    System.out.println("Continue to print numbers from 0 to 9 except 5 " + i);
}

## Examples
This repository includes several example programs demonstrating the use of loops in Java. 

## Contributing
Contributions are welcome! Please fork this repository and submit a pull request for any improvements or additional examples.

Feel free to clone this repository and experiment with the examples to enhance your understanding of loops in Java. Happy coding!







