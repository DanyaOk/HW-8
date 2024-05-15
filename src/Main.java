import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

       int [] klass = new int[3];
       klass[0]=1;
       klass[1]=2;
        klass[2] = 3;
        for (int index =0; index< klass.length; index++
        ) {
            if (index== klass.length-1){
                System.out.print(klass[index]);
                break;
            }
            System.out.print(klass[index] + ", ");
        }
        System.out.println();

        double [] box={1.57,7.654,9.986};

int [] fear= new int[23];

        System.out.print(Arrays.toString(klass));
        System.out.println();
        System.out.print(Arrays.toString(box));
        System.out.println();
        System.out.print(Arrays.toString(fear));
        System.out.println();

 int [] groot = new int[6];
 groot[0]=1;
 groot[1]=2;
 groot[2]=3;
 groot[3]=4;
 groot[4]=5;
 groot[5]=6;
  for (int i=0; i< groot.length; i++) {
if (i == groot.length-1)  {
    {
    System.out.print(groot[i]);
    break;
}}
     System.out.print(groot[i]+", ");
 }





    }


}