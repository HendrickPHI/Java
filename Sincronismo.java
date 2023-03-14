public class Sincronismo {
    static int inflacao = 0;
    static  final int limite = 18;
    public static void main(String[] args){
       IndicePrecos[] ip = new IndicePrecos[5];

       for(int i=0; i<5; i++){
           ip[i] = new IndicePrecos();
           ip[i].start();
       }
       try{
           for(int i=0; i<5; i++){
               ip[i].join();
           }
       }
       catch (Exception e){
           e.printStackTrace();
       }
       System.out.println("Inflação Atual: " +inflacao);
        System.out.println("Limite inflação: " +limite);
    }
}
class IndicePrecos extends Thread{
    public void run(){
        medeInflacao();
    }
    private static synchronized void medeInflacao(){
        if (Sincronismo.inflacao < Sincronismo.limite){
            try{
                sleep(500);
            }
            catch (InterruptedException iex){
                iex.printStackTrace();
                return;
            }
            Sincronismo.inflacao = Sincronismo.inflacao + 2;
        }
    }
}
