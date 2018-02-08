package javaKD1.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javaKD1.client.User;
import javaKD1.model.Candidate;
import javaKD1.readWrite.helpers;

public class ClientVoting {
    private static User user1;
    private static User user2;
    private static ArrayList<User> userList = new ArrayList<User>();
    
    public static void createUserList(){
        System.out.println("Created user list");
        user1 = new User("lietotajs1", "lietotajs1parole");
        userList.add(user1);
        user2 = new User("lietotajs2", "lietotajs2parole");
        userList.add(user2);
    }
    
    public static void main(String[] args) throws IOException{
        createUserList();
        System.out.println("Welcome!");
        System.out.println("Please insert your username and password.");
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        String vote;
                
        String username = s.next();
        String password = s1.next();
        
        for(int i = 0; i < userList.size(); i++){
            if(userList.get(i).getUsername() == username && userList.get(i).getPassword() == password){
                ArrayList<Candidate> givenList = helpers.readCandidate("");
                System.out.println("Voting started. Please add YES or NO for each candidate");
                
                for(Candidate c:givenList){
                    System.out.println("Would You like to vote for:" + c.getName() + ", age " + c.getAge());
                    vote = s2.next();
                }
                
                System.out.println("Voting ended");
                helpers.saveCandidates(givenList, username);
            }else{
                System.out.println("Wrong password or username");
                System.exit(0);
            }
        }   
    }
}
