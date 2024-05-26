package TextEditor;

public class BoldText extends TextDecorator {
    public BoldText(TextComponent decoratedText) {
        super(decoratedText);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", bold";
    }
}
