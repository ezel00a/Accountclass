
package kronometreproje;
import java.util.Random;


public class KronometreProje {
    
        

    public static void main(String[] args) {
        int[] sayilar = new int[100000];
        Random random1=new Random();
     for(int i=0;i<100000;i++){
         
         sayilar[i]=random1.nextInt(100000);
     }
        StopWatch watch1=new StopWatch();
        watch1.start();
   for (int i = 0; i < sayilar.length - 1; i++) {
    int minIndex = i;

    for (int j = i + 1; j < sayilar.length; j++) {
        if (sayilar[j] < sayilar[minIndex]) {
            minIndex = j;
        
    }
    int temp = sayilar[i];
    sayilar[i] = sayilar[minIndex];
    sayilar[minIndex] = temp; 
   }
    watch1.stop();

System.out.println("Gecen sure " + watch1.getElapsedTime() + " milisaniye");
}
    }   }
