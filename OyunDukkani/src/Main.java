import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICustomerCheckService checkService=new MernisServiceAdapter();
		
		Customer customer=new Customer("0123456789", "Hasan", "G�der", LocalDate.of(1994,7, 6));
        CustomerManager customerManager=new CustomerManager(checkService);
        customerManager.add(customer);

Campaign campaign=new Campaign("Zal�m Cuma �ndirimleri", 50);
CampaignManager campaignManager=new CampaignManager();
campaignManager.add(campaign);

Game game=new Game("Call of Duty", 150);

GameManager gameManager=new GameManager();
gameManager.Sale(game, customer);

Discount discount=new Discount();
discount.addCampaign(game, campaign);



}

}
