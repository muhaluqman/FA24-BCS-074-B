public class ParkingZone {
    private String zoneID;
    private static int IDset = 1;
    private Vehicle[] vehicles;
    ParkingZone() {
        this.zoneID = "A" + IDset;
        IDset = IDset + 1;
        vehicles = new Vehicle[5];
    }
    String getZoneID() {
        return this.zoneID;
    }
    void addVehicle(Vehicle v) {
        if (v == null) {
            return;
        }
        for (int i = 0; i < 5; i++) {
            if (vehicles[i] != null && vehicles[i].getPlate().equals(v.getPlate())) {
                System.out.println("Vehicle with license plate " + v.getPlate() + " already exists in zone " + zoneID);
                return;
            }
        }
        for (int i = 0; i < 5; i++) {
            if (vehicles[i] == null) {
                vehicles[i] = v;
                break;
            }
        }
    }
    public String toString() {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            if (vehicles[i] != null) {
                temp.append(vehicles[i]).append(", ");
            }
        }
        String vehicleList = temp.toString();
        if (vehicleList.endsWith(", ")) {
            vehicleList = vehicleList.substring(0, vehicleList.length() - 2);
        }
        return String.format("\nZone ID: %s, Vehicles: [%s]", zoneID, vehicleList);
    }
}