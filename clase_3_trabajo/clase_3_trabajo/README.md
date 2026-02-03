TestMyDate

Objetivo: Recordar y entender como funciona el concepto de encapsulamiento en la Programación Orientada a Objetos

Introducción: Cuando encapsulamos la información en una clase instanciable nosotros decidimos que tan fácil se puede acceder a esos atributos mediante los modificadores de acceso (public, protected, default o private), si seleccionamos algún modificador como el private, ya es muy difícil acceder a esa información, al menos que no sea el acceso desde la misma clase. El Encapsulamiento es una forma de proteger a mis atributos privados, siempre y cuando también se tenga cuidado en proveer un acceso controlado a esa información.

Instrucciones:

Encapsular todos los atributos, y controlar el acceso a ellos (usar el modificador private para todos los atributos), no permitiendo rangos de días, meses y años erróneos (meses mayores a 12 y menores que 1 etc,. para el día igual; días no menores que 1 ni mayores a 31). No permitirá años de nacimiento mayores a la fecha actual

Adicionalmente agregar un método  toString(), que devolverá la fecha formateada de la siguiente manera:

dd/mm/aaaa

las fechas erróneas simplemente desplegara "Fecha Invalida"