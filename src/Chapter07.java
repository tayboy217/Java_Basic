
public class Chapter07 {
	public static void main(String[] args) {
		//		if文
		int number = 6;
		if (number < 5) {
			System.out.println("とても近いです");
		} else if (number < 10) {
			System.out.println("近いです");
		} else if (number < 15) {
			System.out.println("遠いです");
		} else {
			System.out.println("とても遠いです");
		}

		//		Switch文
		String color = "red";
		switch (color) {
		case "red":
			System.out.println("赤信号です");
			break;
		case "yellow":
			System.out.println("黄色信号です");
			break;
		case "blue":
			System.out.println("黄色信号です");
			break;
		}

	}

}
