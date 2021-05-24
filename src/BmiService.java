public class BmiService {
    public float calculate (float height, float weight) {
        float bmi;
        bmi = weight/(( height/100)*( height/100));
        if (bmi < 18.5) {
            System.out.println("Underweight");
        }
        else if (bmi > 18.5 && bmi < 24.9) {
            System.out.println("Normal weight");
        }
        else if (bmi > 25 && bmi < 29.9) {
            System.out.println("Overweight");
        }
        else if (bmi > 30) {
            System.out.println("Obesity");
        }
        return bmi;

    }
}
