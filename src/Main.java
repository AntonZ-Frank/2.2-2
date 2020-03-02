public class Main {
    public static void main(String[] args)
    {
        BmiService service = new BmiService();
        double total = 0;
        double index = service.calculate(total);
        System.out.println(index);
    }
}
