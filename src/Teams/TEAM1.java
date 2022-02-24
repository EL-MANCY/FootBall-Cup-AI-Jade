/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teams;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
//import test.Data;

import javax.swing.*;

public class TEAM1 extends Agent {
      protected void setup()
    {
        System.out.println("TEAM 1 IS HERE");
        addBehaviour(new CyclicBehaviour() {
            @Override
            public void action() {
                ACLMessage message=receive();
                if (message!=null)
                {
                   JOptionPane.showMessageDialog(new JFrame(),"1st " + message.getContent());
                }
            }
        });

    }
    protected void takeDown()
    {
        System.out.println("TEAM 1 OUT");
    }
}
