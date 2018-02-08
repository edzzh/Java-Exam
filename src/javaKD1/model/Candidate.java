package javaKD1.model;

import javasem04.activity.Person;

public class Candidate extends Person{
    int no;
    int votes = 0;
    
    public Candidate(int no, int votes, String name, int age, String comment) {
        super(name, age, comment);
        this.no = no;
        this.votes = votes;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }
    
    @Override
    public int getMyID() {
        return 0;
    }
}
