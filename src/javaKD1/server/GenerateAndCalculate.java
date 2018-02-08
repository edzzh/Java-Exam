package javaKD1.server;

import java.util.ArrayList;
import java.util.Random;
import javasem04.activity.Person;
import javasem04.activity.PersonList;

public class GenerateAndCalculate {
    public static void generateCandidates(){
        Random random = new Random();
        int randomNum = random.nextInt((70 - 18) + 1) + 18;
        ArrayList<Person> personList = new ArrayList<Person>();
        personList.add(new Person("vards", randomNum, "") {
            @Override
            public int getMyID() {
                return 0;
            }
        });
        PersonList generatedList = new PersonList("generatedList", personList);
    }
    
    public static void calculateResults(){
        
    }
}
