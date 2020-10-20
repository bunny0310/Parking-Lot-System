package com.parkingLotSystem.terminals;

public abstract class Terminal {
    int id;

    public Terminal(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
