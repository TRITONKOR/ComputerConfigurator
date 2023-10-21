import Components.ComputerCase;
import Components.HardDrive.HardDrive;
import Components.PowerSupply;
import Components.Processor;
import Components.Ram;
import java.util.Scanner;
import java.util.List;

import Components.Component;
import Components.MotherBoard;

public class ComputerConfigurator {
    static Computer fillComputer(WareHouse wareHouse) {
        Computer.ComputerBuilder computerBuilder;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Motherboard\n");
        MotherBoard motherBoard = selectComponent(wareHouse.motherBoards, scanner);

        System.out.println("Now select Processor\n");
        Processor processor = selectComponent(wareHouse.processors, scanner);

        System.out.println("Now select Ram\n");
        Ram ram = selectComponent(wareHouse.rams, scanner);

        motherBoard.installProcessor(processor);
        motherBoard.installRam(ram);

        System.out.println("Now select Hard Drive\n");
        HardDrive hardDrive = selectComponent(wareHouse.hardDrives, scanner);

        System.out.println("Now select computer Case\n");
        ComputerCase computerCase = selectComponent(wareHouse.computerCases, scanner);

        System.out.println("Now select PowerSupply\n");
        PowerSupply powerSupply = selectComponent(wareHouse.powerSupplies, scanner);

        computerBuilder = new Computer.ComputerBuilder(motherBoard, powerSupply, hardDrive, computerCase);

        if (userAnswer("Want select VideoCard?")) {
            computerBuilder.motherBoard.installVideoCard(selectComponent(wareHouse.videoCards, scanner));
        }

        if (userAnswer("Want select another Hard Driver?")) {
            computerBuilder.addHardDrives(selectComponent(wareHouse.hardDrives, scanner));
        }

        if (userAnswer("Want select Cooling System?")) {
            computerBuilder.addCoolingSystem(selectComponent(wareHouse.coolingSystems, scanner));
        }

        return computerBuilder.build();
    }

    public static <T extends Component> T selectComponent(List<T> components, Scanner scanner) {
        System.out.println("Choose index of component that you want\n");
        showComponents(components);

        int n;
        do {
            System.out.println("Choose index: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Wrong index");
                System.out.println("Choose index: ");
                scanner.next();
            }
            n = scanner.nextInt();
            if (n - 1 < 0 | n - 1 >= components.size()) {
                System.out.println("Wrong index");
            }
        }while (n - 1 < 0 | n - 1 >= components.size());

        return components.get(n - 1);
    }

    public static void showComponents(List<? extends Component> components) {
        int i = 1;
        for (Component component : components) {
            System.out.println(i + ")\t" + component.toString() + "\n");
            i++;
        }
    }

    public static boolean userAnswer(String question) {
        Scanner scan = new Scanner(System.in);

        System.out.println(question);
        System.out.println("Yes - Y, No - anything");

        String answer = scan.nextLine();
        return answer.equalsIgnoreCase("Y");
    }
}
