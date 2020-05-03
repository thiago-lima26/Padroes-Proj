package projsingleton;
public class RelogioSingleton {

    private static RelogioSingleton instancia;
    Data dt = new Data();
    Horario hr = new Horario();
    String relogio;
    
    private RelogioSingleton(){
       setRelogio("01/01/1900", "00:00:00");
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

    public void setRelogio(String data, String hora) {
        this.dt.setData(data);
        this.hr.setHora(hora);
        this.relogio = "Data: "+dt+", " + "Horario " + hr.getHora();
    }

	@Override
	public String toString() {
		return "RelogioSingleton - " + dt + ", " + hr;
	}
    
}
