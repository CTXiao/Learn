package DataStructure.View;

import util.Printer;

public class View {
	/**
	 * 数组最大长度
	 */
	private int max_length;
	/**
	 * 数组当前长度
	 */
	private int current_length;
	/**
	 * 顶点数组
	 */
	private Vertex[] vertexs;
	/**
	 * 边数组
	 */
	private int[][] edges;
	/**
	 * distance数组
	 */
	private Distance[] distances;
	
	/**
	 * 初始化View
	 * @param length 初始化长度
	 */
	public void initSize(int length) {
		this.max_length = length;
		this.current_length = 0;
		this.vertexs = new Vertex[length];
		this.edges = new int[length][length];
		this.distances = new Distance[length];
		this.initEdges();
	}

	/**
	 * 初始化边数组
	 */
	private void initEdges() {
		for (int i = 0; i < max_length; i++) {
			for (int j = 0; j < max_length; j++) {
				if (i == j) {
					edges[i][j] = 0;
				} else {
					edges[i][j] = -1;
				}
				Printer.PrintFormat(edges[i][j]);
			}
			Printer.Println();
		}
		Printer.Println();
	}

	/**
	 * 打印图
	 */
	public void PrintView() {
		for (int i = 0; i < max_length; i++) {
			for (int j = 0; j < max_length; j++) {
				Printer.PrintFormat(edges[i][j]);
				Printer.Print();
			}
			Printer.Println();
		}
	}

	/**
	 * 添加顶点
	 * @param v 顶点
	 */
	public void addVertex(Vertex v) {
		if (current_length >= max_length) {
			Printer.Println("View Is Full");
			return;
		}
		v.setIndex(current_length);
		vertexs[this.current_length] = v;
		current_length++;
	}

	/**
	 * 添加顶点
	 * @param info 顶点信息
	 */
	public void addVertex(String info) {
		if (current_length >= max_length) {
			Printer.Println("Add canceled, The View Is Full");
			return;
		}
		Vertex v = new Vertex();
		v.setIndex(current_length);
		v.setInfo(info);
		vertexs[this.current_length] = v;
		current_length++;
	}

	/**
	 * 设置方向和权值
	 * @param fromVertex 起点
	 * @param toVertex 终点
	 * @param weight 权值
	 */
	public void setDirection(Vertex fromVertex, Vertex toVertex, int weight) {
		edges[fromVertex.getIndex()][toVertex.getIndex()] = weight;
	}

	public int getMax_length() {
		return max_length;
	}

	public int getCurrent_length() {
		return current_length;
	}

	public Vertex[] getVertexs() {
		return vertexs;
	}

	public int[][] getEdges() {
		return edges;
	}
}
