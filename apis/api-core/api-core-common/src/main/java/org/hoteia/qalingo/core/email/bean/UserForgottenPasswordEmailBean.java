/**
 * Most of the code in the Qalingo project is copyrighted Hoteia and licensed
 * under the Apache License Version 2.0 (release version 0.8.0)
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *                   Copyright (c) Hoteia, 2012-2014
 * http://www.hoteia.com - http://twitter.com/hoteia - contact@hoteia.com
 *
 */
package org.hoteia.qalingo.core.email.bean;

import java.io.Serializable;

public class UserForgottenPasswordEmailBean extends AbstractCustomerEmailBean implements Serializable {

	/**
     * 
     */
    private static final long serialVersionUID = -5410830735779028978L;
    
    private String token;

    public String getToken() {
	    return token;
    }
    
    public void setToken(String token) {
	    this.token = token;
    }
    
}