package Components.cooling;


public class LiquidCooling extends CoolingSystem {
    public LiquidCooling(LiquidCoolingBuilder liquidCoolingBuilder) {
        super(liquidCoolingBuilder.model, liquidCoolingBuilder.company, liquidCoolingBuilder.price);
    }

    @Override
    public void cooling() {
        System.out.println("kylu liquidom");
    }

    public static class LiquidCoolingBuilder {
        private CoolingSystemCompany company;
        private String model;
        private int price;

        public LiquidCooling build() {return new LiquidCooling(this);}

        public LiquidCoolingBuilder model(String model) {
            this.model = model;
            return this;
        }
        public LiquidCoolingBuilder price(int price) {
            this.price = price;
            return this;
        }
        public LiquidCoolingBuilder company(CoolingSystemCompany company) {
            this.company = company;
            return this;
        }
    }
}
