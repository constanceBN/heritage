package cantine;

import java.util.*;

public class MidiSoir extends Menu {

    public MidiSoir() {
    	
    }

    public String legume;
    public String proteine;

    public void afficherMenuMidiSoir() {
        
    	System.out.println("Au menu de votre repas: " + getBoisson() + ", " + getFeculent() + ", " + getProduitLaitier() + ", " + getFruit() + ", " + getLegume() + ", " + getProteine() + ".");
    }

	public String getLegume() {
		return legume;
	}

	public void setLegume(String legume) {
		this.legume = legume;
	}

	public String getProteine() {
		return proteine;
	}

	public void setProteine(String proteine) {
		this.proteine = proteine;
	}

}