import java.util.Scanner;
import java.util.Random;

public class SanslıSayiyiBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int tutulansayi = random.nextInt(100) + 1;
        boolean dogrutahmin = false;
        System.out.println("1 ile 100 arasında sayı tuttum tahmin ediniz.");

        while (!dogrutahmin) {
            System.out.println("tahmininiz:");
            int tahmin = scan.nextInt();
            if (tahmin < tutulansayi){
                System.out.println("sayı daha büyük tekrar deneyiniz:");}
                else if (tahmin>tutulansayi){
                System.out.println("sayı daha küçük tekrar deneyiniz:");
                }
                else{
                System.out.println("sayıyı doğru buldunuz.tebrikler.");
            }
            }



        }

    }

