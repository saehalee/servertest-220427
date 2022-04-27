package product;

import java.util.List;

public interface ProductService {
	public List<ProductDTO> productlist(); // 매핑sql id(productlist) 동일하지 않아도 됨/이해를 위해 똑같이 하면 좋음
	public ProductDTO product(int code);
}
