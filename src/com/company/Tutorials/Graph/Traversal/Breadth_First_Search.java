package com.company.Tutorials.Graph.Traversal;

import java.util.*;

// breadth first search is a graph traversal technique, and it is similar to tree's level order traversal
// Implementation is done with the help of Queue data structure
public class Breadth_First_Search {

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

    public static void bfs(ArrayList<Edge>[] graph, int size) {

        // create a queue to store the nodes of the graph
        Queue<Integer> queue = new LinkedList<>();

        // create a visited set to store the nodes which are visited
        Set<Integer> visited = new HashSet<>();

        // store the starting node of the graph which is undefined
        queue.offer(0);

        while (!queue.isEmpty()) {
            int curr = queue.poll();

            // if this node is not visited
            if (!visited.contains(curr)) {
                System.out.print(curr + " ");

                visited.add(curr);

                // add curr node's neighbours
                for (int i = 0; i < graph[curr].size(); i++) {
                    // get the edge of teh curr node
                    Edge e = graph[curr].get(i);
                    // end is our neighbour
                    queue.offer(e.end);
                }
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

        bfs(graph, 4);
    }
}
