public class Teacher extends Inheritance {
    private int ogretmeninKacinciYili;
    private String ogretmenBransi;

        public Teacher(int ogretmeninKacinciYili, String ogretmenBransi) {
        this.ogretmeninKacinciYili = ogretmeninKacinciYili;
        this.ogretmenBransi = ogretmenBransi;
    }
        
    public String getOgretmenBransi() {
        return ogretmenBransi;
    }

    public void setOgretmenBransi(String ogretmenBransi) {
        this.ogretmenBransi = ogretmenBransi;
    }
    
    public int getOgretmeninKacinciYili() {
        return ogretmeninKacinciYili;
    }

    public void setOgretmeninKacinciYili(int ogretmeninKacinciYili) {
        this.ogretmeninKacinciYili = ogretmeninKacinciYili;
    }
    public void ogretmeneBirYilEkle() {
        
        this.ogretmeninKacinciYili= ogretmeninKacinciYili + 1;
        System.out.println("Ogretmenin Yilina 1 yil eklendi. Ogretmenin yeni tecrubesi = " + ogretmeninKacinciYili + " yildir.");
}
}
