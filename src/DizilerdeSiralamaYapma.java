public class DizilerdeSiralamaYapma {
    public static void main(String[] args) {
        int[] sayilar = {1, 8, 5, 9, 2};
        for (int i = 0; i < sayilar.length - 1; i++) {
            for (int j = 0; j < sayilar.length - 1 - i; j++) {
                if (sayilar[j] > sayilar[j + 1]) {
                    int temp = sayilar[j];
                    sayilar[j] = sayilar[j + 1];
                    sayilar[j + 1] = temp;
                }
            }
        }
        System.out.println("sıralanmış hali:");
        for (int sayi : sayilar) {
            System.out.print(sayi + " ");
        }
    }
}
