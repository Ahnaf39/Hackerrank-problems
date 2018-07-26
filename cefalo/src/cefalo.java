import java.io.*;
import java.sql.SQLOutput;
import java.util.*;
import java.util.regex.*;
import java.security.*;
import java.util.Scanner.*;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Scores {
    String position;
    double problemScore, communicationScore, leadershipScore, disciplineScore, experienceScore, currentSalary;

    public Scores(double problemScore, double communicationScore, double leadershipScore, double disciplineScore, double experienceScore, int currentSalary) {
        //this.position = position;
        this.problemScore = problemScore;
        this.communicationScore = communicationScore;
        this.leadershipScore = leadershipScore;
        this.disciplineScore = disciplineScore;
        this.experienceScore = experienceScore;
        this.currentSalary = currentSalary;
    }
}

class Impacts {
    String position;
    double problemImpact, communicationImpact, leadershipImpact, disciplineImpact, experienceImpact;

    public Impacts(double problemImpact, double communicationImpact, double leadershipImpact, double disciplineImpact, double experienceImpact) {
        //this.position = position;
        this.problemImpact = problemImpact;
        this.communicationImpact = communicationImpact;
        this.leadershipImpact = leadershipImpact;
        this.disciplineImpact = disciplineImpact;
        this.experienceImpact = experienceImpact;
    }
}


public class cefalo {
    static class Node {
        String key;
        Node left, right;

        Node(String key) {
            this.key = key;
            left = null;
            right = null;
        }
    }

    static Node root;
    static Node temp = root;

    public static void preOrder(Node root, String choice) {
        if (root == null)
            return;

        /* first print data of node */
        System.out.print(root.key + " ");

        /* then recur on left subtree */
        preOrder(root.left, choice);

        /* now recur on right subtree */
        preOrder(root.right, choice);

    }

    public static void main(String[] args) {
        String choice;
        double revisedSalary = 0;
        double currentSalary = 0;

        root = new Node("CTO1");
        root.left = new Node("PojManager1");
        root.left.left = new Node("Lead1");
        root.left.left.left = new Node("Dev1");
        root.left.right = new Node("Lead2");
        root.left.right.left = new Node("Dev2");
        root.right = new Node("ProjManager2");
        root.right.left = new Node("Lead3");
        root.right.left.left = new Node("Dev3");
        root.right.right = new Node("Lead4");
        root.right.right.left = new Node("Dev4");

        Scanner sc = new Scanner(System.in);
        System.out.print("Write down the team/person's position name which you want to review: ");
        choice = sc.next();
        System.out.println();

        sc.close();

        List<Scores> ListScores = new ArrayList<Scores>();
        List<Impacts> ListImpacts = new ArrayList<Impacts>();

        /*Scores CTO1 = new Scores("CTO 1", 5, 9, 9, 9, 4, 10000);
        Scores ProjManager1 = new Scores("ProjectManager 1", 4, 8, 9, 7, 5, 8000);
        Scores ProjManager2 = new Scores("ProjectManager 2", 4, 8, 9, 7, 5, 8000);
        Scores Lead1 = new Scores("Lead 1", 4, 9, 8, 6, 3, 6000);
        Scores Lead2 = new Scores("Lead 2", 4, 9, 8, 6, 3, 6000);
        Scores Dev1 = new Scores("Developer 1", 8, 6, 4, 8, 4, 4000);
        Scores Dev2 = new Scores("Developer 2", 8, 6, 4, 8, 4, 4000);
        Scores Lead3 = new Scores("Lead 3", 4, 9, 8, 6, 3, 6000);
        Scores Lead4 = new Scores("Lead 4", 4, 9, 8, 6, 3, 6000);
        Scores Dev3 = new Scores("Developer 3", 8, 6, 4, 8, 4, 4000);
        Scores Dev4 = new Scores("Developer 4", 8, 6, 4, 8, 4, 4000);
        */
        Scores CTO1 = new Scores(5, 9, 9, 9, 4, 10000);
        Scores ProjManager1 = new Scores(4, 8, 9, 7, 5, 8000);
        Scores ProjManager2 = new Scores(4, 8, 9, 7, 5, 8000);
        Scores Lead1 = new Scores(4, 9, 8, 6, 3, 6000);
        Scores Lead2 = new Scores(4, 9, 8, 6, 3, 6000);
        Scores Dev1 = new Scores(8, 6, 4, 8, 4, 4000);
        Scores Dev2 = new Scores(8, 6, 4, 8, 4, 4000);
        Scores Lead3 = new Scores(4, 9, 8, 6, 3, 6000);
        Scores Lead4 = new Scores(4, 9, 8, 6, 3, 6000);
        Scores Dev3 = new Scores(8, 6, 4, 8, 4, 4000);
        Scores Dev4 = new Scores(8, 6, 4, 8, 4, 4000);

        //2 teams under each ProjDevs. Each team has 1 teamlead and 1 dev.


        ListScores.add(CTO1);
        ListScores.add(ProjManager1);
        ListScores.add(ProjManager2);
        ListScores.add(Lead1);
        ListScores.add(Lead2);
        ListScores.add(Lead3);
        ListScores.add(Lead4);
        ListScores.add(Dev1);
        ListScores.add(Dev2);
        ListScores.add(Dev3);
        ListScores.add(Dev4);

        Impacts CTO = new Impacts(3, 10, 10, 2, 7);
        Impacts ProjManager = new Impacts(4, 9, 8, 3, 7);
        Impacts Lead = new Impacts(5, 8, 7, 5, 5);
        Impacts Developer = new Impacts(9, 3, 4, 7, 4);

        ListImpacts.add(CTO);
        ListImpacts.add(ProjManager);
        ListImpacts.add(Lead);
        ListImpacts.add(Developer);


        preOrder(root,choice);


        /*for (Scores s : ListScores) {
            if (s.position.contains(choice)) {
                for (Impacts i : ListImpacts) {
                    if (i.position.contains(choice)) {
                        System.out.println("Current Salary: " + s.currentSalary);
                        revisedSalary = s.currentSalary + s.currentSalary * ((s.problemScore / 10 * i.problemImpact / 100) + (s.experienceScore / 10 * i.experienceImpact / 100) + (s.leadershipScore / 10 * i.leadershipImpact / 100) + (s.communicationScore / 10 * i.communicationImpact / 100) + (s.disciplineScore / 10 * i.disciplineImpact / 100));
                        System.out.println("Revised Salary: " + revisedSalary);
                    }
                }
            }

        }*/
    }
}




