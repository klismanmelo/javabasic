package intro_algoritmo;

public class Player {
	int vida = 10;
	String nome = "Klisman";
	
	public void perdeVida() {
		vida-=1;
	}
	
	public void ganhaVida() {
		vida+=1;
	}
}
