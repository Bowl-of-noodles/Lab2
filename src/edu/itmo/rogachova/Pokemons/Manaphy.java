package edu.itmo.rogachova.Pokemons;


import edu.itmo.rogachova.Moves.ConfideMove;
import edu.itmo.rogachova.Moves.FacadeMove;
import edu.itmo.rogachova.Moves.TailGlowMove;
import edu.itmo.rogachova.Moves.WaterfallMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Manaphy extends Pokemon
{

    public Manaphy(String name, int level){
        super(name, level);

        double HP = 100,
               attack = 100,
               defense = 100,
               specialAttack = 100,
               specialDefense = 100,
               speed = 100;

        setType(Type.WATER);
        setLevel(level);
        setStats(HP, attack,  defense, specialAttack, specialDefense, speed);

        setMove(new FacadeMove(), new ConfideMove(), new TailGlowMove(), new WaterfallMove());


    }


}
