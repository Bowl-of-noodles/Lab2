package edu.itmo.rogachova.Moves;

import ru.ifmo.se.pokemon.*;

public class IceBeamMove extends SpecialMove
{
    public IceBeamMove(){
        super(Type.ICE, 90, 100);
    }

    @Override
    protected String describe(){
        return "поражает цель ледяным лучом энергии";
    }
    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage){
        pokemon.setMod(Stat.HP, (int)Math.round(damage));

        //с вероятностью 10% замораживает цель
        if(ChanceToAddEffect.chance(10)){
            Effect.freeze(pokemon);}
    }
}
