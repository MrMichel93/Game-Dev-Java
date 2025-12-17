# Project: Stat Display Panel

## Project Overview

Create a comprehensive game statistics display panel that shows player and game information using primitive data types. This project reinforces your understanding of variables, data types, and basic value manipulation.

## Learning Objectives

- Use primitive types (`int`, `double`, `boolean`) to represent game state
- Update variables based on user input and game logic
- Display formatted information using variables
- Implement basic game state management

## Project Requirements

### Part 1: Variable Declaration (Required)

Create variables to track:

**Player Stats:**
- `playerHealth` (int): Current health (0-100)
- `maxHealth` (int): Maximum health (100)
- `armor` (int): Armor value (0-100)
- `level` (int): Player level (1+)
- `experience` (int): Current XP (0-99)
- `experienceToLevel` (int): XP needed for next level (100)

**Game Stats:**
- `score` (int): Player's score
- `timeElapsed` (int): Game time in seconds
- `enemiesDefeated` (int): Total enemies defeated
- `highScore` (int): Best score this session

### Part 2: Display System (Required)

Create a visual display that shows:
1. All player stats clearly labeled
2. All game stats clearly labeled
3. Different colors for different types of information:
   - White: General labels
   - Green: Positive stats (health when > 50%)
   - Yellow: Warning stats (health when 25-50%)
   - Red: Critical stats (health when < 25%)
   - Cyan: XP and level info
   - Gold: Score information

### Part 3: User Controls (Required)

Implement keyboard controls:
- **Arrow Up**: Increase level by 1
- **Arrow Down**: Decrease level by 1 (minimum 1)
- **'H' or 'h'**: Decrease health by 10
- **'E' or 'e'**: Increase experience by 25
- **'S' or 's'**: Increase score by 100
- **'R' or 'r'**: Reset all stats to starting values

### Part 4: Auto-Updates (Required)

Implement automatic updates:
1. **Time Tracking**: Increment `timeElapsed` every 60 frames (~1 second)
2. **Level Up System**:
   - When XP reaches 100, increase level by 1
   - Reset XP to 0
   - Display "LEVEL UP!" message for 3 seconds
   - Restore health to max
3. **High Score**: Update `highScore` whenever `score` exceeds it

### Part 5: Visual Enhancements (Bonus)

Add these optional features:

1. **Health Bar**:
   - Draw a visual bar showing `currentHealth / maxHealth`
   - Green when > 50%, yellow when 25-50%, red when < 25%

2. **Experience Bar**:
   - Draw a visual bar showing `experience / experienceToLevel`
   - Show how close to next level

3. **Flashing Effects**:
   - Flash health text red when below 25%
   - Flash "LEVEL UP!" message when leveling

4. **Statistics Panel**:
   - Draw a border around the stats
   - Add background colors or sections
   - Include icons or symbols

## Starter Code (Processing)

```java
// Game statistics display panel

// Player stats
int playerHealth = 100;
int maxHealth = 100;
int armor = 50;
int level = 1;
int experience = 0;
int experienceToLevel = 100;

// Game stats
int score = 0;
int timeElapsed = 0;
int enemiesDefeated = 0;
int highScore = 0;

// Level up tracking
boolean showLevelUp = false;
int levelUpTimer = 0;

void setup() {
  size(800, 600);
  textSize(20);
}

void draw() {
  background(30, 30, 40);
  
  // TODO: Draw stat panel
  displayStats();
  
  // TODO: Update time
  updateTime();
  
  // TODO: Check for level up
  checkLevelUp();
  
  // TODO: Update high score
  updateHighScore();
}

void displayStats() {
  // TODO: Display all stats with appropriate colors
  
  // Example:
  fill(255);
  text("PLAYER STATS", 50, 50);
  
  // Health with color coding
  // Level and XP
  // Armor
  // etc.
}

void updateTime() {
  // TODO: Increment timeElapsed every 60 frames
}

void checkLevelUp() {
  // TODO: Check if experience >= experienceToLevel
  // If yes: level up, reset XP, heal to full
}

void updateHighScore() {
  // TODO: Update high score if current score is higher
}

void keyPressed() {
  // TODO: Implement all keyboard controls
  
  if (keyCode == UP) {
    // Increase level
  } else if (keyCode == DOWN) {
    // Decrease level (min 1)
  } else if (key == 'h' || key == 'H') {
    // Decrease health
  }
  // ... etc
}
```

## Sample Output Layout

```
╔════════════════════════════════════════╗
║           PLAYER STATS                 ║
║                                        ║
║  Health: ████████████░░░░ 85/100      ║
║  Armor: 50                             ║
║  Level: 5                              ║
║  XP: ████████░░░░░░░░░░ 45/100        ║
║                                        ║
║           GAME STATS                   ║
║                                        ║
║  Score: 1,250                          ║
║  High Score: 1,500                     ║
║  Time: 2:45                            ║
║  Enemies: 23                           ║
║                                        ║
║  [↑/↓] Level  [H] Damage  [E] Gain XP ║
║  [S] Score    [R] Reset                ║
╚════════════════════════════════════════╝
```

## Testing Checklist

Test your project to ensure:

- [ ] All variables are declared with correct types
- [ ] Stats display correctly on screen
- [ ] Arrow keys change level (down doesn't go below 1)
- [ ] 'H' key decreases health (doesn't go below 0)
- [ ] 'E' key increases XP correctly
- [ ] 'S' key increases score
- [ ] 'R' key resets all values
- [ ] Time increments automatically
- [ ] Level up triggers at 100 XP
- [ ] Level up resets XP to 0
- [ ] Level up restores health to max
- [ ] High score updates when score exceeds it
- [ ] Color coding works for health states
- [ ] Bonus features work (if implemented)

## Grading Rubric

| Category | Points | Criteria |
|----------|--------|----------|
| Variables | 20 | All required variables declared with correct types |
| Display | 25 | All stats displayed clearly with labels |
| Controls | 25 | All keyboard controls working correctly |
| Auto-Updates | 20 | Time, level-up, and high score update automatically |
| Code Quality | 10 | Clean code, good naming, appropriate comments |
| **Bonus** | +15 | Visual enhancements (health bar, XP bar, effects) |

**Total: 100 points (115 with bonus)**

## Extension Ideas

Once you've completed the basic requirements, try:

1. **Save System**: Store high score in a text file
2. **Multiple Players**: Track stats for 2 players side-by-side
3. **Achievements**: Add boolean flags for achievements
4. **Difficulty Levels**: Add difficulty setting that affects score multipliers
5. **Sound Effects**: Play sounds on level up or low health

## AP CS A Connection

This project reinforces:
- **Topic 1.1**: Primitive types (int, boolean)
- **Topic 1.2**: Variables and assignment
- **Topic 1.3**: Expressions and operations
- **Topic 2.1**: Objects (String for display)
- **Topic 3.1**: Boolean expressions (health checks)
- **Topic 3.2**: if statements (conditional updates)

These concepts appear frequently in AP exam FRQs!

## Submission

When complete, your program should:
1. Run without errors
2. Display all required information
3. Respond to all specified controls
4. Update values automatically as described
5. Include comments explaining key sections

Good luck!
