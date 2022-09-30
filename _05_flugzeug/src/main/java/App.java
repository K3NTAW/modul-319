import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
public class App {
    public static void main(String[] args){
        List<Plane> myCars = new ArrayList<>();
        myCars.add(new Plane("ANA", 120, 1203000,"Blue"));
        myCars.add(new Plane("SWISS", 90, 2137000, "White"));
        myCars.add(new Plane("ANA", 150, 1220000, "Black"));
        myCars.add(new Plane("ANA", 140, 1525000,"White"));
        myCars.add(new Plane("SWISS", 230, 1970000, "Chrome"));
        System.out.println(myCars);
    }
}

