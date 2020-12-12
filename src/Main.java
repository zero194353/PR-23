import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class City {
    private String country;
    private ArrayList<String> cities = new ArrayList<>();

    City(String country, String[] cities){
        this.country = country;
        for (int i=0; i < cities.length; i++){
            this.cities.add(cities[i]);
        }
    }

    String getCountry(){
        return country;
    }

    ArrayList<String> getCities(){
        return cities;
    }
}

public class Main{
    public static void main(String[] args) {
        City rus = new City("Россия", new String[]{"Москва", "Воронеж", "Химки", "Сочи"});
        City bgr = new City("Австрия ", new String[]{"Вена", "Грац", "Линц", "Баден"});
        City grc = new City("Германия", new String[]{"Берлин", "Гамбург", "Мюнхен", "Кёльн"});

        Map<String, ArrayList<String>> map = new HashMap();
        map.put(rus.getCountry(), rus.getCities());
        map.put(bgr.getCountry(), bgr.getCities());
        map.put(grc.getCountry(), grc.getCities());

        System.out.println(map.toString());
    }
}
