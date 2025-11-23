# Java Exercises Repository

![Java](https://img.shields.io/badge/Java-21-blue)
![Gradle](https://img.shields.io/badge/Gradle-8-green)
![JUnit](https://img.shields.io/badge/JUnit-5.9.3-purple)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen)

---

This repository contains **personal Java exercises and homework** implemented as part of self-practice.  
It includes various small projects to practice:

- Java basics and arrays
- Loops and conditional statements
- Custom methods and classes
- Searching algorithms
- Object-oriented programming (OOP)

All exercises are configured with **Gradle**, allowing easy building and running from the terminal.

---

## Project Structure

```
Java-zadania/
│ Arrays.java
│ Rozne.java
│ wyszukiwarkaKsiazek.java
│ LICENSE
│ README.md
│ build.gradle
│ Java-zadania.iml
│ structure.txt
│
├── .gradle/
├── .idea/
├── build/
└── out/
```
- **Arrays.java** – exercises with arrays and loops
- **Rozne.java** – miscellaneous practice exercises
- **wyszukiwarkaKsiazek.java** – simple book search logic
- **build.gradle** – Gradle build file
- **structure.txt** – folder structure reference
---

## Getting Started

### Requirements

- Java 21
- Gradle (wrapper included)
- IntelliJ IDEA (optional, recommended)

---

### Dependencies (Gradle)

JUnit 5.9.3 – for running unit tests
```
dependencies {
testImplementation 'org.junit.jupiter:junit-jupiter:5.9.3'
}
```

Gradle handles compilation, building, and running Java applications.

---

### Optional Terminal Commands

**Build project**
```bash
./gradlew build
```
**Run tests**
```bash
./gradlew test
```
**Clean project**
```bash
./gradlew clean
```

---

## Authors

Created by:

**Joanna Kamińska**  
GitHub: https://github.com/joanna-kaminska-qa

---

## Version History

- **0.2** – README added, improved structure
- **0.1** – Initial upload

---

## License

This project is licensed under the **MIT License**.  
See the `LICENSE` file for details.

---

## Acknowledgments

- Java official documentation
- IntelliJ IDEA
- Stack Overflow