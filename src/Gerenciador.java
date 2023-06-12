
import java.util.ArrayList;
import java.util.Scanner;

public class Gerenciador {
	
    static Scanner input = new Scanner(System.in);
    static ArrayList<Criptoativo> criptoativos;

	public static void main(String[] args) {
		
		criptoativos = new ArrayList<Criptoativo>();
		printInicial();
        menu();
	}

    // Função para criar um atraso de tempo 
    public static void tempo(int tempo){
        
        try {
            Thread.sleep(tempo);
        }
        catch (InterruptedException e) {
            System.out.println("Erro na Thread Sleep()");
        }
        
    }

    // Função para limpar a tela do console
    public static void limparTela(){

        System.out.print("\033c");
    }

    public static void aguardarUsuario(){

        input.nextLine();
        input.nextLine();
    }

    // Função para imprimir a tela inicial com informações do projeto e equipe
    public static void printInicial(){
        
        limparTela();

        System.out.println("                                                      ");
        System.out.println("        CENTRO UNIVERSITÁRIO DE JOÃO PESSOA - UNIPÊ        ");
        tempo(1000);
        System.out.println("                   CIÊNCIAS DA COMPUTAÇÃO                  ");
        tempo(1000);
        System.out.println("       PROJETO FINAL - PROGRAMAÇÃO ORIENTADA A OBJETO\n");
        tempo(1000);

        System.out.println("   EQUIPE:        ");
        tempo(1000);
        System.out.println("     - Ayrton Marcos Rodrigues Delfino - RGM 30858569");
        tempo(1000);
        System.out.println("     - Joel Adelaide Medeiros - RGM 29799384");
        tempo(1000);
        System.out.println("     - Juliana Chacon - RGM 29677467");
        tempo(1000);
        System.out.println("     - Marcos Barbosa Vieira Filho - RGM 30174503");
        tempo(1000);
        System.out.println("     - Rian Lucas Gomes Candido - RGM 30632722");
        tempo(1000);
        System.out.println("     - Thiago Emanuel ferreira de paiva - RGM 29510678");
        tempo(1000);
        
    }

