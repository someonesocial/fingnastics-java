import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Controller {
	private Fingnastics dasFingnastics;
	private Model dasModel;

	public Controller(Fingnastics pFingnastics) {
		this.dasFingnastics = pFingnastics;
		this.dasModel = new Model();
	}

	public void test() {
		System.out.println(dasFingnastics.getKeys());
		System.out.println(dasModel.getDemanded());
		if (listEqualsIgnoreOrder(dasFingnastics.getKeys(), dasModel.getDemanded())) {
			dasFingnastics.display("richtig");
		} else
			dasFingnastics.display("falsch");
	}

	public static <T> boolean listEqualsIgnoreOrder(List<T> list1, List<T> list2) { //Adaptiert als Set damit reihenfolge egal
		return new HashSet<>(list1).equals(new HashSet<>(list2));
	}
}
