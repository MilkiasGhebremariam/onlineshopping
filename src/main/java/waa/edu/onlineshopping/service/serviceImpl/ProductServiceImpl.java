//package waa.edu.onlineshopping.service.serviceImpl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import waa.edu.onlineshopping.domain.Product;
//import waa.edu.onlineshopping.repository.ProductRepository;
//import waa.edu.onlineshopping.service.ProductService;
//
//import java.util.List;
//
//public class ProductServiceImpl implements ProductService {
//
//    @Autowired
//    ProductRepository productRepository;
//    @Override
//    public void save(Product product) {
//          productRepository.save(product);
//    }
//
//    @Override
//    public List<Product> getProducts() {
//        return (List<Product>) productRepository.findAll();
//    }
//
//    @Override
//    public Product deleteById(Long id) {
//
//        return (Product) productRepository.deleteById(id);
//    }
//
//    @Override
//    public Product update(Product product) {
//        return null;
//    }
//}
