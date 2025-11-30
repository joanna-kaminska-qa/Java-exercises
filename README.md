# Java Exercises

![Java](https://img.shields.io/badge/Java-21-blue)
![Gradle](https://img.shields.io/badge/Gradle-8-green)
![JUnit](https://img.shields.io/badge/JUnit-5.9.3-purple)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen)


This repository contains exercises, homework tasks, and example implementations organized into **five main modules**. The projects cover a wide range of Java topics including Object-Oriented Programming, Collections, Streams, Optional, Exception Handling, and general practice exercises.  

The repository is structured to allow building, running, and testing each module independently using Gradle.

---

## Table of Contents
1. [Module 1: java-basics](#module-1-java-basics)  
2. [Module 2: collections-basics](#module-2-collections-basics)  
3. [Module 3: collections-advanced](#module-3-collections-advanced)  
4. [Module 4: java-stream](#module-4-java-stream)  
5. [Module 5: extra-exercises](#module-5-extra-exercises)  

---

## Module 1: java-basics

**Description:**  
Exercises and homework completed as part of the Kodilla "Automated Tester" Java course, focusing on Object-Oriented Programming (OOP) in Java 21. Covers basics of classes, objects, methods, constructors, arrays, loops, enums, static variables/methods, and control structures. Developed in IntelliJ IDEA.

**Project Structure:**  
```text
kodilla-intro/
├── src/
│   └── main/
│       └── java/
│           ├── AdvCalcApplication.java
│           ├── AdvCalculator.java
│           ├── Application.java
│           ├── Book.java
│           ├── CalcApplication.java
│           ├── Calculator.java
│           ├── Colors.java
│           ├── DebugExample.java
│           ├── FirstClass.java
│           ├── Grades.java
│           ├── HelloWorld.java
│           ├── LeapYear.java
│           ├── Loops.java
│           ├── Main.java
│           ├── MainExtended.java
│           ├── Notebook.java
│           ├── RandomNumbers.java
│           ├── SimpleArray.java
│           ├── User.java
│           └── UserDialogs.java
└── build.gradle, settings.gradle, gradlew, gradlew.bat, LICENSE, README.md
```
**Dependencies (Gradle)**
```
plugins { id 'java' }
group = 'com.kodilla'
version = '1.0-SNAPSHOT'
repositories { mavenCentral() }
dependencies {
    testImplementation platform('org.junit:junit-bom:5.10.0')
    testImplementation 'org.junit.jupiter:junit-jupiter'
}
test { useJUnitPlatform() }
```

**Optional Terminal Commands**

```bash
./gradlew build     # Build project
./gradlew test      # Run tests
./gradlew clean     # Clean project
```
---

## Module 2: collections-basics

**Description:**  
Exercises focusing on Java Collections (List, Set) and interfaces. Covers polymorphism, random object generation, collection operations, and utility methods.

**Project Structure:**  
```text
kodilla-collections/
├── src/main/java/com/kodilla/
│   ├── collections/arrays/
│   │   ├── ShapeApplication.java
│   │   ├── ShapeUtils.java
│   │   └── homework/
│   │       ├── CarsApplication.java
│   │       └── CarUtils.java
│   ├── collections/interfaces/
│   │   ├── Shape.java
│   │   ├── Square.java
│   │   ├── Circle.java
│   │   ├── Triangle.java
│   │   └── homework/
│   │       ├── Car.java
│   │       ├── CarRace.java
│   │       ├── Ford.java
│   │       ├── Opel.java
│   │       └── Toyota.java
│   ├── collections/lists/
│   │   ├── GeneralShapesListApplication.java
│   │   ├── ShapesListApplication.java
│   │   └── homework/
│   │       └── CarsListApplication.java
│   └── collections/sets/
│       ├── Order.java
│       ├── OrderApplication.java
│       └── homework/
│           ├── Stamp.java
│           └── StampsApplication.java
└── test/java/com/kodilla/collections/
```
**Dependencies (Gradle)**
```
plugins { id 'java' }
group = 'com.kodilla'
version = '1.0-SNAPSHOT'
repositories { mavenCentral() }
dependencies {
    testImplementation platform('org.junit:junit-bom:5.10.0')
    testImplementation 'org.junit.jupiter:junit-jupiter'
}
test { useJUnitPlatform() }
```
---

**Test Suites Overview:**  
- **Interfaces:**  
  - Validates area and perimeter calculations for Circle, Square, and Triangle  
  - Checks correct implementation of the Shape interface  
  - Verifies polymorphism and behavior when handling shapes through the interface type  
  - Tests car-related classes (Car, Ford, Opel, Toyota)  
  - Verifies CarRace logic and speed comparisons  
  - Ensures overridden methods work correctly across car subclasses  

- **Arrays:**  
  - Tests array creation and processing logic  
  - Validates the correctness of ShapeUtils (shape → name mapping, printing utilities)  
  - Verifies CarUtils methods, including random car generation and description formatting  
  - Ensures arrays are processed without null or boundary errors  

- **Lists:**  
  - Verifies add/remove operations in lists  
  - Checks list filtering and element iteration  
  - Ensures correct behavior in CarsListApplication  
  - Validates handling of dynamic list modifications  

- **Sets:**  
  - Validates uniqueness of elements  
  - Ensures correct equals() and hashCode() implementation  
  - Tests Stamp and StampsApplication functionality  
---

**Optional Terminal Commands:**  
```bash
./gradlew build
./gradlew test
./gradlew clean
```
---

## Module 3: collections-advanced

**Description**
Exercises on advanced collections, immutability, nested structures, and Maps in Java 21. Includes dictionary module, flights homework, and immutability tasks.

**Project Structure**
```
kodilla-collections-advanced/
├── src/main/java/com/kodilla/collections/adv/
│   ├── exercises/dictionary
│   ├── exercises/homework
│   ├── immutable
│   ├── immutable/homework
│   └── maps/
│       ├── complex
│       └── homework
└── test/java/com/kodilla/collections/adv/
```
**Dependencies (build.gradle):**
```gradle
plugins { id 'java' }
group = 'com.kodilla'
version = '1.0-SNAPSHOT'
repositories { mavenCentral() }
dependencies {
    testImplementation 'org.junit.jupiter:junit-jupiter-api:5.9.3'
    testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.9.3'
}
test { useJUnitPlatform() }
```
---

**Test Suites Overview:**  
- Dictionary Module: Adding words, multimap-like behavior, translation retrieval
- Flight Finder Module: Searching flights by departure/arrival, filtering logic
- Immutability Module: Verify immutable objects, defensive copying
- Maps Module: Nested map operations, value summarization, mapping principals to schools
---

**Optional Terminal Commands:**  
```bash
./gradlew build
./gradlew test
./gradlew clean
```
---

## Module 4: java-stream

**Description**
Exercises on Java Streams, Optional API, and Exception Handling. Covers functional-style programming, null-safety, safe retrieval, and processing collections.

**Project Structure**
```
stream/
├── src/main/java/com/kodilla/
│   ├── exception/
│   ├── optional/
│   └── stream/
└── test/java/com/kodilla/
```
**Dependencies (build.gradle):**
```gradle
plugins { id 'java' }
group = 'com.kodilla'
version = '1.0-SNAPSHOT'
repositories { mavenCentral() }
dependencies {
    testImplementation 'org.junit.jupiter:junit-jupiter-api:5.9.3'
    testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.9.3'
}
test { useJUnitPlatform() }
```
---

**Test Suites Overview:**  
- Exception Module: Handling missing airports, warehouse operations, custom exceptions
- Optional Module: Safe student/teacher lookup, Optional usage, default/fallback values
- Stream Module: Filtering, mapping, reducing, aggregating user and employee data
---

**Optional Terminal Commands:**  
```bash
./gradlew build
./gradlew test
./gradlew clean
```
---

## Module 5: extra-exercises

**Description**
Personal exercises practicing Java basics, arrays, loops, conditional statements, custom methods, OOP, and search algorithms.

**Project Structure**
```
Java-zadania/
├── Arrays.java
├── Rozne.java
├── wyszukiwarkaKsiazek.java
├── build.gradle
├── LICENSE
├── README.md
├── Java-zadania.iml
└── structure.txt
```
**Dependencies (build.gradle):**
```gradle
plugins { id 'java' }
group = 'com.kodilla'
version = '1.0-SNAPSHOT'
repositories { mavenCentral() }
dependencies {
    testImplementation 'org.junit.jupiter:junit-jupiter-api:5.9.3'
    testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.9.3'
}
test { useJUnitPlatform() }
```

**Optional Terminal Commands:**  
```bash
./gradlew build
./gradlew test
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

- Kodilla "Automated Tester" Java course materials
- Java official documentation
- JUnit documentation
- IntelliJ IDEA documentation
- Oracle Streams & Optional documentation
- Stack Overflow



