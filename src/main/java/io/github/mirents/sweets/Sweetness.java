/*
 * Базовый абстрактный класс для сущности сладость, от которой будут
 * унаследованы все сладости
 */
package io.github.mirents.sweets;

public abstract class Sweetness {
    // Имя сладости
    private String name;
    // Вес сладости
    private double weight;
    // Стоимость сладости
    private double price;
    
    // Конструктор
    public Sweetness (String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }
    
    // Геттеры и сетеры для параметров класса
    
    public String getName() {
        return name;
    }

    protected void setName(String name) {
        name = name;
    }

    public double getWeight() {
        return weight;
    }

    protected void setWeight(double weight) {
        weight = weight;
    }

    public double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        price = price;
    }
    
    // Вывод информации о сладости
    @Override
    public String toString(){
        return "Название: " + getName() + " Вес: " + getWeight() +
                " гр., Стоимость: " + getPrice() + " р.";
    }
    
    // Абстрактный метод получения особенности класса
    public abstract String getSweetFeature();
    // Абстрактный метод присвоения особенности класса
    protected abstract void setSweetFeature(String param);
}
