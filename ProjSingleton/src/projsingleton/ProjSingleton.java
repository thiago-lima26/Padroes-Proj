package projsingleton;
public class ProjSingleton {
    public static void main(String[] args) {

        RelogioSingleton rl = RelogioSingleton.getInstance();
        
        System.out.println(rl.relogio);
    }
}
