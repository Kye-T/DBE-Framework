package dreambot.main;

import org.dreambot.api.script.AbstractScript;

/**
 * Copyright (C) <2019>  <Kye-T>
 * See dtohh.main.Script for GNU license.
 */

public abstract class Provider extends AbstractScript {
    private Main provider;

    public Provider(Main provider) {
        this.provider = provider;
    }

    /**
     * Allows the dependency libs to access the instance
     * @return Script
     */

    public Provider getInstance() {
        return this;
    }

    /**
     * Retrieves the provider for the Script to access instanced dependencies
     * @return Main
     */

    public Main getProvider() {
        return provider;
    }
}