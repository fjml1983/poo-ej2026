
/**
 *
 * @author FJML1983
 */
public class Veterinario {

    protected String nombre;
    protected String cedProf;
    protected int aniosDeExperiencia;

    public void vacunar(Perro dog) {
        System.out.println("El veterinario " + nombre
                + " esta vacunando al perro " + dog.nombre);
        dog.ladrar();
        dog.ladrar();
        System.out.println("El perro ya se tranquilizo.");
        System.out.println("El perro fue vacunado exitosamente");
    }

    public void vacunar(Gato cat) {
        System.out.println("El veterinario " + nombre
                + " esta vacunando al perro " + cat.nombre);
        cat.maullar();
        System.out.println("El gato ya se tranquilizo.");
        System.out.println("El gato fue vacunado exitosamente");
    }

    public void diagnosticar(Mascota pet) {
        System.out.println("El veterinario " + nombre
                + " esta diagnosticando a la mascota " + pet.nombre);

        if (pet instanceof Gato) {
            System.out.println("La mascota es un gato");
            //Revision de peso
            if (pet.peso >= 3500) {
                System.out.println("El gato tiene buen peso");
            } else {
                System.out.println("El gato tiene bajo peso");
            }

        } else if (pet instanceof Perro) {
            System.out.println("La mascota es un perro");

            //Revision de peso
            if (pet.peso >= 30000) {
                System.out.println("El perro tiene buen peso");
            } else {
                System.out.println("El perro tiene bajo peso");
            }

        } else {
            System.out.println("No se pudo identificar que tipo de mascota es");
        }

    }

}
