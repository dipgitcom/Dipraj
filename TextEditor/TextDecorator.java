package TextEditor;

public abstract class TextDecorator implements TextComponent {
    protected TextComponent decoratedText;

    public TextDecorator(TextComponent decoratedText) {
        this.decoratedText = decoratedText;
    }

    @Override
    public String getText() {
        return decoratedText.getText();
    }

    @Override
    public String getDescription() {
        return decoratedText.getDescription();
    }
}
