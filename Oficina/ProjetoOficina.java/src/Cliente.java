// Atribubuto e Metodos

public class Cliente {

    public String peças;//visibilidade publica
    public String elevadores;//visibilidade publica
    public int mecanicos;//visibilidade publica
    public boolean aberto = true;//visibilidade publica

    public void abrir(){
        this.aberto = true;
    }

    public void fechado(){
        this.aberto = false;

    }

    public void consertarCarros(){
        if(this.aberto == true){
            System.out.println("Podemos consertar os carros! ");
        } else{ 
            System.out.println("Não podemos trabalhar! ");
        }

    }

    public void orcamentoDeManutencao(){

    }

    public void trocaDePneus(){

    }

    public void trocaDeSuspenacao(){

    }

    public void status(){
        System.out.println("A oficina ta aberta? " + this.aberto);
        System.out.println("Todas as peças estao prontas para troca? " + this.peças);
        System.out.println("Quantos mecanicos vao trabalhar hoje? " + this.mecanicos);
        System.out.println("Esta tudo certo com os elevadores? " + this.elevadores);
    }

    public void aberto() {
       
    }
}
