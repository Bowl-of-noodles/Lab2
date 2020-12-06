package edu.itmo.rogachova.Moves;

public class ChanceToAddEffect
{
    public static boolean chance(double perc)
    {
        return Math.random() <= perc? true: false;

    }
}
