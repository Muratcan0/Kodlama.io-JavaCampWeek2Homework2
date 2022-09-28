package classesWithAttributes;

public class Product {
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _colour;

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_description() {
		return _description;
	}

	public void set_description(String _description) {
		this._description = _description;
	}

	public double get_price() {
		return _price;
	}

	public void set_price(double _price) {
		this._price = _price;
	}

	public int get_stockAmount() {
		return _stockAmount;
	}

	public void set_stockAmount(int _stockAmount) {
		this._stockAmount = _stockAmount;
	}

	public String get_colour() {
		return _colour;
	}

	public void set_colour(String _colour) {
		this._colour = _colour;
	}

}
