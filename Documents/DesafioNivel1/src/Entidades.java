import java.util.Scanner;

public class Entidades {
    Scanner sc = new Scanner(System.in);

    //variaveis dos tipos de pao
    private int paoTradicional = 0;
    private int paoRecheadoCatupiri = 0;
    private int paoDoce = 0;
    private int paoTemperado = 0;

    //variaveis de preco de custo
    private double valorPadrao = 5;
    private double valorPaoTradicional = valorPadrao;
    private double valorPaoRecheadoCatupiry = valorPadrao;
    private double valorPaoDoce = valorPadrao;
    private double valorPaoTemperado = valorPadrao;

   //variaveis de Valor
    private double precoVendaPaoDoce = paoDoce * valorPaoDoce;
    private double precoVendaPaoTradicional = paoTradicional * valorPaoTradicional;
    private double  precoVendaPaoRecheado = paoRecheadoCatupiri * valorPaoRecheadoCatupiry;
    private double precoVendaPaoTemperado = paoTemperado * valorPaoTemperado;
    private double valorVendaTotal = precoVendaPaoTemperado + precoVendaPaoRecheado +precoVendaPaoTradicional + precoVendaPaoDoce;

    //funcao de alterar valores de vendas dos paes
    public void AlterarValorPaes(double novoValor, double pao){
        pao = novoValor;
    }

    public Entidades(){

    }
    //menus
    public void Menu(){
        System.out.print("====PAES DE QUEIJO LTDA====\n\n"
                        + "     SELECIONE UMA OPÇÃO:\n\n"
                        + "1 - CONSULTAR QUANTIDADE DE PAES\n"
                        + "2 - ADICIONAR PAES DE QUEIJO\n"
                        + "3 - REGISTRAR SAÍDA DE PAES\n"
                        + "4 - VERIFICAR FINANÇAS\n");
    }
    public void Menutipo(){
        System.out.print("====SELECIONE O TIPO DE PÃO====\n"
                + "SELECIONE UMA OPÇÃO:\n"
                + "1 - PÃO DE QUEIJO TRADICIONAL\n"
                + "2 - PÃO DE QUEIJO TEMPERADO\n"
                + "3 - PÃO DE QUEIJO RECHEADO COM CATUPIRY\n"
                + "4 - PÃO DE QUEIJO DOCE\n");
    }
    public int quantidadeTotalpaes(){
        return  paoDoce + paoRecheadoCatupiri + paoTemperado + paoTradicional;
    }


    //inicio funcoes de adicao de estoque
    public void AddPaoTradicional( int quantidade){
        this.paoTradicional += quantidade;
    }
    public void AddPaoTemperado( int quantidade){
        this.paoTemperado += quantidade;
    }
    public void AddPaoDoce( int quantidade){
        this.paoDoce += quantidade;
    }
    public void AddPaoRecheadoComCatupiry( int quantidade){
        this.paoRecheadoCatupiri += quantidade;
    }
    //fim funcoes de adicao de estoque

    //inicio funcoes de remocao de estoque
    public void RemovePaoTradicional( int quantidade){
        if(this.paoTradicional > 0) {
            this.paoTradicional -= quantidade;
        }else{
            System.out.println("PARA VENDER ESSA QUANTIDADE É NECESSÁRIO FAZER MAIS PÃES");
        }
    }
    public void RemovePaoTemperado( int quantidade){
        if(this.paoTemperado > 0) {
            this.paoTemperado -= quantidade;
        }else {
            System.out.println("PARA VENDER ESSA QUANTIDADE É NECESSÁRIO FAZER MAIS PÃES");
        }
    }
    public void RemovePaoDoce( int quantidade){
        if(this.paoDoce > 0) {
            this.paoDoce -= quantidade;
        }else {
            System.out.println("PARA VENDER ESSA QUANTIDADE É NECESSÁRIO FAZER MAIS PÃES");
        }
    }
    public void RemovePaoRecheadoComCatupiry( int quantidade){
        if(this.paoRecheadoCatupiri > 0 ){
            this.paoRecheadoCatupiri -= quantidade;
        }else{
            System.out.println("PARA VENDER ESSA QUANTIDADE É NECESSÁRIO FAZER MAIS PÃES");
        }
    }
    //fim funcoes de remocao de estoque

