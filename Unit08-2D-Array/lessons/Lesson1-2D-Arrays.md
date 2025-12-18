# Lesson 1: 2D Arrays for Game Grids

## 2D Array Basics
```java
// Declaration
int[][] grid = new int[rows][cols];

// Initialization
int[][] map = {
    {1, 0, 1},
    {0, 0, 0},
    {1, 0, 1}
};

// Access
int value = map[row][col];
map[0][0] = 1;
```

## Traversing 2D Arrays
```java
for (int r = 0; r < grid.length; r++) {
    for (int c = 0; c < grid[r].length; c++) {
        System.out.print(grid[r][c]);
    }
    System.out.println();
}
```

## Game Applications
- Tile maps
- Board games
- Pathfinding grids
- Minimap data
