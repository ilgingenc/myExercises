import java.util.Scanner;

public class FaktoriyelHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Faktoriyelini almak istediğiniz sayıyı giriniz:");
        int sayi = scan.nextInt();

        if (sayi<0){
            System.out.println("sayı negatif olamaz.");
        }
        long faktoriyel=1;
        for (int i=1; i<=sayi; i++){
            faktoriyel *=i;

        }
        System.out.println("sayının faktoriyeli:" + faktoriyel);

    }
}
