package Components;

import Components.MotherBoard.RamType;

public class Ram extends Component{
    private int rate;
    private int capacity;
    private RamType type;

    public Ram(RamBuilder ramBuilder) {
        super(ramBuilder.model, ramBuilder.company, ramBuilder.price);
        this.capacity = ramBuilder.capacity;
        this.rate = ramBuilder.rate;
        this.type = ramBuilder.type;
    }

    public boolean isCompatibleWithMotherBoard(MotherBoard motherBoard) {
        return this.type.equals(motherBoard.getRamSocket());
    }

    public static class RamBuilder {
        private RamCompany company;
        private RamType type;
        private String model;
        private int price;
        private int rate;
        private int capacity;

        public Ram build() {
            return new Ram(this);
        }

        public RamBuilder model(String model) {
            this.model = model;
            return this;
        }
        public RamBuilder type(RamType type) {
            this.type = type;
            return this;
        }
        public RamBuilder price(int price) {
            this.price = price;
            return this;
        }
        public RamBuilder company(RamCompany company) {
            this.company = company;
            return this;
        }
        public RamBuilder capacity(int capacity) {
            this.capacity = capacity;
            return this;
        }
        public RamBuilder rate(int rate) {
            this.rate = rate;
            return this;
        }
    }

    public enum RamCompany implements Company {
        KINGSTON("Kingston"),
        HYPERX("HyperX");

        private String company;

        RamCompany(String company) {
            this.company = company;
        }

        @Override
        public String getCompany() {
            return company;
        }
    }

    @Override
    public String toString() {
        return "Ram{" + "\n\t" +
            "Model: " + getModel() + "\n\t" +
            "Price: " + getPrice() + "\n\t" +
            "Company: " + getCompany() + "\n\t" +
            "Rate: " + rate + "\n\t" +
            "Capacity: " + capacity + "\n\t" +
            "Type: " + type + '}';
    }
}
