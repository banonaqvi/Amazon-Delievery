package Services;

public class IDeliveryService implements DeliveryService {

	@Override
	public Boolean DeliverThePackage(Double amount) {
		System.out.println("Package delivered successfully from IDelivery...Thankyou! " + amount);
		return true;
	}

}
