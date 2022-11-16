package examples;

public class Example1 {

    private String checkStrValue = null;
    private String valor = "SomeValue";
    private int i;

    public Example1() {
        this.checkStrValue = valor;
        executeSomeConditions();
        incorrectAssignmentInIfCondition();
    }

    private void executeSomeConditions() {
        if (valor.equals(this.checkStrValue)) {
            i = 1;
        } else if (!valor.equals(this.checkStrValue)) {
            i = 2;
        }
    }

    private static void incorrectAssignmentInIfCondition() {
        boolean value = false;
        if (value == true) {
            i = 3;
        } else {
            i = 4;
        }
    }
}

