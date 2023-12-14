import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        // int age;
        // System.out.println("Enter age: " );
        // age = sc.nextInt();
        // System.out.println("Your age is:\t"+age);

        // int a = 40;
        // char ch = 30;
        // System.out.println(a-ch);
        /*float height,base;
        double area;
        System.out.println("Enter the height of triangle");
        height = sc.nextFloat();
        System.out.println("Enter the base of triangle");
        base = sc.nextFloat();
        area = 1f/2f*(base*height);//must add flaot-->f when you use flaot data type
        System.out.println("Area of triangle:\t"+area);*/

        //Area of equaliteral triangle
        /* 
         float a,b,c,result;
         double area;
         System.out.println("Enter a,b,c:");
         a = sc.nextFloat();
         b = sc.nextFloat();
         c = sc.nextFloat();
         result = 1f/2f*(a+b+c);
         System.out.println("Area of triangle:\t"+result);
         area = Math.sqrt(result*(result-a)*(result-b)*(result-c));
         System.out.println("Area of EQ.triangle:\t"+area);
         */

         //Quadratic Equation
         /*
         float a,b,c;
         double r1,r2;
         System.out.println("Enter a,b,c:");
         a = sc.nextFloat();
         b = sc.nextFloat();
         c = sc.nextFloat();

         r1 = (-b+Math.sqrt(b*b-4*a*c)/(2*a));
         r2 = (-b-Math.sqrt(b*b-4*a*c)/(2*a));

         System.out.println("Roots are:\t"+r1 + " " + r2);
         */


         //RIght and left shift
         /*
          * 
If we do left left than number is multiplied by 2-->n*2^k---->
if we do right shift than number become half.n/2^k---->

          */
    int x = 10;//1010
    int y = 6,z;
    z = x&y;
    System.out.println("AND: "+z);
    x = 0b1010;
    y = 0b0110;
    z = x&y;
    System.out.println("AND: "+z);
    z = x|y;
    System.out.println("OR: "+z);
    z = x^y;
    System.out.println("XOR: "+z);

    //left and right shift
    x = 0b1000;
    y =x<<2;
    System.out.println("Left shift by 1: "+y);
    y =x>>1;
    System.out.println("RIght shift by 1: "+y);



    }
}
