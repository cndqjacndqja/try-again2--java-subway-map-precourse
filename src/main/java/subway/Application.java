package subway;

import java.util.Scanner;

import subway.controller.SubwayMachineController;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        SubwayMachineController subwayMachineController = new SubwayMachineController();
        subwayMachineController.run(scanner);
    }
}
