/**
 * @author Kenta
 * @Klasse 5ia22d
 * @version 07.10.2022
 */
public class Land {
    private String name;
    private int numberofpeople;
    private String language;

    public Land(String name, int numberofpeople, String language) {
        this.name = name;
        this.numberofpeople = numberofpeople;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberofpeople() {
        return numberofpeople;
    }

    public void setNumberofpeople(int numberofpeople) {
        this.numberofpeople = numberofpeople;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Land{" +
                "name='" + name + '\'' +
                ", numberofpeople=" + numberofpeople +
                ", language='" + language + '\'' +
                '}';
    }
}
