package subway.controller;

import static subway.view.input.InputView.*;
import static subway.view.output.OutputView.*;

import java.util.Scanner;

import subway.controller.function.SubwayMachineFunction;

public class SubwayMachineController {
	public void run(Scanner scanner) {
		printMainScreen();
		SubwayMachineFunction subwayMachineFunction = SubwayMachineFunction.findFunction(inputSubwayMainFunction(scanner));
		subwayMachineFunction.apply(scanner);
		if (!subwayMachineFunction.isQuit()) {
			run(scanner);
		}
	}
}
