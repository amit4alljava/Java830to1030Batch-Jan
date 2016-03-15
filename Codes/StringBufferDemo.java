
public class StringBufferDemo {

	public static void main(String[] args) {
		// Dynamic SQL
		StringBuffer sql = new StringBuffer(500);
		sql.append("select * from products");
		//String sql = "select * from products";
		double price = 9000;
		if(price>0){
			sql.append(" where price>").append(price);
			//sql = sql .concat( " where price>").concat(String.valueOf(price));
		}

	}

}
