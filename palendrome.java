import java.util.*;
public class palendrome {
    public static void main(String[] args) {
        int num1,num2,sum=0;
        System.out.println("Enter no=");
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        num2=num1;
        while(num2>0){
            int rem=num2%10;
            sum = sum*10+rem;
            num2=num2/10;
        }
        if(sum!=num1){
            System.out.println("Not palendrome.");
        }
        else{
            System.out.println("palendrome.");
        }
    }
}
