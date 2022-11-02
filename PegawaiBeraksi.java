public class PegawaiBeraksi {
    public static void main(String[] args){
        // Membuat Object
        Manager adjie = new Manager();
        Programmer syahril = new Programmer();

        /*Memberi attribute dan memberi nilai */
        adjie.setNama("Adji Marzuki");
        adjie.setGajiPokok(5000000);
        adjie.setTunjangan(1000000);

        syahril.setNama("Syahril Ifanda");
        syahril.setGajiPokok(4000000);
        syahril.setBonus(400000);

        /*Mengakses Method*/
        adjie.cetakInfo();
        System.out.println();
        syahril.cetakInfo();
    }
}
