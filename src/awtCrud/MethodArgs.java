package awtCrud;

public class MethodArgs {
	public static void getNames(String... Names) {
		for(String Name : Names)
			System.out.println(Name);
	}

	public static void main(String[] args) {
		getNames("Kishore","MajaKo","Maluko","EnType");
	}

}
