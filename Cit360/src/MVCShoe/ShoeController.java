package MVCShoe;

public class ShoeController {
	private Shoe model;
	private ShoeView view;
	private int shoeNum;

	   public ShoeController(Shoe model, ShoeView view, int i){
	      this.model = model;
	      this.view = view;
	      this.shoeNum = i;
	   }

	   public void shoeDetails(){				
	      view.displayShoe(model.getBrand(), model.getStyle(), model.getColor(), model.getSize(), shoeNum);
	   }	
	}