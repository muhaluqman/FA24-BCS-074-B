public class Product{
	int counter=1;
	private String prodID;
	private String prodName;
	private int prodQuan;
	private double prodPr;
	private String prodCat;
	
	public Product(String Name, int Quan, double Pr, String Cat){
		prodName=Name;
		prodQuan=Quan;
		prodPr=Pr;
		prodCat=Cat;
		prodID="E"+counter++;
	}
	public void setProdID(String x){
		prodID=x;
	}
	public void setProdName(String x){
		prodName=x;
	}
	public void setProdQuan(int x){
		prodQuan=x;
	}
	public void setProdPr(double x){
		prodPr=x;
	}
	public void setProdCat(String x){
		prodCat=x;
	}
	String getProdID(){
		return prodID;
	}
	String getProdName(){
		return prodName;
	}
	int getProdQuan(){
		return prodQuan;
	}
	double getProdPr(){
		return prodPr;
	}String getProdCat(){
		return prodCat;
	}
	void printValues(){
		System.out.printf("Product ID is: %s\n",prodID);
		System.out.printf("Product Name is: %s\n",prodName);
		System.out.printf("Product Quantity is: %d\n",prodQuan);
		System.out.printf("Product price is: %f\n",prodPr);
		System.out.printf("Product Category is: %s\n",prodCat);
	}

}