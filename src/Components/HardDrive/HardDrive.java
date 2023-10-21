package Components.HardDrive;

import Components.Component;

public abstract class HardDrive extends Component {
    private final int capacity;
    private final int readingSpeed;
    private final int writingSpeed;

    public HardDrive(String model, HardDriveCompany company, int price, int capacity, int readingSpeed, int writingSpeed) {
        super(model, company, price);
        this.capacity = capacity;
        this.readingSpeed = readingSpeed;
        this.writingSpeed = writingSpeed;
    }

    public abstract void writeData();
    public abstract void readData();

    public enum HardDriveCompany implements Company {
        SANDISK("SanDisk"),
        HP("HP"),
        TOSHIBA("Toshiba"),
        KINGSTON("Kingston");

        private String company;

        HardDriveCompany(String company) {
            this.company = company;
        }

        @Override
        public String getCompany() {
            return company;
        }
    }

    @Override
    public String toString() {
        return "Hard Drive{" + "\n\t" +
            "Model: " + getModel() + "\n\t" +
            "Price: " + getPrice() + "\n\t" +
            "Company: " + getCompany() + "\n\t" +
            "Capacity: " + capacity + "\n\t" +
            "ReadingSpeed: " + readingSpeed + "\n\t" +
            "WritingSpeed: " + writingSpeed + '}';
    }
}
