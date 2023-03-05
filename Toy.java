public class Toy {

    private int id;
    private String name;
    private int amount;
    private double freqWeight;

    public Toy( String name, int amount, double weight) {

        this.name = name;
        this.amount = amount;
        this.freqWeight = weight;
    }

    public void setWeight(float weight) {
        this.freqWeight = weight;
    }

    public double getWeight() {
        return this.freqWeight;
    }
    public void setID(float weight) {
        this.freqWeight = weight;
    }

    public double getID() {
        return freqWeight;
    }
    public int getAmount(){
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
 
    public void changeAmount(int decrement) {
        this.amount += decrement;
    }


    @Override
    public String toString() {
        return "Игрушка [id=" + id + ", название = " + name + ", количество =" + amount + "]"; 
    }
}
