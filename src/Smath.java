public class Smath {
    public static double pow(double base, double ext){
        double result = base;
        if(ext == 0){
            result = 1;
        }
        else if(ext ==1){
            result = base;
        }
        else{
            for(int i = 1; i < ext; i++){
                result *= base;
            }
        }
        return result;
    }
}
