public class Operaio extends Dipendente {
    private double stipendio=stipendiobase;
    private double importoOrarioStraordinario=30;
    private String livello="Operaio";
    private String dipartimento;

    //public Operaio(int matricola, String dipartimento) {
      //  super(stipendio, dipartimento);
    //}

    //public Operaio(int matricola, double dipartimento,) {
    //    super(matricola, dipartimento, importoOrarioStraordinario, livello);
    //   this.importoOrarioStraordinario = importoOrarioStraordinario;
    //   this.livello=livello;
    //   this.stipendio=stipendiobase;
    //}

    public Operaio(int matricola, String dipartimento) {
        super(matricola, 10, dipartimento, "Operaio"); // Chiamata al costruttore di Dipendente
        this.importoOrarioStraordinario = 30; // Valore di default specificato nella classe Dipendente
        this.livello = "Operaio"; // Valore di default specificato nella classe Dipendente
        this.stipendio = getStipendiobase(); // Ottieni il valore di default dalla classe Dipendente
    }

}
