package subway.view.output;

import java.util.List;

import subway.domain.Station;

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

	public static void printStationList(List<Station> stationList) {
		for (Station station:stationList) {
			System.out.println(station.toString());
		}
		printEmptyLine();
	}

	public static void printLineScreen() {
		System.out.println("## 노선 관리 화면");
		System.out.println("1. 노선 등록");
		System.out.println("2. 노선 삭제");
		System.out.println("3. 노선 조회");
		System.out.println("B. 돌아가기");
		printEmptyLine();
	}

	public static void printFinishLineRegister() {
		System.out.println(INFO_MESSAGE_PREFIX + "지하철 노선이 등록되었습니다.");
	}

	public static void printFinishLineDelete() {
		System.out.println(INFO_MESSAGE_PREFIX + "지하철 노선이 삭제되었습니다.");
	}

	public static void printSectionScreen() {
		System.out.println("## 구간 관리 화면");
		System.out.println("1. 구간 등록");
		System.out.println("2. 구간 삭제");
		System.out.println("B. 돌아가기");
		printEmptyLine();
	}
}
