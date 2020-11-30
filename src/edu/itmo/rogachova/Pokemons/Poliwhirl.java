package edu.itmo.rogachova.Pokemons;

import edu.itmo.rogachova.Moves.BodySlamMove;

public class Poliwhirl extends Poliwag
{
    public Poliwhirl(String name, int level){
        super(name,level);
        setLevel(level >= 25 ? level : 25);

        double HP = 65,
                attack = 65,
                defense = 65,
                specialAttack = 50,
                specialDefense = 50,
                speed = 90;

        setStats(HP, attack, defense, specialAttack, specialDefense, speed);
        addMove(new BodySlamMove());
    }
}
