# 🚀 Java Learning Journey — Mohammad

Welcome to my **Java Learning Progress README** — a clean, eye‑catchy summary of everything I’ve learned so far! Perfect for revising, sharing, or adding to my GitHub/Notion.

---

## 🧱 **1. Java Fundamentals**

### 🔹 Basic Structure

* `class` → Blueprint of objects
* `public` → Access modifier
* `static` → Access without creating object
* `void` → Return type (no return)
* `main()` → Entry point of the program

### 🧩 Example:

```java
public class Main {
    static void main(String[] args) {
        System.out.println("Hello Java!");
    }
}
```

---

## 📦 **2. Variables & Data Types**

### 🔹 Primitive Types

* int, double, float, char, boolean, long, short, byte

### 🔹 Reference Types

* String, arrays, objects

---

## 🔤 **3. Strings in Java**

* Strings are **immutable**
* Created using literals or `new` keyword
* Useful methods: `length()`, `charAt()`, `substring()`, `toLowerCase()`

---

## 🔁 **4. Loops**

* `for`
* `while`
* `do-while`

Useful for patterns, arrays, iteration.

---

## 🔀 **5. Conditionals**

* `if`, `else if`, `else`
* `switch`

### 🧩 Example:

```java
class Main{
  static void main() {
    int age = 20;
    if(age > 18) System.out.println("Adult");
  }
}
```

---

## 🧮 **6. Arrays**

* Linear data structure
* Stores similar data types
* Fixed size

### Example:

```java
int[] arr = {1, 2, 3, 4};
```

---

## 🧰 **7. OOP (Object‑Oriented Programming)**

### 🔹 Encapsulation

* Hide data using private variables
* Control with getters & setters

### 🔹 Inheritance

* One class acquiring properties of another

### 🔹 Polymorphism

* Many forms → method overloading and overriding

### 🔹 Abstraction

* Hiding internal details

---

## 🏛 **8. Constructors**

* Special method to initialize objects
* Runs automatically when object is created

```java
class Student{
    String name;
    Student(String name){
        this.name = name;
    }
}
```
---
