package DSA_conditinals;

import java.util.Scanner;

public class Circle_Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double rad = input.nextInt();
        //Area of the circle in integer only
        int ans1 =(int) area(rad);
        double ans2 = area(rad);
        System.out.println("Areaof the Circle: "+ans1);
        System.out.println("Areaof the Circle: "+ans2);
    }
    static double area(double radius){
        if(radius > 0) {
            double crclarea = Math.PI * Math.pow(radius, 2);
            return crclarea;
        }
        return 0;
    }
}
