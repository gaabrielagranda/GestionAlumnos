# Student Management System

## Overview

This is a simple **Student Management System** implemented in **Java**. The application allows users to perform CRUD operations on student records, including:

- Add a new student.
- View all students.
- Edit an existing student's details.
- Delete a student by index.

## Features

- **Add Student**: Allows the user to input and save the details of a student, including name, surname, phone number, email, grades, attendance, and final grades.
- **View Students**: Displays a list of all students with their details.
- **Edit Student**: Modify an existing student's details (name, surname, phone, email, grades, attendance, etc.).
- **Delete Student**: Remove a student record by providing the student's index in the list.
- **Exit**: Exit the program.

## Technologies Used

- **Java**: The program is built using standard Java libraries, including `java.util.Scanner`.
- **Classes**: The program uses a `GestorAlumno` class for managing student operations (add, update, remove, view), and an `Alumno` class to represent each student with their attributes.

## How to Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/student-management-system.git
   ```

2. **Compile and Run**:
   Navigate to the project folder in your terminal and compile the program:
   ```bash
   javac Main.java
   ```
   After compiling, run the program:
   ```bash
   java Main
   ```

## Menu Options

Upon starting the program, you will be presented with a menu:

```
Menú:
1. Agregar alumno
2. Mostrar alumnos
3. Eliminar alumno
4. Modificar alumno
5. Salir
```

Enter the corresponding number to perform the desired operation:

- **1**: Add a new student.
- **2**: View all students.
- **3**: Delete a student by index.
- **4**: Modify an existing student's details.
- **5**: Exit the program.

## Example

- **Add a student**: You will be prompted to enter the student's name, surname, phone, email, grades, attendance, and final grades.
- **View students**: The program will display a list of all students with their details.
- **Edit a student**: You can modify a student's information by selecting their index from the list.
- **Delete a student**: You can remove a student by providing their index in the list.

## Error Handling

The program handles errors like:

- Invalid index when deleting or modifying students.
- Invalid input when entering student data.
- Incorrect options in the menu.

## Contributing

If you want to contribute to this project:

1. Fork the repository.
2. Create a feature branch (`git checkout -b feature-name`).
3. Commit your changes (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature-name`).
5. Open a pull request.
