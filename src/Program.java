import java.util.Arrays;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        int[] tab=new int[10];
        int[] tabRevers=new int[10];
        int j=9;
        Random rand=new Random();

        for (int i = 0; i < tab.length; i++) {
        tab[i]=rand.nextInt(10);
        tabRevers[j]=tab[i];
        j--;
        }

        System.out.print(Arrays.toString(tab));
        System.out.print(Arrays.toString(tabRevers));



    }
}
