import java.util.ArrayList;
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

    public static String busquedaNodo(String valor, ArrayList<Nodo>lista, ArrayList<Nodo>listaResultado){
        int puntero = 0;
        String resultado = "";

        for(int i = 0; i < lista.size(); i++){
            if (lista.get(i).getValue().equals(valor)){
                puntero = i;
            }
        }

        for(int i = puntero+1; i < lista.size(); i++){
            if (!lista.get(i).isMarca()){
                resultado = lista.get(i).getValue();
            }
        }

        if(resultado.equals("")){
            for(int i = 0; i < lista.size(); i++){
                if (lista.get(i).getValue().equals(listaResultado.get(listaResultado.size()-1))){
                    lista.get(i).desmmarcar();
                    puntero = i;
                }
            }

            for(int i = puntero+1; i < lista.size(); i++){
                if (!lista.get(i).isMarca()){
                    resultado = lista.get(i).getValue();
                }
            }

        }

        return resultado;
    }

    public static boolean busqueda (Nodo origen, ArrayList<Nodo> lista, ArrayList<Nodo> listaResultado){
        boolean bandera = false;


        for (int i = 0; i < lista.size(); i++) {
            if (!lista.get(i).isMarca()){
                if (validar(origen.getValue(), lista.get(i).getValue())){
                    lista.get(i).marcar();
                    listaResultado.set((listaResultado.size()+1), lista.get(i));
                    busqueda(lista.get(i), lista, listaResultado);
                    bandera = true;
                }
            }
        }
        x x
        1 2 3 4 5 6
        if (!bandera){
            origen.desmmarcar();
            for (int i = 0; i < lista.size(); i++) {

            }
        }

        if (lista.size() == listaResultado.size())
            return true;
        else
            return false;

    }


    public static void main(String[] args) {
        System.out.println("Hello World!");
        ArrayList<Nodo> lista            = new ArrayList<Nodo>();
        ArrayList<Nodo> listaResultado   = new ArrayList<Nodo>();


        validar("ababababa", "ababccaba");
    }


}
