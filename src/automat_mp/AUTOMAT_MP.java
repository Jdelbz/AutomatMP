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
import controller.MainController;

/**
 *
 * @author Rolo
 */
public class AUTOMAT_MP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainView View = new MainView();
        MainController Controller = new MainController(View);
        View.setControl(Controller);
        
    }
    
}
