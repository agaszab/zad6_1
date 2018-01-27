import java.util.Arrays;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        int[] tab=new int[20];
        int j=0;
        Random rand=new Random();

        for (int i = 0; i < tab.length; i++) {
        if (i<tab.length/2)  tab[i]=rand.nextInt(10);
        j=((tab.length)-1)-i;
        tab[j]=tab[i];
        System.out.print(tab[i]+" ");
        }





    }
}
