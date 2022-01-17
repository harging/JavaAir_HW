public enum Plane {

    JUMBOJET(200, 1000),
    TWINOTTER(10, 200);

    private final int capacity;
    private final int weight;

    Plane(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}