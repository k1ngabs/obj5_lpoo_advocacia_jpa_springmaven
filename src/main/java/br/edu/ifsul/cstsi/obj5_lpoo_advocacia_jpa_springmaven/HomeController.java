package br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven;

import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.advogado.AdvogadoController;
import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.assume.AssumeController;
import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.pessoa.PessoaController;
import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.processo.ProcessoController;
import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.tribunal.TribunalController;

import java.util.Scanner;

public class HomeController {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int opcao;
        do {
            System.out.print("\n-------  Home -------");
            System.out.print(
                    """
    
                        1. Administrar Advogados
                        2. Administrar Pessoas
                        3. Administrar Processos
                        Opção (Zero p/sair):\s""");
            opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
                case 1 -> AdvogadoController.main(null);
                case 2 -> PessoaController.main(null);
                case 3 -> ProcessoController.main(null);
                default -> {
                    if (opcao != 0) System.out.println("Opção inválida.");
                }
            }
        } while(opcao != 0);
        System.out.println("\n    Operacao finalizada");
        input.close();

    }
}
