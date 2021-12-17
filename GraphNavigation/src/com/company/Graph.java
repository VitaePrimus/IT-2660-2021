package com.company;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Graph {
    private HashMap<String, Node> nodes = new HashMap<>();          //
    private HashMap<Node, List<Node>> edges = new HashMap<>();

    // Adding nodes to the graph
    public void addNode(int value) {
        Node node = new Node(value);
        ArrayList<Node> al = new ArrayList<>();

        nodes.putIfAbsent(String.valueOf(value), node);
        edges.putIfAbsent(node, al);
    }

    // Adding edges to the graph
    public void addEdge(int from, int to) {
        Node fromN = nodes.get(String.valueOf(from));
        Node toN = nodes.get(String.valueOf(to));

        if (fromN == null){ return; }
        if (toN == null){ return; }

        edges.get(fromN).add(toN);
        edges.get(toN).add(fromN);
    }

    // Printing out the graph // Working on it right now, will finish by the end of 12/17
//    public void print() {
//        for (int i = 0; i < nodes.size(); i++) {
//            System.out.println(nodes.p + " connected with " + edges.get(nodes.get(String.valueOf(i))));
//        }
//    }

    // Some getters
    public HashMap<String, Node> getNodes() { return nodes; }
    public HashMap<Node, List<Node>> getEdges() { return edges; }

    // Recursive Depth First -------------------------------------------------------------------------------------
    public void tDF(int value) {
        Node node = nodes.get(String.valueOf(value));
        tDF(node, new ArrayList<>());
    }

    private void tDF(Node value, ArrayList<Node> visited) {
        System.out.print(value);
        System.out.print(" -> ");
        visited.add(value);
        for (int i = 0; i < edges.get(value).size(); i++) {
            if (!visited.contains(edges.get(value).get(i))) {
                tDF(edges.get(value).get(i), visited);
            }
        }
    }
    // Recursive Depth First Finish -----------------------------------------------------------------------------


    // Breadth First --------------------------------------------------------------------------------------------
    public void tBF(int value) {
        Node node = nodes.get(String.valueOf(value));
        ArrayList<Node> visited = new ArrayList<>();
        ArrayDeque<Node> q = new ArrayDeque<>();
        q.add(node);

        while (!q.isEmpty()) {
            Node selected = q.remove();
            if (visited.contains(selected)) {
                continue;
            }
            if(!visited.contains(selected)) {
                visited.add(selected);
            }

            System.out.print(selected);
            System.out.print(" -> ");

            for (int i = 0; i < edges.get(selected).size(); i++)
                if (!visited.contains(edges.get(selected).get(i))) {
                    q.add(edges.get(selected).get(i));
                }
        }
    }
    // Breadth First Finish --------------------------------------------------------------------------------------
}
