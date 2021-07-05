package calculadora;

import java.util.Scanner;

public class calculadora {
	
	public static void main(String[] args) {		
		double valor;
		Scanner input = new Scanner(System.in);
	
		System.out.println("Calculadora de alcance de anúncio online!" + "\n");
		System.out.println("Aqui nós iremos calcular a projeção aproximada da quantidade máxima de pessoas que visualizarão o mesmo anúncio (considerando o anúncio original + os compartilhamentos)" + "\n");
		System.out.print("Por gentileza, digite o valor investido em reais: R$ ");	
		valor = input.nextDouble();
		int valorint = (int)valor;

		System.out.println("\n" + "Projeção aproximada calculada: " + Calcular(valorint));
    
	}
    
	static double Calcular (int valorint) {
		int resultado = 0;
		
		double clicks = 0;
		double porcentagemClicks = 0.12;
		
		double compartilhamentos = 0;
		double porcentagemCompartilhamentos = 0.15;
		
		double alcanceCompartilhamentos = 0;
		double visualizacoesCompartilhamentos = 0;
		
		int projecao = 0;
		
		// 1 -> 30 pessoas visualizam o anúncio ORIGINAL (não compartilhado) a cada R$ 1,00 investido.
		resultado = valorint * 30;
	
		// 2 -> A cada 100 pessoas que visualizam o anúncio 12 clicam nele. Logo -> porcentagem de 0.12
		clicks = resultado * porcentagemClicks;
		int clicksint = (int)clicks;
		
		// 3 -> A cada 20 pessoas que clicam no anúncio 3 compartilham nas redes sociais. Logo -> porcentagem de 0.15
		compartilhamentos = clicks * porcentagemCompartilhamentos;
		int compartilhamentosint = (int)compartilhamentos;
		
		// 4 -> O mesmo anúncio é compartilhado no máximo 4 vezes em sequência.
		alcanceCompartilhamentos = compartilhamentosint * 4;
		
		// 5 -> Cada compartilhamento nas redes sociais gera 40 novas visualizações.
		visualizacoesCompartilhamentos = alcanceCompartilhamentos * 40;
		int alcanceint = (int)visualizacoesCompartilhamentos;
		
		//Cálculo de projeção de visualizações
		projecao = resultado + alcanceint;

		return projecao;
    	
	}
	
}
