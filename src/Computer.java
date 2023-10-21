import Components.ComputerCase;
import Components.VideoCard;
import Components.cooling.CoolingSystem;
import java.util.List;
import java.util.ArrayList;

import Components.HardDrive.HardDrive;
import Components.MotherBoard;
import Components.PowerSupply;
import Components.Ram;

public class Computer {
    private ComputerCase computerCase;
    private MotherBoard motherBoard;
    private PowerSupply powerSupply;
    private List<HardDrive> hardDriveList;
    private List<CoolingSystem> coolingSystemList;

    public Computer(ComputerBuilder computerBuilder) {
        this.motherBoard = computerBuilder.motherBoard;
        this.computerCase = computerBuilder.computerCase;
        this.powerSupply = computerBuilder.powerSupply;
        this.hardDriveList = computerBuilder.hardDriveList;
        this.coolingSystemList = computerBuilder.coolingSystemList;
    }

    public static class ComputerBuilder {
        private ComputerCase computerCase;
        public MotherBoard motherBoard;
        private PowerSupply powerSupply;
        private List<HardDrive> hardDriveList;
        private List<CoolingSystem> coolingSystemList;

        public ComputerBuilder (MotherBoard motherBoard, PowerSupply powerSupply, HardDrive hardDrive, ComputerCase computerCase) {
            if (!motherBoard.isFilled()) {
                throw new IllegalArgumentException("MotherBoard is not filled");
            }

            this.motherBoard = motherBoard;
            this.powerSupply= powerSupply;
            this.hardDriveList = new ArrayList<>();
            this.hardDriveList.add(hardDrive);
            this.coolingSystemList = new ArrayList<>();
            this.computerCase = computerCase;
        }

        public Computer build() {return new Computer(this);}

        public ComputerBuilder addHardDrives(HardDrive hardDrive) {
            this.hardDriveList.add(hardDrive);
            return this;
        }
        public ComputerBuilder addCoolingSystem(CoolingSystem coolingSystem) {
            this.coolingSystemList.add(coolingSystem);
            return this;
        }
    }

    @Override
    public String toString() {
        return "Computer{" + "\n\t" +
            "MotherBoard: " + motherBoard + "\n\n\t" +
            "ComputerCase: " + computerCase  + "\n\n\t" +
            "PowerSupply: " + powerSupply + "\n\n\t" +
            "HardDrives: " + hardDriveList + "\n\n\t" +
            "CollingSystems: " + coolingSystemList + "}";
    }
}
