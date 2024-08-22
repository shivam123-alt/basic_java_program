import java.util.*;
class largest_smallest {
    public static void main(String arg[])
    {
        int lag = 0,small=0;
        int a,b,c;
        System.out.println("Enter value of a,b,c");
        Scanner sc= new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a>b){
            if(b>c){
                lag=a;
                small=c;
                System.out.println("Largest "+lag);
                System.out.println("Smallest"+small);
            }
            else
            {
                lag=c;
                small=b;
                System.out.println("Largest "+lag);
                System.out.println("Smallest"+small);
            }
        }
        else 
        {
            if(a>c)
            {
                lag=b;
                small=c;
                System.out.println("Largest "+lag);
                System.out.println("Smallest"+small);
            }
            else
            {
                lag=c;
                small=a;
                System.out.println("Largest "+lag);
                System.out.println("Smallest"+small);
            }
        }
        
            
            }
        }
    



        
    
