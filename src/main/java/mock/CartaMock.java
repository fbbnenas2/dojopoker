package mock;

import domain.Carta;
import domain.Naipe;

public class CartaMock {

    private String VALOR_2 = "2";
    private String VALOR_3 = "3";
    private String VALOR_5 = "5";
    private String VALOR_6 = "6";
    private String VALOR_7 = "7";
    private String VALOR_8 = "8";
    private String VALOR_J = "J";
    private String VALOR_K = "K";
    private Naipe NAIPE_H = Naipe.H;
    private Naipe NAIPE_D = Naipe.D;
    private Naipe NAIPE_S = Naipe.S;
    private Naipe NAIPE_C = Naipe.C;

    //Criando cartas com valores fixos - Mock para teste unitário
    public Carta criarCarta5H() {
        Carta carta = new Carta();
        carta.setValor(VALOR_5);
        carta.setNaipe(NAIPE_H);

        return carta;
    }

    public Carta criarCarta5C() {
        Carta carta = new Carta();
        carta.setValor(VALOR_5);
        carta.setNaipe(NAIPE_C);

        return carta;
    }

    public Carta criarCarta6S() {
        Carta carta = new Carta();
        carta.setValor(VALOR_6);
        carta.setNaipe(NAIPE_S);

        return carta;
    }

    public Carta criarCarta7S() {
        Carta carta = new Carta();
        carta.setValor(VALOR_7);
        carta.setNaipe(NAIPE_S);

        return carta;
    }

    public Carta criarCartaKD() {
        Carta carta = new Carta();
        carta.setValor(VALOR_K);
        carta.setNaipe(NAIPE_D);

        return carta;
    }

    public Carta criarCarta2C() {
        Carta carta = new Carta();
        carta.setValor(VALOR_2);
        carta.setNaipe(NAIPE_C);

        return carta;
    }

    public Carta criarCarta3S() {
        Carta carta = new Carta();
        carta.setValor(VALOR_3);
        carta.setNaipe(NAIPE_S);

        return carta;
    }

    public Carta criarCarta8S() {
        Carta carta = new Carta();
        carta.setValor(VALOR_8);
        carta.setNaipe(NAIPE_S);

        return carta;
    }

    public Carta criarCarta8D() {
        Carta carta = new Carta();
        carta.setValor(VALOR_8);
        carta.setNaipe(NAIPE_D);

        return carta;
    }

    public Carta criarCartaJD() {
        Carta carta = new Carta();
        carta.setValor(VALOR_J);
        carta.setNaipe(NAIPE_D);

        return carta;
    }
}

