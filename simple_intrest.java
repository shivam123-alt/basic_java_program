import java.util.*;
class simple_intrest{
    

    public static void main(String a[]){
        System.out.println("Enter values of p,r,t");
        
        Scanner Sc = new Scanner(System.in);
        int p,r,t;
        float si;
        p=Sc.nextInt();
        r=Sc.nextInt();
        t=Sc.nextInt();

        si=(p*r*t)/100;
        System.out.println(si);

    }
}