//import needed libraries

//Create a class for Assignment Marks Program

import java.util.Scanner;

public class AssignmentMarks
{
    //declare variable in class to use variable globally
    String assignmentName;                          //declare variable to store Assignmnet name
    double [] marks = new double[30];               //declare array to store marks

    public void EnterAssignmentName()              //Method for receiving assignmnet name (f1)
    {
        System.out.println("Welcome");          //Welcome statemnet for program                  
        System.out.println("Please Enter the Name of the Assignment");
        Scanner input = new Scanner(System.in);
        assignmentName = input.nextLine();        //Received assignment name
    }

    public void EnterStudentMarks()
    {
        System.out.println("Please enter the marks for " + assignmentName + " 30 students");
        int i;                                  //declare variable for iteration
        Scanner input = new Scanner(System.in);
        for(i=0;i<30;i++)
        {
            System.out.println("Enter Assignmnet marks for student " + i+1);
            marks[i]=input.nextDouble();
        }
    }
    public static void main(String[] args) {
        AssignmentMarks assignmentObject = new AssignmentMarks();
        assignmentObject.EnterAssignmentName();
        assignmentObject.EnterStudentMarks();
    }
}