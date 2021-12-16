package subway.controller;

import static subway.view.input.InputView.*;
import static subway.view.output.OutputView.*;

import java.util.Scanner;

import subway.controller.function.StationFunction;

public class StationController {
	public void run(Scanner scanner) {
		printStationManageScreen();
		try{
			StationFunction stationFunction = StationFunction.findFunction(inputStationFunction(scanner));
			stationFunction.apply(scanner);
		}catch (IllegalArgumentException illegalArgumentException) {
			System.out.println(illegalArgumentException.getMessage());
			run(scanner);
		}
	}
}
