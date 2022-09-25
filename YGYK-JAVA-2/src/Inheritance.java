public class Inheritance {
    String firstName;
    String lastName;
    int id;
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void isimDegistir(String firstName) {
        System.out.println("Isim degistiriliyor...");
        this.firstName = firstName;
}
}
