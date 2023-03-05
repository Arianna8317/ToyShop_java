import java.util.ArrayList;
import java.util.List;

public class MainProgram {
    public static void main(String[] args) {

        System.out.println ( "Добро пожаловать на лотерею игрушек!") ;      
        List<Toy> toys = new ArrayList<Toy>();
        toys.add(new Toy("Пупс", 5, 38));
        toys.add(new Toy("Кукла", 25, 130));     
        toys.add(new Toy("Машинка", 32,140));
        toys.add(new Toy("Мяч", 23, 16));
        toys.add(new Toy("Настольная игра", 3, 86));
        toys.add(new Toy("Пирамидка", 13, 45));
        toys.add(new Toy("Вертушка", 23,300));
        
        ToyRange toysList = new ToyRange(toys);
        toysList.RunLottery(10);
        toysList.addToy(new Toy("Пупс", 5, 138));
        toysList.setWeight("Мяч",120);
        toysList.RunLottery(10);
        System.out.println ( "Выбранные для лотереи игрушки ищите в файле Toys.txt!") ; 

    }
    
    
}
