package equation;

/**
 * Created by ivan on 15/09/2014.
 */
public class Complex extends Expression{

    private Expression left;
    private Operator op;
    private Expression right;

    public Complex(Expression left, Operator op, Expression right) {
        super();
        this.left = left;
        this.op = op;
        this.right = right;
    }

    @Override
    public String toString() {
        return "( " + left.toString() + " " + op.toString()+ " " + right.toString() + " )";
    }
}
