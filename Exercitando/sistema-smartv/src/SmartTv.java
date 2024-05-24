public class SmartTv {
    boolean ligada = false;
    int canal = 10;
    int volume = 35;

      public void ligar (){
         ligada = true;
      }
      public void desligar (){
         ligada = false;
      }

      public void aumentarVolume(){
          volume++;
          System.out.println("Aumentando Volume : " + volume);
        }
        public void diminuirVolume(){
            volume --;
            System.out.println("Aumentando Volume : " + volume);
      }
       
      public void mudarCanal (int novoCanal){
        canal = novoCanal;
      }
      public void aumentarCanal(){
            canal --;
      }
        public void diminuirCanal(){
            canal --;
      }

      
}
