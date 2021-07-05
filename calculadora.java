package calculadora;

import java.util.Scanner;

public class calculadora {
	
	public static void main(String[] args) {		
		double valor;
		Scanner input = new Scanner(System.in);
	
		System.out.println("Calculadora de alcance de an�ncio online!" + "\n");
		System.out.println("Aqui n�s iremos calcular a proje��o aproximada da quantidade m�xima de pessoas que visualizar�o o mesmo an�ncio (considerando o an�ncio original + os compartilhamentos)" + "\n");
		System.out.print("Por gentileza, digite o valor investido em reais: R$ ");	
		valor = input.nextDouble();
		int valorint = (int)valor;

		System.out.println("\n" + "Proje��o aproximada calculada: " + Calcular(valorint));
    
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
		
		// 1 -> 30 pessoas visualizam o an�ncio ORIGINAL (n�o compartilhado) a cada R$ 1,00 investido.
		resultado = valorint * 30;
	
		// 2 -> A cada 100 pessoas que visualizam o an�ncio 12 clicam nele. Logo -> porcentagem de 0.12
		clicks = resultado * porcentagemClicks;
		int clicksint = (int)clicks;
		
		// 3 -> A cada 20 pessoas que clicam no an�ncio 3 compartilham nas redes sociais. Logo -> porcentagem de 0.15
		compartilhamentos = clicks * porcentagemCompartilhamentos;
		int compartilhamentosint = (int)compartilhamentos;
		
		// 4 -> O mesmo an�ncio � compartilhado no m�ximo 4 vezes em sequ�ncia.
		alcanceCompartilhamentos = compartilhamentosint * 4;
		
		// 5 -> Cada compartilhamento nas redes sociais gera 40 novas visualiza��es.
		visualizacoesCompartilhamentos = alcanceCompartilhamentos * 40;
		int alcanceint = (int)visualizacoesCompartilhamentos;
		
		//C�lculo de proje��o de visualiza��es
		projecao = resultado + alcanceint;

		return projecao;
    	
	}
	
}
