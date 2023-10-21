package Components.cooling;

import Components.Component;

public abstract class CoolingSystem extends Component {
    private CoolingSystemCompany company;

    public CoolingSystem(String model, CoolingSystemCompany company, int price) {
        super(model, company, price);
    }

    public abstract void cooling();

    public enum CoolingSystemCompany implements Company {
        DEEPCOOL("DeepCool"),
        ARTIC("ARTIC");

        private String company;

        CoolingSystemCompany(String company) {
            this.company = company;
        }

        @Override
        public String getCompany() {
            return company;
        }
    }

    @Override
    public String toString() {
        return "Cooling System{" + "\n\t" +
            "Model: " + getModel() + "\n\t" +
            "Price: " + getPrice() + "\n\t" +
            "Company: " + getCompany() + '}';
    }
}
