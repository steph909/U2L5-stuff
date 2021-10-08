import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUnit2ProblemSet {

    @Test
    public void testConstructionTester1() {
        String input = ".08\n10\n5";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke main
        String[] args = {};
        ConstructionTester.main(args);

        //expected output
        String consoleOutput = "Enter the sales tax rate: \nHow many boards do you need? \nHow many windows do you need? \nTotal: 135.0\nGrand Total: 145.8";

        // assertion
        assertEquals(consoleOutput, out.toString().replaceAll( "\r", "" ));

        // undo the binding in System
        System.setOut(originalOut);
    }

    @Test
    public void testConstructionTester2() {
        String input = ".075\n25\n10\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke main
        String[] args = {};
        ConstructionTester.main(args);

        //expected output
        String consoleOutput = "Enter the sales tax rate: \nHow many boards do you need? \nHow many windows do you need? \nTotal: 310.0\nGrand Total: 333.25";

        // assertion
        assertEquals(consoleOutput, out.toString().replaceAll( "\r", "" ));

        // undo the binding in System
        System.setOut(originalOut);
    }

    @Test
    public void testHowFarAway1() {
        String input = "48.8567\n2.3508\n51.5072\n0.1275\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke main
        String[] args = {};
        HowFarAway.main(args);

        //expected output
        String consoleOutput = "Enter the latitude of the starting location: \n" +
                "Enter the longitude of the starting location: \n" +
                "Enter the latitude of the ending location: \n" +
                "Enter the longitude of the ending location: \n" +
                "The distance is 208.08639358288565 miles.";

        // assertion
        assertEquals(consoleOutput, out.toString().replaceAll( "\r", "" ));

        // undo the binding in System
        System.setOut(originalOut);
    }

    @Test
    public void testHowFarAway2() {
        String input = "36.1699\n115.1398\n34.0522\n118.2437\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke main
        String[] args = {};
        HowFarAway.main(args);

        //expected output
        String consoleOutput = "Enter the latitude of the starting location: \n" +
                "Enter the longitude of the starting location: \n" +
                "Enter the latitude of the ending location: \n" +
                "Enter the longitude of the ending location: \n" +
                "The distance is 228.67453559954555 miles.";

        // assertion
        assertEquals(consoleOutput, out.toString().replaceAll( "\r", "" ));

        // undo the binding in System
        System.setOut(originalOut);
    }
}