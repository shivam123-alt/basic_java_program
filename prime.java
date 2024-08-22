import java.util.*;
public class prime {
    
    public static void main(String[] args) {
        int num,i=2;
        System.out.println("Enter the no =");
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();

        for(int i=2;i<=num;i++){
            if(num%i==0){
                System.out.println("Not prime.");
                break;
            }
            else{
                System.out.println("Prime no.");
                break;
            }
        }
        
    }
}
