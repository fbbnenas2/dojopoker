package domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class Mao {

    List<Carta> cartas;
    private Jogada jogada;

    public Mao(List<Carta> cartas) {
        this.cartas = cartas;
    }

    public Mao() {
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

        isStraight(cartas);

        return isStraight(cartas);
    }

    public Boolean isQuadra(List<Carta> cartas){
        Boolean isQuadra = false;
        int contador = 0;

        final Carta carta1 = cartas.get(0);
        int tamanho1 = cartas.stream().filter(c -> {return c.getValor().equals(carta1.getValor());}).collect(Collectors.toList()).size();

        Carta carta2 = cartas.get(1);
        int tamanho2 = cartas.stream().filter(c -> { return c.getValor().equals(carta2.getValor());}).collect(Collectors.toList()).size();

        return tamanho1 == 4 || tamanho2 == 4;
    }

    public Boolean isTrinca(List<Carta> cartas){
        Boolean isQuadra = false;
        int contador = 0;

        final Carta carta1 = cartas.get(0);
        int tamanho1 = cartas.stream().filter(c -> {return c.getValor().equals(carta1.getValor());}).collect(Collectors.toList()).size();

        Carta carta2 = cartas.get(1);
        int tamanho2 = cartas.stream().filter(c -> { return c.getValor().equals(carta2.getValor());}).collect(Collectors.toList()).size();

        return tamanho1 == 3 || tamanho2 == 3;
    }

    public Boolean isPar(List<Carta> cartas){
        Boolean isQuadra = false;
        int contador = 0;

        final Carta carta1 = cartas.get(0);
        int tamanho1 = cartas.stream().filter(c -> {return c.getValor().equals(carta1.getValor());}).collect(Collectors.toList()).size();

        Carta carta2 = cartas.get(1);
        int tamanho2 = cartas.stream().filter(c -> { return c.getValor().equals(carta2.getValor());}).collect(Collectors.toList()).size();

        return tamanho1 == 2 || tamanho2 == 2;
    }

    public boolean isFlush(List<Carta> cartas) {
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

    private Boolean isStraight(List<Carta> cartas) {
        List<Carta> cartasNecessarias = new ArrayList<Carta>();

        if(cartas.contains(new Carta("2"))) {
            cartasNecessarias.add(new Carta("3"));
            cartasNecessarias.add(new Carta("4"));
            cartasNecessarias.add(new Carta("5"));
            cartasNecessarias.add(new Carta("6"));

            return true;
        }else if(cartas.contains(new Carta("3"))) {
            cartasNecessarias.add(new Carta("4"));
            cartasNecessarias.add(new Carta("5"));
            cartasNecessarias.add(new Carta("6"));
            cartasNecessarias.add(new Carta("7"));

            return true;
        }else if(cartas.contains(new Carta("4"))) {
            cartasNecessarias.add(new Carta("5"));
            cartasNecessarias.add(new Carta("6"));
            cartasNecessarias.add(new Carta("7"));
            cartasNecessarias.add(new Carta("8"));

            return true;
        }else if(cartas.contains(new Carta("5"))) {
            cartasNecessarias.add(new Carta("6"));
            cartasNecessarias.add(new Carta("7"));
            cartasNecessarias.add(new Carta("8"));
            cartasNecessarias.add(new Carta("9"));

            return true;
        }else if(cartas.contains(new Carta("6"))) {
            cartasNecessarias.add(new Carta("7"));
            cartasNecessarias.add(new Carta("8"));
            cartasNecessarias.add(new Carta("9"));
            cartasNecessarias.add(new Carta("10"));

            return true;
        }else if(cartas.contains(new Carta("7"))) {
            cartasNecessarias.add(new Carta("8"));
            cartasNecessarias.add(new Carta("9"));
            cartasNecessarias.add(new Carta("10"));
            cartasNecessarias.add(new Carta("J"));

            return true;
        }else if(cartas.contains(new Carta("8"))) {
            cartasNecessarias.add(new Carta("9"));
            cartasNecessarias.add(new Carta("10"));
            cartasNecessarias.add(new Carta("J"));
            cartasNecessarias.add(new Carta("Q"));

            return true;
        }else if(cartas.contains(new Carta("9"))) {
            cartasNecessarias.add(new Carta("10"));
            cartasNecessarias.add(new Carta("J"));
            cartasNecessarias.add(new Carta("Q"));
            cartasNecessarias.add(new Carta("K"));

            return true;
        }else if(cartas.contains(new Carta("10"))) {
            cartasNecessarias.add(new Carta("J"));
            cartasNecessarias.add(new Carta("Q"));
            cartasNecessarias.add(new Carta("K"));
            cartasNecessarias.add(new Carta("A"));

            return true;
        }
        return false;
    }

}
