import java.util.ArrayList;

public class Model {
	private ArrayList<Integer> demanded = new ArrayList();

	public Model() {

		demanded.add(65);
		demanded.add(66);
	}

	public ArrayList getDemanded() {

		return demanded;
	}
}
