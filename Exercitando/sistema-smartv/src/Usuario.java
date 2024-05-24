
public class Usuario {
    public static void main(String[] args) throws Exception{
       
        SmartTv smartTv = new SmartTv();
           
           System.out.println("A TV está ligada? " + smartTv.ligada);
           System.out.println("Em qual canal está a TV? " + smartTv.canal);
           System.out.println("Qual e o volume da TV? " + smartTv.volume);
           
           smartTv.ligar();
             System.out.println("Novo Status -> Está ligada ? " + smartTv.ligada);
             
             smartTv.desligar();
             System.out.println("Novo Status -> Está ligada ? " + smartTv.ligada);
             
             smartTv.diminuirVolume();
             smartTv.diminuirVolume();
             smartTv.diminuirVolume();
             smartTv.aumentarVolume();
             System.out.println("Qual e o volume da TV? " + smartTv.volume);
             
             smartTv.mudarCanal(25);
             System.out.println("Em qual canal está a TV? " + smartTv.canal);
             

               
            
    }
}
