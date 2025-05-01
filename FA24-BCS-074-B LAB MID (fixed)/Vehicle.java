public class Vehicle {
    private String plate;
    private String type;
    private Owner owner;
    private static String[] existingPlates = new String[100];
    private static int plateCount = 0;
    Vehicle(String plate, String type, Owner owner) {
        if (owner == null) {
            System.out.println("Error: Vehicle must have an owner");
            return;
        }
        for (int i = 0; i < plateCount; i++) {
            if (existingPlates[i] != null && existingPlates[i].equals(plate)) {
                System.out.println("Error: Vehicle with license plate " + plate + " already exists");
                return;
            }
        }
        this.plate = plate;
        this.type = type;
        this.owner = owner;
        existingPlates[plateCount] = plate;
        plateCount++;
    }
    Owner getOwner() {
        return this.owner;
    }
    String getPlate() {
        return this.plate;
    }
    String getType() {
        return this.type;
    }
    public Vehicle shallowCopy() {
    Vehicle copy = new Vehicle(this.plate + "_copy", this.type, this.owner);
        copy.plate = this.plate;
        return copy;
    }
    public Vehicle deepCopy() {
        Owner newOwner = new Owner(this.owner.getName());
        Vehicle copy = new Vehicle(this.plate + "_copy", this.type, newOwner);
        copy.plate = this.plate;
        return copy;
    }
    public String toString() {
        return String.format("License Plate: %s, Type: %s, Owner[ %s ]", plate, type, this.owner);
    }
}