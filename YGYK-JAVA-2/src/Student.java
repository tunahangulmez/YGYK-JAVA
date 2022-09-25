public class Student extends Inheritance {
    
    private int ogrenciKacinciSinif;
    private int ogrenciNotu;
    
        public Student(int ogrenciKacinciSinif) {
        this.ogrenciKacinciSinif = ogrenciKacinciSinif;
    }

    public int getOgrenciNotu() {
        return ogrenciNotu;
    }

    public void setOgrenciNotu(int ogrenciNotu) {
        if (ogrenciNotu >= 0 && ogrenciNotu <= 100) {
            this.ogrenciNotu = ogrenciNotu;
        }
        else {
            System.out.println("Hatali not girisi yaptiniz... Lutfen degeri 0 ile 100 arasinda giriniz.");
            
        }
        
    }

    public int getOgrenciKacinciSinif() {
        return ogrenciKacinciSinif;
    }

    public void setOgrenciKacinciSinif(int ogrenciKacinciSinif) {
        this.ogrenciKacinciSinif = ogrenciKacinciSinif;
    }
    
    public void ogrenciSinifiGectiMi() {
        
        if (ogrenciNotu>=50 && ogrenciNotu<100) {
            System.out.println("Ogrenci sinifi gecti...");
        }
        else if (ogrenciNotu>0 && ogrenciNotu<50) {
            System.out.println("Ogrenci sinifta kaldi...");
    }
        else {
            System.out.println("Not yanlis girildi lutfen yukarida cikan hatayi kontrol ediniz...");
        }
    }
    public void ogrenciSinifAtla (int ogrenciNotu) {
        this.ogrenciNotu = ogrenciNotu;
        if (ogrenciNotu>=50 && ogrenciNotu<100) {
            System.out.println("Ogrenci bir sinif atladi...");
        this.ogrenciKacinciSinif = ogrenciKacinciSinif+1;
            System.out.println("Ogrencinin yeni sinifi = " + ogrenciKacinciSinif + " dir.");
        }
        else if (ogrenciNotu>0 && ogrenciNotu<50) {
            System.out.println("Ogrenci ayni sinifta devam etmeli...");
    }
        else {
            System.out.println("Not yanlis girildi lutfen yukarida cikan hatayi kontrol ediniz...");
        }
    }
}
