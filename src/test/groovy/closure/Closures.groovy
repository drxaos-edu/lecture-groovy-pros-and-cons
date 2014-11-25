package closure

class Closures extends GroovyTestCase {

    void test1() {
        def square = { it * it }
        println square(5)
    }

    void test2() {
        def square = { it * it }
        println(
                [1, 2, 3, 4].collect(square)
        )
    }
}
