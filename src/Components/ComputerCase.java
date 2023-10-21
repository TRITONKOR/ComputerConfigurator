package Components;

public class ComputerCase extends Component {
    public ComputerCase(ComputerCaseBuilder computerCaseBuilder) {
        super(computerCaseBuilder.model, computerCaseBuilder.company, computerCaseBuilder.price);
    }

    public static class ComputerCaseBuilder {
        private ComputerCaseCompany company;
        private String model;
        private int price;

        public ComputerCase build() {
            return new ComputerCase(this);
        }

        public ComputerCaseBuilder model(String model) {
            this.model = model;
            return this;
        }
        public ComputerCaseBuilder price(int price) {
            this.price = price;
            return this;
        }
        public ComputerCaseBuilder company(ComputerCaseCompany company) {
            this.company = company;
            return this;
        }
    }

    public enum ComputerCaseCompany implements Company {
        DEEPCOOL("Deepcool"),
        GIGABYTE("GigaByte"),
        MSI("MSI"),
        GAMEMAX("GameMax");

        private String company;

        ComputerCaseCompany(String company) {
            this.company = company;
        }

        @Override
        public String getCompany() {
            return company;
        }
    }

    @Override
    public String toString() {
        return "Computer Case{" + "\n\t" +
            "Model: " + getModel() + "\n\t" +
            "Price: " + getPrice() + "\n\t" +
            "Company: " + getCompany() + '}';
    }
}
