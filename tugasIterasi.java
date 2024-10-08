import java.util.Scanner;

public class tugasIterasi {

    public static int hitungPangkatDua(int n) {
        int hasil = 0;
        for (int i = 0; i < n; i++) {
            hasil += n;  // Menjumlahkan n sebanyak n kali
        }
        return hasil;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bilangan = scanner.nextInt();
        
        int hasil = hitungPangkatDua(bilangan);
        System.out.println("Hasil " + bilangan + "^2 adalah: " + hasil);
        
        scanner.close();
    }
}
