package models;

import interfaces.IPila;

import java.util.ArrayList;
import java.util.LinkedList;

public class Pila<T> extends LinkedList<T> implements IPila<T> {

    @Override
    public void push(T elem) {
        this.add(0, elem);
    }

    @Override
    public T pop() {
        T t = getFirst();
        removeFirst();
        return t;
    }

    @Override
    public int sizePila() {
        return this.size();
    }

    @Override
    public T cima() {
        return this.getFirst();
    }

    @Override
    public void vaciar() {
        this.clear();
    }

    @Override
    public void copiaPila(T destino) {

    }


}
