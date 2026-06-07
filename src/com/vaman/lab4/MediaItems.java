package com.vaman.lab4;

public abstract class MediaItems extends Item {
    private int runtime;

    public MediaItems(int id, String title, int copies, int runtime) {
        super(id, title, copies);
        this.runtime = runtime;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Runtime: " + runtime + " mins";
    }
}