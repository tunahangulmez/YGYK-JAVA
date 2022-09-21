
public class Switch {
        public static void main(String[] args) {

    char grade = 'A';

    switch (grade) {
        case 'A':
            System.out.println("Sinifi A ile gectiniz...");
            break;
        
        case 'B':
            System.out.println("Sinifi B ile gectiniz...");
            break;
            
        case 'C':
            System.out.println("Sinifi C ile gectiniz...");
            break;
            
        case 'D':
            System.out.println("Sinifi D ile gectiniz...");
            break;
            
        case 'F':
            System.out.println("Sinifi F ile gectiniz...");
            break;
            
        default:
            System.out.println("Gecersiz not girildi...");
    }
}
}
