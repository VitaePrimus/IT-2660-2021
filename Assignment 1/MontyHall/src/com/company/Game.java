package com.company;

import java.util.Random;

public class Game {
    private Door r;
    private Door g;
    private Door b;

    public Game(Door r, Door g, Door b){
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public Door Prize(){
        Door prize;
        Random rng = new Random();
        int random = rng.nextInt(3);

        if(random == 0)         prize = r;
        else if(random == 1)    prize = g;
        else                    prize = b;

        return prize;
    }

    public Door chosenDoor(){
        Door prize;
        Random rng = new Random();
        int random = rng.nextInt(3);

        if(random == 0)         prize = r;
        else if(random == 1)    prize = g;
        else                    prize = b;

        return prize;
    }


    public Door openDoor(Door winningDoor, Door chosenDoor){
        Door open;
        if(!r.equals(winningDoor) && !r.equals(chosenDoor))         open = r;
        else if(!g.equals(winningDoor) && !g.equals(chosenDoor))    open = g;
        else if(!b.equals(winningDoor) && !b.equals(chosenDoor))    open = b;
        else open = r;

        return open;
    }

    public Door lastDoor(Door openDoor, Door chosenDoor){
        Door lastDoor;
        if(!r.equals(openDoor) && !r.equals(chosenDoor))        lastDoor = r;
        else if(!g.equals(openDoor) && !g.equals(chosenDoor))   lastDoor = g;
        else if(!b.equals(openDoor) && !b.equals(chosenDoor))   lastDoor = b;
        else lastDoor = r;

        return lastDoor;
    }

}
