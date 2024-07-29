interface Window {
    void draw();
}

class SimpleWindow implements Window {
    @Override
    public void draw() {
        System.out.println("Drawing a simple window.");
    }
}

class WindowDecorator implements Window {
    protected Window decoratedWindow;

    public WindowDecorator(Window window) {
        this.decoratedWindow = window;
    }

    @Override
    public void draw() {
        decoratedWindow.draw();
    }
}

class ScrollbarDecorator extends WindowDecorator {
    public ScrollbarDecorator(Window window) {
        super(window);
    }

    @Override
    public void draw() {
        super.draw();
        drawScrollbar();
    }

    private void drawScrollbar() {
        System.out.println("Adding scrollbar to the window.");
    }
}

class BorderDecorator extends WindowDecorator {
    public BorderDecorator(Window window) {
        super(window);
    }

    @Override
    public void draw() {
        super.draw();
        drawBorder();
    }

    private void drawBorder() {
        System.out.println("Adding border to the window.");
    }
}
