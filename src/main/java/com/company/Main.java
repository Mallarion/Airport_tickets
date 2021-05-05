package com.company;
import java.util.*;

class Airline {
    public String city;
    public int number_reis;
    public String plane_type;

    public Airline(String city, int number_reis, String plane_type, int time, int day_of_week) {
        this.city = city;
        this.number_reis = number_reis;
        this.plane_type = plane_type;
        this.time = time;
        this.day_of_week = day_of_week;
    }

    public Airline() {

    }

    public String getCity() {
        return city;
    }

    public int getNumber_reis() {
        return number_reis;
    }

    public String getPlane_type() {
        return plane_type;
    }

    public String getTime(int i) {
        if(i==0) {
            int min_n = time;
            int hours = min_n / 60;
            int minutes = min_n % 60;
            if (minutes < 10) {
                String time1 = "" + hours + ":0" + minutes;
                return time1;
            } else {
                String time2 = "" + hours + ":" + minutes;
                return time2;
            }
        }
        else{
            return time+"";
        }
    }

    public int getDay_of_week() {
        return day_of_week;
    }

    public int  time;
    public int day_of_week;

    @Override
    public String toString() {
        return "Airline{" +
                "city='" + city + '\'' +
                ", number_reis=" + number_reis +
                ", plane_type='" + plane_type + '\'' +
                ", time=" + getTime(0) +
                ", day_of_week='" + day_of_week + '\'' +
                '}';
    }


    public static double divide(double a, double b){
        return a/b;
    }

    public static void reys_of_city ( ArrayList <Airline> airlines){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Now you can choose city which you want to fly: Moscow, Minsk, Kiev, Riga. Write your choose");
        String city = scanner.next();
        city= city.trim();
        int chet=0;
        for (int i=0; i<airlines.size(); i++){
            if (airlines.get(i).getCity().equals(city)){
                System.out.println(airlines.get(0));
                chet++;
            }
        }
        if (chet==0){
            System.out.println("We can't find the ticket for you, visit our site lately");
        }
    }
    public static void flight_list (ArrayList<Airline> airlines){
        Scanner scanner= new Scanner(System.in);
        int schet=0;
        System.out.println("Hello, you choose to find all flight in certain day, please, write this day of week for example 'Mon, Tue, Wed, Thu, Fri, Sat, Sun'");
        String otv= scanner.next();
        Map < String, Integer> map= new HashMap<>();
        map.put("Mon", 1);
        map.put( "Tue", 2);
        map.put("Wed",3 );
        map.put("Thu",4 );
        map.put("Fri",5);
        map.put("Sat", 6);
        map.put("Sun",7);
        if (map.containsKey(otv)){
            int vozv= map.get(otv);
            for(int i=0; i<airlines.size(); i++){
                if (airlines.get(i).getDay_of_week()==vozv){
                    System.out.println(airlines.get(i));
                    schet++;
                }
            }

        }
        if(schet==0){
            System.out.println("Your data isn't correct or in this day we can't give you a some tickets");
        }
    }

    public static void flight_list_with_time (ArrayList<Airline> airlines){
        Scanner scanner= new Scanner(System.in);
        int schet=0;
        System.out.println("Hello, you choose to find all flight in certain day, please, write this day of week for example 'Mon, Tue, Wed, Thu, Fri, Sat, Sun'");
        String otv= scanner.next();
        System.out.println("You should to write hours (0-24)");
        int hours_vv =scanner.nextInt();
        System.out.println("You should to write minutes (0-59)");
        int minutes_vv =scanner.nextInt();
        int time_vv= (hours_vv*60)+minutes_vv;
        Map < String, Integer> map= new HashMap<>();
        map.put("Mon", 1);
        map.put( "Tue", 2);
        map.put("Wed",3 );
        map.put("Thu",4 );
        map.put("Fri",5);
        map.put("Sat", 6);
        map.put("Sun",7);
        if (map.containsKey(otv)){
            int vozv= map.get(otv);
            for(int i=0; i<airlines.size(); i++){
                if (airlines.get(i).getDay_of_week()==vozv){
                    String time= airlines.get(i).getTime(1);
                    time= time.trim();
                    int unit_time =Integer.parseInt(time);
                    if (unit_time<=time_vv){
                        System.out.println(airlines.get(i));
                    }
                    schet++;
                }
            }

        }
        if(schet==0){
            System.out.println("Your data isn't correct or in this day we can't give you a some tickets");
        }
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        ArrayList<Airline> airlines= new ArrayList<>();
            Airline airline= new Airline("Minsk", 101, "T-1", 645, 1);
            Airline airline1= new Airline("Kiev", 102, "T-3", 1012, 5);
            Airline airline2= new Airline("Moscow", 103, "T-15", 456, 3);
            Airline airline3= new Airline("Riga", 104, "T-1", 723, 7);
            airlines.add(airline);
            airlines.add(airline1);
            airlines.add(airline2);
            airlines.add(airline3);
        int i=0;
        while(i==0) {
            System.out.println(" Our airport have some functions, if you want to have information about flight in current city, write:'1', if you want to see flight list in current day of week, write '2', if you want to see flight list in current day of week and choose the time which can be comfortable for you, write '3', if you don't want choose any functions, write '0'");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    reys_of_city(airlines);
                    i=1;
                    break;
                case 2:
                    flight_list(airlines);
                    i=1;
                    break;
                case 3:
                    flight_list_with_time(airlines);
                    i=1;
                    break;
                case 0:
                    i=1;
                    break;
                default:
                    System.out.println("Вы ввели неправильные символы, попробуйте снова");
            }
        }
    }
}






