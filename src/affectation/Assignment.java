package affectation;

/**
 * Created by ivan on 15/09/2014.
 */
public class Assignment {
    private String name;
    private float value;

    public Assignment(String name, float value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public float getValue() {
        return value;
    }

    @Override
    public String toString(){
        return name.toString() + " = " + value+"\n";
    };
}
