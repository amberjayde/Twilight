/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twilight;

import java.util.ArrayList;

/**
 *
 * @author Jayde
 */
class Game {

    final static int UNKNOWN_ELEMENT = 0,
            FIRE_ELEMENT      = 11, WATER_ELEMENT   = 12, WIND_ELEMENT    = 13, EARTH_ELEMENT  = 14,
            LIGHTNING_ELEMENT = 21, ICE_ELEMENT     = 22, NATURE_ELEMENT  = 23, METAL_ELEMENT  = 24,
            AILMENT_ELEMENT   = 31, XXX_ELEMENT     = 32, BARRIER_ELEMENT = 33, ANIMAL_ELEMENT = 34,
            SUMMON_ELEMENT    = 41, MIRROR_ELEMENT  = 42, TIME_ELEMENT    = 43, SPACE_ELEMENT  = 44;
    final static String UNKNOWN_ELEMENT_NAME = "Unknown",
            FIRE_ELEMENT_NAME = "Fire", WATER_ELEMENT_NAME = "Water", WIND_ELEMENT_NAME = "Wind", EARTH_ELEMENT_NAME = "Earth",
            LIGHTNING_ELEMENT_NAME = "Lightning", ICE_ELEMENT_NAME = "Ice", NATURE_ELEMENT_NAME = "Nature", METAL_ELEMENT_NAME = "Metal",
            AILMENT_ELEMENT_NAME = "Ailment", XXX_ELEMENT_NAME = "xxx", BARRIER_ELEMENT_NAME = "Barrier", ANIMAL_ELEMENT_NAME = "Animal",
            SUMMON_ELEMENT_NAME = "Summon", MIRROR_ELEMENT_NAME = "Mirror", TIME_ELEMENT_NAME = "Time", SPACE_ELEMENT_NAME = "Space";
    
    ArrayList<Player> players = new ArrayList<Player>();
    Player player1, player2, player3;
    int player1_element, player2_element, player3_element;
    public Game(){
        
  
        
    }
    public void addPlayer (Player p){ //adds player to next available slot
        players.add(p);
    }
    public static String getElementName(int i){
        switch(i){
            case FIRE_ELEMENT: return FIRE_ELEMENT_NAME;
            case WATER_ELEMENT: return WATER_ELEMENT_NAME;
            case WIND_ELEMENT: return WIND_ELEMENT_NAME;
            case EARTH_ELEMENT: return EARTH_ELEMENT_NAME;
            case LIGHTNING_ELEMENT: return LIGHTNING_ELEMENT_NAME;
            case ICE_ELEMENT: return ICE_ELEMENT_NAME;
            case NATURE_ELEMENT: return NATURE_ELEMENT_NAME;
            case METAL_ELEMENT: return METAL_ELEMENT_NAME;
            case AILMENT_ELEMENT: return AILMENT_ELEMENT_NAME;
            case XXX_ELEMENT: return XXX_ELEMENT_NAME;
            case BARRIER_ELEMENT: return BARRIER_ELEMENT_NAME;
            case ANIMAL_ELEMENT: return ANIMAL_ELEMENT_NAME;
            case SUMMON_ELEMENT: return SUMMON_ELEMENT_NAME;
            case MIRROR_ELEMENT: return MIRROR_ELEMENT_NAME;
            case TIME_ELEMENT: return TIME_ELEMENT_NAME;
            case SPACE_ELEMENT: return SPACE_ELEMENT_NAME;
            
        }
        return null;
    }

    void addPlayer(String p2n, int p2e, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
