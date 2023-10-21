package Components.cooling;

public class AirCooling extends CoolingSystem {

    public AirCooling(AirCoolingBuilder airCoolingBuilder) {
        super(airCoolingBuilder.model, airCoolingBuilder.company, airCoolingBuilder.price);
    }

    @Override
    public void cooling() {
        System.out.println("kylu airom");
    }

    public static class AirCoolingBuilder {
        private CoolingSystemCompany company;
        private String model;
        private int price;

        public AirCooling build() {return new AirCooling(this);}

        public AirCoolingBuilder model(String model) {
            this.model = model;
            return this;
        }
        public AirCoolingBuilder price(int price) {
            this.price = price;
            return this;
        }
        public AirCoolingBuilder company(CoolingSystemCompany company) {
            this.company = company;
            return this;
        }
    }
}
