import java.util.ArrayList;
import java.util.List;

public class MainProgram {
    public static void main(String[] args) {

        System.out.println ( "Добро пожаловать на лотерею игрушек!") ;      
        List<Toy> toys = new ArrayList<Toy>();
        toys.add(new Toy("Пупс", 5, 38));
        toys.add(new Toy("Кукла", 25, 130));     
        toys.add(new Toy("Машинка", 32,140));
        toys.add(new Toy("Мяч", 23, 56));
        toys.add(new Toy("Настольная игра", 3, 6));
        toys.add(new Toy("Пирамидка", 13, 45));
        toys.add(new Toy("Вертушка", 65, 22));
        
        ToyRange toysList = new ToyRange(toys);
        int numberLotteryToys = 10;
        for ( int i=0; i< numberLotteryToys; i++) {
            toysList.saveToyChosenForLottery();
        }
        
        

    }
    
    
}
