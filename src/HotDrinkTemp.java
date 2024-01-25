public class HotDrinkTemp extends HotDrink {
    private int temp;

    public HotDrinkTemp(String name, int volume, int temp) {
        super(name, volume);
        this.temp = this.temp;
    }

    public int setTemp() {
        return temp;
    }

    @Override
    public void setTemp(int temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "HotDrinkTemp{" +
                "temp" + temp + ", name=" + getName() +
                '}';
    }
}
