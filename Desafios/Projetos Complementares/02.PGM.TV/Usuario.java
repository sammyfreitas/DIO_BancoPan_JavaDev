public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmarTv smarTV = new SmarTv();

        System.out.println("TV Ligada?" + smarTV.ligada);
        System.out.println("Canal atual: " + smarTV.canal);
        System.out.println("Volume atual: " + smarTV.volume);

        smarTV.ligar();
        System.out.println("status novo. TV LIGADA?" + smarTV.ligada);
        smarTV.desligar();
        System.out.println("status novo. TV LIGADA?" + smarTV.ligada);
        smarTV.aumentarVolume();
        smarTV.aumentarVolume();
        smarTV.aumentarVolume();
        smarTV.aumentarVolume();
        smarTV.aumentarVolume();
        System.out.println("status novo. Volume atual: " + smarTV.volume);
        smarTV.diminuirVolume();
        smarTV.diminuirVolume();
        smarTV.diminuirVolume();
        System.out.println("status novo. Volume atual: " + smarTV.volume);
        smarTV.mudarCanal(20);
        System.out.println("status novo. Canal atual: " + smarTV.canal);

    }
}