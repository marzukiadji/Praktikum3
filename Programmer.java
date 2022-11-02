public class Programmer extends Pegawai{
    private double bonus;

    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    public double getBonus(){
        return this.bonus;
    }

    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("BONUS\t\t: " + this.getBonus());
    }
}
