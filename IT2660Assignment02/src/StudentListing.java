// Ryan Dunphy's Assignment 2 ----- IT2660
// StudentListings Node Class

import javax.swing.*;

public class StudentListing {
    private String name; // Key field
    private String gpa;
    private String number;
    public StudentListing(String n, String a, String num){
        name = n;
        gpa = a;
        number = num;
    }
    public String toString(){
        return ("Name is " + name +
                "\nGPA is " + gpa +
                "\nNumber is " + number + "\n");
    }
    public StudentListing deepCopy(){
        StudentListing clone = new StudentListing(name, gpa, number);
        return clone;
    }
    public int compareTo(String targetKey){
        return (name.compareTo(targetKey));
    }
    public void input(){
        name = JOptionPane.showInputDialog("Enter a name");
        gpa = JOptionPane.showInputDialog("Enter your GPA");
        number = JOptionPane.showInputDialog("Enter a number");
    }

    public StudentListing() {
        // default constructor for class Node
    }
} // end of class StudentListings
