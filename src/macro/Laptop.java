package macro;

import java.util.ArrayList;
import java.util.List;


public class Laptop {

        // Создание полей
        private String model;
        private float diagonal;
        private String screenResolution;
        private boolean dvdRom;
        private int hardDisk;
        private String operativeMemory;
        private String operatingSystem;
        private String color;
        private String brand;
        private String country;
        private String language;

        // Создание пустого конструктора для работы с методами
        public Laptop() {
        }

        // Создание конструктора для создания экземпляров класса
        public Laptop(String model, float diagonal, String screenResolution, boolean dvdRom, int hardDisk,
                      String operativeMemory, String operatingSystem, String color, String brand, String country, String language) {
            this.model = model;
            this.diagonal = diagonal;
            this.screenResolution = screenResolution;
            this.dvdRom = dvdRom;
            this.hardDisk = hardDisk;
            this.operativeMemory = operativeMemory;
            this.operatingSystem = operatingSystem;
            this.color = color;
            this.brand = brand;
            this.country = country;
            this.language = language;
        }

        // Создание методов get\set Для работы с private полями
        public String getModel() {return model;}
        public float getDiagonal() {return diagonal;}
        public String getScreenResolution() {return screenResolution;}
        public boolean isDvdRom() {return dvdRom;}
        public int getHardDisk() {return hardDisk;}
        public String getOperativeMemory() {return operativeMemory;}
        public String getOperatingSystem() {return operatingSystem;}
        public String getColor() {return color;}
        public String getBrand() {return brand;}
        public String getCountry() {return country;}
        public String getLanguage() {return language;}


    @Override
    public String toString() {
        return "\nLaptop  ->  " + model + "\nbrand = " + brand + ",\ncountry = " + country + ",\nlanguage = " + language + ",\ndiagonal = " + diagonal + ",\nscreenResolution = "
                + screenResolution
                + ",\ndvdRom = " + dvdRom + ",\nhardDisk = " + hardDisk + ",\noperativeMemory = " + operativeMemory
                + ",\noperatingSystem = " + operatingSystem + ",\ncolor = " + color + "\n";
    }



}
