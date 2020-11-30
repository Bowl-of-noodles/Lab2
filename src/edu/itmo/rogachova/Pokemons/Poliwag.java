package edu.itmo.rogachova.Pokemons;

import edu.itmo.rogachova.Moves.IceBeamMove;
import edu.itmo.rogachova.Moves.SwaggerMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Poliwag extends Pokemon
{
    public Poliwag(String name, int level){
        super(name, level);
        setLevel(level <= 24 ? level : 24);
        setType(Type.WATER);

        double HP = 40,
                attack = 50,
                defense = 40,
                specialAttack = 40,
                specialDefense = 40,
                speed = 90;

        setStats(HP, attack, defense, specialAttack, specialDefense, speed);
        setMove(new IceBeamMove(), new SwaggerMove());
    }
}
