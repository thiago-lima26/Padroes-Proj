package projsingleton;
public class ProjSingleton {
    public static void main(String[] args) {

        RelogioSingleton r1 = RelogioSingleton.getInstance();
        System.out.println(r1);
        
        r1.setRelogio("30/04/2020", "12:59:30");
        System.out.println(r1);
        
        
    }
}
