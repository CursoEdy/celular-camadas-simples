package start;

import java.util.Locale;
import java.util.Scanner;

import start.menu.Internet;
import start.menu.MideaPlay;
import start.menu.Telefone;

public class Start {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		boolean cod = false;
		System.out.println("Estou na dela inicial");
		do {
			telaInicial();
				int menu = scanner.nextInt();
				switch (menu) {
				case 1: {
					Telefone telefone = new Telefone();
					System.out.println("Selecione o tipo de operação");
					telefone.telefone();
					int opcoes = scanner.nextInt();
					if (opcoes == 1) {
						telefone.Ligar();
					} else if (opcoes == 2) {
						telefone.Atender();
					} else if (opcoes == 3) {
						telefone.CorreioDeVoz();
					} else {
						System.out.println("Operação inválida, retornando ao menu");
					}					
					break;
				}case 2: {
					MideaPlay midea = new MideaPlay();
					midea.midea();;
					int opcoes = scanner.nextInt();
					if (opcoes == 1) {
						midea.tocar();
					} else if (opcoes == 2) {
						midea.pausar();
					} else if (opcoes == 3) {
						midea.selecionar();
					} else {
						System.out.println("Operação inválida, retornando ao menu");
					}
					break;
				}case 3: {
					Internet internet = new Internet();
					internet.internet();
					int opcoes = scanner.nextInt();
					if (opcoes == 1) {
						internet.exibir();
					} else if (opcoes == 2) {
						internet.atualizar();
					} else if (opcoes == 3) {
						internet.novaAba();
					} else {
						System.out.println("Operação inválida, retornando ao menu");
					}
					break;
				}
				
				default:
					System.out.println("Opção inválida");
				}
			if (menu < 1 || menu > 3) {
				cod = true;
			}
		} while (cod != true);
		System.out.println("Bloqueando celular");
	}

	static void telaInicial() {
		System.out.println("**********************************");
		System.out.println("*                                *");
		System.out.println("*              17:35             *");
		System.out.println("*           14/09/2024           *");
		System.out.println("*                                *");
		System.out.println("*                                *");
		System.out.println("*      1         2         3     *");
		System.out.println("*  Telefone   Musica    Intenet  *");
		System.out.println("**********************************");
	}

}
