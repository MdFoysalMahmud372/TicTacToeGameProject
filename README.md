# Student Management Module for Odoo 16

## Overview
This is a custom Odoo 16 module called **Student Management** developed as part of a fresher assignment at NN Services & Engineering Ltd.  
It allows you to manage students, courses, and enroll students in multiple courses.

---

## Features
- **Student Model**: Fields – `name`, `email`, `roll_no`, `department`
- **Course Model**: Fields – `name`, `code`, `credit`
- **Many-to-Many Relation**: Students can enroll in multiple courses. A Course can have multiple Students.
- **Views**:
  - Form view for adding students and courses
  - Tree (list) view for displaying students
- **Reports**: View students enrolled in a specific course
- **Bonus Features (Optional)**:
  - Button on student form → "Show Enrolled Courses"
  - Menu in Odoo: `Student Management → Students / Courses`

---

## Prerequisites
Before running this module, make sure you have:
- Docker Desktop (Mac)
- VS Code 
- Git & GitHub account
- Basic understanding of Python and PostgreSQL

---

## Tools & Technology
- **Programming Language:** Python 3.10+
- **Database:** PostgreSQL 13+
- **ERP Framework:** Odoo 16
- **Views & UI:** XML (Odoo)
- **Containerization:** Docker
- **Version Control:** Git, GitHub

---

## Folder Structure
<img width="490" height="560" alt="image" src="https://github.com/user-attachments/assets/f924c96a-4c2a-4886-aa62-70a844442b46" />





## Setup Instructions

### Step 1: Clone Repository

- **Open Terminal / Command Prompt and run**: cd ~/Documents (or any preferred directory)

- **Clone the repository**: git clone https://github.com/MdFoysalMahmud372/odoo-student-management.git

- **Go inside the project folder**: cd odoo-student-management
- **code .**

### Step 2: Start Docker Containers
- **Open terminal and run**: docker-compose up -d

### Step 3: Access Odoo

- **Open your browser and go to**: http://localhost:8069

- **Create a new database or use test_db.**
- **Email**: admin
- **Password**: admin

### Step 5: Install Module

- **Go to Apps → Update Apps List**

- **Search for type**: student_management

- **Click Install**


## Challenges Faced & Solutions

- **Docker Setup**: Initially, Odoo and PostgreSQL containers didn’t connect. Fixed by correctly mapping ports and volumes.

- **Odoo 16 Compatibility**: Older templates caused issues. Solved by using odoo:16.0 Docker image and updating XML views.

- **Database Connection**: Errors due to wrong credentials. Fixed by setting correct PostgreSQL environment variables.

- **Master Password Issue**: Access denied while creating database. Solved by resetting master password in odoo.conf.

- **Many-to-Many Relation**: Linking students and courses was tricky. Solved by properly using Many2many field in models.

- **Module Visibility**: Module didn’t appear in Apps. Fixed by updating apps list and ensuring 'installable': True.



## GitHub Repository

https://github.com/MdFoysalMahmud372/odoo-student-management



## Notes

- **Ensure Docker Desktop is running before starting Odoo**

- **Update odoo.conf with correct database credentials if needed**

- **Clean, understandable Python and XML code is used for all module features**
- **Upgrade the module inside the running container (Use Terminal)**:  docker-compose exec -T odoo odoo -u student_management -d test_db --stop-after-init
- **Restart Odoo so it reloads with the updated code/views (Use Terminal)**: docker-compose restart odoo
- **Stop Docker Container (Use Terminal)**: docker-compose down


## License

This project is open for educational purposes and demo assignment submissions.

## Author

Md. Foysal Mahmud




