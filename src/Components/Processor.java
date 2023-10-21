package Components;

import Components.MotherBoard.CpuSocket;

public class Processor extends Component {
    private final int cores;
    private final int threads;
    private final CpuSocket socket;

    public Processor(ProcessorBuilder processorBuilder) {
        super(processorBuilder.model, processorBuilder.company, processorBuilder.price);
        this.cores = processorBuilder.cores;
        this.threads = processorBuilder.threads;
        this.socket = processorBuilder.socket;
    }

    public boolean isCompatibleWithMotherBoard(MotherBoard motherBoard) {
        return this.socket.equals(motherBoard.getCpuSocket());
    }
    public static class ProcessorBuilder{
        private int cores;
        private int threads;
        private CpuSocket socket;
        private String model;
        private ProcessorCompany company;
        private int price;

        public Processor build() {
            return new Processor(this);
        }

        public ProcessorBuilder model(String model) {
            this.model = model;
            return this;
        }
        public ProcessorBuilder socket(CpuSocket socket) {
            this.socket = socket;
            return this;
        }
        public ProcessorBuilder price(int price) {
            this.price = price;
            return this;
        }

        public ProcessorBuilder company(ProcessorCompany company) {
            this.company = company;
            return this;
        }
        public ProcessorBuilder cores(int cores) {
            this.cores = cores;
            return this;
        }
        public ProcessorBuilder threads(int threads) {
            this.threads = threads;
            return this;
        }
    }
    public enum ProcessorCompany implements Company {
        INTEL("Intel"),
        AMD("Amd");

        private String company;

        ProcessorCompany(String company) {
            this.company = company;
        }

        public String getCompany() {
            return company;
        }
    }

    @Override
    public String toString() {
        return "Processor{" + "\n\t" +
            "Model: " + getModel() + "\n\t" +
            "Price: " + getPrice() + "\n\t" +
            "Company: " + getCompany() + "\n\t" +
            "Socket: " + socket  + "\n\t" +
            "Count of cores: " + cores + "\n\t" +
            "Count of threads: " + threads + '}';
    }
}
