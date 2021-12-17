package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Random rng = new Random();
        Graph g = new Graph();

        // Creating nodes
        for(int i = 0; i < 1000; i++){
            g.addNode(rng.nextInt(100000));
        }

        for(int i = 0; i < 1000; i++){
            // Randoms for the Node values that will form connections
            int r1 = rng.nextInt(100000);
            int r2 = rng.nextInt(100000);

            if(g.getNodes().containsKey(String.valueOf(r1)) &&
                    g.getNodes().containsKey(String.valueOf(r2)) &&
                    g.getEdges().get(g.getNodes().get(String.valueOf(r1))).size() < 5 &&
                    g.getEdges().get(g.getNodes().get(String.valueOf(r2))).size() < 5){
                g.addEdge(g.getNodes().get(String.valueOf(r1)).getValue(), g.getNodes().get(String.valueOf(r2)).getValue());
            }
            else{
                i--;
            }
        }

        // Printing the graph out
        //g.print();

        // Choosing a random node key to start the search from
        int randomSearch = rng.nextInt(100000);
        while(!g.getNodes().containsKey(String.valueOf(randomSearch))){
            randomSearch = rng.nextInt(100000);
        }

        System.out.println("---------------------------------------------------------");

        g.tDF(randomSearch); // Depth First

        System.out.println();

        System.out.println("---------------------------------------------------------");

        g.tBF(randomSearch); // Breadth First

    }
}
