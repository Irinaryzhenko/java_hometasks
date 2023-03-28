package java_hometasks.homework2_and_3.Hometask3;

public enum Model {
    POlO("POLO", 2022),
    SHARAN("SHARAN", 2023),
    TUAREG("TUAREG", 2021),
    GOLF("GOLF", 2022);
    String modelName;
    int issueYear;

    Model(String modelName, int issueYear) {
        this.modelName = modelName;
        this.issueYear = issueYear;

    }

    public String getModelName() {
        return modelName;
    }

    public int getIssueYear() {
        return issueYear;
    }
}
