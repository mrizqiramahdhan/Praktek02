package praktek02;
public class Square {
    double sisi;
    double luas;
    
    void cetakInfo(){
        System.out.println("==============");
        System.out.println("sisi : "+sisi);
        System.out.println("luas : "+luas);
        System.out.println("==============");
    }
    
    double hitungKeliling(){
        double  keliling;
        keliling=sisi*luas;
        return keliling;
    }
}
