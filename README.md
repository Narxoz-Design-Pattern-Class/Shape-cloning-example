# Prototype Pattern – Shape Cloning Example

## Overview

This example demonstrates the **Prototype Pattern** with a simple **Shape** (e.g., `Circle`) that can be **cloned** to produce multiple copies without reconstructing all field values from scratch. It’s useful when creating many similar objects (like identical circles or squares) in a **graphics/editor** context.

### Why Prototype?

- **Repetitive Objects**: If you frequently instantiate the same shape (same radius, color, coordinates), re-calling a constructor can be tedious or error-prone.
- **Performance**: In more advanced scenarios, creating or initializing an object can be expensive. Cloning an existing “prototype” can be faster and more straightforward.
- **Templates**: Keep a “master” shape with default settings (color, border style, etc.). Easily generate multiple clones that share or slightly tweak those properties.

## How to Run

1. **Compile** the Java files (e.g. `Circle.java`, `CloneableShape.java`, `PrototypeDemo.java`):
   ```bash
   javac *.java
