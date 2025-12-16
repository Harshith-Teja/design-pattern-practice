public class House {
    private int windows;
    private int doors;
    private boolean hasGarage;
    private boolean hasSwimmingPool;

    // Private constructor
    private House(HouseBuilder builder) {
        this.windows = builder.windows;
        this.doors = builder.doors;
        this.hasGarage = builder.hasGarage;
        this.hasSwimmingPool = builder.hasSwimmingPool;
    }

    @Override
    public String toString() {
        return "House [windows=" + windows +
                ", doors=" + doors +
                ", garage=" + hasGarage +
                ", swimmingPool=" + hasSwimmingPool + "]";
    }

    // Builder class
    public static class HouseBuilder {
        private int windows;
        private int doors;
        private boolean hasGarage;
        private boolean hasSwimmingPool;

        public HouseBuilder windows(int windows) {
            this.windows = windows;
            return this;
        }

        public HouseBuilder doors(int doors) {
            this.doors = doors;
            return this;
        }

        public HouseBuilder garage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder swimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
