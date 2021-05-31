package Client;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import Domain.Dezena;
import Domain.Unidade;

public class MainClass {
	
	public static ArrayList<Dezena> dezenas = new ArrayList<>();
	public static ArrayList<Unidade> unidades = new ArrayList<>();
	
	public static void main(String[] args) {
		//configurar objetos
		
		dezenas.add	(new Dezena("Dez", 10));
		dezenas.add	(new Dezena("Vinte", 20));
		dezenas.add	(new Dezena("Trinta", 30));
		dezenas.add	(new Dezena("Quarenta", 40));
		dezenas.add	(new Dezena("Cinquenta", 50));
		dezenas.add	(new Dezena("Sessenta", 60));
		dezenas.add	(new Dezena("Setenta", 70));
		dezenas.add	(new Dezena("Oitenta", 80));
		dezenas.add	(new Dezena("Noventa", 90));
		
		unidades.add(new Unidade("Um", 1));
		unidades.add(new Unidade("Dois", 2));
		unidades.add(new Unidade("Três", 3));
		unidades.add(new Unidade("Quatro", 4));
		unidades.add(new Unidade("Cinco", 5));
		unidades.add(new Unidade("Seis", 6));
		unidades.add(new Unidade("Sete", 7));
		unidades.add(new Unidade("Oito", 8));
		unidades.add(new Unidade("Nove", 9));
		
		//entrada
		String valor = JOptionPane.showInputDialog("Digite um valor");
		
		//separação de dezenas e unidades + conversão
		int val = Integer.parseInt(valor);
		int dez = ((val / 10) % 10)*10;
		int uni = val % 10;
		
		//processamento e saída
		
			if(val == 100) {
				System.out.println("Cem");
			}
			
			if(val == 11) {
				System.out.println("Onze");
			}
			
			if(val == 12) {
				System.out.println("Doze");
			}
			
			if(val == 13) {
				System.out.println("Treze");
			}
			
			if(val == 14) {
				System.out.println("Quatorze");
			}
			
			if(val == 15) {
				System.out.println("Quinze");
			}
			
			if(val == 16) {
				System.out.println("Dezesseis");
			}
			
			if(val == 17) {
				System.out.println("Dezessete");
			}
			
			if(val == 18) {
				System.out.println("Dezoito");
			}
			
			if(val == 19) {
				System.out.println("Dezenove");
			}
			
			for(Dezena d: dezenas) {
				if(dez == d.getValor()) {
					 d.setLabel(d.getLabel());
					 if(uni == 0){
						 System.out.print(d.getLabel());
					 }else {
						 System.out.print(d.getLabel()+" e ");
					 }
				}
			}
			
			if(uni > 0){
				for(Unidade u: unidades) {
					if(uni == u.getValor()) {
						u.setLabel(u.getLabel());
						System.out.print(u.getLabel()+" ");
				}
			}
		}	
	}  
}
