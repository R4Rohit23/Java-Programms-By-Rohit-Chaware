package com.company.Tutorials.Graph.Representation;

import java.util.ArrayList;

// In this type of representation the graph is stored in the form of List of Lists or ArrayList of array
public class Adjacency_List {

    // create a class called edge to store the edge of the graph
    static class Edge {
        int start;
        int end;
        // for weighted graph
        int weight;

        public Edge(int s, int d, int w) {
            this.start = s;
            this.end = d;
            this.weight = w;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        // It is important because when you crate an arraylist of array it stores NULL value,
        // so we have to store empty value in it
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        // actual creation of graph
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 2, -1));
        graph[1].add(new Edge(1, 3, 3));

        graph[2].add(new Edge(2, 0, 0));
        graph[2].add(new Edge(2, 1, 4));
        graph[2].add(new Edge(2, 3, 7));

        graph[3].add(new Edge(3, 1, 2));
        graph[3].add(new Edge(3, 2, 1));
    }

    public static void main(String[] args) {
        // size of the graph
        int V = 4;

        // here graph is an array where at each index an ArrayList is stored which contains an edge
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

        // finding neighbour of vertex 2
        for (int i = 0; i < graph[2].size(); i++) {
            // get the edge which is store in (start, end) format
            Edge e = graph[2].get(i);
            System.out.println(e.end + " " + e.weight);
        }

    }
}
