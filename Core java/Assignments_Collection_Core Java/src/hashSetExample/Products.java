package hashSetExample;

//Question 2

public class Products 
{
	int product_id;
	String product_name;
	
	public Products(int pro_id,String prod_name)
	{
		this.product_id=pro_id;
		this.product_name=prod_name;
	}
	
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	@Override
	public String toString() {
		return "Products [product_id=" + product_id + ", product_name=" + product_name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + product_id;
		result = prime * result + ((product_name == null) ? 0 : product_name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Products other = (Products) obj;
		if (product_id != other.product_id)
			return false;
		if (product_name == null) {
			if (other.product_name != null)
				return false;
		} else if (!product_name.equals(other.product_name))
			return false;
		return true;
	}
}
