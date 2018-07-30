package cantine;

import java.util.*;

public class Matin extends Menu {

    public Matin() {
    	
    }

    public String getCereale() {
		return cereale;
	}

	public void setCereale(String cereale) {
		this.cereale = cereale;
	}

	public String cereale;

    public void afficherMenuMatin() {
        
    	System.out.println("Au menu de votre petit déjeuner: " + getBoisson() + ", " + getFeculent() + ", " + getProduitLaitier() + ", " + getFruit() + ", " + getCereale() + ".");
    }

}