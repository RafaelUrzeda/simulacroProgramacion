# Proyecto de Manejo de Mascotas

Este proyecto consiste en la implementación de un sistema de manejo de mascotas en Java. El sistema está diseñado para gestionar diferentes tipos de mascotas, como perros, gatos, loros y canarios, mediante la creación de clases que representan cada tipo de mascota y una clase de manejo de usuario para interactuar con ellas.

## Clases de mascotas

### Clase abstracta Mascota

La clase abstracta `Mascota` define las características comunes de todas las mascotas:

- Atributos:
  - `color` (String): color de la mascota.
  - `edad` (int): edad de la mascota.
  - `estado` (String): estado de la mascota (vivo o muerto).

- Métodos:
  - `cumpleaños()`: Incrementa la edad de la mascota en 1.
  
### Clase Perro

La clase `Perro` hereda de `Mascota` y representa a un perro:

- Atributos adicionales:
  - `tienePulgas` (boolean): indica si el perro tiene pulgas.
  - `numeroChip` (String): número de chip de identificación del perro.

### Clase Gato

La clase `Gato` hereda de `Mascota` y representa a un gato:

- Atributos adicionales:
  - `tienePelo` (boolean): indica si el gato tiene pelo.

### Clase abstracta Ave

La clase abstracta `Ave` representa a las aves y contiene un método para preguntar si vuelan:

- Atributos:
  - `color` (String): color del plumaje de la ave.

- Métodos:
  - `preguntarSiVuela()`: solicita al usuario que indique si el ave vuela.

### Clase Loro

La clase `Loro` hereda de `Ave` y representa a un loro:

- Atributos adicionales:
  - `habla` (boolean): indica si el loro puede hablar.
  - `tamaño` (String): tamaño del loro (pequeño, mediano, grande).

### Clase Canario

La clase `Canario` hereda de `Ave` y representa a un canario:

- Atributos adicionales:
  - `canta` (boolean): indica si el canario puede cantar.
  - `tipoJaula` (String): tipo de jaula preferida por el canario.

## Clase de Manejo de Usuario

La clase `ManejoMascotas` proporciona métodos para interactuar con las mascotas:

- Métodos:
  - `añadirMascota(Mascota mascota)`: añade una mascota al sistema.
  - `muereMascota(String nombreMascota)`: establece el estado de una mascota como "muerta".
  - `eliminarMascota(String nombreMascota)`: elimina una mascota del sistema.
  - `mostrarMascota(String nombreMascota)`: muestra información de una mascota específica.
  - `mostrarTodasLasMascotas()`: muestra información de todas las mascotas en el sistema.

Además de estos métodos, se pueden añadir otros según sea necesario para la funcionalidad específica del sistema.
