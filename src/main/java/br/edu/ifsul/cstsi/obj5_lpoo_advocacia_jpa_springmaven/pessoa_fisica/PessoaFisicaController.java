package br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.pessoa_fisica;

import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.HomeController;
import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.advogado.AdvogadoController;
import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.pessoa.Pessoa;
import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.processo.Processo;
import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.processo.ProcessoController;
import br.edu.ifsul.cstsi.obj5_lpoo_advocacia_jpa_springmaven.processo.ProcessoService;
import org.springframework.stereotype.Controller;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;

@Controller
public class PessoaFisicaController {
    private static final Scanner input = new Scanner(System.in);
    private static PessoaFisicaService  PFService;
    private static ProcessoService PService;

    public PessoaFisicaController (PessoaFisicaService PFService,ProcessoService PService){
        PessoaFisicaController.PFService = PFService;
        PessoaFisicaController.PService =PService;
    }

    public static void main(String[] args) {
            int opcao;
            do {
                System.out.print("\n-------  Home -------");
                System.out.print(
                        """
        
                            1. Criar Pessoa Fisica
                            2. Atualizar Pessoa Fisica
                            3. Deletar Pessoa Fisica
                            4. Listar todas as Pessoas Fisicas
                            5. Buscar por Id
                            6. Buscar por Nome
                            7. Buscar por CPF
                            8. Buscar por RG
                            9. Buscar por Email
                            Opção (Zero p/sair):\s""");
                opcao = input.nextInt();
                input.nextLine();
                switch (opcao) {
                    case 1 -> create();
                    case 2 -> update();
                    case 3 -> delete();
                    case 4 -> read();
                    case 5 -> searchId();
                    case 6 -> searchName();
                    case 7 -> searchCpf();
                    case 8 -> searchRg();
                    case 9 -> searchEmail();
                    default -> {
                        if (opcao != 0) System.out.println("Opção inválida.");
                    }
                }
            } while(opcao != 0);
            System.out.println("\n    Operacao finalizada");
            HomeController.main(null);

    }
    private static void create(){
        PessoaFisica pf = new PessoaFisica();
        System.out.println("\n      Cadastrar Pessoa Fisica");
        System.out.print("Nome da pessoa: ");
        pf.setNomePessoa(input.nextLine());
        System.out.print("CPF da pessoa: ");
        pf.setCpfPessoa(input.nextLine());
        System.out.print("RG da pessoa: ");
        pf.setRgPessoa(input.nextLine());
        System.out.print("Email da pessoa: ");
        pf.setEmailPessoa(input.nextLine());
        System.out.print("Telefone da pessoa: ");
        pf.setTelefonePessoa(input.nextLine());
        System.out.print("Endereco da pessoa: ");
        pf.setEnderecoPessoa(input.nextLine());
        System.out.println("Pessoa inserida com sucesso" + PFService.create(pf));
    }
    private static void update(){
        PessoaFisica pf;
        int c = 0;
        System.out.println("\n      Atualizar Pessoa Fisica");
        System.out.println("Digite do Id da Pessoa:");
        long id = input.nextLong();
        pf = PFService.getPessoaFisicaById(id);

                System.out.println(pf + "\nAgora escolha uma opcao para alterar:");
                System.out.println("""
                            1. Nome
                            2. CPF
                            3. RG
                            4. Email
                            5. Telefone
                            6. Endereco
                            Opção (Zero p/sair):\s""");
                c = input.nextInt();
            if (c == 1){
                System.out.println(pf.getNomePessoa());
                System.out.println("Digite o novo nome:");
                input.nextLine();
                pf.setNomePessoa(input.nextLine());
            } else if (c == 2) {
                System.out.println(pf.getCpfPessoa());
                System.out.println("Digite o novo CPF:");
                input.nextLine();
                pf.setCpfPessoa(input.nextLine());
            } else if (c == 3) {
                System.out.println(pf.getRgPessoa());
                System.out.println("Digite o novo RG:");
                input.nextLine();
                pf.setRgPessoa(input.nextLine());
            } else if (c == 4) {
                System.out.println(pf.getEmailPessoa());
                System.out.println("Digite o novo Email:");
                input.nextLine();
                pf.setEmailPessoa(input.nextLine());
            } else if (c == 5) {
                System.out.println(pf.getTelefonePessoa());
                System.out.println("Digite o novo Telefone:");
                input.nextLine();
                pf.setTelefonePessoa(input.nextLine());
            } else if (c == 6) {
                System.out.println(pf.getEnderecoPessoa());
                System.out.println("Digite o novo endereco:");
                input.nextLine();
                pf.setEnderecoPessoa(input.nextLine());
            }
        if(PFService.update(pf) != null){
            System.out.println("Pessoa Fisica atualizada com sucesso. "+ PFService.getPessoaFisicaById(pf.getIdPessoa()));
        } else {
            System.out.println("Não foi possivel atualizar a tabela");
        }
    }

    public static void delete(){
        PessoaFisica pf;
        System.out.println("\n      Excluir Pessoa Fisica");
        System.out.print("Digite o codigo do motorista (0 = sair): ");
        long id = input.nextLong();
        input.nextLine();
         if(id > 0){
            pf = PFService.getPessoaFisicaById(id);
            if (pf == null){
                System.out.println("Codigo invalido");
            } else {
                System.out.println(pf);
                System.out.print("Deseja excluir a pessoa? (0-sim/1-não) ");
                if(input.nextInt() == 0){
                    input.nextLine();
                    PFService.delete(pf.getIdPessoa());
                    System.out.println("Pessoa excluida com sucesso. " + pf);
                }
            }
        } else {
            System.out.println("Codigo inválido");
        }
    }
    public static void read(){
        System.out.println("Todas as Pessoas: "+ PFService.getPessoasFisicas());
    }
    private static void searchId(){
        System.out.print("Digite o Identificador da Pessoa: ");
        PessoaFisica pf = PFService.getPessoaFisicaById(input.nextLong());
        if (pf != null){
            System.out.println("Pessoa encontrada. " + pf);
        } else {
            System.out.println("Pessoa inexistente");
        }
    }

    private static void searchName(){
        System.out.print("Digite o nome da pessoa: ");
        Pessoa pf =PFService.getPessoaByName(input.nextLine());
        if (pf != null){
            System.out.println("Pessoa encontrada. " + pf);
        } else {
            System.out.println("Pessoa inexistente");
        }
    }

    private static void searchCpf(){
        System.out.print("Digite o cpf da pessoa: ");
        PessoaFisica pf = PFService.getPessoaFisicaByCpf(input.nextLine());
        if (pf != null){
            System.out.println("Pessoa encontrada. " + pf);
        } else {
            System.out.println("Pessoa inexistente");
        }
    }

    private static void searchRg(){
        System.out.print("Digite o rg da pessoa: ");
        PessoaFisica pf = PFService.getPessoaFisicaByRg(input.nextLine());
        if (pf != null){
            System.out.println("Pessoa encontrada. " + pf);
        } else {
            System.out.println("Pessoa inexistente");
        }
    }
    private static void searchEmail(){
        System.out.print("Digite o email da pessoa: ");
        Pessoa pf = PFService.getPessoaByEmail(input.nextLine());
        if (pf != null){
            System.out.println("Pessoa encontrada. " + pf);
        } else {
            System.out.println("Pessoa inexistente");
        }
    }
}

