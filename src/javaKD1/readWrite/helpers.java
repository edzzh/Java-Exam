package javaKD1.readWrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaKD1.model.Candidate;

public class helpers {
    ArrayList<Candidate> someUsers = new ArrayList<Candidate>();
    final static String path = "";
    
    public static void saveCandidates(ArrayList<Candidate> cand, String user){
        cand = new ArrayList<Candidate>();
        File file = new File(path);
        
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(cand.clone().toString());
            bufferedWriter.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(helpers.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(helpers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ArrayList<Candidate> readCandidate(String filename){
        StringBuilder sb = new StringBuilder();
        BufferedReader br = null;
        ArrayList<Candidate> createdList = new ArrayList<Candidate>();
        String candidates;
        
        try {
            br = new BufferedReader(new FileReader(path));
            while((candidates = br.readLine()) != null){
                sb.append(candidates);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(helpers.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(helpers.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return createdList;
    }
    
    public static void writeLog(String msg){
        System.out.println(new Date() + " : " + msg);
    }
}
