package domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Jogador {

    private String nome;
    private Mao mao;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Jogador(){

    }

}
