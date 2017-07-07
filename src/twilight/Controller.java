/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twilight;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Jayde
 */
public class Controller implements java.awt.event.ActionListener {

    Model model;
    View  view;
    
    Controller() {System.out.println ("Controller()");} //println for comfirmation
    Controller(Model m, View v)
    {
        this.model = m; this.view = v;
        this.view.addListener(this); //passes controller to the view
        System.out.println("Controller running with new model and new view");
    }
    
    public void addModel(Model m)
    {
            System.out.println("Controller: adding model");
		this.model = m;
    }
    public void addView(View v)
    {
		System.out.println("Controller: adding view");
		this.view = v;
    } //addView()

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public ActionListener unemplementedFeature(){
        return new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(view, "This feature has not been implemented.");
            }
        };
    }
    public ActionListener newGameListener(){
        return new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int result;
                if(model.getGame() == null) //no game open
                    result = JOptionPane.showConfirmDialog(null, "Would you like to start a new game?");
                else //game currently open
                    result = JOptionPane.showConfirmDialog(null, "Would you like to start a new game?\nAny unsaved data on the current game will be lost.");
                
                if(result==JOptionPane.YES_OPTION)
                    model.newGame(1);
                
            }
        };
    }
    
}
