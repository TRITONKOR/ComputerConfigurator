import Components.ComputerCase.ComputerCaseBuilder;
import Components.ComputerCase.ComputerCaseCompany;
import Components.HardDrive.HardDrive;
import Components.HardDrive.HardDrive.HardDriveCompany;
import Components.HardDrive.Hdd.HddBuilder;
import Components.HardDrive.Ssd.SsdBuilder;
import Components.MotherBoard.CpuSocket;
import Components.MotherBoard.MotherBoardBuilder;
import Components.MotherBoard.MotherBoardCompany;
import Components.MotherBoard.RamType;
import Components.PowerSupply.PowerSupplyBuilder;
import Components.PowerSupply.PowerSupplyCompany;
import Components.Processor.ProcessorBuilder;
import Components.Processor.ProcessorCompany;
import Components.Ram.RamBuilder;
import Components.Ram.RamCompany;
import Components.VideoCard.VideoCardBuilder;
import Components.VideoCard.VideoCardCompany;
import Components.cooling.AirCooling.AirCoolingBuilder;
import Components.cooling.CoolingSystem;
import Components.cooling.CoolingSystem.CoolingSystemCompany;
import Components.cooling.LiquidCooling.LiquidCoolingBuilder;
import Components.MotherBoard;
import Components.Processor;
import Components.VideoCard;
import Components.Ram;
import Components.PowerSupply;
import Components.ComputerCase;

import java.util.List;
import java.util.ArrayList;

public final class WareHouse {
    MotherBoardBuilder motherBoardBuilder = new MotherBoardBuilder();
    ProcessorBuilder processorBuilder = new ProcessorBuilder();
    VideoCardBuilder videoCardBuilder = new VideoCardBuilder();
    PowerSupplyBuilder powerSupplyBuilder = new PowerSupplyBuilder();
    ComputerCaseBuilder computerCaseBuilder = new ComputerCaseBuilder();
    HddBuilder hddBuilder = new HddBuilder();
    SsdBuilder ssdBuilder = new SsdBuilder();
    RamBuilder ramBuilder = new RamBuilder();
    AirCoolingBuilder airCoolingBuilder = new AirCoolingBuilder();
    LiquidCoolingBuilder liquidCoolingBuilder = new LiquidCoolingBuilder();

    public List<MotherBoard> motherBoards = new ArrayList<>();
    public List<Processor> processors = new ArrayList<>();
    public List<VideoCard> videoCards = new ArrayList<>();
    public List<Ram> rams = new ArrayList<>();
    public List<HardDrive> hardDrives = new ArrayList<>();
    public List<ComputerCase> computerCases = new ArrayList<>();
    public List<CoolingSystem> coolingSystems = new ArrayList<>();
    public List<PowerSupply> powerSupplies = new ArrayList<>();

    public WareHouse() {
        fillTheWareHouse();
    }

