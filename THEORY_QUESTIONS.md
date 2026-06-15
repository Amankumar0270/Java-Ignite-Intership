
#  Spring Boot Employee Management System - Debugging Assignment
Please DO NOT COPY FROM EXTERNAL SOURCES FOR YOUR OWN BETTER IF YOU WANT TO BE BETTER IN INTERVIEWS, I HAVE GIVEN THE HINTS AND INSTRUCTIONS, ANY DOUBTS OR HASSLES  PLS ,YOU ARE WELCOME TO REACH ME ON MY WHATSAPP, WILL BE HAPPY TO GUIDE YOU BETTER
---

#  Objective

Fix the broken Spring Boot project and make all APIs work correctly.

You are NOT allowed to rewrite everything.
You must debug and fix existing code.

---

#  SECTION 1: BUG FIX TASKS

##  1. Employee.java Issues

###  Problems in code:
- Entity is not properly mapped
- Missing annotations
- Getters and setters are incorrect
- Missing default constructor

###  Your Task:
Write answers for:

1. Which annotation is missing to make this a database table?
2. Why do we need a default constructor in JPA?
3. Fix all getter and setter methods
4. What happens if @Id is missing?

---

##  2. Repository Issues

### Problems:
- Repository is not extending JpaRepository

###  Your Task:

1. Why do we extend JpaRepository?
2. What happens if we don't extend it?
3. Fix repository so CRUD works

---

##  3. Controller Issues

### Problems:
- Missing annotations (@RestController, @RequestMapping)
- Missing @RequestBody and @PathVariable
- Methods returning null
- Repository not injected properly

###  Your Task:

1. What does @RestController do?
2. Difference between @RequestBody and @PathVariable?
3. Fix all APIs (POST, GET, PUT, DELETE)
4. Explain flow: Postman → Controller → Repository → DB

---

##  4. application.properties Issues

### Problems:
- Incorrect datasource configuration
- Missing H2 settings
- App not starting

###  Your Task:

1. Why do we need application.properties?
2. What is H2 database used for?
3. Fix configuration so application runs

---

#  SECTION 2: POSTMAN TESTING

Write answers after testing:

1. What is response of POST /employee/save?
2. What happens if GET /employee/1 is called with invalid ID?
3. What is returned in DELETE API?
4. Which method is used for update?

---

#  SECTION 3: THEORY QUESTIONS

Answer briefly:

1. What is REST API?
2. What is CRUD?
3. Difference between POST and PUT?
4. What is dependency injection?
5. Why do we use Spring Boot?

---

#  SUBMISSION RULES

- Fix all bugs in code
- Run project successfully
- Test all APIs in Postman
- Push corrected code to GitHub
- Fill this THEORY_QUESTIONS.md file