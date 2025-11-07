class Document implements Cloneable {
    String title;
    String content;

    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // Overriding clone() to create a deep copy
    @Override
    public Document clone() {
        try {
            return (Document) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public void show() {
        System.out.println("Title: " + title + " | Content: " + content);
    }
}

public class PrototypeDemo {
    public static void main(String[] args) {
        Document original = new Document("Report", "This is the original content.");
        Document copy = original.clone();

        // Modify the cloned object
        copy.content = "This is the modified copy.";

        System.out.println("Original Document:");
        original.show();

        System.out.println("Cloned Document:");
        copy.show();
    }
}
