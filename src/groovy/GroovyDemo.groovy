package groovy
/**
 * Created by Sebastian on 06/09/2015.
 */
class GroovyDemo {

    void hello(){
        foo(43,2,3)
    }

    static def foo(int i, int j, int k){
        def v
        println(i + j - k)
        v = 42
        return testMethod(i, v, j)
    }

    private static int testMethod(int i, int v, int j) {
        if (i < 42) {
            println('hello!')
        } else {
            return v + j
        }

        return 239
    }
}
