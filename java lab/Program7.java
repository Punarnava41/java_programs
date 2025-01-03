import java.util.Scanner;


class WrongAgeException extends Exception {
    public WrongAgeException(String message) {
        super(message);
    }
}


class Father {
    int age;

    public Father(int age) throws WrongAgeException {
        if (age < 0) {
            throw new WrongAgeException("Father's age cannot be negative!");
        }
        this.age = age;
    }
}


class Son extends Father {
    int sonAge;

    public Son(int fatherAge, int sonAge) throws WrongAgeException {
        super(fatherAge); 
        if (sonAge < 0) {
            throw new WrongAgeException("Son's age cannot be negative!");
        }
        if (sonAge >= fatherAge) {
            throw new WrongAgeException("Son's age cannot be greater than or equal to Father's age!");
        }
        this.sonAge = sonAge;
    }
}


public class exceptioninheritancedemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter Father's age: ");
            int fatherAge = scanner.nextInt();


            Father father = new Father(fatherAge);


            System.out.print("Enter Son's age: ");
            int sonAge = scanner.nextInt();


            Son son = new Son(fatherAge, sonAge);


            System.out.println("Father's age: " + father.age);
            System.out.println("Son's age: " + son.sonAge);

        } catch (WrongAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer for age.");
        } finally {
            scanner.close(); 
        }
    }
}

// O/P:

// Case 1: Valid Input :
Enter Father's age: 45
Enter Son's age: 20
Father's age: 45
Son's age: 20

// Case 2: Father's Age is Negative :
Enter Father's age: -45
Exception: Father's age cannot be negative!

// Case 3: Son's Age is Negative :
Enter Father's age: 45
Enter Son's age: -10
Exception: Son's age cannot be negative!

// Case 4: Son's Age is Greater Than or Equal to Father's Age :
Enter Father's age: 40
Enter Son's age: 40
Exception: Son's age cannot be greater than or equal to Father's age!

// Case 5: Invalid Input :
Enter Father's age: abc
Invalid input. Please enter a valid integer for age.

