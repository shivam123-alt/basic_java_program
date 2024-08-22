import java.util.*;
class even_odd{
    public static void main(String a[])
    {
        int num;
        System.out.println("Enter value of num : ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
