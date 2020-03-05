public class BmiService {
    public double calculate(double total) {
        double weight = 60; //кг
        double height = 180; // см
        double index = weight / ((height / 100) * (height / 100));
        return index;
    }
}