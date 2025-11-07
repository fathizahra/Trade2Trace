interface Button {
    void paint();
}

interface Checkbox {
    void check();
}

// Concrete products - Light theme
class LightButton implements Button {
    public void paint() { System.out.println("Rendering Light Button"); }
}

class LightCheckbox implements Checkbox {
    public void check() { System.out.println("Checking Light Checkbox"); }
}

// Concrete products - Dark theme
class DarkButton implements Button {
    public void paint() { System.out.println("Rendering Dark Button"); }
}

class DarkCheckbox implements Checkbox {
    public void check() { System.out.println("Checking Dark Checkbox"); }
}

//  Abstract Factory
interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

//  Concrete Factories
class LightThemeFactory implements UIFactory {
    public Button createButton() { return new LightButton(); }
    public Checkbox createCheckbox() { return new LightCheckbox(); }
}

class DarkThemeFactory implements UIFactory {
    public Button createButton() { return new DarkButton(); }
    public Checkbox createCheckbox() { return new DarkCheckbox(); }
}

// Client code
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        String theme = "dark";  // could be "light" or "dark"

        UIFactory factory;
        if (theme.equalsIgnoreCase("light")) {
            factory = new LightThemeFactory();
        } else {
            factory = new DarkThemeFactory();
        }

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.paint();
        checkbox.check();
    }
}
