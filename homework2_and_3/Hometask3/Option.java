package java_hometasks.homework2_and_3.Hometask3;

public enum Option {
    HEATED_SEATS("HEATED SEATS"),
    AUTOSTART("AUTOSTART"),
    AUTO_LINE_ASSISTANT("AUTOLINE ASSISTANT");
    String optionName;
    Option(String optionName) {
        this.optionName = optionName;

    }

    public String getOptionName() {

        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }
}
