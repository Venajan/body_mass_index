public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 55; // вес в килограммах
        double height = 1.87; // рост в метрах
        double bmi = service.calculate(weight, height);
        

        System.out.println("Вес: " + weight + " кг");
        System.out.println("Рост: " + height + " м");
        System.out.printf("Индекс массы тела: %.0f", bmi);
    }
}