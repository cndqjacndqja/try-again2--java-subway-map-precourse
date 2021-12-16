package subway.controller;

import static subway.view.input.InputView.*;
import static subway.view.output.OutputView.*;

import java.util.Scanner;

public class SubwayMachineController {
	public void run(Scanner scanner) {
		printMainScreen();
		inputSubwayMainFunction(scanner);

	}
}
