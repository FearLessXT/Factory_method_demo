package com.api.test.demo.factory;

import com.api.test.demo.button.Button;
import com.api.test.demo.button.WindowButton;

public class WindowDialog extends Dialog {
    @Override
    public Button createButton() {
        //Will Override superclass method
        return new WindowButton();
    }
}
