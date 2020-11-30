package edu.itmo.rogachova.Moves;

import ru.ifmo.se.pokemon.*;

public class ScaldMove extends SpecialMove
{
    public ScaldMove(){
        super(Type.WATER, 80, 100);
    }

    @Override
    protected String describe()
    {
        return "стркляет в цель кипятком";
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage){
        pokemon.setMod(Stat.HP, (int)Math.round(damage));

        //с вероятностью 30% обжигает цель
        if(ChanceToAddEffect.chance(30)){
            Effect.burn(pokemon);}
    }
}
