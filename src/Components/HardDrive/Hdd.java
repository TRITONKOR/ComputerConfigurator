package Components.HardDrive;

public class Hdd extends HardDrive{
    public Hdd(HddBuilder hddBuilder){
        super(hddBuilder.model, hddBuilder.company, hddBuilder.price, hddBuilder.capacity,
            hddBuilder.readingSpeed, hddBuilder.writingSpeed);
    }

    @Override
    public void writeData() {
        System.out.println("pushy medleno");
    }

    @Override
    public void readData() {
        System.out.println("chitau medleno");
    }

    public static class HddBuilder {
        private HardDriveCompany company;
        private String model;
        private int price;
        private int capacity;
        private int readingSpeed;
        private int writingSpeed;

        public Hdd build() {return new Hdd(this);}

        public HddBuilder model(String model) {
            this.model = model;
            return this;
        }
        public HddBuilder capacity(int capacity) {
            this.capacity = capacity;
            return this;
        }
        public HddBuilder price(int price) {
            this.price = price;
            return this;
        }

        public HddBuilder company(HardDriveCompany company) {
            this.company = company;
            return this;
        }
        public HddBuilder readingSpeed(int readingSpeed) {
            this.readingSpeed = readingSpeed;
            return this;
        }
        public HddBuilder writingSpeed(int writingSpeed) {
            this.writingSpeed = writingSpeed;
            return this;
        }
    }
}
