//import needed libraries

//Create a class for Assignment Marks Program

import java.util.Scanner;

public class AssignmentMarks
{
    //declare variable in class to use variable globally
    String assignmentName;                          //declare variable to store Assignmnet name
    double [] marks = new double[30];               //declare array to store marks
    double min, max, mean, standardDeviation, variance;
    int i, studentHighest, studentLowest;                                  //declare variable for iteration
        
    public void EnterAssignmentName()              //Method for receiving assignmnet name (f1)
    {
        System.out.println("Welcome");          //Welcome statemnet for program                  
        System.out.println("Please Enter the Name of the Assignment");
        Scanner input = new Scanner(System.in);
        assignmentName = input.nextLine();        //Received assignment name
    }

    public void EnterStudentMarks()
    {
        System.out.println("Please enter the marks of " + assignmentName + " for 30 students");
        Scanner input = new Scanner(System.in);
        for(i=0;i<30;i++)
        {
            System.out.println("Enter " + assignmentName +" marks for student " + (i+1));
            //marks[i]=input.nextDouble();
            if(marks[i]<= 30)
            {
                marks[i]=input.nextDouble();
            }
            else
            {
               System.out.println("Entered input is invalid please again enter Assignmnet marks for student " + i+1);
               marks[i]=input.nextDouble(); 
            }
        }
    }

    public void MaxMin()
    {
        min = marks[0];
        max = marks[0];
        for(i=0;i<30;i++)
        {
            if(marks[i] >= max)
            {
                max = marks[i];
                studentHighest = i;
            }
            else if(marks[i] <= min)
            {
                min = marks[i];
                studentLowest = i;
            }
        }
    }

    public void MeanCalculate()
    {
        double sum = 0;
        for(i=0;i<30;i++)
        {
            sum = sum + marks[i];
        }
        mean = sum/30;
    }

    public void StandardDeviationCalculation()
    {
        double deviation = 0; 
        for(i=0;i<30;i++)
        {
            deviation = deviation + ((marks[i] - mean) * (marks[i] - mean));
            variance = deviation / 30;
            standardDeviation = Math.sqrt(variance);
        }
    }

    public void Display()
    {
        for(i=0;i<30;i++)
        {
            System.out.println("Marks of student " + (i+1) + " in " + assignmentName + ": " + marks[i]);
        }
        System.out.println("The hightest marks obtained by student " + studentHighest + "in " + assignmentName + ": " + max);
        System.out.println("The lowest marks obtained by student " + studentLowest + "in " + assignmentName + ": " + min);
        System.out.println("The mean of all marks obtained "+mean);
        System.out.println("The standard deviation of all marks obtained "+standardDeviation);
    }
    public static void main(String[] args) {
        AssignmentMarks assignmentObject = new AssignmentMarks();
        assignmentObject.EnterAssignmentName();
        assignmentObject.EnterStudentMarks();
        assignmentObject.Display();
    }
}