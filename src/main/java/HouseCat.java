public class HouseCat implements Drivable, Domesticatable, Tradable{
    private int maxSpeed;

    /**
     * Creates a really fast HouseCat object
     */
    public HouseCat() { this.maxSpeed = 10; }

    /**
     * This cat makes a sound
     * @return
     */
    @Override
    public String sound() {
        return "Meow";
    }

    /**
     * Go faster
     */
    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    /**
     * Whoa there cat
     */
    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
        this.maxSpeed--;
    }

    /**
     * If you return this cat's speed you cannot also return its position
     * @return
     */
    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * Basically free
     * @return
     */
    @Override
    public int getPrice() {
        return 1;
    }

    /**
     * Returns a string describing this cat
     * @return
     */
    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed + ")";
    }
}
