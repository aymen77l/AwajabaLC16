public class repas {
	private int numero ;
	private LocalDate date ;
	
	public repas(int numero, LocalDate date){
		super();
		this.numero = numero;
		this.date=date;
		
	}
	
	public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
 
