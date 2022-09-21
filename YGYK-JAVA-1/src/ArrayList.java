
public class ArrayList {
        public static void main(String[] args) {
            
            String [] ogrenciler = new String[3];
            ogrenciler[0]="Ahmet";
            ogrenciler[1]="Mehmet";
            ogrenciler[2]="Ayse";
            //ogrenciler[3]="Ayse"; //////Eger bu satiri yazarsak arrayimiz 3 elemanli oldugu icin hata aliriz.
            
        for(int i = 0 ; i<ogrenciler.length ; i++) {
            
            System.out.println(i+1 +". Ogrenci : " + ogrenciler[i]);
            
        //For each dongusu
            System.out.println("------------------------------");
        
        for (String ogrenci : ogrenciler) {
            
            System.out.println(ogrenci);
        }
        }
    }
}
