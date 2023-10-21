package Components;

public class PowerSupply extends Component {
    private final int power;

    public PowerSupply(PowerSupplyBuilder powerSupplyBuilder){
        super(powerSupplyBuilder.model, powerSupplyBuilder.company, powerSupplyBuilder.price);
        this.power = powerSupplyBuilder.power;
    }

    public static class PowerSupplyBuilder {
        private PowerSupplyCompany company;
        private String model;
        private int price;
        private int power;

        public PowerSupply build() {
            return new PowerSupply(this);
        }

        public PowerSupplyBuilder model(String model) {
            this.model = model;
            return this;
        }
        public PowerSupplyBuilder price(int price) {
            this.price = price;
            return this;
        }
        public PowerSupplyBuilder company(PowerSupplyCompany company) {
            this.company = company;
            return this;
        }
        public PowerSupplyBuilder power(int power) {
            this.power = power;
            return this;
        }
    }

    public enum PowerSupplyCompany implements Company {
        PROTON("Proton"),
        ENERMAX("Enermax"),
        MSI("MSI");

        private String company;

        PowerSupplyCompany(String company) {
            this.company = company;
        }

        @Override
        public String getCompany() {
            return company;
        }
    }

    @Override
    public String toString() {
        return "PowerSupply{" + "\n\t" +
            "Model: " + getModel() + "\n\t" +
            "Price: " + getPrice() + "\n\t" +
            "Company: " + getCompany() + "\n\t" +
            "Power: " + power + '}';
    }
}
