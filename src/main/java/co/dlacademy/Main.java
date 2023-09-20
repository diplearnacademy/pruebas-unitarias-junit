package co.dlacademy;

public class Main {

    public static void main(String[] args) {
        // Crear productos
        Producto producto1 = new Producto("Camisa", 25.0);
        Producto producto2 = new Producto("Pantalón", 35.0);
        Producto producto3 = new Producto("Zapatos", 50.0);
        Producto producto4 = new Producto("Coca", 5000.0);


        // Crear carrito de compras
        Carrito carrito = new Carrito();

        // Agregar productos al carrito
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        carrito.agregarProducto(producto3);


        // Calcular el total de la compra
      double totalCompra = carrito.calcularTotal();
        System.out.println("Total de la compra: $" + totalCompra);

        // Crear historial de compras
        HistorialCompra historial = new HistorialCompra();

        // Agregar la compra al historial
        historial.agregarCompra(carrito);

        // Mostrar el historial de compras
        System.out.println("\nHistorial de Compras:");
        for (Compra compra : historial.obtenerCompras()) {
            System.out.println("Fecha: " + compra.getFecha());
            System.out.println("Productos:");

            for (Producto producto : compra.getCarrito().getProductos()) {
                System.out.println("- " + producto.getNombre() + ": $" + producto.getPrecio());
            }

            System.out.println("Total de la compra: $" + compra.getTotal());
            System.out.println("----------");
        }
    }
}
