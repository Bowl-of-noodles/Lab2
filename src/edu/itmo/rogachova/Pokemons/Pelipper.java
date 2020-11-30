package edu.itmo.rogachova.Pokemons;


import edu.itmo.rogachova.Moves.HydroPumpMove;
import ru.ifmo.se.pokemon.Type;

public class Pelipper extends Wingull
{
    public Pelipper(String name, int level){
        super(name, level);

        setLevel(level >= 25 ? level : 25);

        double HP = 60,
                attack = 50,
                defense = 100,
                specialAttack = 95,
                specialDefense = 70,
                speed = 65;

        setStats(HP, attack, defense, specialAttack, specialDefense, speed);
        addMove(new HydroPumpMove());
    }
}
