package heinle.leonardo.exemplohelloworldcliente.model;

/**
 * @author Leonardo
 * @since 10/06/2020
 * @version 1.0
 */
public class Client {

    private String name;
    private String lastName;
    private double income;

    public Client() {
        this.income = 0.0;
    }

    public Client(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.income = 0.0;
    }

    public Client(String name, String lastName, double income) {
        this.name = name;
        this.lastName = lastName;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double calculateIncome() {
        return this.income * 1.10;
    }

    @Override
    public String toString() {
        return "Client" +
                "\nname= " + this.name +
                "\nlastName= " + this.lastName +
                "\nincome = " + this.income +
                "\n10% = " + this.calculateIncome();
    }
}
