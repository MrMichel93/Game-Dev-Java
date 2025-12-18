# Lesson 1: ArrayList for Dynamic Collections

## ArrayList vs Array
- ArrayList can grow/shrink dynamically
- Must import: `import java.util.ArrayList;`
- Generic type: `ArrayList<String>`

## Common Methods
```java
ArrayList<String> list = new ArrayList<>();
list.add("item");           // Add to end
list.add(0, "first");       // Insert at index
list.get(0);                // Access element
list.set(0, "new");         // Replace element
list.remove(0);             // Remove by index
list.remove("item");        // Remove by object
list.size();                // Get size
list.contains("item");      // Check existence
```

## Game Applications
- Dynamic enemy lists (spawn/die)
- Active projectiles
- Particle systems
- Quest logs
