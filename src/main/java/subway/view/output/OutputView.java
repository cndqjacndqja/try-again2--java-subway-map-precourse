package subway.view.output;


public class OutputView {
	public static String INFO_MESSAGE_PREFIX = "[INFO] ";

	public static void printMainScreen() {
		System.out.println("## 메인 화면");
		System.out.println("1. 역 관리");
		System.out.println("2. 노선 관리");
		System.out.println("3. 구간 관리");
		System.out.println("4. 지하철 노선도 출력");
		System.out.println("Q. 종료");
		printEmptyLine();
	}

	public static void printStationManageScreen() {
		System.out.println("## 역 관리 화면");
		System.out.println("1. 역 등록");
		System.out.println("2. 역 삭제");
		System.out.println("3. 역 조회");
		System.out.println("B. 돌아가기");
		printEmptyLine();
	}

	public static void printEmptyLine() {
		System.out.println();
	}

	public static void finishRegisterStation() {
		System.out.println(INFO_MESSAGE_PREFIX + "지하철 역이 등록되었습니다.");
		printEmptyLine();
	}
}
