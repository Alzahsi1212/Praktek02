package praktek02;

public class RectangleAksi {
    public static void main(String[] args) {
        
        Rectangle rl = new Rectangle();
        rl.panjang = 6;
        rl.lebar = 2;
        
        rl.cetakInfo();
        System.out.println("Luas Rectangle = "+rl.hitungLuas());
        rl.cetakLuas();
        
        Rectangle r2 = new Rectangle();
        r2.cetakInfo();
        
        Rectangle r3 = new Rectangle(10,4);
        r3.cetakInfo();
    }
    
}
