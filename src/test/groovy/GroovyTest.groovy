
class GroovyTest {
    static void main(String[] args){

        printScriptDouble()
        printActualDouble()
    }

    private static void printScriptDouble() {
        println "Script double: 0.1: ${0.1.getClass().getName()}"
    }

    private static void printActualDouble() {
        double realDouble = 0.1
        println "Actual double: 0.1: ${realDouble.getClass().getName()}"
    }
}