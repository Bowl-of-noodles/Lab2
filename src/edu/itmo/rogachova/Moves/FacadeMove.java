package edu.itmo.rogachova.Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;


public class FacadeMove extends PhysicalMove
{
    public FacadeMove(){
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected String describe(){
        return "увидел травмы противника - нанес удар с двойным уроном,";
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage){
        switch(pokemon.getCondition()){
            case PARALYZE:
            case POISON:
            case BURN: damage *= 2;
                       break;
        }

        pokemon.setMod(Stat.HP, (int) Math.round(damage));
    }


}
