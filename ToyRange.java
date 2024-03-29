import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
public class ToyRange {

    private List<Toy> toys;
    private int currentFreeID ;
    public ToyRange(List<Toy> toys) {
        this.toys = toys;
        this.currentFreeID = 0 ;
        for (Toy toy: toys){
            toy.setID(this.currentFreeID++);
            //System.out.println(toy.getID());
        }
    }
    
    public void addToy( Toy toy){
        toy.setID(this.currentFreeID++);       
        this.toys.add(toy);

    }


    public void saveToyChosenForLottery() {
        Toy toy = pickToyForLottery();
        toy.changeAmount(-1); 
        String text = toy.toString();
        try(FileWriter writer = new FileWriter("ToyShop\\Toys.txt", true))
        { 
            writer.write(text);
            writer.append('\n');
            writer.flush();
        }
        catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

    public Toy pickToyForLottery() {
        double totalWeight = 0.0;
        for (Toy toy : toys)
            totalWeight += toy.getWeight();
        double r = Math.random() * totalWeight;
        double countWeight = 0.0;
        for (Toy toy : toys) {
            countWeight += toy.getWeight();
            if (countWeight >= r && toy.getAmount() >0 )
                return toy;
        }
        throw new RuntimeException("Should never be shown.");
    }
   
    public void RunLottery ( int itemsNumber) {
        for ( int i=0; i< itemsNumber; i++) {
            this.saveToyChosenForLottery();
        }
    }

    public void setWeight(String name, int weight){
        for (Toy toy : toys) {
            if (toy.getName().equals(name)) {
                toy.setWeight(weight);
            }
        }
    }
}