//import needed libraries

//Create a class for Assignment Marks Program

import java.util.Scanner;

public class AssignmentMarks
{
    public void EnterAssignmentName()
    {
        System.out.println("Welcome");          //Welcome statemnet for program
        String assignmentName;
        System.out.println("Please Enter the Name of the Assignment");
        Scanner input = new Scanner(System.in);
        assignmentName = input.nextLine();
        System.out.println("assignment name : " + assignmentName);
    }
    public static void main(String[] args) {
        AssignmentMarks assignmentObject = new AssignmentMarks();
        assignmentObject.EnterAssignmentName();
    }
}