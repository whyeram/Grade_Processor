import java.lang.*;

import java.util.*;

import java.io.*;

 

 

class StudentGrade

{

 

   public static int ReadInteger()

   {

        try

        {

              InputStreamReader input = new InputStreamReader(System.in);

              BufferedReader reader = new BufferedReader(input);

              return Integer.parseInt(reader.readLine());

        }

        catch (Exception e)

        {

 

              e.printStackTrace();

              return 0;

        }

   }

  

 

   public static void main(String[] args)

   {     

         System.out.println("Program for simple student grading logic.");

 

         int MAX_STUDENTS = 10;

        

         int [] arrMark = new int[MAX_STUDENTS];

         String grade = "";

 

         for (int i = 0; i < MAX_STUDENTS; i++)

         {

           System.out.format("Enter %d Student Mark: ", i  + 1);

           arrMark[i] = ReadInteger();

         }

         System.out.print("\n\nNo\tMark\tGrade\n");

 

         for (int i = 0; i < MAX_STUDENTS; i++)

         {

           if(arrMark[i] > 100)

               grade = "Error";

           else if(arrMark[i] > 90)

               grade = "A+";

           else if(arrMark[i] > 70)

               grade = "B+";

           else if(arrMark[i] > 50)

               grade = "C+";

           else if(arrMark[i] > 30)

               grade = "C";

           else

               grade = "F";

           System.out.format("%d\t%d\t%s\n", i + 1, arrMark[i], grade);

         }

   }

}
