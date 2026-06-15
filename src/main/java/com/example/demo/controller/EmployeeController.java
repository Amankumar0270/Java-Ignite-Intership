package com.example.demo.controller;

// TODO: Import Spring annotations
// Hint:
// @RestController, @RequestMapping, @GetMapping, @PostMapping, @PutMapping, @DeleteMapping

// TODO: Import Employee + Repository

public class EmployeeController {

    // TODO: Inject repository

    // Hint:
    // Use constructor injection OR @Autowired

    // ==============================
    // 1. CREATE EMPLOYEE
    // ==============================
    public Employee saveEmployee() {

        // TODO:
        // Accept Employee using @RequestBody

        // TODO:
        // Save using repository

        // Hint:
        // repo.save(employee)

        return null;
    }

    // ==============================
    // 2. GET ALL EMPLOYEES
    // ==============================
    public List<Employee> getAllEmployees() {

        // TODO:
        // Return repo.findAll()

        return null;
    }

    // ==============================
    // 3. GET EMPLOYEE BY ID
    // ==============================
    public Employee getEmployeeById() {

        // TODO:
        // Use @PathVariable

        // TODO:
        // repo.findById(id)

        // Hint:
        // returns Optional → handle safely

        return null;
    }

    // ==============================
    // 4. UPDATE EMPLOYEE
    // ==============================
    public Employee updateEmployee() {

        // TODO:
        // Step 1: Find employee by id
        // Step 2: Check if exists
        // Step 3: Update fields
        // Step 4: Save again

        // Hint:
        // repo.save(existingEmployee)

        return null;
    }

    // ==============================
    // 5. DELETE EMPLOYEE
    // ==============================
    public String deleteEmployee() {

        // TODO:
        // Delete by id

        // Hint:
        // repo.deleteById(id)

        return null;
    }
}