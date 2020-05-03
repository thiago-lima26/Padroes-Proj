package projsingleton;

public class Horario {

    int hh,mm,ss;
    String hora;

    Horario (){
        
    }
    public int getHh() {
        return hh;
    }

    public void setHh(int hh) {
        if (hh>=0&&hh<=23)
            this.hh = hh;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        if (mm>=0&&mm<=59)    
            this.mm = mm;
    }

    public int getSs() {
        return ss;
    }

    public void setSs(int ss) {
        if (ss>=0&&ss<=59)
            this.ss = ss;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        String divh[]=hora.split(":");
        setHh(Integer.parseInt(divh[0]));
        setMm(Integer.parseInt(divh[1]));
        setSs(Integer.parseInt(divh[2]));
        this.hora = this.hh+":"+this.mm+":"+this.ss;
    }
	@Override
	public String toString() {
		return "Horario: [" + hh + ":" + mm + ":" + ss + "]";
	}
    
}
