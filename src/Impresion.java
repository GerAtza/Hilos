
import java.util.Random;


public class Impresion implements Runnable {
    
    private final int inactividad;
    private final String nombretarea;
    private final static Random generador=new Random();
    
    Impresion(String nombre){
        nombretarea=nombre;
        inactividad=generador.nextInt(5000);
    }
    
    @Override
    public void run() {
        try{
            System.out.printf("%s vaestar inactico durante %d segundos \n ",nombretarea,inactividad);
            Thread.sleep(inactividad);
        }catch(InterruptedException ex){
            System.out.printf("%s %s \n",nombretarea,"termino de forma prematura devido a la interrupcion");
        }
        System.out.printf("%s termina su inactividad \n",nombretarea);
    }
}
