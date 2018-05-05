package mock;

import domain.Carta;
import domain.Naipe;

public class CartaMock {

    private static final String VALOR_A = "A";
    private static final String VALOR_2 = "2";
    private static final String VALOR_3 = "3";
    private static final String VALOR_5 = "5";
    private static final String VALOR_6 = "6";
    private static final String VALOR_7 = "7";
    private static final String VALOR_8 = "8";
    private static final String VALOR_9 = "9";
    private static final String VALOR_10 = "10";
    private static final String VALOR_J = "J";
    private static final String VALOR_Q = "Q";
    private static final String VALOR_K = "K";
    private static final Naipe NAIPE_H = Naipe.H;
    private static final Naipe NAIPE_D = Naipe.D;
    private static final Naipe NAIPE_S = Naipe.S;
    private static final Naipe NAIPE_C = Naipe.C;

    //Criando cartas com valores fixos - Mock para teste unitário
    public static Carta criarCarta5H() {
        Carta carta = new Carta();
        carta.setValor(VALOR_5);
        carta.setNaipe(NAIPE_H);

        return carta;
    }

    public static Carta criarCarta5C() {
        Carta carta = new Carta();
        carta.setValor(VALOR_5);
        carta.setNaipe(NAIPE_C);

        return carta;
    }

    public static Carta criarCarta6S() {
        Carta carta = new Carta();
        carta.setValor(VALOR_6);
        carta.setNaipe(NAIPE_S);

        return carta;
    }

    public static Carta criarCarta7S() {
        Carta carta = new Carta();
        carta.setValor(VALOR_7);
        carta.setNaipe(NAIPE_S);

        return carta;
    }

    public static Carta criarCartaKD() {
        Carta carta = new Carta();
        carta.setValor(VALOR_K);
        carta.setNaipe(NAIPE_D);

        return carta;
    }

    public static Carta criarCarta2C() {
        Carta carta = new Carta();
        carta.setValor(VALOR_2);
        carta.setNaipe(NAIPE_C);

        return carta;
    }

    public static Carta criarCarta3S() {
        Carta carta = new Carta();
        carta.setValor(VALOR_3);
        carta.setNaipe(NAIPE_S);

        return carta;
    }

    public static Carta criarCarta8S() {
        Carta carta = new Carta();
        carta.setValor(VALOR_8);
        carta.setNaipe(NAIPE_S);

        return carta;
    }

    public static Carta criarCarta8D() {
        Carta carta = new Carta();
        carta.setValor(VALOR_8);
        carta.setNaipe(NAIPE_D);

        return carta;
    }

    public static Carta criarCartaJD() {
        Carta carta = new Carta();
        carta.setValor(VALOR_J);
        carta.setNaipe(NAIPE_D);

        return carta;
    }

    public static Carta criarCarta5D() {
        Carta carta = new Carta();
        carta.setValor(VALOR_5);
        carta.setNaipe(NAIPE_D);

        return carta;
    }

    public static Carta criarCarta8C() {
        Carta carta = new Carta();
        carta.setValor(VALOR_8);
        carta.setNaipe(NAIPE_C);

        return carta;
    }

    public static Carta criarCarta9S() {
        Carta carta = new Carta();
        carta.setValor(VALOR_9);
        carta.setNaipe(NAIPE_S);

        return carta;
    }

    public static Carta criarCartaJS() {
        Carta carta = new Carta();
        carta.setValor(VALOR_J);
        carta.setNaipe(NAIPE_S);

        return carta;
    }

    public static Carta criarCartaAC() {
        Carta carta = new Carta();
        carta.setValor(VALOR_A);
        carta.setNaipe(NAIPE_C);

        return carta;
    }

    public static Carta criarCarta7D() {
        Carta carta = new Carta();
        carta.setValor(VALOR_7);
        carta.setNaipe(NAIPE_D);

        return carta;
    }

    public static Carta criarCartaQH() {
        Carta carta = new Carta();
        carta.setValor(VALOR_Q);
        carta.setNaipe(NAIPE_H);

        return carta;
    }

    public static Carta criarCarta2D() {
        Carta carta = new Carta();
        carta.setValor(VALOR_2);
        carta.setNaipe(NAIPE_D);

        return carta;
    }

    public static Carta criarCarta10C() {
        Carta carta = new Carta();
        carta.setValor(VALOR_10);
        carta.setNaipe(NAIPE_C);

        return carta;
    }
}

