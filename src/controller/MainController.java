/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.ArrayList;
import model.*;
import view.MainView;
/**
 *
 * @author Rolo
 */
public class MainController {
    
    private Graph graph;
    
    private MainView View;
    public MainController(MainView View){
        this.View = View;
        initialize();
    }

    public Graph getGraph() {
        return graph;
    }
    
    public void initialize(){
        ArrayList<String> inputs = new ArrayList<String>();
        ArrayList<String> inputs1 = new ArrayList<String>();
        ArrayList<String> inputs2 = new ArrayList<String>();
        ArrayList<String> inputs3 = new ArrayList<String>();
        ArrayList<String> inputs4 = new ArrayList<String>();
        ArrayList<String> inputs5 = new ArrayList<String>();
        ArrayList<String> inputs6 = new ArrayList<String>();
        ArrayList<String> inputs7 = new ArrayList<String>();
        ArrayList<String> inputs8 = new ArrayList<String>();
        ArrayList<String> inputs9 = new ArrayList<String>();
        ArrayList<String> inputs10 = new ArrayList<String>();
        ArrayList<String> inputs11 = new ArrayList<String>();
        ArrayList<String> inputs12 = new ArrayList<String>();
        ArrayList<String> inputs13 = new ArrayList<String>();
        ArrayList<String> inputs14 = new ArrayList<String>();
        ArrayList<String> inputs15 = new ArrayList<String>();
        ArrayList<String> inputs16 = new ArrayList<String>();
        ArrayList<String> inputs17 = new ArrayList<String>();
        
        //first state inputs
        inputs.add("COWLION");
        inputs.add("LIONCOW");
        
        Node firstNode = new Node(0, true, false, inputs);
        firstNode.setInputs(inputs);
        //second state inputs
        inputs1.add("COW");
        inputs1.add("LION");
        inputs1.add("COWLION");
        inputs1.add("LIONCOW");
        
        Node secondNode = new Node(1, false, false, inputs1);
        //third state inputs
        inputs2.add("COW");
        inputs2.add("HUMANCOW");
        inputs2.add("COWHUMAN");
        inputs2.add("COWGRAIN");
        inputs2.add("GRAINCOW");
        
        Node thirdNode = new Node(2, false, false, inputs2);
        //fourth state inputs
        inputs3.add("HUMANCOW");
        inputs3.add("COWHUMAN");
        inputs3.add("COWLION");
        inputs3.add("LIONCOW");
        inputs3.add("HUMANLION");
        inputs3.add("LIONHUMAN");
        Node fourthNode = new Node(3, false, false, inputs3);
        //fifth state inputs
        inputs4.add("LION");
        inputs4.add("HUMANLION");
        inputs4.add("LIONHUMAN");
        inputs4.add("HUMANGRAIN");
        inputs4.add("GRAINHUMAN");
        inputs4.add("HUMANHUMAN");
        Node fifthNode = new Node(4, false, false, inputs4);
        //sixth state inputs
        inputs5.add("COW");
        inputs5.add("GRAINLION");
        inputs5.add("LIONGRAIN");
        inputs5.add("COWGRAIN");
        inputs5.add("GRAINCOW");
        inputs5.add("COWLION");
        inputs5.add("LIONCOW");
        Node sixthNode = new Node(5, false, false, inputs5);
        //seventh state inputs
        inputs6.add("COWLION");
        inputs6.add("LIONCOW");
        Node seventhNode = new Node(6, false, false, inputs6);
        //eight state inputs
        inputs7.add("COWLION");
        inputs7.add("LIONCOW");
        inputs7.add("HUMANCOW");
        inputs7.add("COWHUMAN");
        Node eighthNode = new Node(7, false, false, inputs7);
        //ninth state inputs
        inputs8.add("HUMANHUMAN");
        inputs8.add("COW");
        inputs8.add("HUMANCOW");
        inputs8.add("COWHUMAN");
        Node ninthNode = new Node(8, false, false, inputs8);
        //tenth state inputs
        inputs9.add("COW");
        inputs9.add("COWLION");
        inputs9.add("LIONCOW");
        inputs9.add("COWGRAIN");
        inputs9.add("GRAINCOW");
        inputs9.add("GRAINLION");
        inputs9.add("LIONGRAIN");
        Node tenthNode = new Node(9, false, false, inputs9);
        //11th state inputs
        inputs10.add("COWLION");
        inputs10.add("LIONCOW");
        Node elevnthNode = new Node(10, false, false, inputs10);
        //12th state inputs
        inputs11.add("HUMANHUMAN");
        inputs11.add("HUMANLION");
        inputs11.add("LIONHUMAN");
        inputs11.add("GRAINLION");
        inputs11.add("LIONGRAIN");
        inputs11.add("LION");
        Node twelvthNode = new Node(11, false, false, inputs11);
        //13th state inputs
        inputs12.add("COW");
        inputs12.add("LION");
        Node thirteenthNode = new Node(12, false, false, inputs12);
        //14th state inputs
        inputs13.add("COW");
        inputs13.add("COWGRAIN");
        inputs13.add("GRAINCOW");
        inputs13.add("HUMANCOW");
        inputs13.add("COWHUMAN");
        Node fourteenthNode = new Node(13, false, false, inputs13);
        //15th state inputs
        inputs14.add("COWLION");
        inputs14.add("LIONCOW");
        inputs14.add("HUMANCOW");
        inputs14.add("COWHUMAN");
        inputs14.add("HUMANLION");
        inputs14.add("LIONHUMAN");
        Node fifteenthNode = new Node(14, false, false, inputs14);
        //16th state inputs
        inputs15.add("COWLION");
        inputs15.add("LIONCOW");
        inputs15.add("HUMANCOW");
        inputs15.add("COWHUMAN");
        Node sixteenthNode = new Node(15, false, false, inputs15);
        //17th state inputs
        inputs16.add("COW");
        inputs16.add("HUMANCOW");
        inputs16.add("COWHUMAN");
        inputs16.add("HUMANHUMAN");
        Node seventeenthNode = new Node(16, false, false, inputs16);
        //18th state inputs
        Node eighteenthNode = new Node(17, false, true, inputs17);
        
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
        graph = firstGraph;
        graph.setCurrent(firstNode);
        
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
    
//        System.out.println(firstGraph.getNodes().get(15).getInputs().size());
//        
//        int y;
//        y = 15;
//        for (int i = 0; i < firstGraph.getNodes().get(y).getInputs().size(); i++)
//            System.out.println(firstGraph.getNodes().get(y).getInputs().get(i));
    }
}
