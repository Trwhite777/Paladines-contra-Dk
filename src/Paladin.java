public class Paladin extends Personaje implements Accions {

    @Override
    public void presentacionPersonaje(String name) {
        super.presentacionPersonaje(name);
        System.out.println("LUCHARAS JUNTO LA LUZ " + name + " ALZA TU ARMA Y DEVUELE LA ESPERANZA A ESTE MUNDO DEVASTADO");
    }

    @Override
    public void   mostrarEstadisticas() {
        System.out.println("Nombre = " + name);
        System.out.println("Vida = " + vida);
        System.out.println("Daño = " + fuerza);
    }


    @Override
    public void ataqueEspecial(int daño) {
        System.out.println("LA LUZ TE ILUMINA");
        System.out.println("CONSAGRAS EL PISO DE LUZ");
        System.out.println("LOS SIGUIENTES TURNO GENERARAS DAÑO EXTRA");
        super.ataqueEspecial(daño);
    }


}
