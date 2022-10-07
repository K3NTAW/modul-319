
import java.util.Arrays;

/**
 * @author Kenta
 * @Klasse 5ia22d
 * @version 07.10.2022
 */
public class App {

    public static void main(String[] args) {
        Land Schweiz = new Land("Schweiz",8000000,"German" );

        Land Japan = new Land();
        Japan.setName("Japan");
        Japan.setLanguage("Japanese");
        Japan.setNumberofpeople(81000000);

        System.out.println(Schweiz);
        System.out.println(Japan);

    }


}
