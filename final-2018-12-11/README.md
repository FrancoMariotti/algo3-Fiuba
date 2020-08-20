Antes de empezar
================
 
1. Crear un proyecto nuevo desde su IDE llamandolo final-13-12-18-original. Una vez creado copiar todas las carpetas con clases de este zip.
2. Crear un proyecto nuevo desde su IDE llamandolo final-13-12-18-alumno. Una vez creado copiar todas las carpetas con clases de este zip.
3. Trabajar SIEMPRE sobre el proyecto final-13-12-18-alumno.

Consignas
=========

1. Leer las pruebas del archivo Pruebas.java y analizar la implementación propuesta.
2. Identifique potenciales problemas de diseño en el código. Enumérelos en una hoja y justifique por qué considera que representan un problema de diseño.

Problemas identificados:

1- Malos nombres de tests. Nombre de tests no son descriptivos de lo que intentan testear.

2- En la prueba02 se agregan los productos al map y luego se los agrega a la tienda. Esto rompe el encapsulamiento. Deberian poder agregarse productos a la tienda sin tener que saber como esta implementada la tienda por dentro.

3- La clase envio solo tiene un metodo abstracto.Deberia ser una interfaz no hereda comportamiento.

4- Cupon deberia ser un objeto , no un enum.

5- No hay tests unitarios.

6- Los tests estan en la carpeta srcs.

7- agregarEnvio utiliza try y catch cuando no es necesario ya que EnvioInternacion y EnvioLocal son clases hijas 
y por tanto puede utilizarse polimorfismo.


3. ¿Se viola algún principio de diseño? ¿Cuál(es)?

los principios que se violan son:
	
	- single responsability -> la clase tiendaOnline tiene demasiadas responsabilidades.
	- open-closed -> cada vez que quiero agregar un nuevo tipo de cupon o tipo de envio tengo que ir a modificar la clase 
	tienda online.

    - Tambien se rompe lo establecido en el texto Unit Testin Principles, en el que se especifica que los nombres de 
    las pruebas deben ser especificos de lo que hacen, y no prueba01 prueba02 como se recibieron en el codigo original.


4. En base a los items que detalló en el punto (2) realice una mejora de diseño total del proyecto que además incluya la posibilidad de de agregar un cupón que bonifique el envío a domicilio local (es decir, el envío dentro del país pasaría a ser gratis si se aplica ese cupón).

5. Realice un diagrama de clases a mano alzada de cómo sería su nuevo diseño.

6. Realice por lo menos un diagrama de secuencia (a mano alzada) de la o las situaciones que considere relevantes.

7. Puede modificar todo el código (de la solución y de las pruebas), agregando y/o quitando todas las clases que considere apropiadas, justificando cada decisión.