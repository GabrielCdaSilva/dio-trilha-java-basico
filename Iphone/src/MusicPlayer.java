public interface MusicPlayer {
   default void tocarMusica(){
        System.out.println("Tocando música");
   }
   default void pausarMusica(){
        System.out.println("Pausando música");
   }
   default void selecionarMusica(){
        System.out.println("Selecionando música");
   }
}
