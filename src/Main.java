public class Main {
    public static void main(String[] args){
        Dipendente nuovodipendente = new Dipendente(12345, 20, "Impiegato", "Amministrazione");
        System.out.println("Matricola: " + nuovodipendente.getMatricola());
        System.out.println("Livello: " + nuovodipendente.getLivello());
        System.out.println("Dipartimento: " + nuovodipendente.getDipartimento());
        System.out.println("Stipendio Base: " + nuovodipendente.getStipendiobase());

        nuovodipendente.setOrariostraordinario(10.0);
        System.out.println("Importo Orario Straordinario: " + nuovodipendente.getOrariostraordinario());


        Operaio operaio = new Operaio(1234, "Vendite");
        System.out.println("Matricola: " + operaio.getMatricola());
        System.out.println("Livello: " + operaio.getLivello());
        System.out.println("Dipartimento: " + operaio.getDipartimento());
        System.out.println("Stipendio Base: " + operaio.getStipendiobase());
        System.out.println("Importo Orario Straordinario: " + nuovodipendente.getOrariostraordinario());

    }

}
