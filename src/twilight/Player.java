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
class Player {
    
    private boolean isComputerPlayer = false;
    private String name;
    private int element;

    /**
     * Creates a player
     * @param p1n Name of player.
     * @param p1e Element of player.
     */
    Player(String p1n, int p1e) {
        name = p1n;
        element = p1e;
        System.out.println("player created");
    }
    
    public boolean isComputerPlayer(){
        return isComputerPlayer;
    }
    public void setComputerPlayer(boolean b){
        isComputerPlayer = b;
    }
    
}
