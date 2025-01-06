package Services;

public class USP implements DeliveryService {

	@Override
	public Boolean DeliverThePackage(Double amount) {
		System.out.println("Package delivered sucessfully by USP service Thankyou! Amount paid was " + amount );
		return true;
	}

}
