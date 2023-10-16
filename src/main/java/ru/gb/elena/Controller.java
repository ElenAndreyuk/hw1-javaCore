package ru.gb.elena;

public class Controller {
    private Model model;
    private View view;

    public Controller() {
        this.model = new Model();
        this.view = new View();
    }
    public void printNumber(){
        int number = model.getNumber();
        view.showNumber(number);
    }
}
