package ProductManager;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String address;

    public Student() {
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name : ");
        this.name = scanner.nextLine();
        System.out.println("Enter age : ");
        this.age = scanner.nextInt();
        System.out.println("Enter address : ");
        scanner.nextLine();
        this.address = scanner.nextLine();
    }

    public void display() {
        System.out.printf("%20s%-10d%-20s\n", this.name, this.age, this.address);
    }

    @Override
    public String toString() {
        return "name : " + this.name
                + " ; age : " + this.age
                + " ; address : " + this.address;
    }
}