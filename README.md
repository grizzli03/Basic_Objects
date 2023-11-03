# Personal Account Management

This Java project contains a class for managing personal bank accounts. It includes functionalities for depositing money, withdrawing funds, checking the balance, and maintaining a transaction history.

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [How to Use](#how-to-use)
- [Sample Usage](#sample-usage)
- [Compilation and Execution](#compilation-and-execution)
- [Contributing](#contributing)
- [License](#license)

## Introduction
The project includes a `PersonalAccount` class representing a bank account and an `Amount` class to track transaction details. The `PersonalAccount` class facilitates operations like deposit, withdrawal, balance inquiry, and transaction history.

## Features
- Create a bank account with a unique identifier and account holder's name.
- Deposit and withdraw money, updating the balance and transaction history.
- Check the current balance and retrieve account details.
- Maintain a transaction history with transaction type and amount.

## How to Use
To use the `PersonalAccount` class in your Java project, you can include the provided Java files in your project directory. Import the `PersonalAccount` class and use its methods for account management.

### Example:
```java
// Create an instance of PersonalAccount
PersonalAccount account = new PersonalAccount(12345, "John Doe");

// Deposit and withdraw money
account.deposit(1000);
account.withdraw(500);

// Display account information
System.out.println("Account Holder: " + account.getAccountHolder());
System.out.println("Current Balance: " + account.getBalance());

// Print transaction history
account.printTransactionHistory();
