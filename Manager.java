public class Manager extends Pegawai{
    private double tunjangan;

    public void setTunjangan(double tunjangan){
        this.tunjangan = tunjangan;
    }
    public double getTunjangan(){
        return this.tunjangan;
    }

    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("TUNJANGAN\t: " + this.getTunjangan());
    }
}
