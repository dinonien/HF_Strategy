package FlugVerhalten;

public class FliegtGarNicht implements FlugVerhalten {

	@Override
	public void fliegen() {
		System.out.println("Ich kann nicht fliegen");
	}

}
