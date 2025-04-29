# SAPPortal

Simple Java Swing Application to manage students with MySQL Database.

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
