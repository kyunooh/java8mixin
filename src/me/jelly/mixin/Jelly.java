package me.jelly.mixin;

/**
 * Created by jelly on 10/20/16.
 */
public class Jelly implements Person, Dog {

    public boolean drunken;

    @Override
    public Object getInstance() {
        return this;
    }

    @Override
    public boolean isDrunken() {
        return this.drunken;
    }

    @Override
    public void setDrunken(boolean drunken) {
        this.drunken = drunken;
    }
}
