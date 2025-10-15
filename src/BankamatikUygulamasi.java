import java.util.Scanner;

public class BankamatikUygulamasi {
    public static void main(String[] args) {
        String dogrukullaniciadi = "user";
        String dogrusifre = "1234";
        int bakiye = 1000;
        Scanner scan = new Scanner(System.in);
        System.out.println("kullanıcı adınızı giriniz:");
        String kullaniciadi = scan.nextLine();
        System.out.println("şifrenizi giriniz:");
        String sifre = scan.nextLine();

        if (dogrukullaniciadi.equals(kullaniciadi) && dogrusifre.equals(sifre)) {
            System.out.println("bankamatik uygulamamıza hoşgeldiniz.");
            int secim;
            do {


                System.out.println("lütfen seçim yapınız");
                System.out.println("1 - Bakiye Görüntüle");
                System.out.println("2 - Para Yatır");
                System.out.println("3 - Para Çek");
                System.out.println("4 - Çıkış");
                secim = scan.nextInt();



                switch (secim) {
                    case 1:
                        System.out.println("bakiyeniz" + bakiye);
                        break;
                    case 2:
                        System.out.println("yatırmak istediğiniz miktarı giriniz:");
                        int miktar = scan.nextInt();
                        if (miktar > 0) {
                            bakiye +=miktar;
                            System.out.println("yeni bakiyeniz:" + (bakiye));
                        } else {
                            System.out.println("geçersiz tutar girdiniz.");
                        }

                        break;
                    case 3:
                        System.out.println("çekmek istediğiniz miktarı giriniz:");
                        int miktar2 = scan.nextInt();
                        if (miktar2 <= bakiye && miktar2 > 0){
                            bakiye-=miktar2;
                            System.out.println("yeni bakiyeniz:" + (bakiye ));}
                        break;
                    case 4:
                        System.out.println("çıkış yaptınız.");
                        break;
                    default:
                        System.out.println("geçersiz seçim. Tekrar deneyiniz.");
                        break;
                }

            }
            while (secim != 4);
            {

            }

        } else {
            System.out.println("kullanıcı adı veya şifre hatalı.");
        }


    }
}

