package models;

import interfaces.IPila;

import java.util.ArrayList;

public class Pila<T> extends ArrayList<T> implements IPila<T> {

    @Override
    public void push(T elem) {
        this.add(0, elem);
    }

    @Override
    public T pop() {
        return remove(0);
    }

    @Override
    public int sizePila() {
        return this.size();
    }

    @Override
    public T cima() {
        return this.get(0);
    }

    @Override
    public void vaciar() {
        this.clear();
    }

    @Override
    public void copiaPila(T destino) {

    }


}
