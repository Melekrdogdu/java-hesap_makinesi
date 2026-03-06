import java.util.Scanner;

public class hesap_mak { // Sınıf ismini dosya isminle aynı yapmayı unutma!

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int selection;

        do {
            System.out.println("\n--- HESAP MAKİNESİ MENÜSÜ ---");
            System.out.println("1-Toplama");
            System.out.println("2-Çıkarma");
            System.out.println("3-Çarpma");
            System.out.println("4-Bölme");
            System.out.println("0-Çıkış");
            System.out.print("Yapmak istediğiniz işlemi seçin: ");

            selection = input.nextInt();

            if (selection >= 1 && selection <= 4) {
                System.out.print("Birinci sayıyı girin: "); // Buraya ; ekledik
                double sayi1 = input.nextDouble();
                System.out.print("İkinci sayıyı girin: "); // Buraya ; ekledik
                double sayi2 = input.nextDouble();

                if (selection == 1) {
                    System.out.println("Sonuç: " + (sayi1 + sayi2));
                } else if (selection == 2) {
                    System.out.println("Sonuç: " + (sayi1 - sayi2));
                } else if (selection == 3) {
                    System.out.println("Sonuç: " + (sayi1 * sayi2));
                } else if (selection == 4) {
                    if (sayi2 != 0) {
                        System.out.println("Sonuç: " + (sayi1 / sayi2));
                    } else {
                        System.out.println("Hata: Bir sayı sıfıra bölünemez!");
                    }
                }
            } else if (selection != 0) {
                System.out.println("Geçersiz bir seçim yaptınız, lütfen tekrar deneyiniz.");
            }

        } while (selection != 0); // do bloğunun bittiği yer burası

        System.out.println("Programdan çıkıldı. Tekrar görüşmek üzere!");
        input.close();
    }
}