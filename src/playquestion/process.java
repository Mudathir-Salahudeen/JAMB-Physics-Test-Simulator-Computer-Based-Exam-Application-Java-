/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playquestion;

import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author USER
 */
public class process {
    int x;
    Random num = new Random();
     LinkedList<String> questions = new LinkedList<String>();
    LinkedList<String> optA = new LinkedList<String>();
     LinkedList<String> optB = new LinkedList<String>();
      LinkedList<String> optC = new LinkedList<String>();
       LinkedList<String> Ans = new LinkedList<String>();
  //PQframe obj = new PQframe();
  
     public void add(){
        
    questions.add("<html>Which of the following consists entirely <br> vector quantities?</html>");
    questions.add("<html>A stone of mass 1kg is dropped from <br> height of 10m above the ground and <br>falls freely under gravity. Its kineti <br>energy 5m above the ground is then equal to</html>");
    questions.add("What is the angle of dipression at the magnetic equator?");
    questions.add("<html>A cell can supply currents of 0.4A a 0.2A through <br> a 4.0 and 10.0resistors respectively. The internal <br> resistance of the cell is");
    questions.add("At resonance, the phase angle in an a.c. circuit is");
    questions.add("<html>Which of the following metals will provide the greatest shield against <br> ionizing radiation? </html>");
    questions.add("The radiator of a motor car is cooled by");
    questions.add("<html>I. Temperature. <br> II. Density of air molecules <br>III. Pressure<br>IV. Pitch<br>Which of the above will affect the velocity of sound in air?");
    questions.add("<html>Water is a poor thermometric liquid because it</html>");
    questions.add("<html>The eye controls the amount of light reaching the retina<br> by adjusting the</html>");
    questions.add("<html>An electric iron is rated 1000W, 230V. What is the resistance <br>of its element?</html>");
  
   }
   public void add_A(){
      optA.add("Work, pressure and moment");
      optA.add("its kinetic energy on the ground");
      optA.add("0 deg");
      optA.add("1.5");
      optA.add("90 deg");
      optA.add("lead");
      optA.add("conduction");
      optA.add("I and II only.");
      optA.add("is opaque");
      optA.add("cornea");
      optA.add("52.9");
   }
   public void add_B(){
       optB.add("Velocity, magnetic flux and reaction.");
       optB.add("half its initial potential");
       optB.add("45 deg");
       optB.add("2.5");
       optB.add("60 deg");
       optB.add("manganese");
       optB.add("convection");
       optB.add("II and IV only.");
       optB.add("has low vapour pressure.");
       optB.add("Iris");
       optB.add("50.4");
   }
   public void add_C(){
       optC.add("Displacement, impulse and power");
       optC.add("its initial potential energy.");
       optC.add("90 deg");
       optC.add("2.0");
       optC.add("0 deg");
       optC.add("iron");
       optC.add("radiation");
       optC.add("I, II, III and IV.");
       optC.add("wets glass.");
       optC.add("retina");
       optC.add("50.1");
       
   }
   public void add_Ans(){
        Ans.add("Velocity, magnetic flux and reaction.");
        Ans.add("half its initial potential");
        Ans.add("0 deg");
        Ans.add("2.0");
        Ans.add("0 deg");
        Ans.add("lead");
        Ans.add("convection");
        Ans.add("I and II only.");
        Ans.add("wets glass.");
        Ans.add("iris");
        Ans.add("52.9");
        
   }
  
   
  
   public String return_optionA(){
         String returnA=null;
       for(int i=0;i<=questions.size()-1;i++)
       {
        returnA=optA.get(x);
       }
       
       return returnA;
   }
    public String return_optionB(){
        String returnB=null;
       for(int i=0;i<=questions.size()-1;i++)
       {
        returnB=optB.get(x);
       }
       
       return returnB;
   }
     public String return_optionC(){
        String returnC=null;
       for(int i=0;i<=questions.size()-1;i++)
       {
        returnC=optC.get(x);
       }
       
       return returnC;
   }
   
   
   
   public String return_questions(){
       String ques=null;
       for(int i=0;i<=questions.size()-1;i++)
       {
        ques=questions.get(x);
       }
       
       return ques;
   }
   
   public void rand_Num(){
    int x1=0;
    for(int j=0; j<=100; j++)
    {
     x = num.nextInt(11);
    }
     x1=x;
    }
     
}
