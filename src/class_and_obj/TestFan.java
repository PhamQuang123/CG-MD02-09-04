package class_and_obj;

import java.util.ArrayList;
import java.util.List;

public class TestFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.getFAST());
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());


        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.getMEDIUM());
        fan2.setOn(false);
        System.out.println(fan2.toString());
        List<Fan> obj = new ArrayList<>();
    }
}
