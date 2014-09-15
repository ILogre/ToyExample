package main;

import affectation.Assignment;
import utils.FileOperation;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivan on 15/09/2014.
 */
public class TestAssignment {
    public static void main(String[] args) throws IOException {
        List<Assignment> assignmentList = new ArrayList<Assignment>();

        assignmentList.add(
                new Assignment("a",3)
        );
        assignmentList.add(
                new Assignment("b",4)
        );
        assignmentList.add(
                new Assignment("c",2)
        );

        if(args.length!=0)
            FileOperation.fillFileFromObject(assignmentList, Paths.get("").toAbsolutePath().toString() + "/products/" + args[0]);
        else
            System.out.println(assignmentList.toString());
    }
}
