package model.exceptions;

public class DomainException extends Exception { // Classe serializable

	private static final long serialVersionUID = 1L; // Tipo de erro que exige tratamento. Outro seria RuntimeException
	
	
	public DomainException(String msg) {
		super(msg);
	}

}
