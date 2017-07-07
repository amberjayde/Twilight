/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twilight;

/**
 *
 * @author Jayde
 */
public class Model {
    
    private Game tempGame, game1, game2, game3;
    public Model()
    {
        
    }
    public Game newGame(){ //empty constructor creates new game temporary slot
        System.out.println("New Game created in temporary slot.");
        
        tempGame = new Game();
        return tempGame;
    }
    public Game newGame(int i){ //creates new game and places it in given slot
        switch(i){
            case 1: game1 = newGame(); System.out.println("New game created in slot 1.");
                return game1;
            case 2: game2 = newGame(); System.out.println("New game created in slot 2.");
                return game2;
            case 3: game3 = newGame(); System.out.println("New game created in slot 3.");
                return game3;
            default: newGame();        System.out.println("New Game created in temporary slot.");
                return tempGame;
        }
        
    }
    public Game getGame(){return game1;} //empty call returns game 1
    public Game getGame(int i){ //return game # given
        switch(i){
            case 1: return game1;
            case 2: return game2;
            case 3: return game3;
            default: return game1;//invalid integer
        }
    }
    
}
