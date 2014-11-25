package gstring

public class Gstr {

    static class Complex {

        String getWord(){
            return "complex"
        }

    }

    public static void main(String[] a) {

        def foxtype = 'quick'
        def foxcolor = ['b', 'r', 'o', 'w', 'n']

        println "The $foxtype ${foxcolor.join()} fox"

        println "It is currently ${ new Date() }"


        def err = "an error"
        println "This is ${Math.sin(1) > 1 ? err : "a ${new Complex().word} ${this.class.simpleName} example"}"

    }
}
