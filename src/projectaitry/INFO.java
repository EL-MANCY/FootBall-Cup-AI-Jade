
package projectaitry;
import static projectaitry.Centeralized.*;
import jade.core.AID;
import jade.core.Agent;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.lang.acl.ACLMessage;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;
import jade.wrapper.AgentController;
import java.util.*;
import java.util.Random;
import javax.swing.*;



public class INFO extends Agent  {
     static jade.core.Runtime r= jade.core.Runtime.instance();
    static Profile p=new ProfileImpl();
    static ContainerController main1=r.createMainContainer(p);
    
  //The First method executed
   public static void main(String[] args) throws StaleProxyException
    {
        AgentController INFO=main1.createNewAgent("INFO","projectaitry.INFO",null);
        INFO.start();
    }
    // RUNS FOR THE INFO AGENT TO START ALL AGENTS
    @Override
    protected void setup() 
    {
        
        try {
            Start();
        } catch (StaleProxyException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // START THE ORGANIZER
        try {
            AgentController Center = main1.createNewAgent("Center","projectaitry.Centeralized",null);
            Center.start();
            
             AgentController rma=main1.createNewAgent("jaade", "jade.tools.rma.rma", null);
            rma.start();
        } catch (StaleProxyException e) {
            e.printStackTrace();
        }
       
    }
    // START ALL AGENTS IN ONE SINGLE FUNTION
     public void Start() throws StaleProxyException, InterruptedException
    {
        
        try
        {
            AgentController Agent1=main1.createNewAgent("TEAM 1","Teams.TEAM1",null);
            Agent1.start();
            AgentController Agent2=main1.createNewAgent("TEAM 2","Teams.TEAM2",null);
            Agent2.start();
            AgentController Agent3=main1.createNewAgent("TEAM 3","Teams.TEAM3",null);
            Agent3.start();
            AgentController Agent4=main1.createNewAgent("TEAM 4","Teams.TEAM4",null);
            Agent4.start();
            AgentController Agent5=main1.createNewAgent("TEAM 5","Teams.TEAM5",null);
            Agent5.start();
            AgentController Agent6=main1.createNewAgent("TEAM 6","Teams.TEAM6",null);
            Agent6.start();
            AgentController Agent7=main1.createNewAgent("TEAM 7","Teams.TEAM7",null);
            Agent7.start();
            AgentController Agent8=main1.createNewAgent("TEAM 8","Teams.TEAM8",null);
            Agent8.start();
            AgentController Agent9=main1.createNewAgent("TEAM 9","Teams.TEAM9",null);
            Agent9.start();
            AgentController Agent10=main1.createNewAgent("TEAM 10","Teams.TEAM10",null);
            Agent10.start();
            AgentController Agent11=main1.createNewAgent("TEAM 11","Teams.TEAM11",null);
            Agent11.start();
            AgentController Agent12=main1.createNewAgent("TEAM 12","Teams.TEAM12",null);
            Agent12.start();
            AgentController Agent13=main1.createNewAgent("TEAM 13","Teams.TEAM13",null);
            Agent13.start();
            AgentController Agent14=main1.createNewAgent("TEAM 14","Teams.TEAM14",null);
            Agent14.start();
            AgentController Agent15=main1.createNewAgent("TEAM 15","Teams.TEAM15",null);
            Agent15.start();
            AgentController Agent16=main1.createNewAgent("TEAM 16","Teams.TEAM16",null);
            Agent16.start();
      
        }
        catch (StaleProxyException e)
        {
            e.printStackTrace();
        }

       display();
       display();
       display();
       display();
       AllResult();
    }
    static String[] Time={"1pm NEXT SATURDAY","2pm NEXT SUNDAY","3pm NEXT MONDAY","4pm NEXT TUESDAY ","5pm NEXT WEDNESDAY","6pm NEXT THURSDAY","9pm NEXT FRIDAY","10pm NEXT WEEK ON SATURDAY","11pm NEXT WEEK ON SUNDAY","12am NEXT FRIDAY","1am NEXT THURSDAY","2am NEXT TUESDAY","3am NEXT TUESDAY","4pm NEXT MONDAY","5pm  NEXT SUNDAY","6pm NEXT SATURDAY"};
      // array  referees 
    static String[] Referees={"AHMED","MOHAMED","MAHMOUD","ELMANCY","HADAD","IBRAHIM","MOSA","AYMAN","GEHAD","PABLO","SAM","SHAHIN","WEGZ","MARO","HANY","BATI"};
     // array OF teams names 
    static String[] Teams={"TEAM1","TEAM2","TEAM3","TEAM4","TEAM5","TEAM6","TEAM7","TEAM8","TEAM9","TEAM10","TEAM11","TEAM12","TEAM13","TEAM14","TEAM15","TEAM16"};
     // array of   the playgrounds 
    static String[] playgrounds={"PLAYGROUND1","PLAYGROUND2","PLAYGROUND3","PLAYGROUND4","PLAYGROUND5","PLAYGROUND6","PLAYGROUND7","PLAYGROUND8","PLAYGROUND9","PLAYGROUND10","PLAYGROUND11","PLAYGROUND12","PLAYGROUND13","PLAYGROUND14","PLAYGROUND15","PLAYGROUND16"};
    // list to convert teams array to list to use collection.shuffle function
    static List<String> list=Arrays.asList(Teams);
    // array to store the winners of matches
    static String[] winners=new String[8];
    // array  store the name of first half TEAMS 
    static String[] TEAM1=new String[15];
    // array of string to store data
    static String[] info=new String[15];
    // array to store the second half TEAMS
    static String[] TEAM2=new String[15];
    // array  to get the random score 
    static Integer[] score={0,1,2,3,4,5,6};
    // array of string to store  all matches 
    static String[] AllGoals=new String[15];

    static String setReferee()
    {
       int Rand=random(Referees.length);
       String refree=Referees[Rand];
       Referees=removeElement(Referees,Rand);
       return refree;
    }
     static String setTime()
    {
        int Rand=random(Time.length);
        String time=Time[Rand];
        Time=removeElement(Time,Rand);
        return time;
    }
    static String setPlayground()
    {
        int Rand=random(playgrounds.length);
        String Place=playgrounds[Rand];
        playgrounds=removeElement(playgrounds,Rand);
        return Place;
    }
    // function to return random number of a specific range
    static int random(int index)
    {
        Random RAND = new Random();
        int X= (RAND.nextInt());
        if(X<0)
        X=X*-1;
        X=X%index;
        return X;
    }
        // function to remove an element from array with index 

     static String[] removeElement(String[] arr, int index)
    {
        if (arr == null || index < 0 || index >= arr.length) {

            return arr;
        } 
         String[] SPARE = new String[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            SPARE[k++] = arr[i];
        }
        return SPARE;
    }
   
    // used as an index in the AllGoals[] 
    static int N=0;
     

    // return the winner;
    static String score(String agent1,String agent2)
    {
        int a1=random(score.length);
        int a2=random(score.length);
        if(a1==a2)
            a2++;
        if (a1 < a2)
        {
            AllGoals[N]=agent1+" DEFEATED BY "+ agent2 + "  " + a2 +"-"+ a1;
            JOptionPane.showMessageDialog(new JFrame(),AllGoals[N]);
            N++;
            System.out.print("The Winner Is : ");

            return agent2;
        }
        else
        {
            AllGoals[N]=agent2+" DEFEATED BY "+ agent1 +"  " + a1 +"-"+ a2;
            JOptionPane.showMessageDialog(new JFrame(),AllGoals[N]);
            N++;
            System.out.print("The Winner Is : ");
            return agent1;
        }

    }
    // return all matches and the winners and all data about the matches;
    static int j1=0;
    static int no=1;
    public static void display()
    {
        Collections.shuffle(list);
        list.toArray(Teams);
        int j = 0;
        for (int i = 1; i < Teams.length; i++) {
            String z=(Teams[i - 1] + " vs " + Teams[i] + ", The Place is " + setPlayground() + ", The Refree Will Be : " + setReferee()+" , The Time Will Be At : " +setTime() );
            System.out.println(z);
            TEAM1[j1]=Teams[i-1];
            info[j1]=z;
            TEAM2[j1]=Teams[i];
            String winner=score(Teams[i - 1], Teams[i]);
            System.out.println(winner);
            winners[j]=winner;
            j++;
            j1++;
            i++;
        }
        System.out.println("\n");
        Teams=winners;
        int len =winners.length;
        if(len==1)
        {
            System.out.println("The Champion Of The League Is: " + winners[0]);
            JOptionPane.showMessageDialog(new JFrame(),"the champion is: " + winners[0]);
        }
        winners=new String[len/2];
        System.out.println("ROUND "+ no+ " FINISHED");
        no++;
    }
    // function used to show all matches resault ;
    public static void AllResult() 
    {
        for (int i = 0; i < AllGoals.length; i++) {
            System.out.println(AllGoals[i]);
        }
        JOptionPane.showMessageDialog(new JFrame(), AllGoals, "The Competition Has Finished" , JOptionPane.INFORMATION_MESSAGE);
    }
     
    
     
}
