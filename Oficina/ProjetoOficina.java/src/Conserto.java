public class Conserto {
    public static void main(String[] args) throws Exception {
        Cliente c1 = new Cliente();
        c1.peças = "ok";
        c1.elevadores = "funcionando";
        c1.mecanicos = 2;
        c1.aberto = true;
        c1.status();
        

    }
}
