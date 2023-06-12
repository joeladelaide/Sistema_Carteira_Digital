
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

