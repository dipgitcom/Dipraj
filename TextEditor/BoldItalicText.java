package TextEditor;

public class BoldItalicText extends TextDecorator {
    public BoldItalicText(TextComponent decoratedText) {
        super(decoratedText);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", bold and italic";
    }
}
