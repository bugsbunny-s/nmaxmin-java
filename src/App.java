import java.util.Arrays;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int [] list = {15,12,788,1,-1,-778,2,0};
        Scanner inp = new Scanner (System.in );

        System.out.println("Dizi : " + Arrays.toString(list));
        
        Arrays.sort(list);
        System.out.println("Sıralı : " + Arrays.toString(list));

        System.out.print("Bir sayı giriniz : ");
        int value = inp.nextInt();
        int min = value;
        int max = value;

        


        for(int i : list){
            if(i > value){
                max = i;
                break;
            }
        }

        for(int i = list.length -1; i >= 0; i--){
            if(list[i]< value){
                min = list[i];
                break;
            }
        }

        System.out.println("en yakın büyük sayı : " +max);
        System.out.println("en yakın küçük sayı : " + min);
    }
}
