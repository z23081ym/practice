public abstract class TangibleAsset{
  private String name;
  private int price;
	private String color;
	
	//コンストラクタ
	public TangibleAsset(String name, int price, String color) {
		this.name= name;
		this.color = color;
    this.price = price;
	}

  //getter メソッド
	public String getName() {return this.name;}
	public void setName(String name) {this.name = name;}
	public int getPrice() {return this.price;}
	public void setPrice(int price) {this.price = price;}
	public String getColor() {return this.color;}
	public void setColor(String color) {this.color = color;}

}
