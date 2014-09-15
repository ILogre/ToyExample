package equation;

/**
 * Created by ivan on 15/09/2014.
 */
public class Equation {
    private Simple variable;
    private Expression expression;

    public Equation(Simple variable, Expression expression) {
        this.variable = variable;
        this.expression = expression;
    }

    @Override
    public String toString(){
        return variable.toString() + " = " + expression.toString();
    };

}
