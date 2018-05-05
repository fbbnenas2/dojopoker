import domain.Carta;
import domain.Jogador;
import domain.Mao;
import mock.CartaMock;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CartaUnitTest {

    @Test
    public void testPares() {
        Jogador jogador1 = new Jogador("Jogador 1");
        List<Carta> cartasMao1 = new ArrayList<Carta>();
        cartasMao1.add(CartaMock.criarCarta5H());
        cartasMao1.add(CartaMock.criarCarta5C());
        cartasMao1.add(CartaMock.criarCarta6S());
        cartasMao1.add(CartaMock.criarCarta7S());
        cartasMao1.add(CartaMock.criarCartaKD());

        jogador1.setMao(new Mao(cartasMao1));

        Jogador jogador2 = new Jogador("Jogador 1");
        List<Carta> cartasMao2 = new ArrayList<Carta>();
        cartasMao2.add(CartaMock.criarCarta2C());
        cartasMao2.add(CartaMock.criarCarta3S());
        cartasMao2.add(CartaMock.criarCarta8S());
        cartasMao2.add(CartaMock.criarCarta8D());
        cartasMao2.add(CartaMock.criarCartaJD());

        jogador2.setMao(new Mao(cartasMao2));

        Jogador vencedor = new Jogador();
        //vencedor = Mao.verificaJogada(jogador1, jogador2);

        Assert.assertTrue(vencedor.getNome().equals("Jogador 2"));

    }

    @Test
    public void testCartaMaisAlta() {
        Jogador jogador1 = new Jogador("Jogador 1");
        List<Carta> cartasMao1 = new ArrayList<Carta>();
        cartasMao1.add(CartaMock.criarCarta5H());
        cartasMao1.add(CartaMock.criarCarta5C());
        cartasMao1.add(CartaMock.criarCarta6S());
        cartasMao1.add(CartaMock.criarCarta7S());
        cartasMao1.add(CartaMock.criarCartaKD());

        jogador1.setMao(new Mao(cartasMao1));

        Jogador jogador2 = new Jogador("Jogador 1");
        List<Carta> cartasMao2 = new ArrayList<Carta>();
        cartasMao2.add(CartaMock.criarCarta2C());
        cartasMao2.add(CartaMock.criarCarta3S());
        cartasMao2.add(CartaMock.criarCarta8S());
        cartasMao2.add(CartaMock.criarCarta8D());
        cartasMao2.add(CartaMock.criarCartaJD());

        jogador2.setMao(new Mao(cartasMao2));

        Jogador vencedor = new Jogador();
        //vencedor = Mao.verificaJogada(jogador1, jogador2);

        Assert.assertTrue(vencedor.getNome().equals("Jogador 2"));

    }

    @Test
    public void testQuadra() {
        Mao mao = new Mao();

        List<Carta> cartasMao2 = new ArrayList<Carta>();
        cartasMao2.add(CartaMock.criarCarta2C());
        cartasMao2.add(CartaMock.criarCarta2D());
        cartasMao2.add(CartaMock.criarCarta2D());
        cartasMao2.add(CartaMock.criarCarta2D());
        cartasMao2.add(CartaMock.criarCartaJD());

        mao.setCartas(cartasMao2);

        Assert.assertEquals(mao.isQuadra(mao.getCartas()), 4);
    }

}
