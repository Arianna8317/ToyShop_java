import java.util.ArrayList;
import java.util.List;

public class MainProgram {
    public static void main(String[] args) {

        System.out.println ( "Добро пожаловать на лотерею игрушек!") ;      
        List<Toy> toys = new ArrayList<Toy>();
        toys.add(new Toy("Кукла", 25, 30));
        toys.add(new Toy("Машинка", 32,40));
        toys.add(new Toy("Мяч", 23, 56));
        toys.add(new Toy("Настольная игра", 3, 68));
        toys.add(new Toy("Пирамидка", 35, 18));
        
        ToyRange toysList = new ToyRange(toys);
        int numberLotteryToys = 5;
        for ( int i=0; i< numberLotteryToys; i++) {
            toysList.saveToyChosenForLottery();
        }
        


    }
    
    
}
