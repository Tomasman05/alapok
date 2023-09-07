public class Smath {
    public static double pow(double base, double ext){
        double result = base;
        for(int i = 1; i < ext; i++){
           result = result * base;
        }
        return result;
    }
}
