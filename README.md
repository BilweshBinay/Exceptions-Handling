# Exception Handling in Java

This project demonstrates how to handle **exceptions in Java**, using both **built-in exceptions** and **custom exceptions** with real-world examples.

---

## What is Exception Handling?

Exception handling in Java is a powerful mechanism to handle runtime errors and maintain the normal flow of application.

Java provides 5 keywords:
- `try`
- `catch`
- `finally`
- `throw`
- `throws`

---

## Topics Covered

### 1. Built-in Exception Example: 🏦 Bank Withdraw System
**Scenario:** Simulate a withdrawal from a bank account.  
If the amount exceeds the balance, throw a built-in `IllegalArgumentException`.

- Class: `BankAccount`
- Method: `withdraw(int amount)`
- Output:


---

### 2. Custom Exception Example: Admin Access System
**Scenario:** Allow only employees with role `"ADMIN"` to access the admin panel.  
If the role is `"USER"` or `"GUEST"`, throw a custom `AccessDeniedException`.

- Class: `Employee`
- DTO: `EmpAdminDto`
- Custom Exception: `AccessDeniedException`
- Output:
