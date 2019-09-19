# DBE-Framework
DreamBot Easy Framework - Scripting, made simple and effective.

# Installation
- Clone via VCS in your Intellij IDEA IDE
- Navigate to `File > Project Structure > Libraries` and add the `client.jar` from your DreamBot folder (BotData)
- Navigate to the `dreambot.main.Script` Class
- Happy Scripting

# Importing Libs
**NOTE:** All of your dependency libraries should exist in the dreambot.libs package.

- Navigate to `dreambot.main.main` Class
- Append your library class to the `ArrayList<Class<? extends Library>> libs`

```java
public ArrayList<Class<? extends Library>> libs = new ArrayList<>(Arrays.asList(
    AntiBan.class,
));
```

# Gaining Script Instance
Your dependency library will receive the instance to the Script and can be received using `getProvider()`.

```java
public class AntiBan extends Library {
  public void AntiBan() { System.out.println(getProvider().getLocalPlayer().getName()); }
}
```

# Adding and retreiving a GUI
You can add graphical user interfaces simply with DBE. Simply create a GUI then use a dependency library to instance it.

```java
// dreambot.main.Main
public ArrayList<Class<? extends Library>> libs = new ArrayList<>(Arrays.asList(
    AntiBan.class,
));

// dreambot.guis.AntiBan
public class AntiBan extends JFrame { ... }

// dreambot.libs.AntiBan
public class AntiBan extends Library {
    private dreambot.guis.AntiBan gui;

    public AntiBan() {
        gui = new dreambot.guis.AntiBan().setProvider(getProvider()).start();
    }

    public dreambot.guis.AntiBan getGui() {
        return gui;
    }
}

// dreambot.main.Script
@Override
public void onLoop {
    dreambot.guis.AntiBan antiBan = ((AntiBan) getProvider().getLibInstance(AntiBan.class)).getGui();
    return 0;
}
```

You can get any dependency provider via using the `getProvider().getLibInstance()` method

```java
dreambot.libs.AntiBan lib = (dreambot.libs.AntiBan) getProvider().getLibInstance(dreambot.libs.AntiBan.class);
```

# Copyright and License
Copyright (C) <2019>  <Kye-T>

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <https://www.gnu.org/licenses/>.
