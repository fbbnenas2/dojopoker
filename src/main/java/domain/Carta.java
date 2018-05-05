package domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Carta {

    private String valor;
    private Naipe naipe;

    public Carta(String valor) {
        this.valor = valor;
    }
}
