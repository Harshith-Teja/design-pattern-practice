import java.util.*;

public class Main {
    public static void main(String[] args) {

        Pen p = new PenAdapter();
        AssignmentWork aw = new AssignmentWork();
        aw.setPen(p);

        aw.write("write assgnment");

    }
}