/**
 * Most of the code in the Qalingo project is copyrighted Hoteia and licensed
 * under the Apache License Version 2.0 (release version 0.7.0)
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *                   Copyright (c) Hoteia, 2012-2013
 * http://www.hoteia.com - http://twitter.com/hoteia - contact@hoteia.com
 *
 */
package org.hoteia.qalingo.core.service;

import java.util.List;

import org.hoteia.qalingo.core.domain.AbstractPaymentGateway;

public interface PaymentGatewayService {

    AbstractPaymentGateway getPaymentGatewayById(Long paymentGatewayId, Object... params);
    
	AbstractPaymentGateway getPaymentGatewayById(String paymentGatewayId, Object... params);

	List<AbstractPaymentGateway> findPaymentGateways(Object... params);

	void saveOrUpdatePaymentGateway(AbstractPaymentGateway paymentGateway);
	
	void deletePaymentGateway(AbstractPaymentGateway paymentGateway);

}
