package edu.itmo.rogachova;

import edu.itmo.rogachova.Pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {

    public static void main(String[] args) {
        Battle battle = new Battle();

        Pokemon monaphy = new Manaphy("Головастик",11);
        Pokemon wingull = new Wingull("Чайка", 20);
        Pokemon pelipper = new Pelipper("Пеликан",25);

        Pokemon poliwag = new Poliwag("Спиралька", 15);
        Pokemon poliwhirl = new Poliwhirl("Жабовидный", 26);
        Pokemon politoed = new Politoed("Хамелион", 35);

        battle.addAlly(monaphy);
        battle.addAlly(wingull);
        battle.addAlly(pelipper);

        battle.addFoe(poliwag);
        battle.addFoe(poliwhirl);
        battle.addFoe(politoed);

        battle.go();

    }
}
