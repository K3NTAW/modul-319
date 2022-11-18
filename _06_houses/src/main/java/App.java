
import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args){
        List<House> myHouses = new ArrayList<>();
        myHouses.add(new House(50,"Im GLockenacker", "white",3000));
        myHouses.add(new House(17,"Witikonerstrasse", "blue",4000));
        myHouses.add(new House(13,"Dorfstrasse","black", 2400));
        myHouses.add(new House(89,"Feldhof","brown",3500));
        myHouses.add(new House(178,"Roggenfeld","white",2800));
        System.out.println(myHouses);
    }
}
