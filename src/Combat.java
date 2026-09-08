public class Combat {

    Personaje personaje;
    boolean isCombatActive = false;

    public void combat () {

    }

    public boolean GetisCombatActive() {
        return isCombatActive;
    }

    public void setCombatActive(boolean combatActive) {
        isCombatActive = combatActive;
    }

    public void  menuAccionsMain () {
        System.out.println("==========================");
        System.out.println("Menu Accions");
        System.out.println("1 : Info Combat");
        System.out.println("2 : Defenderse");
        System.out.println("3 : Habilidades");
        System.out.println("4 : Huir");
        System.out.println("==========================");
    }

    public void  menuAccionsAttack () {
        System.out.println("=====================");
        System.out.println("Habilidades");
        System.out.println("1 : ATACAR");
        System.out.println("2 : CONCENTRARSE");
        System.out.println("3 : CURARSE");
        System.out.println("4 : ESPECIAL");
        System.out.println("5 : VOLVER");
        System.out.println("=====================");
    }

    public void menuAccionInfo () {
        System.out.println("==========================");
        System.out.println("INFO");
        System.out.println("1 : VER STAST");
        System.out.println("2 : VER STAST ENEMIGO");
        System.out.println("3 : VOLVER");
        System.out.println("==========================");
    }

    public void accionInfo (byte Accion, Personaje personaje1 , Npc npc1) {
        switch (Accion) {
            case 1:
                personaje1.mostrarEstadisticas();
                break;
            case 2:
                npc1.mostrarEstadisticas();
                break;
        }
    }


    public static byte realizarAcciones (byte Opcions, Personaje personaje1 , Npc npc1 , Boolean isCombatActive ) {
        switch (Opcions) {
        case (1):
            double changevida = personaje1.atacarOBjetivo(personaje1.getName(), ataque , npc1.name );
            npc1.setVida(changevida);
            break;
        case (2):
            ataque = personaje1.concentracionAttack(personaje1);
            break;
        case (3):
            personaje1.healHp(personaje1.getVida(), personaje1.getName());
            break;
        case (6):
            npc1.mostrarEstadisticas();
            break;

    }
    return var;
    }



}
