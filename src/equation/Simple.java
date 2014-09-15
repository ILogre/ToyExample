package equation;

/**
 * Created by ivan on 15/09/2014.
 */
public class Simple extends Expression{
    private String variable;

    @Override
    public String toString() {
        return variable;
    }

    public Simple(String variable) {
        super();
        this.variable = variable;
    }
}
