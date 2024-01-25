//    Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int
//    температура.
//    Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат
//    и реализовать перегруженный метод getProduct(int name, int volume, int temperature)
//    выдающий продукт соответствующий имени, объему и температуре
//    В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат
//    и воспроизвести логику заложенную в программе
//    Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
//    Формат сдачи: Ссылка на гитхаб-проект Подписать фамилию и номер группы


import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotDrinkTemp HotDrink1 = new HotDrinkTemp("Американо", 100, 75);
        HotDrinkTemp HotDrink2 = new HotDrinkTemp("Капучино", 130, 80);
        HotDrinkTemp HotDrink3 = new HotDrinkTemp("Латте", 170, 75);

//        List<HotDrink> hotDrinksList = null;
//        HotDrinkMashine hotDrinkMashine = new HotDrinkMashine(hotDrinksList);
        HotDrink1 = new HotDrinkTemp("Американо", 150, 75);
        HotDrink2 = new HotDrinkTemp("Капучино", 2000, 80);
        HotDrink3 = new HotDrinkTemp("Латте", 300, 75);
    }
}