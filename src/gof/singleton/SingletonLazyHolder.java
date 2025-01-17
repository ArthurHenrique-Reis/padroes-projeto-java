package gof.singleton;

/**
 *
 * Singleton "Lazy Holder".
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 *
 * @author Arthur
 */

public class SingletonLazyHolder {

    private static class Holder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return instancia;
    }
}
