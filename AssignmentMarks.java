//import needed libraries

//Create a class for Assignment Marks Program

import java.util.Scanner;

public class AssignmentMarks
{
    //declare variable in class to use variable globally
    String assignmentName;                          //declare variable to store Assignmnet name
    double [] marks = new double[30];               //declare array to store marks
    double min, max, mean, standardDeviation, variance;     //declare variable to perform given functions
    int i, studentHighest = 0, studentLowest = 0;                                  //declare variable for iteration
        
    public void EnterAssignmentName()              //F1: Method for receiving assignmnet name (f1)
    {
        System.out.println("Welcome");          //Welcome statemnet for program
        System.out.println("Please Enter the Name of the Assignment");
        Scanner input = new Scanner(System.in);
        assignmentName = input.nextLine();        //Received assignment name
    }

    public void EnterStudentMarks()             //F2: method for receiving marks
    {
        System.out.println("Please enter the marks of " + assignmentName + " for 30 students");
        Scanner input = new Scanner(System.in);
        for(i=0;i<30;i++)
        {
            System.out.println("Enter " + assignmentName +" marks for student " + (i+1));
            double temp = input.nextDouble();
            if(temp <= 30)
            {
                marks[i]=temp;
            }
            else
            {
               System.out.println("Invalid Input");     //F3: invalid input for marks more than 30
               i--;
            }
        }
    }

    public void DisplayMarks()                          //F4: displaying marks
    {
        for(i=0;i<30;i++)
        {
            System.out.println("Marks of student " + (i+1) + " in " + this.assignmentName + ": " + this.marks[i]);
        }
    }

    public void MaxMin()                                //F5: find highest and lowest marks
    {
        min = marks[0];
        max = marks[0];
        for(i=0;i<30;i++)
        {
            if(marks[i] >= max)
            {
                if(max > marks[i])
                max = marks[i];
                else if(max == marks[i])
                studentHighest = studentHighest + 1;
            }
            else if(marks[i] <= min)
            {
                if(min < marks[i])
                min = marks[i];
                else if(min == marks[i])
                studentLowest = studentLowest + 1;
            }
        }
        System.out.println("The hightest marks obtained by " + this.studentHighest + " students in " + this.assignmentName + ": " + this.max);
        System.out.println("The lowest marks obtained by " + this.studentLowest + " studnets in " + this.assignmentName + ": " + this.min);
    }

    public void MeanCalculate()         //F6: finding mean of all marks obtained
    {
        double sum = 0;
        for(i=0;i<30;i++)
        {
            sum = sum + marks[i];
        }
        mean = sum/30;
        System.out.println("The mean of all marks obtained " + this.mean);
    }

    public void StandardDeviationCalculation()              //F6: finding Standarad deviation
    {
        double deviation = 0;
        for(i=0;i<30;i++)
        {
            deviation = deviation + ((marks[i] - mean) * (marks[i] - mean));
        }
        variance = deviation / 30;
        standardDeviation = Math.sqrt(variance);
        System.out.println("The standard deviation of all marks obtained " + this.standardDeviation);
    }

    public static void main(String[] args) {
        AssignmentMarks assignmentObject = new AssignmentMarks();           //object for calling all methods
        assignmentObject.EnterAssignmentName();
        assignmentObject.EnterStudentMarks();
        assignmentObject.DisplayMarks();
        assignmentObject.MaxMin();
        assignmentObject.MeanCalculate();
        assignmentObject.StandardDeviationCalculation();
    }
}