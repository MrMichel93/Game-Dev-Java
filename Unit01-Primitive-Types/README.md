# Unit 1: Primitive Types - Game State Fundamentals

## Unit Overview

This unit introduces Java's primitive data types in the context of game development. You'll learn how variables store game state, perform calculations for game mechanics, and use operators to create interactive systems.

## AP CS A Alignment

- **Topic 1.1:** Primitive Types
- **Topic 1.2:** Variables and Assignments  
- **Topic 1.3:** Expressions and Assignment Statements
- **Topic 1.4:** Compound Assignment Operators

## Learning Objectives

By the end of this unit, you will be able to:
1. Declare and initialize variables using primitive types (int, double, boolean)
2. Use arithmetic operators to perform game calculations
3. Apply compound assignment operators (+=, -=, etc.)
4. Distinguish between different numeric types and choose appropriately
5. Track game state using primitive variables

## Unit Contents

### Lessons
- [Lesson 1: Variables and Game State](lessons/Lesson1-Variables-GameState.md)
  - Primitive data types in Java
  - Variable declaration and initialization
  - Using variables to track game state
  - Python vs Java comparison

### Practice Problems
1. [Health System](practice-problems/Problem1_HealthSystem.java) - Write a health management system
2. [Debug Position System](practice-problems/Problem2_DebugPosition.java) - Fix boundary checking bugs
3. [Combo Scoring](practice-problems/Problem3_ComboScoring.java) - Enhance a scoring system with combo tracking

### Code Examples
- [ScoreTracker.java](code-examples/ScoreTracker.java) - Complete working example of score tracking

### Projects
- [Stat Display Panel](projects/StatDisplayPanel.md) - Build a comprehensive game statistics display

## Key Concepts

### Primitive Types
- `int` - whole numbers (score, health, count)
- `double` - decimal numbers (position, velocity)
- `boolean` - true/false flags (isAlive, gameOver)
- `char` - single characters

### Operators
- Arithmetic: `+`, `-`, `*`, `/`, `%`
- Compound: `+=`, `-=`, `*=`, `/=`
- Increment/Decrement: `++`, `--`
- Comparison: `==`, `!=`, `<`, `>`, `<=`, `>=`

### Game Applications
- **Score Tracking:** Using int variables
- **Position Coordinates:** Using double for precision
- **Game State Flags:** Using boolean for conditions
- **Health Systems:** Calculations and bounds checking

## AP Exam Connection

### Multiple Choice Topics
- Variable declaration and initialization
- Operator precedence
- Type compatibility
- Integer division vs floating-point division

### FRQ Patterns
- Declaring variables within methods
- Performing calculations
- Updating state variables
- Enforcing constraints (min/max values)

## Getting Started

1. Read [Lesson 1: Variables and Game State](lessons/Lesson1-Variables-GameState.md)
2. Review the [ScoreTracker example](code-examples/ScoreTracker.java)
3. Complete the three practice problems
4. Build the Stat Display Panel project

## Prerequisites

- Basic programming concepts (variables, assignment)
- Algebra I (for arithmetic operations)
- Completed [SETUP.md](../SETUP.md) environment setup

## Next Unit

After mastering primitive types, move on to [Unit 2: Using Objects](../Unit02-Using-Objects/README.md) to learn how to work with pre-existing classes and object references.

## Resources

- [Processing Reference](https://processing.org/reference/)
- [Java Primitives Documentation](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
- [AP CS A Course Description](https://apcentral.collegeboard.org/courses/ap-computer-science-a)
