import Aparelhos.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone15 = new Iphone();

        //Navegador Internet
        System.out.println("*** Navegador Internet ***");
        iphone15.exibirPagina();
        iphone15.adicionarNovaAba();
        iphone15.atualizarPagina();
        System.out.println("---------------------------------------------------------------------");



        //Reprodutor Musical
        System.out.println("*** Reprodutor Musical ***");
        iphone15.tocar();
        iphone15.pausar();
        iphone15.selecionarMusica();
        System.out.println("---------------------------------------------------------------------");

        //Aparelho Telefônico
        System.out.println("*** Aparelho Telefônico ***");
        iphone15.ligar();
        iphone15.atender();
        iphone15.iniciarCorreioVoz();
        System.out.println("---------------------------------------------------------------------");

    }
}