public abstract class VehicleReport {

    public final void generateReport() {
        collectData();
        formatReport();
        logStatus();
    }

    protected void collectData() {
        System.out.println("Collecting vehicle data...");
    }

    protected abstract void formatReport();

    protected abstract void logStatus() {
        System.out.println("Logging report status...");
    }
}