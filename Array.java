import java.util.ArrayList;
public class Array {
	public static void main(String [] args) {

        ArrayList<String> bandas = new ArrayList<String>();

    bandas.add("Pink Floyd");
    bandas.add("Calipso");
    bandas.add("Rush");


        //System.out.println(bandas.get(0));
        //System.out.println(bandas.get(1));
        //System.out.println(bandas.get(2));

//para percorrer toda a lista
       // for (int i=0 ; i<bandas.size(); i++){
        //System.out.println(bandas.get(i));
        //}
        //System.out.println(bandas.get(bandas.size()-1));
        //bandas.remove("Calipso");
        //System.out.println(bandas.get(2));

        //bandas.clear(); //limpando a lista
        //System.out.println(bandas.get(2));
   
        //Lista para qualquer tipo de dado
        ArrayList<Object> lista = new ArrayList<Object>();
   
        lista.add(1000);
        lista.add(5.78);
        lista.add("Jandira");
        lista.add(true);
        lista.add('a');
   
            for (int i=0 ; i<bandas.size(); i++){
                System.out.println(lista.get(i));
            }
   
   
   
   
   
   
    }
}