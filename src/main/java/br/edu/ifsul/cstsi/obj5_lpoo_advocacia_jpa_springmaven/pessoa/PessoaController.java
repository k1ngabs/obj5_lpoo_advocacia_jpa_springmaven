package br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.pessoa;

import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.advogado.Advogado;
import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.advogado.AdvogadoController;
import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.pessoa_fisica.PessoaFisicaController;
import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.pessoa_juridica.PessoaJuridica;
import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.pessoa_juridica.PessoaJuridicaController;
import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.processo.ProcessoController;

import java.util.Scanner;

public class PessoaController {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int opcao;
        do {
            System.out.print("\n-------  Home -------");
            System.out.print(
                    """
    
                        1. Administrar Pessoa Fisica
                        2. Administrar Pessoa Juridica
                        3. Administrar Advogado
                        Opção (Zero p/sair):\s""");
            opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
                case 1 -> PessoaFisicaController.main(null);
                case 2 -> PessoaJuridicaController.main(null);
                case 3 -> AdvogadoController.main(null);
                default -> {
                    if (opcao != 0) System.out.println("Opção inválida.");
                }
            }
        } while(opcao != 0);
        System.out.println("\n    Operacao finalizada");
        input.close();

    }
}
