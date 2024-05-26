package TextEditor;

public class ItalicText extends TextDecorator {
    public ItalicText(TextComponent decoratedText) {
        super(decoratedText);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", italic";
    }
}
