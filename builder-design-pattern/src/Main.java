public class Main {
    public static void main(String[] args) {

        House house = new House.HouseBuilder()
                .windows(4)
                .doors(2)
                .garage(true)
                .swimmingPool(false)
                .build();

        System.out.println(house);
    }
}