/*
* Copyright (C) 2014 tarent AG
*
* Permission is hereby granted, free of charge, to any person obtaining
* a copy of this software and associated documentation files (the
* "Software"), to deal in the Software without restriction, including
* without limitation the rights to use, copy, modify, merge, publish,
* distribute, sublicense, and/or sell copies of the Software, and to
* permit persons to whom the Software is furnished to do so, subject to
* the following conditions:
*
* The above copyright notice and this permission notice shall be
* included in all copies or substantial portions of the Software.
*
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
* EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
* MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
* IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
* CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
* TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
* SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/

package org.osiam.addons.self_administration.plugin_api;

/**
 * Application exception indicating that callback steps failed.
 */
public class CallbackException extends Exception {

    private static final long serialVersionUID = -5211143904792666211L;

    /**
     * Creates a new {@link CallbackException} with the given message.
     * 
     * @param message
     *        the exception message
     */
    public CallbackException(String message) {
        super(message);
    }

    /**
     * Creates a new {@link CallbackException} with the given message and cause.
     * 
     * @param message
     *        the exception message
     * @param cause
     *        the cause
     */
    public CallbackException(String message, Throwable cause) {
        super(message, cause);
    }
}
