import java.util.*;
class leap_year {
    public static void main(String a[])
    {
        int num;
        System.out.println("Enter value of num : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if(num%4==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a leap year.");
        }
    }
}
