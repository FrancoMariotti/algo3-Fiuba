/********************************************************************************************************************************************
 * ANTES DE EMPEZAR 
*********************************************************************************************************************************************/
 
a.Crear un proyecto nuevo desde su IDE llamandolo final-inversion-original. Una vez creado copiar todas las carpetas con clases de este zip.
b.Crear un proyecto nuevo desde su IDE llamandolo final-inversion-alumno. Una vez creado copiar todas las carpetas con clases de este zip.
c.Trabajar SIEMPRE sobre el proyecto final-inversion-alumno


/********************************************************************************************************************************************
* IMPORTANTE
*********************************************************************************************************************************************/

Para aprobar este examen el/la alumno/a debe entregar una solución integral y completa que resuelva el problema dado, demostrando un alto dominio de POO, así como también de UML.
En este sentido cualquiera de las siguientes situaciones conlleva a la desaprobación AUTOMATICA del examen integrador:

	1. NO entregar código desarrollado por el propio/a alumno/a.
	2. NO entregar diagramas UML.
	3. Presentar errores GROSEROS de notación UML.


/********************************************************************************************************************************************
 * PREGUNTAS 
*********************************************************************************************************************************************/

1) Analice el modelo otorgado y conteste:

	a) ¿Qué potenciales problemas de diseño encuentra en el codigo? Enumérelos explicando PARA CADA UNO de ellos porqué considera que representan un problema de diseño.
	- Las clases Inversionista estan vacoas, no tienen comportamiento o estado asociado.
	- El tipo de inversion es un int lo que hace que el codigo sea muy dificil de leer y entender.
	- Los if que consultan el tipo de inversion estan mal, deberia resolverse por polimorfismo.
	- Los tests se encuentran en la funcion main, esto es un problema porque dificulta mucho el mantenimiento de lo
	tests lo que lleva a que no se mantegan y posteriormente a no manterlos. Deberia utilizarse una herramienta como junit.

	b) ¿Se viola algún(os) principio(s) de diseño ? ¿Cual(es)?
    - open-closed -> cada vez que quiero agregar un nuevo tipo de inversion tengo que agregar un case en el switch
    de la funcion calcularPlata.

2) 	En base a los items que ud. detalle en el punto (1) desarrolle diseñando y programando una mejora de diseño total del proyecto para incluir el BITCOIN como inversion, el cual solo estará disponible para inversionistas agresivos y devolverá 4 veces el monto invertido.

		a) Realice PRIMERO un diagrama de clases A MANO ALZADA de como sera su nuevo diseño.
		b) Realice un diagrama de secuencia A MANO ALZADA del monto devuelto al invertir $100 en un BITCOIN.

 - RECOMENDACIÓN: Una vez decidido su diseño, comience con la programación del bitcoin y luego complete el sistema.


3) Preguntas teóricas: A determinar por el docente.


4) Lecturas obligatorias: A determinar por el docente.


