
public class AsalMi {
    public static void main(String[] args) {
        
        int a = 25;
        int remainder = a % 2;
        System.out.println(remainder);
        boolean asalMi = true;
        
        if(a == 1) {
            System.out.println("Sayi asal degildir...");
            return;
        }
        if(a<1) {
            System.out.println("Gecersiz sayi girdiniz...");
            return;
        }
        
        for (int i=2; i<a; i++) {
            
            if (a % i == 0) {
                
                asalMi = false;
            }
     
        }
           if (asalMi) {
            System.out.println("Sayi asaldir...");
        }
        else {
            System.out.println("Sayi asal degildir...");
        }
    }
}    

