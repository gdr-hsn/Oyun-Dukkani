
public  class Discount implements ICampaignService{

	@Override
	public void addCampaign(Game game, Campaign campaign) {
		// TODO Auto-generated method stub
		game.setPrice(game.getPrice()-(game.getPrice()*campaign.getDiscount()/100));
		System.out.println("M�jde! %"+campaign.getDiscount()+" �ndirim oran�yla Zal�m Cuma �ndirimleri Geldi "
				
				+game.getGameName()+" oyunu art�k  "
				+game.getPrice()+" Tl"
				
				
				
				
				
				);
		
	}

}
