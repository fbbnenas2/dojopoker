package domain;

public enum Jogada {
    CARTA_MAIS_ALTA(1), PAR(2), TRINCA(3), STRAIGHT(4), FLUSH(5), FULL_HOUSE(6), QUADRA(7), STRAIGHT_FLUSH(8), ROYAL_FLUSH(9);

    private int peso;

    Jogada(int peso){
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
