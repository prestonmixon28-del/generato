public class main {
    
    public static void main(String[] args) {
        VehicleReport truck = new TruckReport();
        VehicleReport bike = new BikeReport();

        truck.generateReport();
        System.out.println();

        bike.generateReport();
    }
}
