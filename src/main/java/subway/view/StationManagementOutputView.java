package subway.view;

import static subway.view.EmptyOutView.*;

public class StationManagementOutputView {
	public static void printStationManageScreen() {
		System.out.println("## 역 관리 화면");
		System.out.println("1. 역 등록");
		System.out.println("2. 역 삭제");
		System.out.println("3. 역 조회");
		System.out.println("B. 돌아가기");
		printEmptyLine();
	}
}
