
public class Main {
        public static void main(String[] args) {
            
        System.out.println("Merhaba, bu projem Yazılım Geliştirici Yetiştirme Kampı kapsamında ilk ödev projemdir.");
//------------------------------------------------------------------------------------------------------------------------------------------------        
        int ogrenciSayisi = 25;        
        System.out.println("Sinifimizin ogrenci sayisi: " + ogrenciSayisi);
        
        byte sayi = 10;
        //sayi = 128; Hata verir cunku Java default olarak Int deger dondurur.
        int sayi1 = 10;
        double sayi2 = 10.0;
        
        String sehir = "Bursa";
        char karakter = 'B';
        
        boolean trueDondur = true;
        boolean falseDondur = false;
           
//------------------------------------------------------------------------------------------------------------------------------------------------
        
    int a = 10;
        
        if (a < 100) {
            System.out.println("Sayi 100'den kucuktur.");
}
        
        else if (a == 100) {
            System.out.println("Sayi 100'e esittir.");
        }
        
        else {
            System.out.println("Sayi 100'den buyuktur.");
        }
        
 //------------------------------------------------------------------------------------------------------------------------------------------------

    int a1 = 999;
    int b1 = 1;
    int c1 = 277;
    
    if (a1>b1 && a1>c1) {
        System.out.println("En buyuk sayi = " + a1);
    }
    else if (b1>a1 && b1>c1) {
        System.out.println("En buyuk sayi = " + b1);
    }
    else {
        System.out.println("En buyuk sayi = " + c1);
    }
    
    }
}

