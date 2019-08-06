//package waa.edu.onlineshopping.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import waa.edu.onlineshopping.domain.Product;
//import waa.edu.onlineshopping.service.ProductService;
//
//import javax.validation.Valid;
//
//@Controller
//public class ProductController {
//
//    @Autowired
//    ProductService productService;
//
//        @GetMapping({"/product"})
//    public String getProduct(@ModelAttribute("product")Product product){
//            return "product";
//        }
//    @PostMapping({"/product"})
//    public String postProduct(@Valid Product product, BindingResult bindingResult){
//            if(bindingResult.hasErrors()){
//                  return "product";
//            }
//
//    }
//
//}
