package main;

import equation.*;
import utils.FileOperation;

import java.io.IOException;
import java.nio.file.Paths;

/**
 * Created by ivan on 15/09/2014.
 */
public class TestEquation {
    public static void main(String[] args) throws IOException {
        Equation e = new Equation(
                new Simple("x"),
                new Complex(
                        new Simple("a"),
                        Operator.MINUS,
                        new Complex(
                                new Simple("b"),
                                Operator.DIV,
                                new Simple("c")
                        )
                )
        );
        if(args.length!=0)
            FileOperation.fillFileFromObject(e, Paths.get("").toAbsolutePath().toString()+"/products/"+args[0]);
        else
            System.out.println(e.toString());
    }
}
