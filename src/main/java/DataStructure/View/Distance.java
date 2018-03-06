package DataStructure.View;

public class Distance {
	private boolean visited = false;
	private int value;
	private String path;

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public String toString() {
		return "Distance [visited=" + visited + ", value=" + value + ", path=" + path + "]";
	}
}