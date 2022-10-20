package bridgelabz.com;

public class LineCompaison {
	static void length(int x1, int y1, int x2, int y2) {
		double Line = Math.sqrt((x2-x2)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println(Line);

	public static void main(String args[]) {
		System.out.println("Welcome to Line Comparison");
		length(1,1,3,3);		
	}

}
