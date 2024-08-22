import java.util.*;
public class perfect_no {
    
    public static void main(String[] args) {
        int i=1,num,sum=0;
        System.out.println("Enter no=");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for(i=1;i<num;i++){
            if(num%i==0){
                sum +=i;
            }
        }
        if(sum==num){
            System.out.println("Perfect no.");
        }
        else{
            System.out.println("Not perfect no.");
        }
    }
}
