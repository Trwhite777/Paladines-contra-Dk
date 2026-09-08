import java.util.Random;

abstract public class Personaje {
    String name;
    static double vida= 100;
    static int fuerza = 12;
    int id = 001;

    public void presentacionPersonaje (String name)  {
    }
    public void ataqueEspecial (int daño) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public int getDaño() {
        return fuerza;
    }

    public void setDaño(double daño) {
        this.fuerza = fuerza;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void   mostrarEstadisticas() {
        System.out.println("Estadisticas Actuales");
        System.out.println("Nombre = " + name);
        System.out.println("Vida = " + vida);
        System.out.println("Daño = " + fuerza);
    }

    public double atacarOBjetivo (String name , boolean ataque , String nameNpc ) {
        System.out.println( name + "Ataca a " + nameNpc);
        double daño=calculadoraDaño(fuerza);
        double dañoTotal = daño;
        if (ataque) {
            dañoTotal += daño*(1.5);
            System.out.println("Concentrado Daño aumentado 1.5");
        }
        System.out.println( name + " Hizo un total de daño " +dañoTotal + " a " + nameNpc );

        double nuevaVida =recibirDaño(dañoTotal, Npc.vida);
        return nuevaVida;
    }

    public boolean defenderAttack(String name) {
        boolean isDefense=true;
        System.out.println(name + "Se Defiende");
        System.out.println("Siguiente ataque recibido reducido 50%");
        return isDefense;
    }

    public boolean concentracionAttack (String name) {
        boolean isConcentr = true;
        System.out.println(name + " se concentro " );
        System.out.println("Siguiente ataque 2x");
        return isConcentr;
    }

    public double healHp (double vida , String name) {
        vida+=20;
        String nasfsa = "asdfasd";
        System.out.println(name + " Se cura 20 puntos de vida ");
        if (vida>100) {
            System.out.println(name + "Sobresanacion ");
            double reducSanacion =  vida-100;
            vida-=reducSanacion;
        }
        return vida;
    }

    public static void  restutirPersonaje (Personaje personaje) {
        System.out.println("Felicidades Has ganado el combate");
        vida = 100;
    }


    public static double  calculadoraDaño (int fuerza) {
        Random random = new Random();
        int subdaño = random.nextInt((fuerza - 8) + 1) + 8;
        return subdaño;
    }


    public static double recibirDaño (double dañoTotal , double vidaNpc) {
        vidaNpc  -= dañoTotal;

        return vidaNpc;
    }





}
