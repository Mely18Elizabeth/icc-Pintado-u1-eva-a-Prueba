package Views;
import java.util.Scanner;
public class ViewConsole {

    Scanner leer= new Scanner(System.in);

    public void Busqueda(){
        System.out.println("---Ingresa libro buscas---");
        String nom=leer.nextLine();
    }

    public void imprimir( String mensaje){
            System.out.println(mensaje);
    }
    
}
