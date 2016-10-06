
public class Product {
String name;
double price;
Product(String a, double b){
	name = a;
	price = b;
}
public String getName(){
	return name;
}
public double getPrice(){
	return price;
}
public void reducePrice(int a){
	price -= a;
}

}
