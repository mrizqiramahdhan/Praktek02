package praktek02;
public class SquareAksi {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.sisi = 4;
        s1.luas = 16;
        
        s1.cetakInfo();
        System.out.println("Keliling Square = "+s1.hitungKeliling());
    }           
}
