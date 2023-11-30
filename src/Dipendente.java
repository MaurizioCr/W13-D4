public class Dipendente {
    double stipendiobase=1000;
    int matricola;
    double orariostraordinario;
    String livello;
    String dipartimento;

    public  Dipendente(int matricola, double orariostraordinario, String dipartimento, String livello){
        this.matricola=matricola;
        this.dipartimento=dipartimento;
        this.orariostraordinario=10;
        this.livello=livello;
    }
    public double getStipendiobase() {
        return stipendiobase;
    }

    public int getMatricola() {
        return matricola;
    }

    public String getDipartimento() {
        return dipartimento;
    }

    public String getLivello() {
        return livello;
    }

    public double getOrariostraordinario() {
        return orariostraordinario;
    }

    public void setOrariostraordinario(double orariostraordinario) {
        this.orariostraordinario = orariostraordinario;
    }

    public void setLivello(String livello) {
        this.livello = livello;
    }

}