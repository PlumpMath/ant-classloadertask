/*
 * Copyright  2005 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.apache.tools.ant.taskdefs.classloader;
/**
 * Handler interface.
 * @since Ant1.7
 */
public interface ClassLoaderHandler {
    /**
     * Checks whether this handler is properly configured.
     *
     * @throws RuntimeException If not properly defined.
     */
    void check();
    /**
     * Gets an adapter instance.
     *
     * @param context The calling context (f.e.classloader task).
     * @return The newly created adapter or null if an error occured.
     */
    ClassLoaderAdapter getAdapter(ClassloaderContext context);
    /**
     * Gets the classloaders classname.
     *
     * @return The classloader classname.
     */
    String getLoader();

}
