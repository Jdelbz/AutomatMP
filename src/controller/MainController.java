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
        inputs.add("COWLION1");
        inputs.add("LIONCOW1");
        
        Node firstNode = new Node(0, true, false, inputs);
        firstNode.setInputs(inputs);
        //second state inputs
        inputs1.add("COW2");
        inputs1.add("LION4");
        inputs1.add("COWLION0");
        inputs1.add("LIONCOW0");
        
        Node secondNode = new Node(1, false, false, inputs1);
        //third state inputs
        inputs2.add("COW1");
        inputs2.add("HUMANCOW3");
        inputs2.add("COWHUMAN3");
        inputs2.add("COWGRAIN5");
        inputs2.add("GRAINCOW5");
        
        Node thirdNode = new Node(2, false, false, inputs2);
        //fourth state inputs
        inputs3.add("HUMANCOW2");
        inputs3.add("COWHUMAN2");
        inputs3.add("COWLION7");
        inputs3.add("LIONCOW7");
        inputs3.add("HUMANLION4");
        inputs3.add("LIONHUMAN4");
        Node fourthNode = new Node(3, false, false, inputs3);
        //fifth state inputs
        inputs4.add("LION1");
        inputs4.add("HUMANLION3");
        inputs4.add("LIONHUMAN3");
        inputs4.add("GRAINLION5");
        inputs4.add("LIONGRAIN5");
        inputs4.add("HUMANHUMAN8");
        Node fifthNode = new Node(4, false, false, inputs4);
        //sixth state inputs
        inputs5.add("COW16");
        inputs5.add("GRAINLION4");
        inputs5.add("LIONGRAIN4");
        inputs5.add("COWGRAIN2");
        inputs5.add("GRAINCOW2");
        inputs5.add("COWLION6");
        inputs5.add("LIONCOW6");
        Node sixthNode = new Node(5, false, false, inputs5);
        //seventh state inputs
        inputs6.add("COWLION5");
        inputs6.add("LIONCOW5");
        Node seventhNode = new Node(6, false, false, inputs6);
        //eight state inputs
        inputs7.add("COWLION3");
        inputs7.add("LIONCOW3");
        inputs7.add("HUMANCOW8");
        inputs7.add("COWHUMAN8");
        Node eighthNode = new Node(7, false, false, inputs7);
        //ninth state inputs
        inputs8.add("HUMANHUMAN4");
        inputs8.add("COW9");
        inputs8.add("HUMANCOW7");
        inputs8.add("COWHUMAN7");
        Node ninthNode = new Node(8, false, false, inputs8);
        //tenth state inputs
        inputs9.add("COW8");
        inputs9.add("COWLION10");
        inputs9.add("LIONCOW10");
        inputs9.add("COWGRAIN13");
        inputs9.add("GRAINCOW13");
        inputs9.add("GRAINLION11");
        inputs9.add("LIONGRAIN11");
        Node tenthNode = new Node(9, false, false, inputs9);
        //11th state inputs
        inputs10.add("COWLION9");
        inputs10.add("LIONCOW9");
        Node elevnthNode = new Node(10, false, false, inputs10);
        //12th state inputs
        inputs11.add("HUMANHUMAN16");
        inputs11.add("HUMANLION14");
        inputs11.add("LIONHUMAN14");
        inputs11.add("GRAINLION9");
        inputs11.add("LIONGRAIN9");
        inputs11.add("LION12");
        Node twelvthNode = new Node(11, false, false, inputs11);
        //13th state inputs
        inputs12.add("COW13");
        inputs12.add("LION11");
        Node thirteenthNode = new Node(12, false, false, inputs12);
        //14th state inputs
        inputs13.add("COW12");
        inputs13.add("COWGRAIN9");
        inputs13.add("GRAINCOW9");
        inputs13.add("HUMANCOW14");
        inputs13.add("COWHUMAN14");
        Node fourteenthNode = new Node(13, false, false, inputs13);
        //15th state inputs
        inputs14.add("COWLION15");
        inputs14.add("LIONCOW15");
        inputs14.add("HUMANCOW13");
        inputs14.add("COWHUMAN13");
        inputs14.add("HUMANLION11");
        inputs14.add("LIONHUMAN11");
        Node fifteenthNode = new Node(14, false, false, inputs14);
        //16th state inputs
        inputs15.add("COWLION14");
        inputs15.add("LIONCOW14");
        inputs15.add("HUMANCOW16");
        inputs15.add("COWHUMAN16");
        Node sixteenthNode = new Node(15, false, false, inputs15);
        //17th state inputs
        inputs16.add("COW5");
        inputs16.add("HUMANCOW15");
        inputs16.add("COWHUMAN15");
        inputs16.add("HUMANHUMAN11");
        Node seventeenthNode = new Node(16, false, false, inputs16);
        //18th state inputs
        inputs17.add("COWLION12");
        inputs17.add("LIONCOW12");
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
        secondNode.addNext(fifthNode);
        secondNode.addNext(thirdNode);
        secondNode.addNext(firstNode);
        thirdNode.addNext(secondNode);
        thirdNode.addNext(fourthNode);
        thirdNode.addNext(sixthNode);
        fourthNode.addNext(thirdNode);
        fourthNode.addNext(eighthNode);
        fourthNode.addNext(fifthNode);
        fifthNode.addNext(ninthNode);
        fifthNode.addNext(secondNode);
        fifthNode.addNext(fourthNode);
        fifthNode.addNext(sixthNode);
        sixthNode.addNext(seventeenthNode);
        sixthNode.addNext(fifthNode);
        sixthNode.addNext(thirdNode);
        sixthNode.addNext(seventhNode);
        seventhNode.addNext(sixthNode);
        eighthNode.addNext(ninthNode);
        eighthNode.addNext(fourthNode);
        ninthNode.addNext(tenthNode);
        ninthNode.addNext(eighthNode);
        ninthNode.addNext(fifthNode);
        tenthNode.addNext(twelvthNode);
        tenthNode.addNext(ninthNode);
        tenthNode.addNext(elevnthNode);
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
        fifteenthNode.addNext(twelvthNode);
        fifteenthNode.addNext(sixteenthNode);
        fifteenthNode.addNext(fourteenthNode);
        sixteenthNode.addNext(seventeenthNode);
        sixteenthNode.addNext(fifteenthNode);
        seventeenthNode.addNext(twelvthNode);
        seventeenthNode.addNext(sixthNode);
        seventeenthNode.addNext(sixteenthNode);
        
        
        
//        System.out.println(solutionPath.size());
        
//        System.out.println(firstGraph.getNodes().get(15).getInputs().size());
//        
//        int y;
//        y = 15;
//        for (int i = 0; i < firstGraph.getNodes().get(y).getInputs().size(); i++)
//            System.out.println(firstGraph.getNodes().get(y).getInputs().get(i));
    }
}
