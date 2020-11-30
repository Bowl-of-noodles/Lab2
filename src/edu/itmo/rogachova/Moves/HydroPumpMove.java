package edu.itmo.rogachova.Moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class HydroPumpMove extends SpecialMove
{
    public HydroPumpMove(){
        super(Type.WATER, 110,80);
    }

    @Override
    protected String describe(){
        return "атакует огромным объемом воды, запущенной под большим давлением";
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage){
        pokemon.setMod(Stat.HP, (int)Math.round(damage));
    }
}
