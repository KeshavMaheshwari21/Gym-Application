<h1 align="center">GYM - Application <img width="40" src="src/images/bicep.gif"></h1>

A comprehensive **Gym Management** System designed to streamline membership management, subscription tracking, and fitness routine organization. Built with Java and MySQL, this application features an intuitive GUI and secure database connectivity for efficient gym operations.

## 📑 Table of Contents

- Features
- Technology Stack
- Setup & Installation
- Usage Guide
- Project Structure
- MySQL Database 

## ✨ Features

- User Registration/Login - Secure and personalized profiles
- Membership Management - Manage memberships

## 🛠️ Technology Stack

- Language: Java
- GUI: Java Swing
- Database: MySQL
- Libraries: JDBC for database connection

## ⚙️ Setup & Installation

### Prerequisites

- Java Development Kit (JDK) - Version 11 or above
- MySQL - To store travel data

### Installation Steps

Clone the repository and navigate to it:

```bash
git clone https://github.com/KeshavMaheshwari21/Gym-Application.git
cd Gym-Application
```

## 📖 Usage Guide

1. **User Authentication** 🔑 - New users sign up; existing users log in.
2. **Membership Management** 🏋️‍♂️ - Take Gym Membership.

## 📂 Project Structure

```bash
Travel-Manager/
├── src/                             # Source code directory ( contains all the java files )
│   └── images/                      # Contains all the images of the projects
├── bin/                             # Compiled .class files
│   └── images/                      # Contains all the images of the projects                  
├── lib/                             # External libraries and dependencies
│   └── mysql-connector.jar          # MySQL connector for database connection
└── Readme.md                        # Project description
```

## 🗄️ MySQL Database 

Creating the new Database for the Project :
```bash
create database gym-application;
```

Use the new database for creating various tables :

```bash
use gym-application;
```

### Creating the Tables in the Database

1. 🧑‍💼 **Account Table** : The **account** table stores essential user information for the **Gym - Application** application, including login credentials and security data. It contains the following fields:
- username: Unique identifier for each user
- name: Full name of the user
- password: User’s password (plain text; encryption recommended in production)

```bash
create table account(
username varchar(20),
name varchar(30),
password varchar(20));
```

2. 🔑 **Membership Table** : The **membership** table stores details related to membership bookings in the **Gym - Application** application, including:
- username: Username of the person making the booking
- phone: Contact number for the user
- email: email address of the user

```bash
create table membership(
username varchar(20),
phone varchar(15),
email varchar(30));
```
