package batch.service.dto;

public class FeatureExtractMatchDTO extends DataTransferObject{
    /** Input directory. */
    private final String inputDir;
    /** Output directory. */
    private final String outputDir;

    public FeatureExtractMatchDTO(){
        super("feature-extract-match");
        this.inputDir = null;
        this.outputDir = null;
    }

    public FeatureExtractMatchDTO(final String inputDir, final String outputDir) {
        super("feature-extract-match");
        this.inputDir = inputDir;
        this.outputDir = outputDir;
    }

    public String getInputDir() {
        return inputDir;
    }

    public String getOutputDir() {
        return outputDir;
    }

    @Override
    public String toString() {
        return "FeatureExtractMatchDTO [inputDir=" + inputDir + ", outputDir=" + outputDir + "]";
    }
}