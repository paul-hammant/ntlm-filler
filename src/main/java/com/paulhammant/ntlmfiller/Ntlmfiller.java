package com.paulhammant.ntlmfiller;

import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Location;
import org.sikuli.script.Screen;

public class Ntlmfiller {
    public static void main(String[] args) throws FindFailed {
        App.logOn();
        App.focus("chrome");
        Screen screen = new Screen();
        int y = (screen.h / 2 * -1) - 300;
        System.out.println(screen.h + " " + y);

        //screen.offset(0, y).click();
        screen.hover(new Location(1308, 41));
        screen.type("usernameeee\t");
        screen.type("passwoooooord\t\t");
        screen.type(" "); // click OK button
    }
}