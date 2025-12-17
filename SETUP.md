# Development Environment Setup

This guide will help you set up your Java development environment for the Game Dev course.

## Option 1: Processing (Recommended for Beginners)

Processing is a beginner-friendly environment with built-in graphics capabilities.

### Installation Steps

1. **Download Processing**
   - Visit [processing.org/download](https://processing.org/download)
   - Download the version for your operating system
   - Extract and run the Processing application

2. **Set to Java Mode**
   - Open Processing
   - Click the mode dropdown (upper right, says "Java" or "Python")
   - Select "Java" if not already selected

3. **Verify Installation**
   - Create a new sketch (File → New)
   - Type the following code:
   ```java
   void setup() {
     size(800, 600);
     println("Setup complete!");
   }
   
   void draw() {
     background(0);
     fill(255);
     ellipse(mouseX, mouseY, 50, 50);
   }
   ```
   - Click the Run button (play icon)
   - You should see a window with a white circle following your mouse

### Processing Resources
- [Processing Reference](https://processing.org/reference/)
- [Processing Tutorials](https://processing.org/tutorials/)
- [Processing Forum](https://discourse.processing.org/)

## Option 2: IntelliJ IDEA with LibGDX

For students comfortable with IDEs and wanting more professional game dev experience.

### Installation Steps

1. **Install Java Development Kit (JDK)**
   - Download JDK 11 or later from [Oracle](https://www.oracle.com/java/technologies/downloads/) or [AdoptOpenJDK](https://adoptopenjdk.net/)
   - Install following the installer instructions
   - Verify installation:
   ```bash
   java -version
   javac -version
   ```

2. **Install IntelliJ IDEA**
   - Download [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download/) (free)
   - Install following the installer instructions

3. **Setup LibGDX Project**
   - Use the [LibGDX Project Setup Tool](https://libgdx.com/dev/project-generation/)
   - Or use the gdx-liftoff web-based setup
   - Follow the [LibGDX Getting Started Guide](https://libgdx.com/wiki/start/setup)

4. **Verify Installation**
   - Open the generated project in IntelliJ
   - Run the desktop launcher
   - You should see a window with the LibGDX logo

### LibGDX Resources
- [LibGDX Documentation](https://libgdx.com/wiki/)
- [LibGDX Tutorials](https://libgdx.com/wiki/start/a-simple-game)
- [LibGDX Discord](https://discord.gg/libgdx)

## Option 3: Visual Studio Code with Java

Lightweight option for students familiar with VS Code.

### Installation Steps

1. **Install Java Development Kit (JDK)**
   - Same as Option 2 above

2. **Install Visual Studio Code**
   - Download from [code.visualstudio.com](https://code.visualstudio.com/)
   - Install following the installer instructions

3. **Install Java Extensions**
   - Open VS Code
   - Go to Extensions (Ctrl+Shift+X or Cmd+Shift+X)
   - Install "Extension Pack for Java" by Microsoft
   - This includes:
     - Language Support for Java
     - Debugger for Java
     - Java Test Runner
     - Maven for Java
     - Project Manager for Java

4. **Verify Installation**
   - Create a new file `HelloGame.java`
   - Type:
   ```java
   public class HelloGame {
       public static void main(String[] args) {
           System.out.println("Ready to build games!");
       }
   }
   ```
   - Click "Run" that appears above main method
   - You should see output in the terminal

### Adding Graphics Support
For graphics in VS Code, you can:
- Use Processing's core.jar as a library
- Use JavaFX for graphics
- Use lightweight libraries like LWJGL

## Course Code Organization

Regardless of which option you choose, organize your code as follows:

```
Game-Dev-Java/
├── Unit01-Primitive-Types/
│   ├── lessons/
│   ├── practice-problems/
│   │   ├── Problem1.java
│   │   ├── Problem2.java
│   │   └── Problem3.java
│   ├── projects/
│   └── code-examples/
├── Unit02-Using-Objects/
│   └── ... (same structure)
└── ... (other units)
```

## Testing Your Setup

Create and run the following test program to ensure everything works:

```java
// TestSetup.java
public class TestSetup {
    public static void main(String[] args) {
        System.out.println("=== Java Game Dev Setup Test ===");
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Operating System: " + System.getProperty("os.name"));
        System.out.println("\n✓ Java is working!");
        System.out.println("✓ Ready to start game development!");
        
        // Test basic OOP
        Player p = new Player("Hero", 100);
        System.out.println("\n✓ OOP is working!");
        System.out.println(p);
    }
    
    static class Player {
        private String name;
        private int health;
        
        public Player(String name, int health) {
            this.name = name;
            this.health = health;
        }
        
        public String toString() {
            return "Player: " + name + " (HP: " + health + ")";
        }
    }
}
```

Expected output:
```
=== Java Game Dev Setup Test ===
Java Version: 11.0.x (or your version)
Operating System: (your OS)

✓ Java is working!
✓ Ready to start game development!

✓ OOP is working!
Player: Hero (HP: 100)
```

## Troubleshooting

### "javac not found" or "java not found"
- Ensure JDK is installed (not just JRE)
- Add Java to your PATH environment variable
- Restart your terminal/IDE after installation

### Processing won't start
- Check that you have extracted the full Processing folder
- On macOS: Right-click Processing.app → Open (to bypass security)
- On Linux: Ensure execute permissions (`chmod +x processing`)

### IntelliJ can't find JDK
- File → Project Structure → Project → Project SDK
- Click "Add SDK" → "Download JDK" or point to installed JDK

### Import errors in VS Code
- Check that Java extensions are installed
- Reload window (Ctrl+Shift+P → "Reload Window")
- Check Java runtime path in settings

## Ready to Start?

Once your environment is set up, proceed to [Unit 1: Primitive Types](Unit01-Primitive-Types/lessons/Lesson1-Variables-GameState.md) to begin the course!

## Need Help?

- Check the Processing/LibGDX forums linked above
- Review Java installation guides for your specific OS
- Ensure you have the latest version of your chosen IDE
