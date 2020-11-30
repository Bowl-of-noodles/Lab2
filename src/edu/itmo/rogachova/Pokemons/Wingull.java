package edu.itmo.rogachova.Pokemons;

import edu.itmo.rogachova.Moves.BlizzardMove;
import edu.itmo.rogachova.Moves.HurricaneMove;
import edu.itmo.rogachova.Moves.ScaldMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Wingull extends Pokemon
{
    public Wingull(String name, int level){
        super(name, level);

        setLevel(level <= 24 ? level : 24);
        setType(Type.WATER, Type.FLYING);

        double HP = 40,
                attack = 30,
                defense = 30,
                specialAttack = 55,
                specialDefense = 30,
                speed = 85;

        setStats(HP, attack, defense, specialAttack, specialDefense, speed);
        setMove(new BlizzardMove(), new HurricaneMove(), new ScaldMove());
    }
}