    public int getPaoTradicional() {
        return paoTradicional;
    }
    public void setPaoTradicional(int paoTradicional) {
        this.paoTradicional = paoTradicional;
    }
    public int getPaoRecheadoCatupiri() {
        return paoRecheadoCatupiri;
    }
    public void setPaoRecheadoCatupiri(int paoRecheadoCatupiri) {
        this.paoRecheadoCatupiri = paoRecheadoCatupiri;
    }
    public int getPaoDoce() {
        return paoDoce;
    }
    public void setPaoDoce(int paoDoce) {
        this.paoDoce = paoDoce;
    }
    public int getPaoTemperado() {
        return paoTemperado;
    }
    public void setPaoTemperado(int paoTemperado){this.paoTemperado = paoTemperado;}

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public double getValorPadrao() {
        return valorPadrao;
    }

    public void setValorPadrao(double valorPadrao) {
        this.valorPadrao = valorPadrao;
    }

    public double getValorPaoTradicional() {
        return valorPaoTradicional;
    }

    public void setValorPaoTradicional(double valorPaoTradicional) {
        this.valorPaoTradicional = valorPaoTradicional;
    }

    public double getValorPaoRecheadoCatupiry() {
        return valorPaoRecheadoCatupiry;
    }

    public void setValorPaoRecheadoCatupiry(double valorPaoRecheadoCatupiry) {
        this.valorPaoRecheadoCatupiry = valorPaoRecheadoCatupiry;
    }

    public double getValorPaoDoce() {
        return valorPaoDoce;
    }

    public void setValorPaoDoce(double valorPaoDoce) {
        this.valorPaoDoce = valorPaoDoce;
    }

    public double getValorPaoTemperado() {
        return valorPaoTemperado;
    }

    public void setValorPaoTemperado(double valorPaoTemperado) {
        this.valorPaoTemperado = valorPaoTemperado;
    }

    public double getPrecoVendaPaoDoce() {
        return precoVendaPaoDoce;
    }

    public void setPrecoVendaPaoDoce(double precoVendaPaoDoce) {
        this.precoVendaPaoDoce = precoVendaPaoDoce;
    }

    public double getPrecoVendaPaoTradicional() {
        return precoVendaPaoTradicional;
    }

    public void setPrecoVendaPaoTradicional(double precoVendaPaoTradicional) {
        this.precoVendaPaoTradicional = precoVendaPaoTradicional;
    }

    public double getPrecoVendaPaoRecheado() {
        return precoVendaPaoRecheado;
    }

    public void setPrecoVendaPaoRecheado(double precoVendaPaoRecheado) {
        this.precoVendaPaoRecheado = precoVendaPaoRecheado;
    }

    public double getPrecoVendaPaoTemperado() {
        return precoVendaPaoTemperado;
    }

    public void setPrecoVendaPaoTemperado(double precoVendaPaoTemperado) {
        this.precoVendaPaoTemperado = precoVendaPaoTemperado;
    }

    public double getValorVendaTotal() {
        return valorVendaTotal;
    }

    public void setValorVendaTotal(double valorVendaTotal) {
        this.valorVendaTotal = valorVendaTotal;
    }

    //metodo toString para imprimir a quantidade de paes
    public String toString() {
        return "\n PAO TRADICIONAL: " + paoTradicional +
                "\n PAO RECHEIO CATUPIRY" + paoRecheadoCatupiri +
                "\n PAO DOCE: " + paoDoce +
                "\n PAO TEMPERADO: " + paoTemperado +
                "\nQUANTIDADE TOTAL DE PAES: " + quantidadeTotalpaes();
    }
}
