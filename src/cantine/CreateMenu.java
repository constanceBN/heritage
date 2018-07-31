package cantine;

public class CreateMenu {

    public static void main(String[] args) {
    	
    	// Créer les instances des classes.
    	Matin menuMatin = new Matin();
        MidiSoir menuMidi = new MidiSoir();
        MidiSoir menuSoir = new MidiSoir();
        
        // Initialiser les différentes valeurs.
        menuMatin.setBoisson("café");
        menuMatin.setFeculent("pain complet");
        menuMatin.setProduitLaitier("yaourt");
        menuMatin.setFruit("pomme");
        menuMatin.setCereale("muesli");
        
        menuMidi.setBoisson("eau");
        menuMidi.setFeculent("pâtes");
        menuMidi.setFruit("clémentine");
        menuMidi.setLegume("petits pois");
        menuMidi.setProduitLaitier("fromage");
        menuMidi.setProteine("lardons");
        
        menuSoir.setBoisson("vin");
        menuSoir.setFeculent("riz");
        menuSoir.setFruit("banane");
        menuSoir.setLegume("champignons");
        menuSoir.setProduitLaitier("créme caramel");
        menuSoir.setProteine("poisson");
        
        // Appeler les méthodes.
        menuMatin.afficherMenuMatin();
        menuMidi.afficherMenuMidiSoir();
        menuSoir.afficherMenuMidiSoir();
    }
    
}