package subway.view.input;

import static subway.view.EmptyLineView.*;

import java.util.Scanner;

public class InputView {
	public static String INPUT_FUNCTION_MESSAGE = "원하는 기능을 입력하세요.";

	public static String inputSubwayMainFunction(Scanner scanner) {
		System.out.println(INPUT_FUNCTION_MESSAGE);
		return scanner.nextLine();
	}

	public static String inputStationFunction(Scanner scanner) {
		System.out.println(INPUT_FUNCTION_MESSAGE);
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

	public static String inputLineFunction(Scanner scanner) {
		System.out.println(INPUT_FUNCTION_MESSAGE);
		return scanner.nextLine();
	}

	public static String inputStartStationForLineRegister(Scanner scanner) {
		System.out.println("## 등록할 노선의 상행 종점역 이름을 입력하세요.");
		return scanner.nextLine();
	}

	public static String inputEndStationForLineRegister(Scanner scanner) {
		System.out.println("## 등록할 노선의 하행 종점역 이름을 입력하세요.");
		return scanner.nextLine();
	}

	public static String inputLineNameForLineRegister(Scanner scanner) {
		System.out.println("## 등록할 노선 이름을 입력하세요.");
		return scanner.nextLine();
	}

	public static String inputLineNameForDeleteLine(Scanner scanner) {
		System.out.println("## 삭제할 노선 이름을 입력하세요.");
		return scanner.nextLine();
	}

	public static String inputLineNameForSectionRegister(Scanner scanner) {
		System.out.println("## 노선을 입력하세요.");
		return scanner.nextLine();
	}

	public static String inputStationNameForSectionRegister(Scanner scanner) {
		System.out.println("## 역이름을 입력하세요.");
		return scanner.nextLine();
	}

	public static int inputSequenceNumberForSectionRegister(Scanner scanner) {
		System.out.println("## 순서를 입력하세요.");
		return Integer.parseInt(scanner.nextLine());
	}

	public static String inputLineNameForDeleteSection(Scanner scanner) {
		System.out.println("## 삭제할 구간의 노선을 입력하세요.");
		return scanner.nextLine();
	}
}
