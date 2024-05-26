package TextEditor;

public class UnderLineText extends TextDecorator {
    public UnderLineText(TextComponent decoratedText) {
        super(decoratedText);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", underline";
    }
}
