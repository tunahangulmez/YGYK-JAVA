public class Main {
    public static void main(String[] args) {
    Student student = new Student(1);
    student.setFirstName("Hamza");
    student.setLastName("Hamzaoglu");
    student.setId(1);
    student.setOgrenciNotu(60);
    
        System.out.println(student.getFirstName());
        
    student.isimDegistir("Kadir");
        
        System.out.println(student.getFirstName());
        
    Teacher teacher = new Teacher(3, "Cografya");
    
        System.out.println("Ogretmenin tecrubesi = " + teacher.getOgretmeninKacinciYili() + " yildir.");
        
    teacher.ogretmeneBirYilEkle();
    
    student.ogrenciSinifiGectiMi();
    
    student.ogrenciSinifAtla(student.getOgrenciNotu());
}
}
