/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twilight;

import com.sun.glass.ui.Application;

/**
 *
 * @author Jayde
 */
class RunGame {
    
    public RunGame()
    {
        //create Model and View2
        //Model myModel = new Model();
        //View myView = new View();
        
        //create Contoller. Tell it about Model and View2.
        Controller myController = new Controller();
        myController.addModel(new Model());
        myController.addView(new View(myController));
        //myView.setVisible(true);
        
        /* Controller myController = new Controller(); //empty constructor
        myController.addModel(myModel);
        myController.addView(myView);
        */
        
        //tell View2 about Controller
       // myView.addController(myController);
    }
    
}
