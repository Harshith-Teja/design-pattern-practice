public class Main {
    public static void main(String[] args) {

        ReportGenerator pdf = new PdfReport();
        pdf.generateReport();

        System.out.println("------");

        ReportGenerator excel = new ExcelReport();
        excel.generateReport();
    }
}