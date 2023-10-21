package Components.HardDrive;

public class Ssd extends HardDrive{
    public Ssd(SsdBuilder ssdBuilder){
        super(ssdBuilder.model, ssdBuilder.company, ssdBuilder.price, ssdBuilder.capacity,
            ssdBuilder.readingSpeed, ssdBuilder.writingSpeed);
    }

    @Override
    public void writeData() {
        System.out.println("pushy bistro");
    }

    @Override
    public void readData() {
        System.out.println("chitau bistro");
    }

    public static class SsdBuilder {
        private HardDriveCompany company;
        private String model;
        private int price;
        private int capacity;
        private int readingSpeed;
        private int writingSpeed;

        public Ssd build() {return new Ssd(this);}

        public SsdBuilder model(String model) {
            this.model = model;
            return this;
        }
        public SsdBuilder capacity(int capacity) {
            this.capacity = capacity;
            return this;
        }
        public SsdBuilder price(int price) {
            this.price = price;
            return this;
        }

        public SsdBuilder company(HardDriveCompany company) {
            this.company = company;
            return this;
        }
        public SsdBuilder readingSpeed(int readingSpeed) {
            this.readingSpeed = readingSpeed;
            return this;
        }
        public SsdBuilder writingSpeed(int writingSpeed) {
            this.writingSpeed = writingSpeed;
            return this;
        }
    }
}
