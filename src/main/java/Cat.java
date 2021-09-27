/* A sample class.
 */
public class Cat implements Domesticatable, Tradable{

    public Cat(){    }

    @Override
    public string sound() {
        return "Meow!";
    }

    @Override
    public int getPrice() {
        return 5;
    }
}
