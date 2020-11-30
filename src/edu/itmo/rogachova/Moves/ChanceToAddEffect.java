package edu.itmo.rogachova.Moves;

public class ChanceToAddEffect
{
    public static boolean chance(int perc)
    {
        return Math.random() <= perc/100? true: false;

    }
}
