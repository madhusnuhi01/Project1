import java.util.*;
class guess_number
{
    public int user_input,system_input;
    guess_number()
    {
        Random r=new Random();
        this.system_input=r.nextInt(100)+1;
    }
    public void getdata()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter your guess:");
        user_input=Sc.nextInt();
    }
    public boolean number_g()
    {
        boolean g=false;
        if(user_input==system_input)
        g=true;
        else
        g=false;
        return g;
    }
}
public class guess
{
    public static void main(String args[])
    {
       int attempts=5,round=3,score=0;
       boolean b=false;
       while(round>0)
       {
           guess_number obj=new guess_number();
           while(attempts>0)
           {
               obj.getdata();
               b=obj.number_g();
               if(b==true)
               {
                   System.out.println("You guessed the number correctly");
                   break;
               }
               else
               {
                   if(obj.user_input>obj.system_input)
                   System.out.println("Too high!");
                   else
                   System.out.println("Too low!");
               }
               attempts--;
           }
           if(b==true)
           {
           if(attempts==0)
           score=10;
           else if(attempts==1)
           score=20;
           else if(attempts==2)
           score=30;
           else if(attempts==3)
           score=40;
           else if(attempts==4)
           score=50;
          }
           System.out.println("Score:"+score);
           round--;
       }
    }
}
