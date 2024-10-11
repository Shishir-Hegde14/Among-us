import java.util.*;
class among_us extends data
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        char simplyinput=' ';
        int imposter;
        int killed1;
        int killed2;
        int killed3;
        int killed4;
        int kickout;
        int kickout1;
        int kickout2;
        int kickout3;
        int kickout4;
        System.out.println("************AMONG US************");
        System.out.print("What is your name???:_______");
        String name = scan.nextLine();
        System.out.println("   ___ Captian "+ name+" We are in desparate need of your assistance.");
        System.out.println("We are on a spaceship which is headed towards mars.  There are 10 people on board");
        System.out.println("But there is one imposter AMONG US.........");
        System.out.println("You need to find the imposter before  he kills everyone and sabotages our mission");
        System.out.println("Press any button to continue:");
        simplyinput= scan.next().charAt(0);   
        String[] players = new String[10];
        {
            // // players[0]="Red";
            // // players[1]="Blue";
            // // players[2]="Green";
            // // players[3]="Yellow";
            // // players[4]="Black";
            // // players[5]="White";
            // // players[6]="Pink";
            // players[7]="Gold";
            // players[8]="Brown";
            // players[9]="Silver";

        }
        System.out.println("Enter the names of the members : ");
        for(int i =0; i<10; i++)
        {
            players[i]= scan.nextLine();
        }

        System.out.println("Press any button to continue");
        simplyinput= scan.next().charAt(0);   
        System.out.println("Captian you need to complete a few tasks. There has been a BLACKOUT in electrical.....");
        among_us obj1 = new among_us();
        imposter= obj1.imposter();// creating the imposter
        obj1.game1();
        System.out.println("Press any button to continue");
        simplyinput= scan.next().charAt(0); 
        obj1.game2();
        System.out.println("Press any button to continue");
        simplyinput= scan.next().charAt(0);
        killed1= obj1.kill();
        while(killed1==imposter)
        {
            killed1= obj1.kill();
        }

        System.out.println("@@@@@@@@@@@@@@@ EMERGENCY MEETING HAS BEEN CALLED @@@@@@@@@@@@@@@@@");
        System.out.println(players[killed1]+" HAS BEEN FOUND DEAD IN THE MEDICAL ROOM");
        System.out.println("The imposter has got his first victim.");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("Press any button to continue");
        simplyinput= scan.next().charAt(0);
        System.out.println("The members present are:");
        for(int j=0 ; j<10; j++)
        {
            if(j!= killed1)
            {

                System.out.println(j+"."+ players[j]);
            }

        }

        System.out.println("Captian who do you think is the imposter. Enter their number:________");
        kickout= scan.nextInt();
        if(kickout<12 && kickout!= killed1)
        {
            System.out.println(players[kickout]+" Was thrown out of the ship");

            if(kickout== imposter)
            {
                System.out.println("You DID IT CAPTIAN "+ players[kickout]+" WAS THE IMPOSTER. ");
                System.out.println("##############You win################ ");
                System.out.println("Exiting.....");
                System.exit(0);

            }
            else if(kickout!= imposter)
            {

                System.out.println( players[kickout]+" WAS NOT THE IMPOSTER........ ...... ..... ..");
                System.out.println("@@@@ 8 people remaining.....");
                System.out.println("@@@@THE BOY WHO WAS NOT LOVED BY THE VILLAGE WILL BURN IT DOWN TO FEEL ITS WARMTH");
                System.out.println("--- the imposter");
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

            }
        }
        else
        {
            System.out.println("Please give an proper guidence. be serious. captian was kicked out for not co-operating ");
            System.out.println("imposter wins");
        }
        kickout1=kickout;
        System.out.println("Press any button to continue");
        simplyinput= scan.next().charAt(0);  
        obj1.game3();

        killed2=obj1.kill();
        while( killed2== killed1 ||  killed2== imposter || killed2== kickout1)
        {
            killed2 =obj1.kill();
        }
        System.out.println("@@@@@@@@@@@@@@@ EMERGENCY MEETING HAS BEEN CALLED @@@@@@@@@@@@@@@@@");
        System.out.println(players[killed2]+" HAS BEEN FOUND DEAD IN THE CABIN ROOM");
        System.out.println("The imposter has got his Second victim.");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("Press any button to continue");
        simplyinput= scan.next().charAt(0);

        for(int j=0; j<10; j++)
        {
            if(j!= killed1 && j!= killed2 &&j!=kickout1)
            {

                System.out.println(j+"."+ players[j]);
            }

        }
        System.out.println("Captian who do you think is the imposter. enter their number:________");
        kickout= scan.nextInt();
        if(kickout<12 && kickout!=kickout1 && kickout!= killed1 && kickout!= killed2)
        {
            System.out.println(players[kickout]+" Was thrown out of the ship");
            if(kickout == imposter)
            {
                System.out.println("You DID IT CAPTIAN "+ players[kickout]+" WAS THE IMPOSTER. ");
                System.out.println("##############You win################ ");
                System.out.println("Exiting.....");
                System.exit(0);

            }
            else if(kickout!= imposter)
            {

                System.out.println( players[kickout]+" WAS NOT THE IMPOSTER........ ...... ..... ..");
                System.out.println("@@@@6 people remaining.....");
                System.out.println("@@@@ You either die a hero or live long enough to see yourself become a villan");
                System.out.println("--- the imposter");
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

            }
        }
        else
        {
            System.out.println("Please give an proper guidence. be serious. captian was kicked out for not co-operating ");
            System.out.println("imposter wins");
        }
        kickout2 = kickout;
        obj1.game4();
        killed3=obj1.kill();
        while( killed3== killed1 || killed3== killed2|| killed3== imposter || killed3== kickout1 || killed3== kickout2)
        {
            killed3 =obj1.kill();
        }
        System.out.println("@@@@@@@@@@@@@@@ EMERGENCY MEETING HAS BEEN CALLED @@@@@@@@@@@@@@@@@");
        System.out.println(players[killed3]+" HAS BEEN FOUND DEAD IN THE Storage ROOM");
        System.out.println("The imposter just stepped up his game");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        for(int j=0; j<10; j++)
        {
            if(j!= killed1 && j!= killed2&& j!= killed3 &&j!=kickout1 &&j!=kickout2 )
            {

                System.out.println(j+"."+ players[j]);
            }

        }
        System.out.println("Captian who do you think is the imposter. enter their number:________");
        kickout= scan.nextInt();
        if(kickout<12 && kickout!=kickout1 && kickout!=kickout2 && kickout!= killed1 && kickout!= killed2 &&kickout!= killed3 )
        {
            System.out.println(players[kickout]+" Was thrown out of the ship");
            if(kickout == imposter)
            {
                System.out.println("You DID IT CAPTIAN "+ players[kickout]+" WAS THE IMPOSTER. ");
                System.out.println("##############You win################ ");
                System.out.println("Exiting.....");
                System.exit(0);

            }
            else if(kickout!= imposter)
            {

                System.out.println( players[kickout]+" WAS NOT THE IMPOSTER........ ...... ..... ..");
                System.out.println("@@@@4 people remaining.....");
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

            }
            kickout3=kickout;
            for(int j=0; j<10; j++)
            {
                if(j!= killed1 && j!= killed2 && j!=killed3 &&j!=kickout1 &&j!=kickout2 && j!=kickout3 )
                {

                    System.out.println(j+"."+ players[j]);
                }

            }
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Thats unfortunate. Try again......:");
            System.out.println("This is your last chance..... enter their number:________");
            kickout= scan.nextInt();
            if(kickout<12 && kickout!=kickout1 && kickout!=kickout2 && kickout!= killed1 && kickout!= killed2 &&kickout!= killed3&&kickout!=kickout1)
            {
                System.out.println(players[kickout]+" Was thrown out of the ship");
                if(kickout == imposter)
                {
                    System.out.println("You DID IT CAPTIAN "+ players[kickout]+" WAS THE IMPOSTER. ");
                    System.out.println("##############You win################ ");
                    System.out.println("Exiting.....");
                    System.exit(0);

                }
                else if(kickout!= imposter)
                {

                    System.out.println( players[kickout]+" WAS NOT THE IMPOSTER........ ...... ..... ..");
                    System.out.println("@@@@ only 3 people remaining.....");
                    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

                }
            }
            else
            {
                System.out.println("Please give an proper guidence. be serious. captian was kicked out for not co-operating ");
                System.out.println("imposter wins");
            }

        }
        System.out.println("xxxxxxxxxxxxxxxxxxxx             xxxxxxxxxxxxxxxxxxxx");    
        System.out.println(players[imposter]+" Was the imposter all along.");
        System.out.println(players[imposter]+" Killed you");
        System.out.println("YOU LOOSE");
        System.out.println("xxxxxxxxxxxxxxxxxxxx             xxxxxxxxxxxxxxxxxxxx");
        System.exit(0);
    }
}