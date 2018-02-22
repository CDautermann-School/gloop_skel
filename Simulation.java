import GLOOP. * ;
import java.util.*;

class Simulation {
GLEntwicklerkamera meineKamera;
GLLicht meinLicht;
GLKugel meineKugel;
ArrayList<GLKugel> kList;


Simulation() {
    meineKamera = new GLEntwicklerkamera();
    meinLicht = new GLLicht();

    
    kList = new ArrayList();
    
    for(int i = 1; i<=20; i++){
     
        kList.add(new GLKugel(i*10, 0, 0, 10));
    }
    
    
}

}
