package subway.view;

import java.util.Scanner;

public class InputView {
	public static String inputSubwayMainFunction(Scanner scanner) {
		System.out.println("원하는 기능을 입력하세요.");
		return scanner.nextLine();
	}
}
