package dreambot.main;

import dreambot.libs.AntiBan;
import org.dreambot.api.methods.Calculations;
import org.dreambot.api.script.Category;
import org.dreambot.api.script.ScriptManifest;

/**
 *
 *     Copyright (C) <2019>  <Kye-T>
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
@ScriptManifest(
        author = "Dtohh",
        name = "DBE Framework",
        description = "Edit me and enjoy coding!",
        version = 1.1,
        category = Category.CONSTRUCTION
)

public class Script extends Provider {

    public Script(Main provider) {
        super(provider);
    }

    @Override
    public void onStart() {
        // Enjoy scripting
    }

    @Override
    public int onLoop() {
        // Return a short delay
        return Calculations.random(100, 300);
    }

    @Override
    public void onExit() {

    }
}
