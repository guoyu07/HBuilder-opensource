/**
 * Copyright (c) 2005-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the license.txt included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package org.python.pydev.debug.ui.launching;

import org.python.pydev.core.callbacks.CallbackWithListeners;

/**
 * @author fabioz
 *
 */
public class PythonRunnerCallbacks {

    public static class CreatedCommandLineParams {

        public final String[] cmdLine;
        public final boolean coverageRun;

        public CreatedCommandLineParams(String[] cmdLine, boolean coverageRun) {
            this.cmdLine = cmdLine;
            this.coverageRun = coverageRun;
        }

    }

    public final static CallbackWithListeners<CreatedCommandLineParams> onCreatedCommandLine = new CallbackWithListeners<CreatedCommandLineParams>();

    public final static CallbackWithListeners<Process> afterCreatedProcess = new CallbackWithListeners<Process>();

}
