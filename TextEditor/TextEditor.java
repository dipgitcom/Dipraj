package TextEditor;

public class TextEditor {
    public static void main(String[] args) {
        TextComponent myText = new ConcreteText("I am a DP");
        System.out.println(myText.getDescription());

        TextComponent boldText = new BoldText(myText);
        System.out.println(boldText.getDescription());

        TextComponent italicText = new ItalicText(boldText);
        System.out.println(italicText.getDescription());

        TextComponent boldItalicText = new BoldItalicText(boldText);
        System.out.println(boldItalicText.getDescription());

        TextComponent underLineText = new UnderLineText(boldItalicText);
        System.out.println(underLineText.getDescription());
    }
}
