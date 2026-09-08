import java.util.Scanner;
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hola jugador");
    System.out.println("Veo que es la primera vez que entras por aqui");
    System.out.println("Me podrias Decir tu nombre?");
    String name = scanner.nextLine();
    boolean isSelectorPj = true;
    boolean defensa = false;
    boolean ataque = false;
    Personaje personaje1 = new Personaje() {
    };
    while (isSelectorPj) {
        System.out.println("Que Clase quieres escojer");
        System.out.println("1 info Paladin");
        System.out.println("2 Info Caballero de la muerte");
        System.out.println("3 Escojer Clase ");
        byte opcionMenu = scanner.nextByte();
        switch (opcionMenu)  {
            case 1 :
                limpiarPantalla();
                System.out.println("Paladin : son guerreros sagrados híbridos que usan armadura de placas y el poder de la Luz para proteger a los débiles, castigar el mal");
                System.out.println("Habilidad Especial : Consagras el piso de luz e infliges daño en el tiempo");
                break;
            case 2 :
                limpiarPantalla();
                System.out.println("Caballero De La Muerte : Eran guerreros o paladines caídos en combate y revividos por el Rey Exánime Usan el poder de la plaga");
                System.out.println("Habilidad Especial : Usas el poder de tus runas profanando el piso Drenando la vida de tu oponente");
                break;
            case 3 :
                System.out.println("1 : Paladin ");
                System.out.println("2 : Caballero de la muerte");
                System.out.println("Otro valor regresas al menu");
                byte opcionClase = scanner.nextByte();
                switch (opcionClase) {
                    case 1:
                        personaje1 = new Paladin();
                        personaje1.setName(name);
                        personaje1.presentacionPersonaje(personaje1.getName());
                        isSelectorPj = false;
                        break;
                    case 2:
                        personaje1 = new CaballeroDeLaMuerte();
                        personaje1.setName(name);
                        personaje1.presentacionPersonaje(personaje1.getName());
                        isSelectorPj = false;
                        break;
                    default:
                        System.out.println("Intente nuevamente");
                }
                break;

            default:
                System.out.println("Numero no valido");
        }

        Npc npc1 = new Npc("Bulbasur" , 100);
        boolean combat =false;
        while (combat=true) {
            System.out.println("Menu Accions");
            System.out.println("1 : MOSTRAR ESTADISTICAS");
            System.out.println("2 : CURARSE");
            System.out.println("3 : CONCENTRARSE");
            System.out.println("4 : DEFENDENSER");
            System.out.println("5 : ATACAR");
            System.out.println("6 : VER STAST ENEMIGO");
            System.out.println("7 : HUIR");
            byte accions = scanner.nextByte();
            switch (accions) {
                case (1):
                    personaje1.mostrarEstadisticas();
                    break;
                case (2):
                    personaje1.healHp(personaje1.getVida(), personaje1.getName());
                    break;
                case (3):
                    ataque = personaje1.concentracionAttack(personaje1.getName());
                    break;
                case (4):
                    defensa = personaje1.defenderAttack(personaje1.getName());
                    break;
                case (5):
                    double changevida = personaje1.atacarOBjetivo(personaje1.getName(),ataque , npc1.name );
                    ataque = false;
                    npc1.setVida(changevida);
                    break;
                case (6):
                    npc1.mostrarEstadisticas();
                    break;

            }
        }



    }
    personaje1.restutirPersonaje(personaje1);

}

public static  void limpiarPantalla  () {
    for (int i = 0; i < 3; i++) {
        System.out.println();
    }
}
