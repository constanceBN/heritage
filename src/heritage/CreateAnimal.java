package heritage;

public class CreateAnimal { // C'est notre classe Application, celle qui contient la méthode <main> et qui lance l'application.

	public static void main(String argv[]) {
		
		Chien monChien = new Chien();
		monChien.setNom("Médor");
		monChien.setCouleur("Noir");
		System.out.println("Mon chien s'appelle "+monChien.getNom()+" et il fait "+monChien.aboie());
		
		Chat monChat = new Chat();
		monChat.setNom("Félix");
		monChat.setCouleur("Blanc et Noir");
		System.out.println("Mon chat s'appelle "+monChat.getNom()+" et il fait "+monChat.miaule());
	}
}