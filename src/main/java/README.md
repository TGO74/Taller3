# README

# Sistema de Gestión de Venta de Vehículos

Este sistema de venta de vehículos permite a los clientes comprar automóviles y motocicletas. A continuación, se describen las principales características y la estructura del proyecto.

#### Funcionalidades del Sistema:

1. **Registro de Clientes:**
    - Los clientes pueden registrarse y tener una cuenta en la tienda de vehículos.

2. **Catálogo de Vehículos:**
    - La tienda de vehículos cuenta con un catálogo que incluye automóviles y motocicletas.
    - Cada vehículo tiene una marca, modelo, año de fabricación, peso, precio y stock.

3. **Búsqueda de Vehículos:**
    - Los clientes pueden buscar vehículos por marca, modelo o tipo.

4. **Carrito de Compras:**
    - Los clientes pueden agregar vehículos a su carrito de compras.
    - Se muestra el subtotal de la compra en el carrito.

5. **Proceso de Compra:**
    - Los clientes pueden realizar una compra proporcionando información de envío y pago.
    - Cada compra registra una lista de vehículos, el cliente asociado y la fecha de compra.
    - Al realizar una compra, se descuenta el stock de vehículos de la tienda.

#### Clases del Modelo:

- **Cliente:**
    - Atributos: nombre, dirección, información de cuenta, etc.

- **Vehículo:**
    - Atributos: marca, modelo, año, peso, precio, stock.

- **Automóvil (hereda de Vehículo):**
    - Atributos adicionales: potencia (HP), número de puertas, tamaño del motor.
    - Método para calcular la velocidad máxima.

- **Motocicleta (hereda de Vehículo):**
    - Atributos adicionales: potencia (HP), tipo de motor, suspensión.
    - Método para calcular la velocidad máxima.

- **Compra:**
    - Atributos: lista de vehículos, cliente, fecha de compra.

#### Gestor de Datos:

- **GestorDatosVehiculos:**
    - Métodos:
        - `leerArchivoVehiculos(nombreArchivo): void`
        - `cargarDatos(): void`
        - `almacenarDatos(): void`

#### Estructura del Proyecto:

- **Packages:**
    - `modelo`: Contiene las clases relacionadas con el modelo de datos (Cliente, Vehículo, Automóvil, Motocicleta, Compra).
    - `dato`: Contiene el gestor de datos (GestorDatosVehiculos).
    - `vista`: Contiene las clases relacionadas con la interfaz de usuario y el flujo del programa.

---

Este análisis proporciona una visión general del sistema y su estructura. A continuación, se debe proceder a implementar las clases, métodos y funcionalidades descritas en este README para crear el sistema de gestión de venta de vehículos.