package cantine;

public class Menu {

    public String boisson;
    public String feculent;
    public String produitLaitier;
    public String fruit;
    
    // Getters and Setters: méthodes qui récupèrent et affectent des valeurs à une variable.
    // Méthodes partagées par les sous-classes.
    public String getBoisson() {
		return boisson;
	}

	public void setBoisson(String boisson) {
		this.boisson = boisson;
	}

	public String getFeculent() {
		return feculent;
	}

	public void setFeculent(String feculent) {
		this.feculent = feculent;
	}

	public String getProduitLaitier() {
		return produitLaitier;
	}

	public void setProduitLaitier(String produitLaitier) {
		this.produitLaitier = produitLaitier;
	}

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

}