import java.util.Scanner;

public class Presentasi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Daftar resep makanan
        String[] resepMakanan = {
            "1. Nasi Goreng",
            "2. Mie Goreng",
            "3. Ayam Bakar",
            "4. Sate",
            "5. Gado-gado"
        };

        // Daftar detail resep makanan
        String[] detailResep = {
            "Nasi Goreng: Nasi, bawang merah, bawang putih, telur, kecap, garam, minyak.",
            "Mie Goreng: Mie, bawang merah, bawang putih, telur, saus tiram, garam, minyak.",
            "Ayam Bakar: Ayam, bawang merah, bawang putih, cabai, garam, minyak.",
            "Sate: Daging sapi/ayam, bawang merah, bawang putih, cabai, kecap, garam, tusuk sate.",
            "Gado-gado: Sayuran (kentang, tauge, sawi, tahu, tempe), bumbu kacang, garam."
        };

        // Menampilkan daftar resep makanan
        System.out.println("Daftar Resep Makanan:");
        for (String resep : resepMakanan) {
            System.out.println(resep);
        }

        // Meminta pengguna memilih resep
        System.out.print("Pilih nomor resep makanan: ");
        int pilihan = input.nextInt();

        // Memastikan pilihan ada dalam rentang yang benar
        if (pilihan >= 1 && pilihan <= resepMakanan.length) {
            // Menampilkan detail resep makanan yang dipilih
            System.out.println("Detail Resep Makanan:");
            System.out.println(detailResep[pilihan - 1]);
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}