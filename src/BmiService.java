public class BmiService {
    public double calculate (int weight, double height){
        double index = weight / (height*height);
        int bmi = (int) index;
        return bmi;
    }
}