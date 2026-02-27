package com.api.test.demo.button;

public class HtmlButton implements Button {
    
    public void render() {
        System.out.println("<button> Test Button </button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello world!'");
    }
}
