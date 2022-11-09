import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {


        System.out.println("this is my first git assignment");
        Assignment asg = new Assignment();
        ChildBranchFile cbf = new ChildBranchFile();
        System.out.println("-------------");
        asg.printinfo();
        System.out.println("-------------");
        cbf.info();
        System.out.println("no i have called one method from the first child branch class");

    }
}