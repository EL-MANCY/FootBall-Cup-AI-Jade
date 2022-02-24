/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teams;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

import javax.swing.*;

public class TEAM9 extends Agent {
       String content;
    protected void setup()
    {
        System.out.println("TEAM 9 IS HERE");
        addBehaviour(new CyclicBehaviour() {
            @Override
            public void action() {
                ACLMessage message=receive();
                if (message!=null)
                {
                    JOptionPane.showMessageDialog(new JFrame()," 9th " +message.getContent());
                }

            }
        });
    }
    protected void takeDown()
    {
        System.out.println("TEAM 9 OUT");
    }
}
