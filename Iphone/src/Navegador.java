public interface Navegador {
    default void exibirPagina(){
        System.out.println("Exibindo página web");
    }
    default void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    }
    default void atualizarPagina(){
        System.out.println("Atualizando página");
    }
}
