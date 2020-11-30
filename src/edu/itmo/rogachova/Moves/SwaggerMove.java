package edu.itmo.rogachova.Moves;

import ru.ifmo.se.pokemon.*;

public class SwaggerMove extends StatusMove
{
    public SwaggerMove(){
        super(Type.NORMAL, 0, 85);
    }

    @Override
    protected String describe(){
        return "что сделал непонятно, но противника с толку сбил";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        //сбивает с толку противника
        Effect.confuse(pokemon);
        //повышает аттаку противника на 2 уровня
        pokemon.addEffect(new Effect().turns(1).stat(Stat.ATTACK, 2));
    }
}
