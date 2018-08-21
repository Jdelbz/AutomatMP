/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat_mp;
import java.util.ArrayList;
import model.Node;
import model.Graph;
import view.MainView;

/**
 *
 * @author Rolo
 */
public class AUTOMAT_MP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainView view = new MainView();
        ArrayList<String> inputs = new ArrayList<String>();
        //first state inputs
        inputs.add("COWLION");
        inputs.add("LIONCOW");
        
        Node firstNode = new Node(0, true, false, inputs);
        //second state inputs
        
        inputs.add("COW");
        inputs.add("LION");
        
        Node secondNode = new Node(1, false, false, inputs);
        //third state inputs
        inputs.clear();
        inputs.add("COW");
        inputs.add("HUMANCOW");
        inputs.add("COWHUMAN");
        inputs.add("COWGRAIN");
        inputs.add("GRAINCOW");
        
        Node thirdNode = new Node(2, false, false, inputs);
        //fourth state inputs
        inputs.clear();
        inputs.add("HUMANCOW");
        inputs.add("COWHUMAN");
        inputs.add("COWLION");
        inputs.add("LIONCOW");
        inputs.add("HUMANLION");
        inputs.add("LIONHUMAN");
        Node fourthNode = new Node(3, false, false, inputs);
        //fifth state inputs
        inputs.clear();
        inputs.add("LION");
        inputs.add("HUMANLION");
        inputs.add("LIONHUMAN");
        inputs.add("HUMANGRAIN");
        inputs.add("GRAINHUMAN");
        inputs.add("HUMANHUMAN");
        Node fifthNode = new Node(4, false, false, inputs);
        //sixth state inputs
        inputs.clear();
        inputs.add("COW");
        inputs.add("GRAINLION");
        inputs.add("LIONGRAIN");
        inputs.add("COWGRAIN");
        inputs.add("GRAINCOW");
        inputs.add("COWLION");
        inputs.add("LIONCOW");
        Node sixthNode = new Node(5, false, false, inputs);
        //seventh state inputs
        inputs.clear();
        inputs.add("COWLION");
        inputs.add("LIONCOW");
        Node seventhNode = new Node(6, false, false, inputs);
        //eight state inputs
        inputs.add("HUMANCOW");
        inputs.add("COWHUMAN");
        Node eighthNode = new Node(7, false, false, inputs);
        //ninth state inputs
        inputs.clear();
        inputs.add("HUMANHUMAN");
        inputs.add("COW");
        inputs.add("HUMANCOW");
        inputs.add("COWHUMAN");
        Node ninthNode = new Node(8, false, false, inputs);
        //tenth state inputs
        inputs.clear();
        inputs.add("COW");
        inputs.add("COWLION");
        inputs.add("LIONCOW");
        inputs.add("COWGRAIN");
        inputs.add("GRAINCOW");
        inputs.add("GRAINLION");
        inputs.add("LIONGRAIN");
        Node tenthNode = new Node(9, false, false, inputs);
        //11th state inputs
        inputs.clear();
        inputs.add("COWLION");
        inputs.add("LIONCOW");
        Node elevnthNode = new Node(10, false, false, inputs);
        //12th state inputs
        inputs.clear();
        inputs.add("HUMANHUMAN");
        inputs.add("HUMANLION");
        inputs.add("LIONHUMAN");
        inputs.add("GRAINLION");
        inputs.add("LIONGRAIN");
        inputs.add("LION");
        
        Node twelvthNode = new Node(11, false, false, inputs);
        //13th state inputs
        inputs.clear();
        inputs.add("COW");
        inputs.add("LION");
        Node thirteenthNode = new Node(12, false, false, inputs);
        //14th state inputs
        inputs.clear();
        inputs.add("COW");
        inputs.add("COWGRAIN");
        inputs.add("GRAINCOW");
        inputs.add("HUMANCOW");
        inputs.add("COWHUMAN");
        Node fourteenthNode = new Node(13, false, false, inputs);
        //15th state inputs
        inputs.clear();
        inputs.add("COWLION");
        inputs.add("LIONCOW");
        inputs.add("HUMANCOW");
        inputs.add("COWHUMAN");
        inputs.add("HUMANLION");
        inputs.add("LIONHUMAN");
        Node fifteenthNode = new Node(14, false, false, inputs);
        //16th state inputs
        inputs.clear();
        inputs.add("COWLION");
        inputs.add("LIONCOW");
        inputs.add("HUMANCOW");
        inputs.add("COWHUMAN");
        Node sixteenthNode = new Node(15, false, false, inputs);
        //17th state inputs
        inputs.clear();
        inputs.add("COW");
        inputs.add("HUMANCOW");
        inputs.add("COWHUMAN");
        inputs.add("HUMANHUMAN");
        Node seventeenthNode = new Node(16, false, false, inputs);
        //18th state inputs
        inputs.clear();
        Node eighteenthNode = new Node(17, false, true, null);
        
        Graph firstGraph = new Graph();
        firstGraph.appendNode(firstNode);
        firstGraph.appendNode(secondNode);
        firstGraph.appendNode(thirdNode);
        firstGraph.appendNode(fourthNode);
        firstGraph.appendNode(fifthNode);
        firstGraph.appendNode(sixthNode);
        firstGraph.appendNode(seventhNode);
        firstGraph.appendNode(eighthNode);
        firstGraph.appendNode(ninthNode);
        firstGraph.appendNode(tenthNode);
        firstGraph.appendNode(elevnthNode);
        firstGraph.appendNode(twelvthNode);
        firstGraph.appendNode(thirteenthNode);
        firstGraph.appendNode(fourteenthNode);
        firstGraph.appendNode(fifteenthNode);
        firstGraph.appendNode(sixteenthNode);
        firstGraph.appendNode(seventeenthNode);
        firstGraph.appendNode(eighteenthNode);
        
        firstNode.addNext(secondNode);
        secondNode.addNext(thirdNode);
        secondNode.addNext(firstNode);
        secondNode.addNext(fifthNode);
        thirdNode.addNext(secondNode);
        thirdNode.addNext(fourthNode);
        thirdNode.addNext(sixthNode);
        fourthNode.addNext(thirdNode);
        fourthNode.addNext(eighthNode);
        fourthNode.addNext(fifthNode);
        fifthNode.addNext(ninthNode);
        fifthNode.addNext(fourthNode);
        fifthNode.addNext(sixthNode);
        sixthNode.addNext(fifthNode);
        sixthNode.addNext(thirdNode);
        sixthNode.addNext(seventhNode);
        sixthNode.addNext(seventeenthNode);
        seventhNode.addNext(sixthNode);
        eighthNode.addNext(ninthNode);
        eighthNode.addNext(fourthNode);
        ninthNode.addNext(eighthNode);
        ninthNode.addNext(fifthNode);
        ninthNode.addNext(tenthNode);
        tenthNode.addNext(ninthNode);
        tenthNode.addNext(elevnthNode);
        tenthNode.addNext(twelvthNode);
        tenthNode.addNext(fourteenthNode);
        elevnthNode.addNext(tenthNode);
        twelvthNode.addNext(thirteenthNode);
        twelvthNode.addNext(tenthNode);
        twelvthNode.addNext(fifteenthNode);
        twelvthNode.addNext(seventeenthNode);
        thirteenthNode.addNext(eighteenthNode);
        thirteenthNode.addNext(fourteenthNode);
        thirteenthNode.addNext(twelvthNode);
        fourteenthNode.addNext(fifteenthNode);
        fourteenthNode.addNext(tenthNode);
        fourteenthNode.addNext(thirteenthNode);
        fifteenthNode.addNext(sixteenthNode);
        fifteenthNode.addNext(twelvthNode);
        fifteenthNode.addNext(fourteenthNode);
        sixteenthNode.addNext(seventeenthNode);
        sixteenthNode.addNext(fifteenthNode);
        seventeenthNode.addNext(sixthNode);
        seventeenthNode.addNext(twelvthNode);
        seventeenthNode.addNext(sixteenthNode);
    
        System.out.println(firstGraph.getNodes().get(2).getInputs().size());
        int y;
        y = 2;
        for (int i = 0; i < firstGraph.getNodes().get(y).getInputs().size(); i++)
            System.out.println(firstGraph.getNodes().get(y).getInputs().get(i));
    }
    
}
