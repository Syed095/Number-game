import java.util.*;
public class StudentGradeCalculator {
    
    
    
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of subjects: ");
            int n=sc.nextInt();
            int[] marks=new int[n];
            for (int i = 0; i <n; i++) {
                System.out.print("Enter marks(out of 100) in subject"+(i+1)+": ");
               marks[i]=sc.nextInt();
               
                
            }
            int sum=0;
            for (int i = 0; i < marks.length; i++) {
                sum=sum+marks[i];
                
            }
            float avg=(float)sum/n;
            char grade;
             if (avg>=85) {
                grade='A';
                
            }
            else if (avg>=75) {
                grade='B';
            }
             else if (avg>=65) {
                grade='C';
            }
             else if (avg>=55) {
                grade='D';
            }
             else if (avg>=45){
                grade='E';
            }
            else{
                grade='F';
            }

            System.out.println("The SUM of marks out of "+(n*100)+" is: "+sum);
            System.out.println("The AVERAGE marks is: "+avg);
            System.out.println("The GRADE assigned to student is: "+grade);
            
            
        }
    }
    

