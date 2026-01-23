package sass;
public class exercise_28 {

    public static void main(String[] args) {
        
        int age = 25;

        double temperature_celsius = 36.6;

        float temperature_fahrenheit = 305.8f;

        System.out.println();

        String age_to_str = Integer.toString(age);
        System.out.println("age in str: " + age_to_str);
        System.out.println(age_to_str.getClass().getName());

        System.out.println();

        String temperature_celsius_to_str = Double.toString(temperature_celsius);
        System.out.println("temperature celsius in str: " + temperature_celsius_to_str);
        System.out.println(temperature_celsius_to_str.getClass().getName());

        System.out.println();

        String temperature_fahrenheit_to_str = Float.toString(temperature_fahrenheit);;
        System.out.println("temperature fahrenheit in str: " + temperature_fahrenheit_to_str);
        System.out.println(temperature_fahrenheit_to_str.getClass().getName());

    }
}


