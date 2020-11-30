package edu.itmo.rogachova.Moves;

import ru.ifmo.se.pokemon.*;

public class TailGlowMove extends StatusMove
{
    public TailGlowMove(){
        super(Type.BUG, 0, 0);
    }

    @Override
    protected String describe(){
        return "засмотрелся на мигающие огни и повысил себе спец аттаку";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        //повышает спец атаку аттакующего на три уровня.
        pokemon.addEffect(new Effect().turns(1).stat(Stat.SPECIAL_ATTACK, 3));
    }
}
