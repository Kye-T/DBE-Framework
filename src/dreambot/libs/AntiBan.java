package dreambot.libs;

/**
 * Copyright (C) <2019>  <Kye-T>
 * See dtohh.main.Script for GNU license.
 */

public class AntiBan extends Library {
    private dreambot.guis.AntiBan gui;

    public AntiBan() {
        gui = new dreambot.guis.AntiBan().setProvider(getProvider()).start();
    }

    public dreambot.guis.AntiBan getGui() {
        return gui;
    }
}
