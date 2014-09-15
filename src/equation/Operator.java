package equation;

/**
 * Created by ivan on 15/09/2014.
 */
public enum Operator {
    PLUS("+"),
    MINUS("-"),
    MULT("*"),
    DIV("/");

    private String value;
    private Operator(String value)
    {
        this.value = value;
    }

    public String toString()
    {
        return this.value;
    }
}
