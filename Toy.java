public class Toy {

    private int id;
    private String name;
    private int amount;
    private int freqWeight;

    public Toy( String name, int amount, int weight) {

        this.name = name;
        this.amount = amount;
        this.freqWeight = weight;
    }

    public void setWeight(int weight) {
        this.freqWeight = weight;
    }

    public int getWeight() {
        return this.freqWeight;
    }
    public void setID(int id) {
        this.id = id;
    }

    public int getID() {
        return this.id;
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
        return "Для лотереи выбрана игрушка " + name + " c id = " + id +", оставшееся количество =" + amount ; 
    }
}
