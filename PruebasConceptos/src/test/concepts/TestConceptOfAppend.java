package test.concepts;

public class TestConceptOfAppend {

	private static StringBuffer convertArrayToString(String[] entryArray) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < entryArray.length; i++) {
			result = result.append(entryArray[i]);
		}
		return result;
	}

	public static void main(String[] args) {
		// Append, puede insertar un valor al final de otro string builder
		StringBuffer sb = new StringBuffer("cadena");
		sb.append(" de ");
		sb.append("texto ");
		sb.append(10);
		System.out.println(sb);
		System.out.println("Con to String : " + sb.toString());
		System.out.println(sb.reverse());

		String miarray[] = { "T", "A", "B", "i", "T", "A" };
		System.out.println(convertArrayToString(miarray));

	}

}
