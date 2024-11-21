import java.util.*;

class student {
    String usn;
    String name;
    int sem;

    student(String usn, String name, int sem) {
        this.usn = usn;
        this.name = name;
        this.sem = sem;
    }

    void details() {
        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
        System.out.println("Semester: " + sem);
    }
}

class internals {
    int[] cie = new int[5];

    void get() {
        System.out.println("Enter the CIE marks of 5 subjects:");
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            cie[i] = s.nextInt();
        }
    }

    void display() {
        System.out.println("CIE marks of 5 subjects are:");
        for (int i = 0; i < 5; i++) {
            System.out.println(cie[i]);
        }
    }
}

class externals extends student {
    int[] see = new int[5];

    externals(String usn, String name, int sem) {
        super(usn, name, sem);
    }

    void get() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter SEE marks of 5 subjects:");
        for (int i = 0; i < 5; i++) {
            see[i] = s.nextInt();
        }
    }

    void display() {
        System.out.println("SEE marks of 5 subjects are:");
        for (int i = 0; i < 5; i++) {
            System.out.println(see[i]);
        }
    }
}

class details {
    public static void main(String args[]) {
        internals i = new internals();
        i.get();
        i.display();

        externals e = new externals("1BM23CS263", "Rashi", 3);
        e.details();
        e.get();
        e.display();
    }
}

// i/p:
Enter the CIE marks of 5 subjects:
20
25
30
35
40
Enter SEE marks of 5 subjects:
60
55
45
70
65

// o/p:
CIE marks of 5 subjects are:
20
25
30
35
40
Name: Rashi
USN: 1BM23CS263
Semester: 3
SEE marks of 5 subjects are:
60
55
45
70
65
