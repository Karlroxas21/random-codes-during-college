package FundamentalsOfProgramming;

//A
public class Main {
    public static void main (String [] args){
        System.out.println("Pregame A");
        PregameA a = new PregameA();
        a.A();
        System.out.println("Pregame B");
        PregameB b = new PregameB();
        b.B();
        System.out.println("Pregame C");
        PregameC c = new PregameC();
        c.C();

        System.out.println("Minor League A");
        MinorleagueA leagueA = new MinorleagueA();
        leagueA.leagueA();
        System.out.println("Minor League B");
        MinorleagueB leagueB = new MinorleagueB();
        leagueB.call();
        System.out.println("Minor League C");
        MinorleagueC leagueC = new MinorleagueC();
        leagueC.call();
        System.out.println("Minor League D");
        MinorleagueD leagueD = new MinorleagueD();
        leagueD.call();
        System.out.println("Minor League E");
        MinorleagueE leagueE = new MinorleagueE();
        leagueE.call();

        System.out.println("Majoy League A");
        MajorleagueA majorA = new MajorleagueA();
        majorA.call();
        System.out.println("Majoy League B");
        MajorleagueB majorB = new MajorleagueB();
        majorB.call();

        System.out.println("Activity 1A");
        Activity1A activity1A = new Activity1A();
        activity1A.call();
        System.out.println("Activity 1B");
        Activity1B activity1B = new Activity1B();
        activity1B.call();
        System.out.println("Activity 2A");
        Activity2A activity2A = new Activity2A();
        activity2A.call();
        System.out.println("Activity 2B");
        Activity2B activity2B = new Activity2B();
        activity2B.call();
        System.out.println("Activity 2C");
        Activity2C activity2C = new Activity2C();
        activity2C.call();

    }
}
