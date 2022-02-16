package interfaces;

public interface IPila<T> {
    void push(T elem);
    T pop();
    boolean isEmpty();
    int sizePila();
    T cima();
    void vaciar();
    void copiaPila(T destino);
}
