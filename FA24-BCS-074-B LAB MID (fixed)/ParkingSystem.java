public class ParkingSystem {
    private String campusName;
    private Supervisor supervisor;
    private ParkingZone[] pzones;
    private PermitHolder[] permitHolders;
    private static ParkingSystem system = null;
    private ParkingSystem(String campusName, Supervisor supervisor) {
        if (supervisor == null) {
            System.out.println("Error: System must have a supervisor");
            return;
        }
        this.campusName = campusName;
        this.supervisor = supervisor;
        pzones = new ParkingZone[2];
        permitHolders = new PermitHolder[2];
    }
    public static ParkingSystem getInstance(String campusName, Supervisor supervisor) {
        if (system == null) {
            system = new ParkingSystem(campusName, supervisor);
        } else {
            System.out.println("Warning: System instance already exists, returning existing instance");
        }
        return system;
    }
    String getCampusName() {
        return this.campusName;
    }
    void setCampusName(String name) {
        this.campusName = name;
    }
    void addZone(ParkingZone z) {
        if (z == null) {
            return;
        }
        for (int i = 0; i < 2; i++) {
            if (pzones[i] == null) {
                pzones[i] = z;
                break;
            }
        }
    }
    void addPermitHolder(PermitHolder ph) {
        if (ph == null) {
            return;
        }
        for (int i = 0; i < 2; i++) {
            if (permitHolders[i] == null) {
                permitHolders[i] = ph;
                break;
            }
        }
    }
	public String toString() {
    String zonesInfo = "";
    for (int i = 0; i < 2; i++) {
        if (pzones[i] != null) {
            zonesInfo += pzones[i];
        }
    }
    
    String permitInfo = "\n\nPermit Holders: [";
    boolean firstPermit = true;
    
    for (int i = 0; i < 2; i++) {
        if (permitHolders[i] != null) {
            if (!firstPermit) {
                permitInfo += ", ";
            }
            permitInfo += permitHolders[i];
            firstPermit = false;
        }
    }
    permitInfo += "]";
    
    return String.format("Campus: %s%s%s%s", campusName, supervisor, zonesInfo, permitInfo);
}
}