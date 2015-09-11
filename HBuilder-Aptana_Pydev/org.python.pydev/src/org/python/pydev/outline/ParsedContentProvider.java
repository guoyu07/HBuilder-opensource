/**
 * Copyright (c) 2005-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the license.txt included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
/*
 * Author: atotic
 * Created: Jul 25, 2003
 */
package org.python.pydev.outline;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * Trivial: A ContentProvider interface ParsedItem tree items
 * 
 */
public class ParsedContentProvider implements ITreeContentProvider {

    public Object[] getElements(Object inputElement) {
        return ((ParsedItem) inputElement).getChildren();
    }

    public void dispose() {
    }

    public Object[] getChildren(Object parentElement) {
        return ((ParsedItem) parentElement).getChildren();
    }

    public Object getParent(Object element) {
        return ((ParsedItem) element).getParent();
    }

    public boolean hasChildren(Object element) {
        return (((ParsedItem) element).getChildren().length > 0);
    }

    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
    }
}
