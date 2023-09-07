public class App {
    public static void main(String[] args) throws Exception {
        Outputs out1 = new Outputs();
        out1.printek("A számítás eredménye: ");
        System.out.print(Smath.pow(8, 5)+"\n"); 
        Konvert.konvertal();
    }
}
