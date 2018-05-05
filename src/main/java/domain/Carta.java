package domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Carta {

    private String valor;
    private Integer peso;
    private Naipe naipe;

}
