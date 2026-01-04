abstract class ReportGenerator {

    // Template Method (final so subclasses can't change the flow)
    public final void generateReport() {
        fetchData();
        formatData();
        export();
    }

    protected void fetchData() {
        System.out.println("Fetching data from database...");
    }

    protected abstract void formatData();   // varies

    protected void export() {
        System.out.println("Exporting report...");
    }
}
