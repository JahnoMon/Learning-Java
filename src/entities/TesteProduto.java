package entities;

import entities.TesteProduto;
public class TesteProduto {
    private int number;
    private String name;
    private double deposit;

    private String isDeposit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getIsDeposit() {
        return isDeposit;
    }

    public void setIsDeposit(boolean initialDeposit) {
        this.isDeposit = isDeposit;
    }

    public TesteProduto(int number, String name, String isDeposit, double deposit){
        this.number = number;
        this.name = name;
        this.deposit = deposit;
        this.isDeposit = isDeposit;
    }

    public TesteProduto(String nome, int deposit){
        this.name = nome;
        this.deposit = deposit;
    }

    public String toString() { //muito interessante
        return "Nome: " + name;
    }


}
