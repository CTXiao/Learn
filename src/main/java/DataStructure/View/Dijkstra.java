package DataStructure.View;

import util.Printer;

public class Dijkstra {
	/**
	 * 当前顶点数量
	 */
	private int current_length;
	/**
	 * 边集合
	 */
	private int[][] edges;
	/**
	 * 顶点集合
	 */
	private Vertex[] Vertexs;
	/**
	 * dis数组
	 */
	private Distance[] distances;

	/**
	 * 初始化各种...
	 * 
	 * @param view
	 *            图
	 */
	public void initView(View view) {

		this.current_length = view.getCurrent_length();
		this.edges = view.getEdges();
		this.Vertexs = view.getVertexs();
	}

	/**
	 * 获取当前顶点的distance表
	 */
	public void initDistances() {
		Printer.Println();
		for (int j = 0; j < this.current_length; j++) {
			// 遍历顶点数组
			Printer.Print(j + "-: ");
			Vertex vertex = this.Vertexs[j];
			for (int i = 0; i < this.current_length; i++) {
				// 生成Distance[]
				distances[i] = new Distance();
				distances[i].setValue(edges[vertex.getIndex()][i]);
				Printer.PrintFormat(distances[i].getValue());
			}
			Printer.Println();
		}
	}

	/**
	 * 计算最短路径
	 */
	public void dijkstra() {
		if (null == this.distances) {
			this.distances = new Distance[current_length];
			initDistances();
		}
	}
}
