# SAPPortal 🎓
[![Java](https://img.shields.io/badge/Java-17-blue.svg)](https://www.oracle.com/java/)  
[![MySQL](https://img.shields.io/badge/Database-MySQL-yellow.svg)](https://www.mysql.com/)  
[![Maven](https://img.shields.io/badge/Build-Maven-FF6F00.svg)](https://maven.apache.org/)  
[![License: MIT](https://img.shields.io/badge/License-MIT-green.svg)](https://opensource.org/licenses/MIT)  
[![IDE: IntelliJ](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-red.svg)](https://www.jetbrains.com/idea/)

A **Standalone Java Application** for managing student details with a **GUI** built using **Swing** and a **MySQL database** backend.  
Created as a part of the **OOPS Project** at UPES.

## Technologies Used
- Java 21
- Swing GUI
- MySQL Database
- Maven Build Tool
- JUnit5 for Testing
- Git/GitHub for Version Control

## Setup Instructions
1. Create MySQL Database:
    - Run `docs/db/schema.sql`
2. Update database credentials inside `DatabaseConnection.java`.
3. Build Project:
    ```bash
    mvn clean install
    mvn package
    ```
4. Run Project:
    ```bash
    java -jar target/SAPPortal-1.0-SNAPSHOT.jar
    ```

## Author
Ananya Rana
