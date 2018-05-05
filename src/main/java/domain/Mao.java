package domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Mao {

    List<Carta> cartas;
    private Jogada jogada;

    public Mao(List<Carta> cartas) {
        this.cartas = cartas;
    }

    //Método para retornar a jogada formada pela mão
    private Jogada retornaJogadaDaMao(Mao mao){
        if(mao == null ||
                mao.getCartas().isEmpty()){
            return null;
        }

        Carta carta1 = mao.getCartas().get(0);
        Carta carta2 = mao.getCartas().get(1);
        Carta carta3 = mao.getCartas().get(2);
        Carta carta4 = mao.getCartas().get(3);
        Carta carta5 = mao.getCartas().get(4);

        //Verifica jogada RoyalFlush
        if(isRoyalFlush(mao.getCartas())){
            return Jogada.ROYAL_FLUSH;
        }

        return Jogada.CARTA_MAIS_ALTA;
    }

    private Boolean isRoyalFlush(List<Carta> cartas){
        if(!isFlush(cartas)){
            return false;
        }

        List<Carta> cartasNecessarias = new ArrayList<Carta>();

        cartasNecessarias.add(new Carta("10"));
        cartasNecessarias.add(new Carta("J"));
        cartasNecessarias.add(new Carta("Q"));
        cartasNecessarias.add(new Carta("K"));
        cartasNecessarias.add(new Carta("A"));

        return cartas.containsAll(cartasNecessarias);
    }

    private Boolean isStraightFlush(List<Carta> cartas){
        if(!isFlush(cartas)){
            return false;
        }

        /*switch (cartas) {
            case cartas.contains(new)
        }

        return cartas.containsAll(cartasNecessarias);*/return false;
    }

    private boolean isFlush(List<Carta> cartas) {
        boolean naipesIguais = true;

        for(Carta cartaa: cartas){
            for(Carta cartab : cartas){
                if(!cartaa.getNaipe().equals(cartab.getNaipe())){
                    naipesIguais = false;
                    break;
                }
            }
        }
        return naipesIguais;
    }

}
