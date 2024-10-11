import java.util.*;
class data 
{
    Scanner scan= new Scanner(System.in);
    public int imposter()
    {
        int imposter;
        do
        {
            imposter = (int)(Math.random()*100);
        }while(imposter>9);
        return imposter;
    }

    public int kill()
    {
        int kill;
        do
        {
            kill =(int)(Math.random()*100); 
        }while(kill>9);
        return kill;
    }

    public void game1()
    {
        int random =(int) (Math.random()*100);

        System.out.println("*********Electrical********");
        System.out.println("Your need to guess the code to fix the electrical. The code is a number between 0 to 100:__");
        int i= scan.nextInt();
        while(random!= i)
        {
            if(i < random)
            {
                System.out.println("Try a higer number...");
                i= scan.nextInt();
            }
            else if(i>random)
            {
                System.out.println("Try a lower  number...");
                i= scan.nextInt();

            }

        }
        if( i== random)
        {
            System.out.println("Congratulations captian You guessd the code correct.....");
            System.out.println("The blackout was fixed");

        }

    }

    public void game2()
    {
        System.out.println("********* STORAGE ********");
        System.out.println("An emergency has occured in the Storage. The code for the food Storage has been changed by the imposter");
        System.out.println("Guess the code word :");
        System.out.println("** IF DOG can be written as 4.15.7 and ANT can be written as 1.14.20 **");
        System.out.println("What can CAR be written as??");
        int ans= 3118;
        int userans = scan.nextInt();
        while(userans != ans)
        {
            System.out.println("Try again:");
            System.out.println("Hint a=1, b=2, c=3......");
            userans = scan.nextInt();

        }
        if(userans == ans)
        {
            System.out.println("Congrats captian. You guessed the Code");
        }

    }

    public void  game3()
    {
        int marbleAi= (int)(Math.random()*10);
        int marbleresult;
        System.out.println("SOMEONE HAS SABOTAGED THE NAVIGATION");
        System.out.println("*****************NAVIGATION*****************");
        System.out.println("It looks like the AI has taken over the controls. defeat it in a game to get back the control:");
        System.out.println("The AI has X number of marbles....");
        System.out.println("You need to guess if the AI has odd or even number of marbles:.....");
        System.out.println("Get threee points to win:");
        System.out.println("1.odd");
        System.out.println("2.even");
        System.out.println("Enter the number:");
        int yourscore=0;
        int inputtaken= scan.nextInt();

        while(inputtaken<3 && yourscore<3 )
        {
            marbleAi= (int)(Math.random()*10);
            if(marbleAi%2==0)
            {
                marbleresult=1;

            }
            else
            {
                marbleresult=2;
            }

            if(marbleresult== inputtaken)
            {
                System.out.println("You got a point.");
                yourscore+=1;
                System.out.println("Your score is:"+ yourscore+"/3");
                if(yourscore==3)
                {
                    break;
                }
                System.out.println("1.odd");
                System.out.println("2.even");
                System.out.println("Enter the number:");
                inputtaken= scan.nextInt();
                System.out.println("-------------------------------------------------------------------------------");
            }
            else
            {
                System.out.println("Wrong. Try again:");
                System.out.println("Your score still is:"+ yourscore+"/3");
                System.out.println("1.odd");
                System.out.println("2.even");
                System.out.println("Enter the number:");
                inputtaken= scan.nextInt();
                System.out.println("-------------------------------------------------------------------------------");

            }

        }
        if(inputtaken>3)
        {
            System.out.println("Wrong input. exiting......");
            System.exit(0);
        }
        if(yourscore>=3)
        {
            System.out.println("You did it captian. The navigation control has been taken back.....");
        }

    }

    public void game4()
    {
        int myscore=0;
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("The reactors has malfunctioned.. Our spaceship is loosing control.. It must be the imposter");
        System.out.println("Fix the reactor by winnig this game of rock paper or scissor with the Ai.");
        System.out.println("You need to get 3 points to win");
        System.out.println("1.Rock");
        System.out.println("2.scissor");
        System.out.println("3.paper");
        System.out.println("Enter the number:.......");
        int choice=scan.nextInt();
        int ai_choice=0;
        String ai=" ";
        while(choice<=3 && myscore<3)
        {
            do
            {
                ai_choice =(int)(Math.random()*10);
            }while(ai_choice>3 && ai_choice==0);
            switch(ai_choice)
            {
                case 1: ai="Rock";
                break;
                case 2: ai="Paper";
                break;
                case 3 :ai=" Scissor";

            }
            switch(choice)
            {
                case 1:
                if(ai_choice==1)
                {
                    System.out.println("The ai played:"+ ai);
                    System.out.println("Its a draw play again:");
                    System.out.println("Play again: 1)rock 2)paper or 3)scissor :");
                    choice = scan.nextInt();
                }
                else if(ai_choice==2)
                {
                    System.out.println("The ai played:"+ ai);
                    System.out.println("the ai won.");
                    System.out.println("Play again: 1)rock 2)paper or 3)scissor :");
                    choice = scan.nextInt();
                }
                else if(ai_choice==3)
                {
                    System.out.println("The ai played:"+ ai);
                    myscore+=1;
                    System.out.println("You got a point. your score is:"+ myscore);
                    System.out.println("Play again: 1)rock 2)paper or 3)scissor :");
                    choice = scan.nextInt();

                }
                break;
                case 2:
                if(ai_choice==1)
                {
                    System.out.println("The ai played:"+ ai);
                    myscore+=1;
                    System.out.println("You won. you got a point:"+ myscore);
                    System.out.println("Play again: 1)rock 2)paper or 3)scissor :");
                    choice = scan.nextInt();
                }
                else if(ai_choice==2)
                {
                    System.out.println("The ai played:"+ ai);
                    System.out.println("Its a draw");
                    System.out.println("Play again: 1)rock 2)paper or 3)scissor :");
                    choice = scan.nextInt();
                }
                else if(ai_choice==3)
                {
                    System.out.println("The ai played:"+ ai);
                    myscore+=1;
                    System.out.println("You lost");
                    System.out.println("Play again: 1)rock 2)paper or 3)scissor :");
                    choice = scan.nextInt();

                }

                break;
                case 3:
                if(ai_choice==1)
                {
                    System.out.println("The ai played:"+ ai);
                    System.out.println("you lost");
                    System.out.println("Play again: 1)rock 2)paper or 3)scissor :");
                    choice = scan.nextInt();
                }
                else if(ai_choice==2)
                {
                    System.out.println("The ai played:"+ ai);
                    myscore+=1;
                    System.out.println("You won.Your score is:"+ myscore);
                    System.out.println("Play again: 1)rock 2)paper or 3)scissor :");
                    choice = scan.nextInt();
                }
                else if(ai_choice==3)
                {
                    System.out.println("The ai played:"+ ai);
                    myscore+=1;
                    System.out.println("its a draw");
                    System.out.println("Play again: 1)rock 2)paper or 3)scissor :");
                    choice = scan.nextInt();

                }

                break;

            }
            if(myscore==3)
            {
                break;

            }

        }
        System.out.println("Congratulations captian. You Fixed the reactors.");

    }
}
