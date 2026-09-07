public class CaballeroDeLaMuerte extends Personaje implements ACCIONS{

    public CaballeroDeLaMuerte() {
    }

    @Override
    public void presentacionPersonaje(String name) {
        System.out.println("CABALLERO CAIDO LA MUERTE NO MARCA TU FINAL SI NO UN NUEVO COMIENZO");
        System.out.println("ALZATE DE NUEVO Y RECIBE EL REGALO MALDITO DE RUNAS ");
        System.out.println("PROFANARAS LA PESTE Y TRAERAS LA OSCURIDAD A ESTE MUNDO");
        System.out.println(name + " SERA TU NUEVO NOMBRE ");
    }

    public void ataqueEspecial() {
        System.out.println("LA OSCURIDAD TE INVADE");
        System.out.println("CLAVANDO TU ESPADA EN EL PISO");
        System.out.println("PROFANAS EL SUELO");
        System.out.println("LOS SIGUIENTES TURNOS GENERARAS DAÑO EXTRA");
    }
}
