package DataProcessingPipreline;

public abstract class DataPipeline {
    // Template method
    public final boolean processData(String URL) {
        connect(URL);
        transformData();
        storeData();
        return true;
    }

    // Steps to be implemented by subclasses
    protected abstract boolean connect(String URL);
    protected abstract boolean transformData();
    protected abstract boolean storeData();
}
