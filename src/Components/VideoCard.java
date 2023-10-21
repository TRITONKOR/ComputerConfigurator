package Components;

public class VideoCard extends Component {

    public final int memory;

    public VideoCard(VideoCardBuilder videoCardBuilder) {
        super(videoCardBuilder.model, videoCardBuilder.company, videoCardBuilder.price);
        this.memory = videoCardBuilder.memory;
    }

    public static class VideoCardBuilder {
        private int memory;
        private VideoCardCompany company;
        private String model;
        private int price;

        public VideoCard build() {
            return new VideoCard(this);
        }

        public VideoCardBuilder model(String model) {
            this.model = model;
            return this;
        }
        public VideoCardBuilder price(int price) {
            this.price = price;
            return this;
        }
        public VideoCardBuilder company(VideoCardCompany company) {
            this.company = company;
            return this;
        }
        public VideoCardBuilder memory(int memory) {
            this.memory = memory;
            return this;
        }
    }

    public enum VideoCardCompany implements Company{
        ASUS("ASUS"),
        MSI("MSI"),
        GIGABYTE("Gigabyte"),
        PALITE("PaLit"),
        NVIDIA("Nvidia");

        private String company;

        VideoCardCompany(String company) {
            this.company = company;
        }

        @Override
        public String getCompany() {
            return company;
        }
    }

    @Override
    public String toString() {
        return "VideoCard{" + "\n\t" +
            "Model: " + getModel() + "\n\t" +
            "Price: " + getPrice() + "\n\t" +
            "Company: " + getCompany() + "\n\t" +
            "Memory: " + memory + '}';
    }
}
