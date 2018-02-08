package javaKD1.server;

import javaKD1.server.GenerateAndCalculate;
import javaKD1.readWrite.helpers;

public class MainServer {
    public static void main(String[] args){
        helpers.writeLog("Generating Candidates");
        GenerateAndCalculate.generateCandidates();
        GenerateAndCalculate.generateCandidates();
        helpers.writeLog("Calculating Results");
        GenerateAndCalculate.calculateResults();
    }
}
