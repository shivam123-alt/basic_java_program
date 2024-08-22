import java.util.*;
class Grade{
    public static void main(String a[])
    {
        int percentage;
        System.out.println("Enter the percentage : ");
        Scanner sc = new Scanner(System.in);
        percentage = sc.nextInt();

        if(percentage > 90){
            System.out.println("A+");
        }
        else if (percentage >= 80 && percentage <= 89){
            System.out.println("A");
        }
        else if(percentage >= 70 && percentage <= 79){
            System.out.println("B");
        }
        else if(percentage >= 60 && percentage <= 69){
            System.out.println("C");
        }
        else if(percentage >=50 && percentage <=59){
            System.out.println("D");
        }
        else{
            System.out.println("FAIL");
        }
        
    }
}
