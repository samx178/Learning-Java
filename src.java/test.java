import java.util.*;
public class test {
    public static void main(String[] args) {
        Encapsulation student = new Encapsulation();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String Name = sc.nextLine();
        System.out.println("Enter your age: ");
        Integer Age = sc.nextInt();
        System.out.println("Enter your rollNumber: ");
        Integer rollNumber = sc.nextInt();
        student.setName(Name);
        student.setRollNumber(65);
        student.setAge(20);
        System.out.println(student.getName());
        System.out.println(student.getRollNumber());
        System.out.println(student.getAge());
    }
}