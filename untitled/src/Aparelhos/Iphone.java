package Aparelhos;

import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorInternet;
import Interfaces.ReprodutorMusical;

public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical {

    //Aparelho Telefônico
    @Override
    public void ligar() {
        System.out.println("Ligando do Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada no Iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando verificação de mensagens no Correio de Voz!");
    }


    //Navegador Internet
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página web...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    //Reprodutor Musical
    @Override
    public void tocar() {
        System.out.println("Tocando múscia...");
    }

    @Override
    public void pausar() {
        System.out.println("Musica Pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Escolha uma música");
    }
}
