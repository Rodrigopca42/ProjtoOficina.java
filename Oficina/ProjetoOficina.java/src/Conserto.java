//Instância
public class Conserto {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.peças = "ok";
        c1.elevadores = "funcionando";
        c1.mecanicos = 2;
        c1.aberto();
        c1.status();
        c1.consertarCarros();
        //O Aqui é instanciado todos os atributos,ou seja, é criado o Objeto
    }
}
