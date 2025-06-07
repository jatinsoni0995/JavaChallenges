# University Management System > AdvancedExamples/UniversityManagementSystem/README.md

A Java-based project from MCA 2022, revived in 2025. Manages university user accounts using MySQL and WampServer. 

## Features 
- User registration with username, name, password, security question, and answer. 
- MySQL database integration via WampServer. 
- GUI support with rs2xml.jar for displaying data in JTable.
  
## Requirements 
- **WampServer**: For local MySQL database hosting.
- **MySQL Connector for Java**: To connect Java app to MySQL (e.g., mysql-connector-java-8.0.33.jar). 
- **rs2xml.jar**: For displaying database results in JTable (GUI). 
- **IntelliJ IDEA**: IDE used for coding and running the project. 
- **Java JDK**: Version 8 or higher.
  
## Setup Instructions 
1. Install WampServer and start MySQL service.
2. Download and add MySQL Connector JAR and rs2xml.jar to project (lib/ folder). 
3. Create database in phpMyAdmin: `CREATE DATABASE ums;` 
4. Run `sql/ums.sql` to create `users` table. 
5. Open project in IntelliJ IDEA. 
6. Configure DB connection in `application.properties` or Java code (e.g., JDBC URL, username, password). 
7. Run the project from IntelliJ IDEA.
   
## Technologies 
- Java (JDK 8+) 
- WampServer 
- rs2xml.jar for GUI 

