import java.util.List;

public class OptionMenu {
    private List<String> buttons;
    private String option;
    private String color;

    private OptionMenu(){}

    private static final OptionMenu optionMenu = new OptionMenu();

    public static OptionMenu getInstance() {
        return optionMenu;
    }

    public List<String> getButtons() {
        return buttons;
    }

    public void setButtons(List<String> buttons) {
        this.buttons = buttons;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
