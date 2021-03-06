/**
 * Copyright (c) 2014 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the End User License
 * Agreement for Liferay Developer Studio ("License"). You may not use this file
 * except in compliance with the License. You can obtain a copy of the License
 * by contacting Liferay, Inc. See the License for the specific language
 * governing permissions and limitations under the License, including but not
 * limited to distribution rights of the Software.
 */

package com.liferay.ide.kaleo.ui.editor;

import org.eclipse.gef.ui.palette.PaletteViewer;
import org.eclipse.gef.ui.palette.PaletteViewerProvider;
import org.eclipse.gef.ui.views.palette.PaletteViewerPage;

/**
 * @author Gregory Amerson
 */
public class KaleoPaletteViewerPage extends PaletteViewerPage
{

    public KaleoPaletteViewerPage( PaletteViewerProvider paletteViewerProvider )
    {
        super( paletteViewerProvider );
    }

    public PaletteViewer getViewer()
    {
        return this.viewer;
    }
}
