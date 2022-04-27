package product;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("productdao")
public interface ProductDAO {
	public List<ProductDTO> productlist();
	public ProductDTO product(int code);
}
