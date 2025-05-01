public class PermitHolder extends Person {
    private int permitID;
    private static int IDset = 1000;
    PermitHolder(String name) {
        super(name);
        permitID = IDset;
        IDset = IDset + 1;
    }
    int getPermitID() {
        return this.permitID;
    }
    @Override
    String getName() {
        return super.getName();
    }
    boolean equals(PermitHolder ph) {
        if (ph == null) {
            return false;
        }
        return this.permitID == ph.permitID;
    }
    public String toString() {
        return String.format("Name: %s, Permit ID: %d", super.getName(), permitID);
    }
}