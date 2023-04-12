# Software de gestión de clínicas
Sistema de reserva de citas para una clínica dental. Proyecto realizado para la asignatura Backend I, parte del curso Certified Tech Developer realizado en Digital House.

| Java - Framework Spring Boot - Maven - JUnit - Hibernate(JPA) - Diseño de API RESTful |

## Objetivo
Implementar un sistema para gestionar la reserva de citas para una clínica dental.

## Requerimientos técnicos
Debe cumplir con los siguientes requisitos: 
* Gestión de datos de odontológicos: listar, agregar, modificar y eliminar odontólogos. 
* Registrar apellido, nombre y número de registro de los dentistas. 
* Gestión de datos de pacientes: enumerar, añadir, modificar y eliminar pacientes. 
* De cada paciente se almacenan: nombre, apellidos, dirección, DNI y fecha de alta. 
* Registrar cita: debe ser posible asignar a un paciente una cita con un dentista en una fecha y hora determinadas. 
* Login: validar el ingreso al sistema mediante un login con usuario y contraseña. 
* Cualquier usuario que haya iniciado sesión (ROLE_USER) debe poder registrar una cita, pero solo aquellos que tengan un rol de administrador (ROLE_ADMIN) deben poder gestionar dentistas y pacientes. Un usuario solo puede tener un rol y se ingresará directamente en la base de datos.

## Arquitectura de la aplicación
La aplicación debe desarrollarse por capas:
* Capa de entidad de negocio: son las clases Java del negocio modeladas a través del paradigma orientado a objetos.
* Capa de acceso a datos (Repositorio): son las clases que se encargarán de acceder a la base de datos.
* Capa de datos (base de datos): es la base de datos del sistema modelada a través de un modelo entidad-relación. Usa la base de datos H2 por su practicidad.
* Capa empresarial: estas son las clases de servicio que se encargan de desacoplar el acceso a los datos de la vista.
* Capa de presentación: estas son las pantallas web desarrolladas usando el framework Spring Boot MVC con los controladores y HTML+JavaScript para la vista.
Es importante realizar el manejo de excepciones registrando cualquier excepción que pueda generarse y realizando pruebas unitarias para asegurar la calidad de los desarrollos.
