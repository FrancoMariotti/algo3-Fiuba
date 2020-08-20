Los profesores se confundieron y no dejaron la consigna en la carpeta. La dictaron.

Consigna:
1. Analizar los archivos dados. 
    1. ¿Qué problemas de diseño encuentra y por que los considera problemas?
    - El Try-Catch de casteos era una truchada cero POO. Hay que arreglarlo con polimorfismo, en vez de preguntarle a un objeto de que clase es
    - No hay tests unitarios, lo que dificulta la deteccion de erroes.
    - test_BIEN_BIEN_COMPLETO no es un buen nombre para un test ya que no describe lo que el test intenta testear
    - los atributos del instrumento son publicos lo que permite que el musico acceda directamente a los mismos.
     esto rompe el encapsulamiento
     * Imprimir por pantalla NO es testeable. Lo deje como estaba para evitar 'cambiar el modelo', pero imprimir por pantalla algo y devolver 0 no es la mejor manera de manejar un error.
	1. ¿Qué principios de diseño se violan?
	los principios que se rompen son:

	    - open-closed
	    - dependecy-inversion
		
1. Teniendo en cuenta los problemas encontrados, mejorar el programa en general, y agregar una entidad 'Roberto Pettinato' que toque un saxo de metal, y al tocarlo el sonido que salga sea el triple del `normal`. Los decibeles originales de un saxo son 30.`
1. Hacer un diagrama de secuencia de Luciano Pereyra tocando el Charango
1. Explicar el principio de segregación de interfaz y hacer un diagrama de clases donde se cumpla y otro donde no

