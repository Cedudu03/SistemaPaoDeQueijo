import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Entidades entidades = new Entidades();
        String tipoPao;
        int quantidade;
        entidades.Menu();

        //Menu sendo implementado com condições e usando a classe entidades
        System.out.println("TOTAL DE PAES: " + entidades.quantidadeTotalpaes());
        System.out.println("\n====================================\n"
                            + "DIGITE SUA OPÇÃO: ");
        String opcao = sc.next();
        while(!(opcao.equals("1") || opcao.equals("3") || opcao.equals("2") || opcao.equals("3") || opcao.equals("4"))) {
            System.out.println("OPCAO INVALIDA!!, TENTE NOVAMENTE");
            entidades.Menu();
            opcao = sc.next();
        }
        while(opcao.equals("1") || opcao.equals("3") || opcao.equals("2") || opcao.equals("3") || opcao.equals("4")){
            switch (opcao) {
                case "1":
                    System.out.println("DESEJA ALGUM TIPO DE PÃO ESPECIFICO? S/N");
                    String especificarTipo = sc.next();
                    while(especificarTipo.toLowerCase().equals("s") && especificarTipo.toLowerCase().equals("n")){
                        System.out.println("POR FAVOR, USE 'S' PARA SIM E 'N' PARA NÃO");
                        especificarTipo = sc.next();
                    }
                    if (especificarTipo.equals("s")){
                        System.out.println("SELECIONE O PÃO: ");
                        entidades.Menutipo();
                        tipoPao = sc.next();
                        switch (tipoPao){
                            case "1":
                                System.out.println("QUANTIDADE DE PAES TRADICIONAIS: " + entidades.getPaoTradicional());
                                break;
                            case "2":
                                System.out.println("QUANTIDADE DE PAES TEMPERADOS: " + entidades.getPaoTemperado());
                                break;
                            case "3":
                                System.out.println("QUANTIDADE DE PAES RECHEADOS : " + entidades.getPaoRecheadoCatupiri());
                                break;
                            case "4":
                                System.out.println("QUANTIDADE DE PAES DOCES: " + entidades.getPaoDoce());
                                break;
                        }
                    }else if(especificarTipo.equals("n")){
                        System.out.println("\nQUANTIDADE TOTAL DE PAES: " + entidades.quantidadeTotalpaes());
                    }
                    break;
                case "2":
                    entidades.Menutipo();
                    tipoPao = sc.next();
                    System.out.println("INSIRA A QUANTIDADE DE PAES: ");
                    quantidade = sc.nextInt();
                    switch (tipoPao) {
                        case "1":
                            entidades.AddPaoTradicional(quantidade);
                            System.out.println("QUANTIDADE DE PAES TRADICIONAIS: " + entidades.getPaoTradicional());
                            break;
                        case "2":
                            entidades.AddPaoTemperado(quantidade);
                            System.out.println("QUANTIDADE DE PAES TEMPERADOS: " + entidades.getPaoTemperado());
                            break;
                        case "3":
                            entidades.AddPaoRecheadoComCatupiry(quantidade);
                            System.out.println("QUANTIDADE DE PAES RECHEADOS : " + entidades.getPaoRecheadoCatupiri());
                            break;
                        case "4":
                            entidades.AddPaoDoce(quantidade);
                            System.out.println("QUANTIDADE DE PAES DOCES: " + entidades.getPaoDoce());
                            break;
                    }
                    break;
                case "3":

                    entidades.Menutipo();
                    tipoPao = sc.next();
                    System.out.println("INSIRA A QUANTIDADE DE PAES: ");
                    quantidade = sc.nextInt();

                    switch (tipoPao) {
                        case "1":
                            entidades.RemovePaoTradicional(quantidade);
                            break;
                        case "2":
                            entidades.RemovePaoTemperado(quantidade);
                            break;
                        case "3":
                            entidades.RemovePaoRecheadoComCatupiry(quantidade);
                            break;
                        case "4":
                            entidades.RemovePaoDoce(quantidade);
                            break;
                    }
                    System.out.println("\nQUANTIDADE TOTAL DE PAES: " + entidades.quantidadeTotalpaes());
                    break;
                case "4":
                    System.out.println(entidades.getValorVendaTotal());
                    break;

            }

            entidades.Menu();
            opcao = sc.next();
        }
        sc.close();
    }
}
