
package projectaitry;

import jade.core.AID;
import jade.core.Agent;
import jade.lang.acl.ACLMessage;
import jade.wrapper.AgentController;
import jade.wrapper.StaleProxyException;

public class Centeralized extends Agent {
     String[] TEAM1=INFO.TEAM1;
    String[] TEAM2=INFO.TEAM2;
    String[] info=INFO.info;
    @Override
    protected void setup() {
        for (int i=0;i<TEAM1.length;i++)
        {
            ACLMessage acl1 = new ACLMessage(ACLMessage.INFORM);
            acl1.addReceiver(new AID(TEAM1[i], false));
            acl1.setContent(info[i]);
            send(acl1);
            ACLMessage acl2 = new ACLMessage(ACLMessage.INFORM);
            acl2.addReceiver(new AID(TEAM2[i], false));
            acl2.setContent(info[i]);
            send(acl2);
        }
            System.out.println("ORGANIZER FINISHED HIS MISSION");


    }

}
