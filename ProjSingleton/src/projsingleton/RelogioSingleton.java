package projsingleton;
public class RelogioSingleton {

    private static RelogioSingleton instancia;
    Data dt = new Data("23/03/2020");
    Horario hr = new Horario("02:30:50");
    String relogio;
    
    private RelogioSingleton(){
        setRelogio(relogio);
    }
    
    public static RelogioSingleton getInstance(){
        if (instancia==null){
            instancia = new RelogioSingleton();
        }
        return instancia;
    }

    public String getRelogio() {
        return relogio;
    }

    public void setRelogio(String relogio) {
        this.relogio = "Data: "+dt.databr+" - "+hr.hora;
    }
    
}
