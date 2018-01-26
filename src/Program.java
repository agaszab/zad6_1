import java.util.Arrays;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        int[] tab=new int[10];
        int[] tabRevers=new int[10];
        int j=0;
        Random rand=new Random();

        for (int i = 0; i < tab.length; i++) {
        tab[i]=rand.nextInt(100);
        }

        for (int i = tab.length-1; i >= 0; i--) {
        tabRevers[j]=tab[i];
        j++;
        }

        System.out.println(Arrays.toString(tab));
        System.out.println(Arrays.toString(tabRevers));
    }
}
