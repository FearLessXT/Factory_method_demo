package com.api.test.demo.factory;

import com.api.test.demo.button.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button button = createButton();
        button.render();
    }

    public abstract Button createButton();
}
