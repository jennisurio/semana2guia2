
package semana2guia2;

/**
 *
 * @author hogar
 */
public class crearmetodoscomparametros {
    public static void main(String[] args) {
        System.out.println("metodo void");
        metodoscomparametrosvoid(1, 24.13, "lucas");
        System.out.println("---------------");
        System.out.println("metodo int");
        metodoscomparametrosint(1);
        System.out.println("----------------");
        System.out.println("metodos double");
        metodoscomparametrosdouble(24.34);
        System.out.println("metodo string");
         metodoscomparametrosstring("lucas");
    }

    private static void metodoscomparametrosvoid(int valorint, double valordouble, String valorstring) {
        System.out.println("valor int" + valorint);
        System.out.println("valor int" + valordouble);
        System.out.println("valor int" + valorstring);
    }

    private static int metodoscomparametrosint(int valorint) {
        System.out.println("el valor int es" + valorint);
        return valorint;
    }

    private static double metodoscomparametrosdouble(double valordouble ) {
        System.out.println("el valor double es" + valordouble);
        return valordouble;
    }    

    private static String metodoscomparametrosstring(String valorstring) {
        System.out.println("el valor string es" + valorstring);
        return valorstring;
    }
    
}
