/* ******************************************************************************
 * Copyright (c) 2014 - 2015 Fabian Prasser.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Fabian Prasser - initial API and implementation
 ******************************************************************************/
package de.linearbits.tiles;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

/**
 * Returns a heat gradient
 * @author Fabian Prasser
 */
public class GradientHeatscale extends Gradient{

    /**
     * Returns the colors
     * @param tiles
     * @return
     */
	private static final Color[] getColors(Tiles<?> tiles){
	    Display device = tiles.getDisplay();
	    return new Color[]{	new Color(device, 0, 0, 255), 
	    					new Color(device, 0, 255, 255),
	    					new Color(device, 0, 200, 0), 
	    					new Color(device, 255, 255, 0), 
	    					new Color(device, 255, 69, 0),
	    					new Color(device, 255, 0, 0)};
	}
	
	/**
	 * Creates a new instance
	 * @param tiles
	 */
	public GradientHeatscale(Tiles<?> tiles) {
		super(tiles, getColors(tiles));
	}
}
