package SS;

import java.util.ArrayList;
import java.util.List;

public class SeguridadSocial {

    private List<Persona> personasList;
    public SeguridadSocial() {

        personasList = new ArrayList<>();
    }


    // Debes comprobar que no se introduzcan dos personas con el mismo DNI/Número Seguridad Social
    public void altaPersona(Persona persona) {
        boolean comprobar = false;
        for (int i=0;i<personasList.size();i++){
            if(persona.getDni()==personasList.get(i).getDni()){
                comprobar = true;
                System.out.println("Error: DNI repetido.");
            }
            if(persona.getNumSS()==personasList.get(i).getNumSS()){
                comprobar = true;
                System.out.println("Error: NumSS repetido.");
            }


        }
        if(comprobar == false){
            personasList.add(persona);
        }
        comprobar = false;
    }

    public void bajaPersona(String dni) {
        int num = 1;
        for (int i=0;i<personasList.size();i++){

            if(dni==personasList.get(i).getDni()){
                personasList.remove(personasList.get(i));
                System.out.println("La persona se ha dado de baja.");
                num = 0;
            }
        }
        if(num==1){
            System.out.println("Error: El dni introducido no coincide con ninguna persona.");
        }
        num = 1;

    }

    public void obtenerPersonaPorDNI(String dni) {
        for (int i = 0; i < personasList.size(); i++) {

            if (dni == personasList.get(i).getDni()) {

                System.out.println("Nombre: " + personasList.get(i).getNombre());
                System.out.println("Apellidos: " + personasList.get(i).getApellidos());
                System.out.println("Edad: " + personasList.get(i).getEdad());

            }
        }
    }

    public void obtenerPersonaPorNumSS(String numSS) {
        for (int i = 0; i < personasList.size(); i++) {

            if (numSS == personasList.get(i).getNumSS()) {

                System.out.println("Nombre: " + personasList.get(i).getNombre());
                System.out.println("Apellidos: " + personasList.get(i).getApellidos());
                System.out.println("Edad: " + personasList.get(i).getEdad());

            }
        }
    }

    public void obtenerPersonasRangoSalarial(double min, double max){

        for (int i = 0; i < personasList.size(); i++) {

            if (personasList.get(i).getSalario() >= min && personasList.get(i).getSalario() <= max) {

                System.out.println("Nombre: " + personasList.get(i).getNombre());
                System.out.println("Apellidos: " + personasList.get(i).getApellidos());
                System.out.println("Edad: " + personasList.get(i).getEdad());
                System.out.println();

            }
        }
    }

    public void obtenerPersonasMayoresQue(int edad){
        for (int i = 0; i < personasList.size(); i++) {

            if (edad < personasList.get(i).getEdad()) {

                System.out.println("Nombre: " + personasList.get(i).getNombre());
                System.out.println("Apellidos: " + personasList.get(i).getApellidos());
                System.out.println("Edad: " + personasList.get(i).getEdad());
                System.out.println();

            }
        }
    }

    public void obtenerTodas(){
        for (int i = 0; i < personasList.size(); i++) {

                System.out.println("Nombre: " + personasList.get(i).getNombre());
                System.out.println("Apellidos: " + personasList.get(i).getApellidos());
                System.out.println("Edad: " + personasList.get(i).getEdad());
                System.out.println();

            }

    }

    @Override
    public String toString() {
        return "SeguridadSocial{" +
                "personasList=" + personasList +
                '}';
    }
}
