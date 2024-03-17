package macro;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // Создание объектов класса Laptop
        Laptop hp_pailion_g6 = new Laptop("hp_pailion_g6", 16, "4k",
                true, 500, "16", "Windows", "black", "HP", "U.S.A.", "AmericaLanguage");
        Laptop hp_galaxy_x64 = new Laptop("hp_galaxy_x64", 14, "FullHD",
                true, 500, "8", "Windows", "white", "HP", "U.S.A.", "AmericaLanguage");
        Laptop samsung_a52 = new Laptop("samsung_a52", 18, "FullHD",
                true, 300, "8", "Windows", "black", "Samsung", "Korea", "KoreaLanguage");
        Laptop samsung_m31s = new Laptop("samsung_m31s", 16, "4k",
                false, 1000, "16", "Linux", "black", "Samsung", "Korea", "KoreaLanguage");
        Laptop lenovo_gtx76 = new Laptop("lenovo_gtx76", 16, "FullHD",
                true, 700, "8", "Windows", "white", "Lenovo", "China", "ChinaLanguage");
        Laptop macbook_14pro = new Laptop("macbook_14pro", 17, "4k",
                false, 1000, "8", "ios", "white", "Apple", "U.S.A.", "AmericaLanguage");
        Laptop asus_x515 = new Laptop("asus_x515", 17, "FullHD",
                true, 300, "4", "Windows", "black", "Asus", "taiwan", "ChinaLanguage");
        Laptop acer_air5 = new Laptop("acer_air5", 19, "FullHD",
                true, 600, "8", "Windows", "black", "Acer", "taiwan", "ChinaLanguage");
        Laptop acer_air6 = new Laptop("acer_air6" ,18, "4k",
                false, 500, "16", "Windows", "black", "Acer", "taiwan", "ChinaLanguage");
        Laptop acer_a313 = new Laptop("acer_a313", 16, "FullHD",
                true, 500, "8", "Windows", "black", "Acer", "taiwan", "ChinaLanguage");
// Создание множества
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(hp_pailion_g6);
        laptops.add(hp_galaxy_x64);
        laptops.add(samsung_a52);
        laptops.add(samsung_m31s);
        laptops.add(lenovo_gtx76);
        laptops.add(macbook_14pro);
        laptops.add(asus_x515);
        laptops.add(acer_air5);
        laptops.add(acer_air6);
        laptops.add(acer_a313);

        // создание нового объекта вызова методов
        Laptop FilterLaptop = new Laptop();
        laptops.forEach(laptop -> System.out.println(laptop.toString()));
// вызов метода фильтрации по определеннеым параметрам
        // System.out.println("по вашему запросу найдено: " + FilterLaptop.filter(laptops));

// вызод метода фильтрации по заданным пользователем критериям
//        System.out.println(FilterLaptop.newFilter(laptops));
    }
}
