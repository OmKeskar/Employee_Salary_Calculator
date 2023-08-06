# Employee_Salary_Calculator

This program calculates various salary-related values based on user input, such as age, Dearness Allowance (DA), Travelling Allowance (TA), House Rent Allowance (HRA), Provident Fund (PF), annual salary, and retirement date.

## Getting Started

To run the program, follow these steps:

1. Ensure you have Java installed on your machine.
2. Download the `Salary.java` file from this repository.
3. Open a command prompt or terminal and navigate to the directory where the `Salary.java` file is located.
4. Compile the program by running the following command:
   ```
   javac Salary.java
   ```
5. Run the program by executing the following command:
   ```
   java Salary
   ```
6. Follow the prompts to enter the monthly salary and birth date.

## Program Flow

1. The program prompts the user to enter the monthly salary and birth date.
2. It validates the user's age, ensuring it is between 18 and 55 years.
3. If the age is valid, it checks if the monthly salary is between 4500 and 6500 Rs.
4. If both the age and salary are valid, the program calculates various salary-related values.
5. It calculates DA, TA, HRA, and PF based on the monthly salary.
6. It calculates the annual salary by multiplying the monthly salary by 12.
7. If the annual salary is greater than 10000, it deducts 1000 as professional tax.
8. It calculates the retirement date by adding 55 years to the birth date.
9. Finally, it displays the calculated values, including age, DA, TA, HRA, PF, annual salary, and retirement date.

## Error Handling

The program performs error handling for the following scenarios:

- If the user's age is less than 18 or greater than 55, an error message is displayed.
- If the monthly salary is not between 4500 and 6500 Rs, an error message is displayed.

## Dependencies

This program uses the following dependencies:

- Java 8 or higher
- `java.time.LocalDate` class from the `java.time` package
- `java.util.Scanner` class from the `java.util` package

## Contributing

Contributions to this program are welcome! If you find any issues or have suggestions for improvements, please feel free to open an issue or submit a pull request.

## Acknowledgments

- The program was developed by Om Keskar.
- This program was created as an assignment.

