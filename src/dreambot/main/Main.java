package dreambot.main;

import dreambot.guis.Welcome;
import dreambot.libs.AntiBan;
import dreambot.libs.Library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

/**
 * Copyright (C) <2019>  <Kye-T>
 * See dtohh.main.Script for GNU license.
 */

public class Main {
    public static Provider script;

    public ArrayList<Class<? extends Library>> libs = new ArrayList<>(
            Arrays.asList(AntiBan.class)
    );

    public ArrayList<Library> libInstances = new ArrayList<>();

    public Main() throws InterruptedException {

        // Generate the Welcome GUI
        Welcome gui = new Welcome();

        // Waits for the GUI to notify us the user is ready to start
        synchronized (gui) {
            gui.wait();
        }

        // When the user is ready to start, we can initiate the script
        script = new Script(this);

        // Lets build the libs we want to use in the script
        initLibs();
    }

    /**
     * Returns the Library instance based on the class
     * @param lib
     * @return Library
     */

    public Library getLibInstance(Class<? extends Library> lib) {
        Optional<Object> library;
        return (library = Arrays.stream(libInstances.toArray()).filter(o -> o.getClass() == lib).findFirst()).isPresent() ? (Library) library.get() : null;
    }

    /**
     * Creates and stores an instance for each script dependency
     */

    private void initLibs() {
        libs.forEach(o -> {
            try {
                // Create a new instance for the GUI, store it in ArrayList
                libInstances.add(o.newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });
    }
}
