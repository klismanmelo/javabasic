package intro_algoritmo;

public class Game {
	
	public static void main(String[] args) {
		String nome = "Klisman";
		int idade = 24;
		int contador = 0;
		/*
		while(contador < 10) {
			
			System.out.println("O numero atual e: " +contador);
			contador++;
		}

		if(idade == 24) {
			System.out.println("A idade é 24!");
		}else {
			System.out.println("A idade não é 28!");
		}
		
		if(nome.equals("Klisman")) {
			System.out.println("Verdade");
		}*/
		
		for(int i = 1; i<=10; i+=2){
			System.out.println("O numero atual e: " +i);
		}
	}
}
