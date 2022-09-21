
public class ArrayList2 {
        public static void main(String[] args) {
        
            double[] myList = {1.2,1.3,1.4,1.5};
            double toplam = 0;
            double max = myList[0];
            
                for (double list:myList) {
                   
                  if (max<list) {
                      
                      max = list;
                  }  
                    System.out.println(list);
            
                toplam = toplam + list;
                }
            
            System.out.println("Sayilarin toplami = " + toplam);
            System.out.println("En buyuk sayi = " + max);
            
//--------------------------------------------------------------------------------------------------------------------

            String[][] cities = new String[2][2];
            
            cities[0][0] = "Istanbul";
            cities[0][1] = "Ankara";
            cities[1][0] = "Diyarbakir";
            cities[1][1] = "Gaziantep";
            
            for (int i = 0; i<=1; i++){
                for (int j = 0; j<=1; j++) {
                    
                    System.out.println(cities[i][j]);
                }
                
                //contat
                //startWwith
                //endsWith
                //getChars
                //indexIf
                //lastIndexOf
            }
    }
}
