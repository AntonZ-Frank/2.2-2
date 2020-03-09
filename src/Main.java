public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 60;  // кг
        double height = 180; // см
        double index = service.calculate(height, weight);
        System.out.printf("%.2f", index);
    }
}
