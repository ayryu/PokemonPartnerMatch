package com.ayryu.springprojects.pokemonmatcher;

import java.util.Random;

public class GeneratedMon {

    private int pokedexNumber;
    private String name;
    private Random random = new Random();
    private String url;

    public int getPokedexNumber() {
        return pokedexNumber;
    }

    public void setPokedexNumber(int pokedexNumber) {
        this.pokedexNumber = pokedexNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getURL() {
        int randompokedexNumber = this.random.nextInt(720) + 1;
        return "https://www.serebii.net/pokedex-xy/" + randompokedexNumber + ".shtml";
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
