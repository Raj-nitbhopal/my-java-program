
package cubeareavolume;
import java.util.*;


public class CubeAreaVolume {

    public static void main(String[] args) {
        float side;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the side of a Cube:");
        side = sc.nextFloat();
        System.out.println("Area of Cube = " + 6*side+ " mtr. sqr");
        System.out.println("Volume of Cube = " + side*side*side + " mtr.qube");
       
    }
    
}
