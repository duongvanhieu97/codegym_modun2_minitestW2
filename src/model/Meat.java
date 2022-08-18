package model;

import java.time.LocalDate;
import java.time.Period;

public class Meat extends Material implements Discount {
    private double weight;

    public Meat() {
    }

    public Meat(double weight) {
        this.weight = weight;
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return getCost() * weight;
    }

    @Override
    public LocalDate getExpiryDate() {
        return this.getManufacturingDate().plusDays(7);
    }

    @Override
    public double getRealMoney() {
        Period different = Period.between(getExpiryDate(), LocalDate.now());
        if (different.getDays() <= 5) {
            return getAmount() / 100 * 70;
        } else return getAmount() / 100 * 90;
    }
}
