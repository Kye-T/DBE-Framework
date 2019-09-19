package dreambot.main;

import dreambot.libs.AntiBan;
import org.dreambot.api.methods.Calculations;

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

public class Script extends Provider {
 
    public Script(Main provider) {
        super(provider);
    }

    @Override
    public void onStart() {
        // Example on how to load your libs and get access to your GUI
        dreambot.guis.AntiBan antiBan = ((AntiBan) getProvider().getLibInstance(AntiBan.class)).getGui();
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