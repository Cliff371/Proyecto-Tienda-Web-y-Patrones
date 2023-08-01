package Tienda.demo.dao;

import Tienda.demo.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoDao extends JpaRepository<Producto, Long>{
    
}
