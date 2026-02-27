package com.api.test.demo;

import com.api.test.demo.factory.Dialog;
import com.api.test.demo.factory.HtmlDialog;
import com.api.test.demo.factory.WindowDialog;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    private static Dialog dialog;

    static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Window 10")) {
            dialog = new WindowDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
