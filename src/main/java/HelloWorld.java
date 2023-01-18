import Letters.*;

public class HelloWorld {
    public static void main(String[] args) {
        H h = new H();
        E e = new E();
        L l = new L();
        L l2 = new L();
        O o = new O();
        W w = new W();
        O o2 = new O();
        R r = new R();
        L l3 = new L();
        D d = new D();
        Space space = new Space();
        Exclamation exclamation = new Exclamation();


        System.out.printf("%s%s%s%s%s%s%s%s%s%s%s%s\n", h.getUpperCase(),e.getLowerCase(), l.getLowerCase(), l2.getLowerCase(), o.getLowerCase(),space.getSpace(), w.getUpperCase(),o2.getLowerCase(), r.getLowerCase(),l3.getLowerCase(), d.getLowerCase(), exclamation.getExclamation());
    }
}
