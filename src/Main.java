public class Main {
    public static void main(String[] args) {
        WareHouse wareHouse = new WareHouse();

        Computer computer = ComputerConfigurator.fillComputer(wareHouse);

        System.out.println(computer.toString());
    }
}