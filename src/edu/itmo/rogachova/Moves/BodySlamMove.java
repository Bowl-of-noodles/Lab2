package edu.itmo.rogachova.Moves;

import ru.ifmo.se.pokemon.*;

public class BodySlamMove extends PhysicalMove
{
    public BodySlamMove(){
        super(Type.NORMAL, 85, 100);
    }

    @Override
    protected String describe(){
        return "лень атаковать - падает на цель всем своим весом";
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage){
        pokemon.setMod(Stat.HP, (int)Math.round(damage));

        //с вероятностью 30% парализовать цель
        if(ChanceToAddEffect.chance(0.3)){
            Effect.paralyze(pokemon);}
    }
}
