package main;

import Services.DeliveryService;

public class AmazonT {
	private DeliveryService service;
	
public Boolean DeliverProduct(Double amount) {
	return service.DeliverThePackage(amount);
	}

public void setService(DeliveryService service) {
	this.service = service;
}

}


