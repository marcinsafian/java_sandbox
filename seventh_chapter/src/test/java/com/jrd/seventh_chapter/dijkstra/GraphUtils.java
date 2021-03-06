package com.jrd.seventh_chapter.dijkstra;

/**
 * Created by jakub on 06.09.16.
 */
public class GraphUtils {
    public static Graph buildTestGraph() throws Exception {
        Graph graph = new Graph();

        for (int i = 1; i <= 6; i++) {
            graph.addVertex(i + "");
        }

        graph.addBiEdge("1", "2", 7D);
        graph.addBiEdge("1", "6", 14D);
        graph.addBiEdge("1", "3", 9D);
        graph.addBiEdge("2", "3", 10D);
        graph.addBiEdge("2", "4", 15D);
        graph.addBiEdge("6", "3", 2D);
        graph.addBiEdge("6", "5", 9D);
        graph.addBiEdge("3", "4", 11D);
        graph.addBiEdge("4", "5", 6D);

        return graph;
    }
}
