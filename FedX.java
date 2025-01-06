package Services;

public class FedX implements DeliveryService {

	@Override
	public Boolean DeliverThePackage(Double amount) {
		System.out.println("Package delivered sucessfully by FedX service Thankyou!"+ amount);
		return true;
	}

}
