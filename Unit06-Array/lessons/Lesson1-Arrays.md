# Lesson 1: Arrays in Games

## Array Basics
```java
// Declaration and initialization
int[] scores = new int[10];
String[] names = {"Alice", "Bob", "Charlie"};
double[] positions = {100.5, 200.3, 300.7};

// Access elements
scores[0] = 100;
String first = names[0];

// Array length
int size = scores.length;
```

## Traversing Arrays
```java
// Standard for loop
for (int i = 0; i < array.length; i++) {
    System.out.println(array[i]);
}

// Enhanced for loop
for (int value : array) {
    System.out.println(value);
}
```

## Game Applications
- Store multiple enemies
- Track player inventory
- High score lists
- Level data
