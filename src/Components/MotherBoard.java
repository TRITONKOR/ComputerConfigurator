package Components;

import java.util.ArrayList;
import java.util.List;

public class MotherBoard extends Component {
    private Processor processor;
    private VideoCard videoCard;
    private List<Ram> ramMemories;
    private final CpuSocket cpuSocket;
    private final RamType ramSocket;

    private final int ramSlots;

    public MotherBoard(MotherBoardBuilder motherBoardBuilder) {
        super(motherBoardBuilder.model, motherBoardBuilder.company, motherBoardBuilder.price);
        this.ramMemories = new ArrayList<>();
        this.cpuSocket = motherBoardBuilder.cpuSocket;
        this.ramSocket = motherBoardBuilder.ramSocket;
        this.ramSlots = motherBoardBuilder.ramSlots;
    }

    public boolean isFilled() {
        if (this.processor != null & this.ramMemories.size() > 0) {
            return true;
        }
        return false;
    }

    public CpuSocket getCpuSocket() {
        return cpuSocket;
    }
    public RamType getRamSocket() {
        return ramSocket;
    }
    public void installProcessor(Processor processor) {
        if (processor.isCompatibleWithMotherBoard(this)) {
            this.processor = processor;
        }
        else {
            throw new IllegalArgumentException("Not compatible processor");
        }
    }

    public void installVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;

    }
    public void installRam(Ram ram) {
        if (!ram.isCompatibleWithMotherBoard(this)) {
            throw new IllegalArgumentException("Not compatible ram");
        }
        else if (ramMemories.size() >= ramSlots){
            throw new IllegalArgumentException("All slots are occupied");
        }
        else {
            this.ramMemories.add(ram);
        }
    }

    public static class MotherBoardBuilder {
        private CpuSocket cpuSocket;
        private RamType ramSocket;
        private Company company;
        private String model;
        private int price;
        private int ramSlots;


        public MotherBoard build() { return new MotherBoard(this);}

        public MotherBoardBuilder cpuSocket(CpuSocket cpuSocket) {
            this.cpuSocket = cpuSocket;
            return this;
        }
        public MotherBoardBuilder ramSocket(RamType ramSocket) {
            this.ramSocket = ramSocket;
            return this;
        }
        public MotherBoardBuilder model(String model) {
            this.model = model;
            return this;
        }
        public MotherBoardBuilder price(int price) {
            this.price = price;
            return this;
        }
        public MotherBoardBuilder ramSlots(int ramSlots) {
            this.ramSlots = ramSlots;
            return this;
        }
        public MotherBoardBuilder company(Company company) {
            this.company = company;
            return this;
        }
    }

    public enum MotherBoardCompany implements Company{
        ASUS("ASUS"),
        MSI("MSI"),
        GIGABYTE("Gigabyte");

        private String company;

        MotherBoardCompany(String company) {
            this.company = company;
        }

        @Override
        public String getCompany() {
            return company;
        }
    }

    public enum CpuSocket {
        AM4("AM4"),
        AM5("AM5"),
        LGA1700("LGA1700"),
        LGA1200("LGA1200"),
        WRX8("WRX8");

        private String cpuSocket;

        CpuSocket(String cpuSocket) {this.cpuSocket = cpuSocket;}

        public String getCpuSocket() {
            return cpuSocket;
        }
    }

    public enum RamType {
        DDR4("DDR4"),
        DDR3("DDR3"),
        DDR5("DDR5"),
        DDR4_SO_DIMM("DDR4_SO_DIMM");

        private String ramType;

        RamType(String ramType) {this.ramType = ramType;}

        public String getRamType() {
            return ramType;
        }
    }

    @Override
    public String toString() {
        return "MotherBoard{" + "\n\t" +
            "Model: " + getModel() + "\n\t" +
            "Price: " + getPrice() + "\n\t" +
            "Company: " + getCompany() + "\n\t" +
            "CpuSocket: " + cpuSocket + "\n\t" +
            "RamSocket: " + ramSocket + "\n\t" +
            "Processor: " + processor + "\n\t" +
            "VideoCard: " + videoCard + "\n\t" +
            "RamMemories: " + ramMemories + "\n\t" +
            "RamSlots: " + ramSlots + '}';
    }
}
