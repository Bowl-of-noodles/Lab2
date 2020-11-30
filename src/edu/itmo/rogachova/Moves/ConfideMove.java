package edu.itmo.rogachova.Moves;

import ru.ifmo.se.pokemon.*;

public class ConfideMove extends StatusMove
{
    public ConfideMove(){
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected String describe(){
        return "рассказал такой секрет, что соперник забыл о концентрации";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        //снижает специальную аттаку противника на 1 ступень
        pokemon.addEffect(new Effect().turns(1).stat(Stat.SPECIAL_ATTACK, -1));
    }
}
