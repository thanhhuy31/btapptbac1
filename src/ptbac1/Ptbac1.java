
package ptbac1;

import java.util.Scanner;


public class Ptbac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a,b:");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            
            float x = -b / a;
            System.out.println("Nghiệm của phương trình là: x = " + x);
        }
    }
    
}
