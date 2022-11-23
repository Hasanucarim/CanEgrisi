import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ogrenci birey1 = new Ogrenci();
        Ders birey1ders = new Ders();

        birey1.adSoyad = "Ahmet";
        birey1.id = 2222;
        birey1ders.dersAdi = "Matematik";
        birey1ders.ilkSinav = 50;
        birey1ders.ikinciSinav = 80;
        int birey1ortalama = (birey1ders.ilkSinav + birey1ders.ikinciSinav) / 2;

        Ogrenci birey2 = new Ogrenci();
        Ders birey2ders = new Ders();

        birey2.adSoyad = "Mehmet";
        birey2.id = 3222;
        birey2ders.dersAdi = "Matematik";
        birey2ders.ilkSinav = 40;
        birey2ders.ikinciSinav = 30;
        int birey2ortalama = (birey2ders.ilkSinav + birey2ders.ikinciSinav) / 2;

        Ogrenci birey3 = new Ogrenci();
        Ders birey3ders = new Ders();

        birey3.adSoyad = "Ahmet";
        birey3.id = 4222;
        birey3ders.dersAdi = "Matematik";
        birey3ders.ilkSinav = 90;
        birey3ders.ikinciSinav = 80;
        int birey3ortalama = (birey3ders.ilkSinav + birey3ders.ikinciSinav) / 2;


        Ogrenci birey4 = new Ogrenci();
        Ders birey4ders = new Ders();

        birey4.adSoyad = "Ahmet";
        birey4.id = 5222;
        birey4ders.dersAdi = "Matematik";
        birey4ders.ilkSinav = 20;
        birey4ders.ikinciSinav = 35;
        int birey4ortalama = (birey4ders.ilkSinav + birey4ders.ikinciSinav) / 2;


        Ogrenci birey5 = new Ogrenci();
        Ders birey5ders = new Ders();

        birey5.adSoyad = "Ahmet";
        birey5.id = 6222;
        birey5ders.dersAdi = "Matematik";
        birey5ders.ilkSinav = 65;
        birey5ders.ikinciSinav = 57;
        int birey5ortalama = (birey5ders.ilkSinav + birey5ders.ikinciSinav) / 2;


        int ilkSinavOrtalama = (birey1ders.ilkSinav + birey2ders.ilkSinav + birey3ders.ilkSinav + birey4ders.ilkSinav + birey5ders.ilkSinav) / 5;
        int ikinciSinavOrtalama = (birey1ders.ikinciSinav + birey2ders.ikinciSinav + birey3ders.ikinciSinav + birey4ders.ikinciSinav + birey5ders.ikinciSinav) / 5;
        int ortalama = (ilkSinavOrtalama + ikinciSinavOrtalama) / 2;

        int DD = ortalama + ((100 - ortalama) / 6);
        int DC = DD + ((100 - ortalama) / 6);
        int CC = DC + ((100 - ortalama) / 6);
        int CB = CC + ((100 - ortalama) / 6);
        int BB = CB + ((100 - ortalama) / 6);
        int BA = BB + ((100 - ortalama) / 6);
        int AA = BA + ((100 - ortalama) / 6) - 3;


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen öğrenci numaranızı giriniz : ");
        int ogrenciNo = scan.nextInt();
        if (ogrenciNo == 2222) {
            System.out.println("Ogrenci adi : " + birey1.adSoyad);
            System.out.println("Ders Adi :" + birey1ders.dersAdi);
            if (ortalama > birey1ortalama) {
                System.out.println("Dersten kaldiniz");
            } else {
                System.out.println("Geçtiniz");
                System.out.println("Ders Ortalamaniz : " + birey1ortalama);

            }
            if (birey1ortalama > BA) {
                System.out.println("Harf Notunuz : AA");

            } else if (birey1ortalama > BB) {
                System.out.println("Harf Notunuz : BA");

            } else if (birey1ortalama > CB) {
                System.out.println("Harf Notunuz : BB");

            } else if (birey1ortalama > CC) {
                System.out.println("Harf Notunuz : CB");

            } else if (birey1ortalama > DC) {
                System.out.println("Harf Notunuz : CC");
            } else if (birey1ortalama > DD) {
                System.out.println("Harf Notunuz : DC");

            } else {
                System.out.println("Harf notunuz : DD");
            }

        }

        if (ogrenciNo == 3222) {
            System.out.println("Ogrenci adi : " + birey2.adSoyad);
            System.out.println("Ders Adi :" + birey2ders.dersAdi);
            if (ortalama > birey2ortalama) {
                System.out.println("Dersten kaldiniz");
            } else {
                System.out.println("Geçtiniz");
                System.out.println("Ders Ortalamaniz : " + birey2ortalama);

            }
            if (birey2ortalama > BA) {
                System.out.println("Harf Notunuz : AA");

            } else if (birey2ortalama > BB) {
                System.out.println("Harf Notunuz : BA");

            } else if (birey2ortalama > CB) {
                System.out.println("Harf Notunuz : BB");

            } else if (birey2ortalama > CC) {
                System.out.println("Harf Notunuz : CB");

            } else if (birey2ortalama > DC) {
                System.out.println("Harf Notunuz : CC");
            } else if (birey2ortalama > DD) {
                System.out.println("Harf Notunuz : DC");

            } else {
                System.out.println("Harf notunuz : DD");
            }


        }


        if (ogrenciNo == 4222) {
            System.out.println("Ogrenci adi : " + birey3.adSoyad);
            System.out.println("Ders Adi :" + birey3ders.dersAdi);
            if (ortalama > birey3ortalama) {
                System.out.println("Dersten kaldiniz");
            } else {
                System.out.println("Geçtiniz");
                System.out.println("Ders Ortalamaniz : " + birey3ortalama);

            }
            if (birey3ortalama > BA) {
                System.out.println("Harf Notunuz : AA");

            } else if (birey3ortalama > BB) {
                System.out.println("Harf Notunuz : BA");

            } else if (birey3ortalama > CB) {
                System.out.println("Harf Notunuz : BB");

            } else if (birey3ortalama > CC) {
                System.out.println("Harf Notunuz : CB");

            } else if (birey3ortalama > DC) {
                System.out.println("Harf Notunuz : CC");
            } else if (birey3ortalama > DD) {
                System.out.println("Harf Notunuz : DC");

            } else {
                System.out.println("Harf notunuz : DD");
            }
        }
        if (ogrenciNo == 5222) {
            System.out.println("Ogrenci adi : " + birey4.adSoyad);
            System.out.println("Ders Adi :" + birey4ders.dersAdi);
            if (ortalama > birey4ortalama) {
                System.out.println("Dersten kaldiniz");
            } else {
                System.out.println("Geçtiniz");
                System.out.println("Ders Ortalamaniz : " + birey4ortalama);

            }
            if (birey4ortalama > BA) {
                System.out.println("Harf Notunuz : AA");

            } else if (birey4ortalama > BB) {
                System.out.println("Harf Notunuz : BA");

            } else if (birey4ortalama > CB) {
                System.out.println("Harf Notunuz : BB");

            } else if (birey4ortalama > CC) {
                System.out.println("Harf Notunuz : CB");

            } else if (birey4ortalama > DC) {
                System.out.println("Harf Notunuz : CC");
            } else if (birey4ortalama > DD) {
                System.out.println("Harf Notunuz : DC");

            } else {
                System.out.println("Harf notunuz : DD");
            }
        }
        if (ogrenciNo == 6222) {
            System.out.println("Ogrenci adi : " + birey5.adSoyad);
            System.out.println("Ders Adi :" + birey5ders.dersAdi);
            if (ortalama > birey5ortalama) {
                System.out.println("Dersten kaldiniz");
            } else {
                System.out.println("Geçtiniz");
                System.out.println("Ders Ortalamaniz : " + birey5ortalama);

            }
            if (birey5ortalama > BA) {
                System.out.println("Harf Notunuz : AA");

            } else if (birey5ortalama > BB) {
                System.out.println("Harf Notunuz : BA");

            } else if (birey5ortalama > CB) {
                System.out.println("Harf Notunuz : BB");

            } else if (birey5ortalama > CC) {
                System.out.println("Harf Notunuz : CB");

            } else if (birey5ortalama > DC) {
                System.out.println("Harf Notunuz : CC");
            } else if (birey5ortalama > DD) {
                System.out.println("Harf Notunuz : DC");

            } else {
                System.out.println("Harf notunuz : DD");
            }
        }

    }
}

