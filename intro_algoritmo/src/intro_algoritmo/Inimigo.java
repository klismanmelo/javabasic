package intro_algoritmo;

public class Inimigo {
	public int vida = 10;
	public int dano;
	public String inimigoTipo = "tipo1";
	public int ataqueDano = 10;
	
	public int getVida() {
		return vida;
	}
	
	//MÉTODO CONSTRUTOR
	public Inimigo(int vida) {
		this.vida = vida;
	}
	
	public void tomarDano(int dano) {
		this.dano = dano;
		vida = vida - dano;
	}
}
