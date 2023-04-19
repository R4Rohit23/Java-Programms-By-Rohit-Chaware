package com.company.Tutorials.Graph.Traversal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Depth_First_Search {

    // create a class called edge to store the edge of the graph
    static class Edge {
        int start;
        int end;

        public Edge(int s, int d) {
            this.start = s;
            this.end = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        // It is important because when you crate an arraylist of array it stores NULL value,
        // so we have to store empty value in it
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        // actual creation of graph
        graph[0].add(new Edge(0, 1));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, Set<Integer> visited) {
        // first print the current element
        System.out.print(curr);

        // now add current element into visited set
        visited.add(curr);

        // now get the neighbour of the curr element
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            // if neighbour are not visited then again loop through them
            if (!visited.contains(e.end)) {
                dfs(graph, e.end, visited);
            }
        }
    }

    public static void main(String[] args) {

        // create a graph of size 4
        ArrayList<Edge>[] graph = new ArrayList[4];
        createGraph(graph);

        // 0 -----   1
        //  \      /  \
        //    \   /    \
        //      2 ----- 3
        Set<Integer> visited = new HashSet<>();
        dfs(graph, 0, visited);
    }
}
