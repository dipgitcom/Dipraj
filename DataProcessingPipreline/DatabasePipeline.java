package DataProcessingPipreline;

public class DatabasePipeline extends DataPipeline {
    @Override
    protected boolean connect(String URL) {
        boolean connected = false;
        System.out.println("connecting databases...");
        // do something and somehow got connected
        connected = true;
        return connected;
    }

    @Override
    protected boolean transformData() {
        boolean transformed = false;
        System.out.println("transforming data in databases...");
        // do something and somehow got transformed
        transformed = true;
        return transformed;
    }

    @Override
    protected boolean storeData() {
        boolean stored = false;
        System.out.println("storing data in databases...");
        // do something and somehow got stored
        stored = true;
        return stored;
    }
}
