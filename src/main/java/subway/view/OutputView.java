package subway.view;

public class OutputView {
	public static void printMainScreen() {
		System.out.println("## 메인 화면");
		System.out.println("1. 역 관리");
		System.out.println("2. 노선 관리");
		System.out.println("3. 구간 관리");
		System.out.println("4. 지하철 노선도 출력");
		System.out.println("Q. 종료");
		printEmptyLine();
	}

	public static void printEmptyLine() {
		System.out.println();
	}
}