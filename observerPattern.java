interface Observer {
    void update(float price);
}

class Stock {
    private List<Observer> observers = new ArrayList<>();
    private float price;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setPrice(float price) {
        this.price = price;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(price);
        }
    }
}

class Investor implements Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(float price) {
        System.out.println(name + " notified. New stock price: " + price);
    }
}
