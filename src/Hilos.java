import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Hilos {
	public static void main(String[] arg0){
		ExecutorService ejecutosSubproceso = Executors.newCachedThreadPool();
		ejecutosSubproceso.execute(new Impresion("Tarea 1"));
		ejecutosSubproceso.execute(new Impresion("Tarea 2"));
		ejecutosSubproceso.execute(new Impresion("Tarea 3"));
		ejecutosSubproceso.shutdown();
	}
}
