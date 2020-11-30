package edu.itmo.rogachova.Pokemons;

import edu.itmo.rogachova.Moves.BlizzardMove;

public class Politoed extends Poliwhirl
{
    public Politoed(String name, int level){
        super(name,level);

        double HP = 90,
                attack = 75,
                defense = 75,
                specialAttack = 90,
                specialDefense = 100,
                speed = 70;

        setStats(HP, attack, defense, specialAttack, specialDefense, speed);
        addMove(new BlizzardMove());
    }
}
