package intro_algoritmo;

import java.util.ArrayList;

public class GameX {
	public static void main(String[]args) {
		
		Player p1 = new Player();
		ArrayList<Inimigo> inimigos = new ArrayList<Inimigo>();
		
		inimigos.add(new ElfInimigo(10));
		inimigos.add(new ElfInimigo(15));
		inimigos.add(new ElfInimigo(20));
		inimigos.add(new ElfInimigo(25));
		
		for(int i=0; i<inimigos.size(); i++) {
			Inimigo inimigoLocal = inimigos.get(i);
			if(i==1) {
				inimigoLocal.tomarDano(5);
				System.out.println(inimigoLocal.vida);
			}
			
			if(i==2) {
				inimigoLocal.tomarDano(9);
				System.out.println(inimigoLocal.vida);
			}
			
			if(i==3) {
				inimigoLocal.tomarDano(11);
				System.out.println(inimigoLocal.vida);
			}
		}
		
		inimigos.get(0).tomarDano(5);
		
		System.out.println(inimigos.get(0).vida);
		
		System.out.println(p1.vida);
		
		p1.perdeVida();
		p1.perdeVida();
		
		System.out.println(p1.vida);
		
		p1.ganhaVida();
		
		System.out.println(p1.vida);
		
	}
}
