import java.util.List;

public class HotDrinkMashine implements Mashine{
    private final List<HotDrink> hotDrinksList;
    public HotDrinkMashine (List<HotDrink> hotDrinksList) {

        this.hotDrinksList = hotDrinksList;
    }

    @Override
    public HotDrink getProduct(String name) {
        for (HotDrink product : hotDrinksList){
            if (product.getName().equals(name)){
                int volume = product.getVolume();
                return product;
            }
        }
        return null;
    }

    public HotDrinkTemp getProduct(String name, int volume, int temp){
        for (HotDrink product : hotDrinksList)
            if (product instanceof HotDrinkTemp) {
                if (product.getName().equals(name) && ((HotDrinkTemp) product).getVolume() == volume && ((HotDrinkTemp) product).getTemp() == temp) {
                    return (HotDrinkTemp) product;
                }
            }
        return null;

    }
}