    private void fillTheWareHouse(){
        motherBoards.add(motherBoardBuilder.model("B550").company(MotherBoardCompany.GIGABYTE).cpuSocket(CpuSocket.AM4).ramSocket(RamType.DDR4).ramSlots(4).price(6199).build());
        motherBoards.add(motherBoardBuilder.model("B560M PRO-E").company(MotherBoardCompany.MSI).cpuSocket(CpuSocket.LGA1200).ramSocket(RamType.DDR4).ramSlots(2).price(2977).build());
        motherBoards.add(motherBoardBuilder.model("MSI B760 GAMING PLUS").company(MotherBoardCompany.MSI).cpuSocket(CpuSocket.LGA1700).ramSocket(RamType.DDR5).ramSlots(4).price(6979).build());
        motherBoards.add(motherBoardBuilder.model("B650").company(MotherBoardCompany.MSI).cpuSocket(CpuSocket.AM5).ramSocket(RamType.DDR5).ramSlots(4).price(7399).build());

        processors.add(processorBuilder.model("Ryzen 5 5600X").company(ProcessorCompany.AMD).cores(6).threads(12).socket(CpuSocket.AM4).price(6329).build());
        processors.add(processorBuilder.model("Core i5-12400F").company(ProcessorCompany.INTEL).cores(6).threads(12).socket(CpuSocket.LGA1700).price(6549).build());
        processors.add(processorBuilder.model("Ryzen 5 7600").company(ProcessorCompany.AMD).cores(6).threads(12).socket(CpuSocket.AM5).price(8779).build());
        processors.add(processorBuilder.model("i5-10400F").company(ProcessorCompany.INTEL).cores(6).threads(12).socket(CpuSocket.LGA1200).price(4155).build());

        videoCards.add(videoCardBuilder.model("GeForce RTX 3060").company(VideoCardCompany.GIGABYTE).memory(12).price(12399).build());
        videoCards.add(videoCardBuilder.model("GeForce RTX 4060").company(VideoCardCompany.MSI).memory(8).price(13999).build());
        videoCards.add(videoCardBuilder.model("GeForce RTX 4070 Gaming").company(VideoCardCompany.ASUS).memory(12).price(31369).build());
        videoCards.add(videoCardBuilder.model("RTX 3060 Dual").company(VideoCardCompany.PALITE).memory(12).price(11699).build());

        rams.add(ramBuilder.model("FURY").company(RamCompany.KINGSTON).type(RamType.DDR5).capacity(32).rate(5200).price(9155).build());
        rams.add(ramBuilder.model("FURY Beast RGB Black ").company(RamCompany.HYPERX).type(RamType.DDR4).capacity(8).rate(3200).price(1990).build());
        rams.add(ramBuilder.model("FURY").company(RamCompany.HYPERX).type(RamType.DDR4).capacity(16).price(3200).rate(3200).build());
        rams.add(ramBuilder.model("FURY").company(RamCompany.KINGSTON).type(RamType.DDR4).capacity(16).price(3199).rate(3200).build());

        computerCases.add(computerCaseBuilder.model("MAG Forge 100M").company(ComputerCaseCompany.MSI).price(2499).build());
        computerCases.add(computerCaseBuilder.model("CH370 Tempered Glass").company(ComputerCaseCompany.DEEPCOOL).price(3029).build());
        computerCases.add(computerCaseBuilder.model("Fortress Tempered Glass").company(ComputerCaseCompany.GAMEMAX).price(1675).build());
        computerCases.add(computerCaseBuilder.model("C301 Glass").company(ComputerCaseCompany.GIGABYTE).price(4299).build());

        hardDrives.add(hddBuilder.model("P300").company(HardDriveCompany.TOSHIBA).capacity(1024).readingSpeed(120).writingSpeed(120).price(1349).build());
        hardDrives.add(hddBuilder.model("P300").company(HardDriveCompany.TOSHIBA).capacity(512).readingSpeed(100).writingSpeed(100).price(835).build());
        hardDrives.add(ssdBuilder.model("NV2 3D NAND").company(HardDriveCompany.KINGSTON).capacity(1024).readingSpeed(250).writingSpeed(250).price(2259).build());
        hardDrives.add(ssdBuilder.model("KC3000 3D NAND").company(HardDriveCompany.TOSHIBA).capacity(1024).readingSpeed(300).writingSpeed(300).price(3049).build());

        powerSupplies.add(powerSupplyBuilder.model("BDF-750C").company(PowerSupplyCompany.PROTON).power(750).price(3919).build());
        powerSupplies.add(powerSupplyBuilder.model("MarbleBron").company(PowerSupplyCompany.ENERMAX).power(850).price(3299).build());
        powerSupplies.add(powerSupplyBuilder.model("MAG").company(PowerSupplyCompany.MSI).power(850).price(5799).build());

        coolingSystems.add(airCoolingBuilder.model("Freezer i13 X").company(CoolingSystemCompany.ARTIC).price(919).build());
        coolingSystems.add(liquidCoolingBuilder.model("LT720").company(CoolingSystemCompany.DEEPCOOL).price(5449).build());
    }
}
