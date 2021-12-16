package subway.view.input;

import static subway.view.EmptyLineView.*;

import java.util.Scanner;

public class InputView {
	public static String inputSubwayMainFunction(Scanner scanner) {
		System.out.println("원하는 기능을 입력하세요.");
		return scanner.nextLine();
	}

	public static String inputStationFunction(Scanner scanner) {
		System.out.println("원하는 기능을 입력하세요.");
		return scanner.nextLine();
	}

	public static String inputRegisterStation(Scanner scanner) {
		System.out.println("## 등록할 역 이름을 입력하세요.");
		String input = scanner.nextLine();
		printEmptyLine();
		return input;
	}

	public static String inputDeleteStation(Scanner scanner) {
		System.out.println("## 삭제할 역 이름을 입력하세요.");
		String input = scanner.nextLine();
		printEmptyLine();
		return input;
	}
}
