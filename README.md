1. Se desea realizar una aplicación Java para la gestión de un instituto, almacenando sus
especialidades, alumnos y profesores.
De las especialidades hay que almacenar su identificador y su nombre.
Sobre los miembros del instituto se deberán almacenar los datos propios de persona (el DNI,
el nombre, la edad y la dirección) y la fecha de incorporación al centro como atributo propio.
Existirán 2 tipos de miembros: alumnos y profesores.
En el caso de los alumnos, se almacenará el ciclo que se encuentra realizando, su media de
notas y el importe de su matrícula.
Para los profesores se registrará el tipo de jornada (parcial o completa), su sueldo y la
especialidad que imparte.
En cuanto a los constructores, en cada clase deberá existir uno por defecto que asigne
valores a todos los atributos, propios y heredados; y otro parametrizado con todos los
atributos.
Existirá un método común a alumnos y profesores, aplicarBonificacion, que en función de la
clase sobre la que se implemente, actuará de una manera u otra:
• En el caso de los alumnos, si el alumno se ha incorporado al centro hace más de 2
años, el importe de su matrícula se verá reducido en un 10%.
• En el caso de profesores, si su incorporación al centro fue hace más de 3 años, su
sueldo se incrementará en un 15%.
Por último, desarrolla una clase ejecutable que realice lo siguiente:
• Cree un listado de miembros.
• Elaborar un menú que dé las opciones de dar altas, bajas o consultas sobre los
miembros existentes en el listado.
• Cuando se introduzcan los datos de los objetos para realizar las altas, deberá hacerse
por teclado, capturando las excepciones que puedan producirse por la utilización del
flujo de entrada de datos, así como por introducción de datos en formato incorrecto.
En caso de que se produzca alguna de estas circunstancias, deberá mostrarse por
pantalla un error y volver a solicitar el dato.
• El menú deberá proporcionar también las siguientes funcionalidades:
▪ Mostrar por pantalla la edad media de los profesores.
▪ Calcular la nota media obtenida por los alumnos del ciclo DAM.
▪ Calcular el salario medio de los profesores.
