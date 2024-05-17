import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

       int [] klass = new int[3];
       klass[0]=1;
       klass[1]=2;
        klass[2] = 3;
        for (int i = klass.length-1; i>=0; i--) {
            System.out.print(klass[i]+", ");
        }
        System.out.println();
        for (int i=0; i < klass.length; i++ ) {
            if (klass[i]%2==1) {
                System.out.print(klass[i]+1+" ");
            } else {
                System.out.print(klass[i]+" ");

            }
        }
        System.out.println();




        double [] box={1.57,7.654,9.986};
        for (int i = box.length-1; i>=0; i--) {
            System.out.print(box[i]+", ");
        }
        System.out.println();
int [] fear= new int[23];
        for (int i = fear.length-1; i>=0; i--) {
            System.out.print(fear[i]+", ");
        }
        System.out.println();
        System.out.print(Arrays.toString(klass));
        System.out.println();
        System.out.print(Arrays.toString(box));
        System.out.println();
        System.out.print(Arrays.toString(fear));
        System.out.println();










    }


}