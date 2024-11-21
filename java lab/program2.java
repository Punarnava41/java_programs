import java.util.Scanner;

public class Student {
    String usn;     
    String name;     
    int[] credits;  
    int[] marks;  
    int numSubjects;   
    public Student(int numSubjects) {
        this.numSubjects=numSubjects;
        credits = new int[numSubjects];
        marks = new int[numSubjects];
    }

    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter USN: ");
        usn = scanner.nextLine();
        
        System.out.print("Enter Name: ");
        name = scanner.nextLine();
        
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter credits for subject " + (i + 1) + ": ");
            credits[i] = scanner.nextInt();
            
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
    }

    public void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        
        for (int i = 0; i < numSubjects; i++) {
            System.out.println("Subject " + (i + 1) + ": Credits = " + credits[i] + ", Marks = " + marks[i]);
        }
    }
    public double calc(){
        int totalc=0;
        int totalg=0;
        for(int i=0;i<numSubjects;i++){
            int gradepoint=getGP(marks[i]);
            totalg+=gradepoint*credits[i];
            totalc+=credits[i];
        }
        return(double) totalg/totalc;
    }
    public int getGP(int marks){
        if(marks>=90) return 10;
        else if(marks>=80) return 9;
        else if(marks>=70) return 8;
        else if(marks>=60) return 7;
        else if(marks>=50) return 6;
        else if(marks>=40) return 5;
        else if(marks>=30) return 4;
        else return 0;1
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        Student student = new Student(numSubjects);
        
        student.inputDetails();
        student.displayDetails();
        double sgpa=student.calc();
        System.out.println("Sgpa="+sgpa);
    }
}

// O/P:
Enter the number of subjects: 3
Enter USN: 1BM23CS001
Enter Name: John Doe
Enter credits for subject 1: 4
Enter marks for subject 1: 85
Enter credits for subject 2: 3
Enter marks for subject 2: 75
Enter credits for subject 3: 2
Enter marks for subject 3: 65

Student Details:
USN: 1BM23CS001
Name: John Doe
Subject 1: Credits = 4, Marks = 85
Subject 2: Credits = 3, Marks = 75
Subject 3: Credits = 2, Marks = 65
SGPA = 8.22
