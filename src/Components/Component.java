package Components;

public abstract class Component {
    private final String model;
    private final Company company;
    private final int price;

    public Component(String model, Company company, int price) {
        this.model = model;
        this.company = company;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public Company getCompany() {
        return company;
    }

    public int getPrice() {
        return price;
    }

    public interface Company {
        String getCompany();
    }
}
