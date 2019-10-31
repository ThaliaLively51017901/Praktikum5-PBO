package praktikum5;
import java.io.*;
public class Praktikum5 {
    private double radius;
    public Praktikum5(double radius) {
        this.radius = radius;
}
public void Luas() {
    double luas = 3.14 * radius * radius;
    System.out.println("Luas Lingkaran: "+luas);
}
public void Keliling() {
    double keliling = 2.0 * 3.14 * radius;
    System.out.println("Keliling Lingkaran: "+keliling);
}
public static void main(String[] args) throws Exception{
    DataInputStream dis = new DataInputStream(System.in);
    System.out.print("input radius: ");
    String input = dis.readLine();
    double i = Double.parseDouble(input);
    Praktikum5 A = new Praktikum5(i);
    A.Luas();
    A.Keliling();
    }
}
