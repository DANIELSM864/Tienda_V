
package com.tienda.service;

import com.tienda.domain.Producto;
import java.util.List;

/**
 *
 * @author danis
 */
public interface ProductoService {
    
    public List<Producto> getProductos(boolean activos);
    
    // Se obtiene un Producto, a partir del id de un producto
    public Producto getProducto(Producto producto);
    
    // Se inserta un nuevo producto si el id del producto esta vacío
    // Se actualiza un producto si el id del producto NO esta vacío
    public void save(Producto producto);
    
    // Se elimina el producto que tiene el id pasado por parámetro
    public void delete(Producto producto);
    
     //lista de productos utilizando un metodo querry
    
    public List<Producto> consultaQuerry(double precioInf,double precioSup);
}

