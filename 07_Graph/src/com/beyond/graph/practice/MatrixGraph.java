//package com.beyond.graph.practice;
//
//import java.util.Arrays;
//
//public class MatrixGraph {
//	private int[][] matrix;
//	private int numOfVertices;//꼭짓점의 수
//	
//	public MatrixGraph(int numOfVertices) {
//		
//		this.numOfVertices = numOfVertices;
//		this.matrix = new int[numOfVertices][numOfVertices];
//		
//	}
//
//	public void addEdge(int src, int dest, int weight) {//시작, 도착, 가중치
//		
//		// 행이 시작 꼭짓점	// 열이 도착 꼭짓점
//		matrix[src][dest] = weight;
//		// 그래프가 방향이 없는 경우
////		matrix[dest][src] = weight;
//		
//	}
//	
//	public void removeEdge(int src, int dest) {
//
//		matrix[src][dest] = 0;
//		
//		// 그래프가 방향이 없는 경우 ↓
////		matrix[dest][src] = 0;
//	}
//
//	@Override
//	public String toString() {
//		StringBuilder sb = new StringBuilder();
//		
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix[i].length; j++) {
//				if(matrix[i][j] <= 0) {
//					continue;
//				}
////				System.out.print(matrix[i][j] + " ");
//				sb.append(String.format("Vertex %d -> Vertex %d (weight : %d)\n",i, j, matrix[i][j]));
//				
//			}
////			System.out.println();
//		}
//		
//		return sb.toString();
//	}
//
//	
//	
//	
//}


package com.beyond.graph.practice;

public class MatrixGraph {
	private int numOfVertices;
	
	private int[][] matrix;

	public MatrixGraph(int numOfVertices) {
		this.numOfVertices = numOfVertices;
		this.matrix = new int[this.numOfVertices][this.numOfVertices];
	}

	public void addEdge(int src, int dest, int weight) {
		// 행이 시작 꼭짓점
		// 열이 도착 꼭짓점
		matrix[src][dest] = weight;
		
		// 그래프가 방향이 없는 경우
//		matrix[dest][src] = weight;
	}

	public void removeEdge(int src, int dest) {
		// 행이 시작 꼭짓점
		// 열이 도착 꼭짓점
		matrix[src][dest] = 0;
				
		// 그래프가 방향이 없는 경우
//		matrix[dest][src] = 0;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] <= 0) {
					continue;
				}
				
				sb.append(String.format("Vertex %d -> Vertex %d (weight : %d)\n", i, j, matrix[i][j]));
			}
		}		
		
		return sb.toString();
	}
}