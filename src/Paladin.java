public class Paladin extends Personaje implements ACCIONS{
    public Paladin() {
    }

    @Override
    public void presentacionPersonaje(String name) {
        super.presentacionPersonaje(name);
    }
    public void ataqueEspecial() {
        System.out.println("LA LUZ TE ILUMINA");
        System.out.println("CONSAGRAS EL PISO DE LUZ");
        System.out.println("LOS SIGUIENTES TURNO GENERARAS DAÑO EXTRA");
    }
}
