package cantine;

public class Matin extends Menu {

    public String cereale;

    public String getCereale() {
		return cereale;
	}

	public void setCereale(String cereale) {
		this.cereale = cereale;
	}

    public void afficherMenuMatin() {
        
    	System.out.println("Au menu de votre petit déjeuner: " + getBoisson() + ", " + getFeculent() + ", " + getProduitLaitier() + ", " + getFruit() + ", " + getCereale() + ".");
    }

}