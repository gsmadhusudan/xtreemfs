/*
 * Copyright (c) 2011 by Felix Langner,
 *               Zuse Institute Berlin
 *
 * Licensed under the BSD License, see LICENSE file for details.
 *
 */
package org.xtreemfs.common.stage;

/**
 * <p>Callback for postprocessing a {@link Request}.</p>
 * 
 * @author fx.langner
 * @version 1.00, 09/03/11
 */
public interface Callback {
    
    /**
     * <p>Method to call if the request connected to this callback was successful.</p>
     * 
     * @param result - for the request.
     */
    public void success(Object result);
    
    /**
     * <p>Method that is called if execution of a request failed because of <code>error</code>.</p>
     * 
     * @param error - reason for the failure.
     */
    public void failed(Exception error);
    
    /**
     * <p>Callback implementation that simply ignores all incoming calls.</p>
     * 
     * @author fx.langner
     * @version 1.00, 09/13/2011
     */
    final static class NullCallback implements Callback {
        
        /**
         * <p>Static instance of NullCallback to avoid memory leaks due multiple instances of this type.</p>
         */
        final static Callback INSTANCE = new NullCallback();

        /**
         * <p>Hidden default constructor of this class.</p>
         */
        private NullCallback() { }
        
        /* (non-Javadoc)
         * @see org.xtreemfs.common.stage.Callback#success(java.lang.Object)
         */
        @Override
        public void success(Object result) { /* ignored */ }

        /* (non-Javadoc)
         * @see org.xtreemfs.common.stage.Callback#failed(java.lang.Exception)
         */
        @Override
        public void failed(Exception error) { /* ignored */ }
    }
}
