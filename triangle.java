import java.util.*;
class triangle {
    public static void main(String[] args) {
        int AB,BC,CA;
        System.out.println("Enter the sides of triangle");
        Scanner sc = new Scanner(System.in);
        AB=sc.nextInt();
        BC=sc.nextInt();
        CA=sc.nextInt();
        if(AB==BC && AB==CA && BC==CA){
            System.out.println("Equilateral triange.");
        }
        else if(AB==BC  || AB==CA || BC==CA){
            System.out.println("Isosceles triangle.");
        }
        else{
            System.out.println("Scalene Triangle.");
        }
    }
    
}
