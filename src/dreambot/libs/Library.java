package dreambot.libs;

import dreambot.main.Main;
import dreambot.main.Provider;

/**
 * Copyright (C) <2019>  <Kye-T>
 * See dtohh.main.Script for GNU license.
 */

abstract public class Library {

    protected Provider getProvider() {
        return Main.script;
    }

}
