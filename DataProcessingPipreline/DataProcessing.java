package DataProcessingPipreline;

public class DataProcessing {
    public static void main(String[] args) {
        DataPipeline dbPipeline = new DatabasePipeline();
        DataPipeline cldPipeline = new CloudPipeline();

        dbPipeline.processData("A random URL");
        cldPipeline.processData("A random URL");
    }
}
