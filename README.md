# Custom-String-Java
A Java project that implements a customizable string manipulation class with advanced text-processing methods such as character removal, capitalization reversal, and alphabetical filtering, along with comprehensive JUnit test cases.
# Custom String Java Project
## Screenshot

![Java Project Screenshot](java.png)
## Overview
This project implements a customizable `CustomString` class in Java that provides advanced string manipulation operations beyond the standard Java `String` class.

The program includes methods for:
- Removing selected alphabetical characters
- Reversing capitalization of selected characters
- Filtering letters based on alphabetical order
- Managing internal string state safely

The project also includes a full JUnit testing suite to validate functionality and edge cases.

---

## Features

### Remove Characters
Removes specified alphabetical characters from the current string (case-insensitive).

Example:
```java
CustomString str = new CustomString();
str.setString("my lucky numbers are 6, 8, and 19.");

System.out.println(str.remove("ra6"));
```

Output:
```text
my lucky numbes e 6, 8, nd 19.
```

---

### Reverse Capitalization
Reverses capitalization for selected alphabetical characters.

Example:
```java
CustomString str = new CustomString();
str.setString("abc, XYZ; 123.");

System.out.println(str.reverse("bcdxyz@3210."));
```

Output:
```text
aBC, xyz; 123.
```

---

### Filter Letters
Filters letters greater than/equal to or less than/equal to a selected character.

Example:
```java
CustomString str = new CustomString();
str.setString("Hello 90, bye 2");

System.out.println(str.filterLetters('h', false));
```

Output:
```text
llo 90, y 2
```

---

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- JUnit 5
- Eclipse IDE

---

## Project Structure

```text
customstring/
│
├── CustomString.java
└── CustomStringTest.java
```

---

## Concepts Demonstrated

- Classes and Objects
- Encapsulation
- String Processing
- Loops and Conditionals
- Character Manipulation
- Unit Testing with JUnit
- Edge Case Handling

---

## Testing

This project uses JUnit 5 to test:
- Normal functionality
- Null input handling
- Empty strings
- Uppercase/lowercase behavior
- Invalid inputs
- Edge cases

Example test:
```java
@Test
void testReverse() {
    this.myCustomString.setString("JAVA");
    assertEquals("java", this.myCustomString.reverse("java"));
}
```

---

## How to Run

1. Clone the repository:
```bash
git clone https://github.com/yourusername/custom-string-java.git
```

2. Open the project in Eclipse or IntelliJ IDEA

3. Run `CustomStringTest.java` as a JUnit Test

---

## Author

Carlos Navarro Naranjo

---

## License

This project is open-source and available for educational purposes.
