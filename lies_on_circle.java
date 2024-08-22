import java.util.*;
class lies_on_circle{
    public static void main(String a[])
    {
        int r, x1,x2,y1,y2;
        double d,d1,d2;
        System.out.println("Enter values of r, x1,x2,y1,y2");
        Scanner sc = new Scanner(System.in);
        r=sc.nextInt();
        x1=sc.nextInt();
        x2=sc.nextInt();
        y1=sc.nextInt();
        y2=sc.nextInt();

        d1=Math.pow((x2-x1),2);
        d2=Math.pow((y2-y1),2);
        d=Math.sqrt(d2+d1);
        if(d>r){
            System.out.println("Outside");
        }
        if(d==r){
            System.out.println("On the circle");
        }
        if(d<r){
            System.out.println("inside the circle");
        }
    }
}
