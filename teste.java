package Aps;
import java.util.Scanner;
import Aps.Cliente.*;
import Aps.equipamentos_.*;

public class teste {
    static Scanner menu = new Scanner(System.in);
    public static void main(String[] args) {
        int escolha = 0;
        while (escolha != 1){

        System.out.print("\n|---------------Menu--------------|\n");
        System.out.print("| 1 - Visualizar Assinaturas      |\n");
        System.out.print("| 2 - Tipos de Clientes           |\n");
        System.out.print("| 3 - Tipos de Equipamentos       |\n");
        System.out.print("| 4 - Sair                        |\n");
        System.out.print("|---------------------------------|\n");
        System.out.print("Digite uma opção: ");

        int opcao = menu.nextInt();
        
        switch(opcao){
        // Assinaturas Cadastradas
        case 1: 
        System.out.println("\nBem-Vindo(a) a Empresa XYZ!!");
        System.out.println();
        System.out.println("Assinaturas Cadastradas");
        // CLIENTE SEM ASS
        cliente Assinante = new ClienteSemAss();

        Assinante.apresentar();
        Assinante.usarEquipamento();
        System.out.println();
    //CLiente C/ ASS anual:
        cliente Assinante2 = new ClienteComAssAnual();

        Assinante2.apresentar();
        Assinante2.usarEquipamento();
        System.out.println(); 
    //Cliente C/ ASS mensal:
        cliente Assinante3 = new ClienteComAssSemestral();
        Assinante3.apresentar();
        Assinante3.usarEquipamento();

    // altere dinamicamente o equipamento que o cliente está utilizando.
        System.out.println();
        Assinante.setEquipamento(new Skate());
        Assinante.usarEquipamento();
      
        System.out.println();
    //Cliente C/ ASS Semanal:
        cliente Assinante4 = new ClienteComAssSemanal();
        Assinante4.apresentar();
        Assinante4.usarEquipamento();
        break;
        // tipos de Assinaturas
        case 2:
        System.out.println("\n1-Assinatura Anual\n2-Assinatura Semestral\n3-Assintura Semanal");break;
        
        case 3:
        System.out.println("\n1-Bicicleta para Uma Pessoa\n2-Skate\n3-Bicleta Para Duas Pessoas\n4-Prancha de Surf");break;

        case 4:
        System.out.println("Fim da Operação!");
        System.exit(4);
        }
        }
    }
}