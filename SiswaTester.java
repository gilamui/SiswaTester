//Driver class
import java.util.Scanner;
public class SiswaTester {
    public static void main(String[] args) {
        System.out.println("Inputkan Nama Siswa");
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        System.out.println("Inputkan ID Siswa");
        int id = input.nextInt();
        System.out.println("Inputkan IPK Siswa");
        double ipk = input.nextDouble();

        Siswa averil = new Siswa(id, nama, ipk);
        averil.print();
        // object
        // Class object = new constructor
        Siswa lam = new Siswa();
        Siswa zam = new Siswa();
        Siswa nibras = new Siswa();
        Siswa gus = new Siswa();
        Siswa meno = new Siswa();
        Siswa tegar = new Siswa();

        lam.id = 19;
        lam.nama = "gilam";
        lam.ipk = 100;
                
        zam.id = 22;
        zam.nama = "azzam";
        zam.ipk = 100;

        nibras.id = 29;
        nibras.nama = "ibra";
        nibras.ipk = 100;
        
        gus.id = 26;
        gus.nama = "burhan";
        gus.ipk = 100;

        meno.id = 24;
        meno.nama = "moreno";
        meno.ipk = 0;

        tegar.id = 16;
        tegar.nama = "tegar";
        tegar.ipk =100;

        lam.print();
        zam.print();
        nibras.print();
        gus.print();
        meno.print();
        tegar.print();
        input.close();
    }
}