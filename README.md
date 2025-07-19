
# Java Console-Based Login and Signup System

This project is a **Java-based console application** that allows users to register (signup) and log in using credentials. It stores user data using Java serialization in a file-based system.

## 📁 Project Files

```
├── Main.java         # Entry point of the application
├── Signup.java       # Handles user registration
├── Login.java        # Handles user login
├── Validation.java   # Validates user input (email, mobile, password)
├── Userobj.java      # Model class for user data
├── Userd.java        # Manages User details
```

## ✅ Features

- Signup with validations
- Login with credential verification
- File-based user data storage
- Object-oriented programming structure
- Runs via CMD on Windows


## 🧱 Class Descriptions

| Class        | Description |
|--------------|-------------|
| `Main`       | Main menu and program launcher |
| `Signup`     | Handles user registration logic |
| `Login`      | Authenticates user login |
| `Validation` | Validates input like email, mobile, password |
| `Userobj`    | A user object with fields: name, email, mobile, password |
| `Userd`      | Handles saving and reading users  |


## 🖥️ How to Run in CMD (Windows)

### Step 1: Open Command Prompt

- Press `Win + R`, type `cmd`, hit `Enter`.

### Step 2: Navigate to Project Folder

```cmd
cd path\to\your\project\folder
```

Example:
```cmd
cd C:\Users\YourName\Documents\JavaLoginProject
```

### Step 3: Compile All Java Files
```Please follow the order, Because some files are importing other file.
```cmd
javac -d Userd.java
javac -d Userobj.java
javac -d Login.java
javac -d Signup.java
javac -d Validation.java
javac -d Main.java
```

### Step 4: Run the Program

```cmd
java main.Main
```

## 🔐 Validation Rules

- **Email:** Must contain `@` and `.` in correct format.
- **Mobile Number:** Must be exactly 10 digits.
- **Password:** Must be at least 6 characters.


## 🧾 Sample Console Output

```
1. Signup
2. Login
Enter your choice: 1

--- Signup Page ---
Enter Name: Alice Smith
Enter Email: alice@example.com
Enter Mobile Number: 9876543210
Enter Password: alice123

User Registered Successfully!
```

## 📄 License

This project is free to use for educational and learning purposes.
