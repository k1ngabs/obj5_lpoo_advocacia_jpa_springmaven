package br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.advogado;

import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.processo.ProcessoController;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class AdvogadoController {
    private static final Scanner input = new Scanner(System.in);
    private static AdvogadoService advogadoService;
    public static void main(String[] args) {
        int opcao;
        do {
            System.out.print("\n-------  Home -------");
            System.out.print(
                    """
                        1. Inserir Advogado
                        2. Visualizar Advogado
                        3. Atualizar Advogado
                        4. Deletar Advogado
                        Opção (Zero p/sair):\s""");
            opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
                case 1 -> AdvogadoController.main(null);
                case 2 ->{System.out.print("\n-------  Home -------");
                            System.out.print(
                                """
                                1. Inserir Advogado
                                2. Visualizar Advogado
                                3. Atualizar Advogado
                                4. Deletar Advogado
                                Opção (Zero p/sair):\s""");
                            opcao = input.nextInt();
                            input.nextLine();
                }
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