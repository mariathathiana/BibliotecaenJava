📚 Sistema de Gestión de Libros

Aplicación de consola desarrollada en Java para gestionar una biblioteca, permitiendo registrar, eliminar y consultar libros mediante un menú interactivo.

🚀 Características
➕ Añadir libros indicando nombre, autor y año de publicación.
🗑️ Eliminar libros por su nombre.
📖 Mostrar los libros registrados.
🔎 Buscar coincidencias de nombres sin distinguir entre mayúsculas y minúsculas al eliminar.
💾 Almacenar los datos de forma persistente mediante una base de datos H2.
🛠️ Tecnologías utilizadas
Java — Lenguaje de programación.
JDBC — Conexión entre Java y la base de datos.
H2 Database — Base de datos SQL integrada en Java.
Maven — Gestión de dependencias.
IntelliJ IDEA — Entorno de desarrollo.
Git y GitHub — Control de versiones y alojamiento del código.
📋 Requisitos previos

Antes de ejecutar la aplicación, necesitas:

Tener instalado un JDK compatible con el proyecto.
Tener instalado IntelliJ IDEA u otro IDE compatible con Java.
Tener Maven configurado, o utilizar el Maven integrado en IntelliJ IDEA.
Disponer de la dependencia de H2 declarada en el archivo pom.xml.
⚙️ Instalación y ejecución
Clona el repositorio:
bash
git clone https://github.com/TU_USUARIO/GestionBibliotecaJava.git

Abre el proyecto en IntelliJ IDEA.
Espera a que Maven descargue las dependencias.
Ejecuta la clase principal Libros.java.
Utiliza el menú de la aplicación para gestionar los libros.
Sustituye TU_USUARIO por tu nombre de usuario de GitHub y utiliza la URL real de tu repositorio.
🗂️ Estructura del proyecto
text
Libros/
├── src/
│   └── main/
│       └── java/
│           ├── Libros.java
│           ├── ConexionBD.java
│           └── datosLibros.java
├── pom.xml
├── .gitignore
└── README.md


La estructura puede variar según la organización actual de los archivos de tu proyecto.

🗄️ Base de datos

La aplicación utiliza H2 para almacenar los libros en una tabla con los siguientes campos:

Campo	Descripción
id	Identificador único del libro
nombre	Título o nombre del libro
autor	Autor del libro
aniopublicacion	Año de publicación

La base de datos se configura mediante JDBC y puede almacenarse localmente para conservar los registros entre ejecuciones.

🖥️ Uso de la aplicación

Al ejecutar el programa, se muestra un menú con las siguientes opciones:

Agregar libro.
Eliminar libro.
Mostrar libros.
Salir del sistema.

Selecciona la opción deseada e introduce los datos solicitados por la aplicación.

🎯 Objetivo del proyecto

Este proyecto tiene como objetivo practicar los fundamentos de Java, la programación orientada a objetos, la gestión de colecciones, las consultas SQL y la conexión a bases de datos mediante JDBC.

👨‍💻 Autor

Proyecto desarrollado como ejercicio práctico de programación en Java.

⭐ Si este proyecto te resulta útil, puedes dejar una estrella en el repositorio.