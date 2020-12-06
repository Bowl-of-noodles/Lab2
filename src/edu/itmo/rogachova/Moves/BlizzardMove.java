package edu.itmo.rogachova.Moves;

import ru.ifmo.se.pokemon.*;

public class BlizzardMove extends SpecialMove
{
    public BlizzardMove(){
        super(Type.ICE, 110,70);
    }

    @Override
    protected String describe(){
        return "разозлился и попытался заморозить противника";
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage){
        pokemon.setMod(Stat.HP, (int)Math.round(damage));

        //с вероятностью 10% замораживает цель
        if(ChanceToAddEffect.chance(0.1)){
            Effect.freeze(pokemon);}
    }
}
