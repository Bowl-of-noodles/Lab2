package edu.itmo.rogachova.Moves;

import ru.ifmo.se.pokemon.*;

public class HurricaneMove extends SpecialMove
{
    public HurricaneMove(){
        super(Type.FLYING, 110, 70);
    }

    @Override
    protected String describe(){
        return "поднял противника в небо сильным ветром";
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage){
        pokemon.setMod(Stat.HP, (int)Math.round(damage));

        //с вероятностью 30% сбивает цель с толку
        if(ChanceToAddEffect.chance(30)){
            Effect.confuse(pokemon);}
    }
}
