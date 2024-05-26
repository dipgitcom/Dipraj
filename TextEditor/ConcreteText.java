package TextEditor;

public class ConcreteText implements TextComponent {
    private String text;

    public ConcreteText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public String getDescription() {
        return text;
    }
}
