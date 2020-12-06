package edu.itmo.rogachova.Moves;

import ru.ifmo.se.pokemon.*;

public class WaterfallMove extends PhysicalMove
{
    public WaterfallMove(){
        super(Type.WATER, 80, 100);
    }

    @Override
    protected String describe(){
        return "создает водопад, заставив цель вздрогнуть";
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon,double damage){
        pokemon.setMod(Stat.HP, (int)Math.round(damage));

        //с вероятностью 20% заставит цель вздрогнуть
        if(ChanceToAddEffect.chance(0.2)){Effect.flinch(pokemon);}

    }

}
