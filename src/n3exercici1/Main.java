package n3exercici1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author OCuevas
 */
public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Redactor> redaccio = new ArrayList<Redactor>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testData();
        int opc;
        do {

            System.out.println("1.- Introduir redactor.\n"
                    + "2.- Eliminar redactor.\n"
                    + "3.- Introduir notícia a un redactor.\n"
                    + "4.- Eliminar notícia.\n"//(ha de demanar redactor i titular de la notícia)
                    + "5.- Mostrar totes les notícies per redactor.\n"
                    + "6.- Calcular puntuació de la notícia.\n"
                    + "7.- Calcular preu-notícia.\n"
                    + "0.- Salir");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    introduirRedactor();
                    break;
                case 2:
                    eliminarRedactor();
                    break;
                case 3:
                    introduirNoticia();
                    break;
                case 4:
                    eliminarNoticia();
                    break;
                case 5:
                    mostrarNoticiesPerRedactor();
                    break;
                case 6:
                    calcularPuntuacioNoticia();
                    break;
                case 7:
                    calcularPreuNoticia();
                    break;
                case 0:

                    break;
                default:
                    System.out.println("Opcio no valida");
            }
        } while (opc != 0);

    }

    private static void introduirRedactor() {
        String nom, dni;
        char continuar = 's';

        while (continuar == 's') {
            sc.nextLine();
            System.out.println("Nom del redactor: ");
            nom = sc.nextLine();
            System.out.println("DNI: ");
            dni = sc.nextLine();
            if (existDNI(dni) == false) {
                redaccio.add(new Redactor(nom, dni));
                System.out.println("Redactor afegit correctament!!!");
            } else {
                System.out.println("Aquest redactor amb aquest DNI ja existeix!!!");
            }

            System.out.println("Introduir un altre redactor?(s/n)......");
            continuar = sc.next().charAt(0);
            if (continuar == 'n') {
                System.out.println("Tornant al menu principal.....");
            }
        }
    }

    private static void eliminarRedactor() {
        String dni;
        char continuar = 's';

        while (continuar == 's') {
            sc.nextLine();
            System.out.println("DNI del redactor que vol eliminar: ");
            dni = sc.nextLine();
            Redactor r = trobarRedactor(dni);

            if (r != null) {
                redaccio.remove(r);

                System.out.println("Redactor eliminat correctament!!!");
            } else {
                System.out.println("Aquest redactor amb aquest DNI no existeix!!!");
            }
            System.out.println("Introduir un altre DNI de redactor per eliminar?(s/n)......");
            continuar = sc.next().charAt(0);
            if (continuar == 'n') {
                System.out.println("Tornant al menu principal.....");
            }
        }
    }

    /**
     *
     * @param dni
     * @return false si no existeix i true si esta a la llista
     */
    private static boolean existDNI(String dni) {
        boolean exist = false;

        for (Redactor r : redaccio) {
            if (r.getDNI().equals(dni)) {
                exist = true;
            }
        }
        return exist;
    }

    private static void mostrarRedactorsPerNom(String nom) {

        for (Redactor r : redaccio) {
            if (r.getNom().equals(nom)) {
                System.out.println(r.getNom() + " amb DNI " + r.getDNI());
            }
        }

    }

    private static void mostrarNoticiesPerDNI(String dni) {
        boolean existe = false;
        for (Redactor r : redaccio) {
            if (r.getDNI().equals(dni)) {
                System.out.println("Mostrant titulars de les noticies de " + r.getNom() + "....");
                for (Noticia n : r.getNoticies()) {
                    System.out.println(n.getTitular());
                    existe = true;
                }
            }
        }

        if (existe == false) {
            System.out.println("Aquest redactor no te cap noticia.");
        }
    }

    private static void mostrarListRedactors(ArrayList<Redactor> redactors) {
        if (redactors.isEmpty()) {
            System.out.println("No hi ha cap redactor a la llista.");
        } else {
            System.out.println("*****************************\n*** Noticies per redactor ***\n*****************************");
            for (Redactor r : redactors) {
                System.out.println(r.getNom() + " amb DNI " + r.getDNI() + " les seves Noticies:");
                System.out.println("===========================================================================================================================");
                for (Noticia n : r.getNoticies()) {
                    System.out.println(n.toString());
                }
                System.out.println("===========================================================================================================================");
            }

        }

    }

    private static void insertarNoticiaRedactor(Noticia n, Redactor r) {
        for (Redactor redactor : redaccio) {
            if (redactor.equals(r)) {
                redactor.setNoticia(n);
            }
        }
    }

    private static Redactor trobarRedactor(String dni) {
        Redactor redactor = null;
        for (Redactor r : redaccio) {
            if (r.getDNI().equals(dni)) {
                redactor = r;
            }
        }
        return redactor;
    }

    private static void introduirNoticia() {
        String dni, titular, competicio, tenista, club, jugador, escuderia, equip;
        int opc = -1;
        Noticia noticia = null;
        NTenis noticiaT = null;
        char continuar = 's';

        while (continuar == 's') {
            sc.nextLine();
            System.out.println("DNI del redactor per introduir la nova noticia: ");
            dni = sc.nextLine();
            Redactor redactor = trobarRedactor(dni);
            if (redactor != null) {
                System.out.print("Título de la noticia: ");
                titular = sc.nextLine();
                System.out.println("Tipus de noticia\n1.- Futbol\n2.- Basquet\n3.- Tenis\n4.- F1\n5.- Motociclisme\n0.- Menu principal");
                opc = sc.nextInt();
                switch (opc) {
                    case 1://Futbol
                        sc.nextLine();
                        System.out.print("Competicio: ");
                        competicio = sc.nextLine();
                        System.out.print("Club: ");
                        club = sc.nextLine();
                        System.out.print("Jugador: ");
                        jugador = sc.nextLine();
                        noticia = new NFutbol(titular, competicio, club, jugador);
                        insertarNoticiaRedactor(noticia, redactor);

                        break;
                    case 2://Basquet
                        sc.nextLine();
                        System.out.print("Competicio: ");
                        competicio = sc.nextLine();
                        System.out.print("Club: ");
                        club = sc.nextLine();
                        noticia = new NBasquet(titular, competicio, club);
                        insertarNoticiaRedactor(noticia, redactor);
                        break;
                    case 3://Tenis
                        sc.nextLine();
                        System.out.print("Competicio: ");
                        competicio = sc.nextLine();
                        System.out.println("Nom del tenista: ");
                        tenista = sc.nextLine();
                        noticiaT = new NTenis(titular, competicio, tenista);
                        while (continuar == 's') {
                            System.out.println("Vol afegir un altre tenista?(s/n)");
                            continuar = sc.next().charAt(0);
                            if (continuar == 's') {
                                sc.nextLine();
                                System.out.println("Nom del tenista: ");
                                tenista = sc.nextLine();
                                noticiaT.setTenista(tenista);
                                System.out.println("Tenista afegit!!!");
                            }
                        }
                        insertarNoticiaRedactor(noticiaT, redactor);
                        break;
                    case 4://F1
                        sc.nextLine();
                        System.out.println("Escuderia:");
                        escuderia = sc.nextLine();
                        noticia = new NF1(titular, escuderia);
                        insertarNoticiaRedactor(noticia, redactor);
                        break;
                    case 5://Motociclisme
                        sc.nextLine();
                        System.out.println("Equip:");
                        equip = sc.nextLine();
                        noticia = new NMotociclisme(titular, equip);
                        insertarNoticiaRedactor(noticia, redactor);
                        break;
                    case 0:
                        continuar = 'n';
                        System.out.println("Sortint al Menu principal.....");
                        break;
                    default:
                        System.out.println("Opcio no valida");

                }

            } else {
                System.out.println("No existeix cap redactor amb aquest DNI\nVol introduir altre DNI? sªn");
                continuar = sc.next().charAt(0);
                switch (continuar) {
                    case 's' -> {
                    }
                    case 'n' ->
                        System.out.println("Sortint al menu principal.....");
                    default ->
                        System.out.println("Opcio no valida.");
                }
            }
        }

    }

    private static void eliminarNoticia() {
        String nom, dni, titular;
        int pos;
        char continuar = 's';

        while (continuar == 's') {
            sc.nextLine();
            System.out.println("Nom del redactor per mostrar els que existeixen: ");
            nom = sc.nextLine();
            mostrarRedactorsPerNom(nom);
            System.out.println("Dni del redactor del qual vol eliminar la noticia? ");
            dni = sc.nextLine();
            pos = encontrarPosicionEnLista(dni);
            if (existDNI(dni) == true) {
                mostrarNoticiesPerDNI(dni);
                System.out.println("Titular de la noticia que vol eliminar?");
                titular = sc.nextLine();
                eliminarPerIndexItitol(titular, pos);
            } else {
                System.out.println("Aquest DNI no existeix per cap Redactor.");
            }

            System.out.println("Eliminar un altre noticia?(s/n)......");
            continuar = sc.next().charAt(0);
            if (continuar == 'n') {
                System.out.println("Tornant al menu principal.....");
            } else if (continuar == 's') {

            } else {
                System.out.println("Opcio no valida");
                continuar = 'n';
            }
        }
    }

    private static int encontrarPosicionEnLista(String dni) {
        int index = -1;

        for (int i = 0; i < redaccio.size(); i++) {
            if (redaccio.get(i).getDNI().equals(dni)) {
                index = i;
            }
        }
        return index;
    }

    private static void eliminarPerIndexItitol(String titular, int index) {
        boolean exist = false;
        for (int i = 0; i < redaccio.get(index).getNoticies().size(); i++) {

            if (redaccio.get(index).getNoticies().get(i).getTitular().equalsIgnoreCase(titular)) {
                redaccio.get(index).getNoticies().remove(i);
                exist = true;
            }

        }
        if (exist == false) {
            System.out.println("Aquesta noticia existeix per aquest redactor.");
        }
        //  System.out.println(n);
    }

    private static void mostrarNoticiesPerRedactor() {
        sc.nextLine();
        String dni;

        if (!redaccio.isEmpty()) {
            mostrarListRedactors(redaccio);
            System.out.println("DNI del redactor per mostrar les seves noticies?");
            dni = sc.nextLine();
            if (existDNI(dni)) {
                for (Redactor r : redaccio) {
                    if (r.getDNI().equals(dni)) {
                        for (Noticia n : r.getNoticies()) {
                            System.out.println(n.toString());
                        }
                    }
                }
            } else {
                System.out.println("No hi ha cap redactor amb aquest DNI.");
            }

        } else {
            System.out.println("No hi ha cap redactor per mostrar.");
        }
    }

    private static void testData() {
        Redactor r = new Redactor("pepe", "222");
        Noticia nFutbol = new NFutbol("LLiga de Campions", "Lliga de Campions", "Madrid", "Benzema");
        Noticia nBasquet = new NBasquet("Basquet a la NBA", "Eurolliga", "Madrid");
        Noticia nTenis = new NTenis("El millor tenis del moment", "Roland Garros", "Nadal");
        Noticia nF1 = new NF1("Formula 1 en vivo!!!", "Ferrari");
        Noticia nMoto = new NMotociclisme("Gran premio GP", "Yamaha");
        r.setNoticia(nFutbol);
        r.setNoticia(nBasquet);
        r.setNoticia(nTenis);
        r.setNoticia(nF1);
        r.setNoticia(nMoto);
        redaccio.add(r);

    }

    private static void calcularPuntuacioNoticia() {
        String titular;
        // mostrarNoticiesPerRedactor();
        int puntuacio = -1;
        sc.nextLine();
        System.out.println("Titular de la noticia per saber la seva puntuacio?");
        titular = sc.nextLine();

        for (Redactor r : redaccio) {
            for (Noticia n : r.getNoticies()) {
                if (n.getTitular().equalsIgnoreCase(titular)) {
                    puntuacio = n.calcularPuntuacio();
                }
            }
        }

        if (puntuacio != -1) {
            System.out.println("El preu de la noticia " + titular + " te una puntuacio de  " + puntuacio + " punts.");
        } else {
            System.out.println("Aquest titualr no existeix.");
        }
    }

    private static void calcularPreuNoticia() {
        String titular;
        // mostrarNoticiesPerRedactor();
        int preu = -1;
        sc.nextLine();
        System.out.println("Titular de la noticia per saber el preu?");
        titular = sc.nextLine();

        for (Redactor r : redaccio) {
            for (Noticia n : r.getNoticies()) {
                if (n.getTitular().equalsIgnoreCase(titular)) {
                    preu = n.calcularPreuNoticia();
                }
            }
        }

        if (preu != -1) {
            System.out.println("El preu de la noticia " + titular + " es " + preu);
        } else {
            System.out.println("Aquest titualr no existeix.");
        }
    }

}
