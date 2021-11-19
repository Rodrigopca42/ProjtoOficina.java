package Trabalho.Atender;

public class Clientes {
    public String peças;
    public String elevadores;
    public int mecanicos;
    public boolean aberto;

    public void abrir(){

    }

    public void consertarCarros(){

    }

    public void orcamentoDeManutencao(){

    }

    public void trocaDePneus(){

    }

    public void trocaDeSuspenacao(){

    }

    public void status(){
        System.out.println("A oficina ta aberta? " +this.aberto);
        System.out.println("Todas as peças estao prontas para troca? " + this.peças);
        System.out.println("Quantos mecanicos vao trabalhar hoje? " + this.mecanicos);
        System.out.println("Esta tudo certo com os elevadores? " + this.elevadores);
    }
}
