
public class GameManager implements IGameManager{
//Sale Manager yerine b�yle bir isimlendirme yapt�m,��nk� oyunlar�n veritaban�na kayd� istenmemi�.
	@Override
	public void Sale(Game game, Customer customer) {
		System.out.println(
				game.getPrice()+" Tl fiyatl� "+
				game.getGameName()+" isimli oyun  "
				+(customer.getFirstName()+"  "+customer.getLastName()+" isimli m��teriye sat�ld� ")
				
	
				);
		
	}


}
