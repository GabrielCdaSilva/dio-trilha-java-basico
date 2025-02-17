public interface Telefone {
    default void ligar(){
        System.out.println("Ligando...");
    }
    default void atender(){
        System.out.println("Atendendo ligação");
    }
    default void iniciarCorreioVoz(){
        System.out.println("iniciando correio de voz");
    }
}
