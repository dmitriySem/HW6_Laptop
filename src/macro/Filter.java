package macro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Filter {

    private Set<Laptop> setObject;
    private Map<String, String> filteringCriteria;

    public Filter() {
    }

    public Filter(Set<Laptop> setObject) {
        this.setObject = setObject;
    }

    public Set<Laptop> getObjects() {
        return setObject;
    }

    public void find(){
        filteringCriteria = new HashMap<>();

        Scanner in = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        boolean flag = true;
        while (flag){
            System.out.println("Введите цифру, соответствующую необходимому критерию поиска:");
            System.out.println("1. Оперативная память");
            System.out.println("2. Объем ЖД");
            System.out.println("3. Операционная система");
            System.out.println("4. Цвет");
            System.out.println("10. Начать поиск");
            System.out.println("0. Выход из поиска");

            int num = in.nextInt();
                switch (num){
                    case 1:
                        System.out.println("Введите размер оперативной памяти в Гигабайтах: ");
                        int gb = in.nextInt();
                        filteringCriteria.put("ОЗУ",String.valueOf(gb));
                        break;
                    case 2:
                        System.out.println("Введите Объем ЖД в Гигабайтах: ");
                        int hardDisk = in.nextInt();
                        filteringCriteria.put("HD",String.valueOf(hardDisk));
                        break;
                    case 3:
                        System.out.println("Введите операционную систему: ");
                        try {
                            String OP = reader.readLine();
                            filteringCriteria.put("OP",OP);
                            break;
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    case 4:
                        System.out.println("Введите цвет: ");
                        try {
                            String Color = reader.readLine();
                            filteringCriteria.put("Color",Color);
                            break;
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    case 10:
                        Set<Laptop> filtering = filtering();
                        filtering.forEach(laptop -> System.out.println(laptop.toString()));
                    case 0:
                        flag = false;
                        break;
                }
        }

    }

    public Set<Laptop> filtering(){
        Set<Laptop> laptops = new HashSet<>(getObjects());
        for(Map.Entry<String, String> entry : filteringCriteria.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

//            System.out.println(objects);
            if (key == "ОЗУ") {
                Set<Laptop> collect = laptops.stream().
                        filter(laptop -> Integer.parseInt(laptop.getOperativeMemory()) < Integer.parseInt(value)).
                        collect(Collectors.toSet());
                laptops.removeAll(collect);
            }
            if (key == "HD"){
                Set<Laptop> collect = laptops.stream().
                        filter(laptop -> laptop.getHardDisk() < Integer.parseInt(value)).
                        collect(Collectors.toSet());
                laptops.removeAll(collect);
            }
            if (key == "OP"){
                Set<Laptop> collect = laptops.stream().
                        filter(laptop -> !laptop.getOperatingSystem().replace(" ", "").toLowerCase()
                                        .equals(value.replace(" ", "").toLowerCase())
                                ).
                        collect(Collectors.toSet());
                laptops.removeAll(collect);
            }
            if (key == "Color"){
                Set<Laptop> collect = laptops.stream().
                        filter(laptop -> !laptop.getColor().replace(" ", "").toLowerCase().
                                        equals(value.replace(" ", "").toLowerCase())
                                ).
                        collect(Collectors.toSet());
                laptops.removeAll(collect);
            }
        }
        return laptops;
    }
}
