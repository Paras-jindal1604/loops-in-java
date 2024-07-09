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

For Loop
The for loop is used when the number of iterations is known before entering the loop.

Syntax
java
Copy code
for (initialization; condition; increment/decrement) {
    // statements
}
Example
java
Copy code
for (int i = 0; i < 10; i++) {
    System.out.println("Iteration: " + i);
}
While Loop
The while loop is used when the number of iterations is not known and depends on a condition.

Syntax
java
Copy code
while (condition) {
    // statements
}
Example
java
Copy code
int i = 0;
while (i < 10) {
    System.out.println("Iteration: " + i);
    i++;
}
Do-While Loop
The do-while loop is similar to the while loop, but it guarantees at least one iteration.

Syntax
java
Copy code
do {
    // statements
} while (condition);
Example
java
Copy code
int i = 0;
do {
    System.out.println("Iteration: " + i);
    i++;
} while (i < 10);
Nested Loops
Loops can be nested within each other to handle more complex tasks.

Example
java
Copy code
for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++) {
        System.out.println("i: " + i + ", j: " + j);
    }
}
Enhanced For Loop
The enhanced for loop, also known as the "for-each" loop, is used to iterate over arrays or collections.

Syntax
java
Copy code
for (type element : array/collection) {
    // statements
}
Example
java
Copy code
int[] numbers = {1, 2, 3, 4, 5};
for (int number : numbers) {
    System.out.println("Number: " + number);
}
Break and Continue
Break
The break statement exits the loop immediately.

java
Copy code
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break;
    }
    System.out.println("Iteration: " + i);
}
Continue
The continue statement skips the current iteration and proceeds with the next one.

java
Copy code
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        continue;
    }
    System.out.println("Iteration: " + i);
}
Examples
This repository includes several example programs demonstrating the use of loops in Java. Check out the examples directory to explore them.

Contributing
Contributions are welcome! Please fork this repository and submit a pull request for any improvements or additional examples.

License
This project is licensed under the MIT License - see the LICENSE file for details.

Feel free to clone this repository and experiment with the examples to enhance your understanding of loops in Java. Happy coding!







