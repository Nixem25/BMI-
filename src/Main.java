public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float height = 186; // ( in cm)
        float weight = 84; //(in kg)
        float bmi = service.calculate(height, weight);
        System.out.println((String.format("%.1f", bmi)));
    }
}
