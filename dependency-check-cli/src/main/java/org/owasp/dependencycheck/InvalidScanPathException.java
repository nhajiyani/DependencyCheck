/*
 * This file is part of dependency-check-cli.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Copyright (c) 2014 Jeremy Long. All Rights Reserved.
 */
package org.owasp.dependencycheck;

/**
 * Thrown if an invalid path is encountered.
 *
 * @author Jeremy Long
 */
class InvalidScanPathException extends Exception {

    /**
     * The serial version UID for serialization.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Creates a new InvalidScanPathException.
     */
    public InvalidScanPathException() {
        super();
    }

    /**
     * Creates a new InvalidScanPathException.
     *
     * @param msg a message for the exception
     */
    public InvalidScanPathException(String msg) {
        super(msg);
    }

    /**
     * Creates a new InvalidScanPathException.
     *
     * @param ex the cause of the exception
     */
    public InvalidScanPathException(Throwable ex) {
        super(ex);
    }

    /**
     * Creates a new InvalidScanPathException.
     *
     * @param msg a message for the exception
     * @param ex the cause of the exception
     */
    public InvalidScanPathException(String msg, Throwable ex) {
        super(msg, ex);
    }
}