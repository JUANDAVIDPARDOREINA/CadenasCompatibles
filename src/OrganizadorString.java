import java.util.HashMap;
import java.util.List;

public class OrganizadorString {


    public static boolean validar (String texto1, String texto2){

        boolean bandera = false;

        for (int i = 0; i < texto1.length(); i++) {

            if (!(texto1.charAt(i) == texto2.charAt(i))){
                if (bandera){return false;}
                else{bandera = true;}
            }

        }
        return true;

    }

    public static boolean busqueda (Nodo origen, List<Nodo> lista){
        boolean bandera = false;

        for (int i = 0; i < lista.size(); i++) {
            if (!lista.get(i).isMarca()){
                if (validar(origen.getValue(), lista.get(i).getValue())){
                    lista.get(i).marcar();
                    busqueda(lista.get(i), lista);
                    bandera = true;
                }
            }
        }

        if (!bandera){
            origen.desmmarcar();
            for (int i = 0; i < lista.size(); i++) {

            }
        }

        return true;
    }


    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<Nodo> nodos = new List<Nodo>;


        validar("ababababa", "ababccaba");
    }


}
