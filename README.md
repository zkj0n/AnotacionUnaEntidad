# Mapeo Una Entidad

Este es un proyecto de ejemplo que implementa un CRUD básico para el mapeo de una entidad utilizando **Hibernate** para la gestión de la persistencia de datos.

## Descripción

"Mapeo Una Entidad" es una aplicación web que permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre una entidad específica. La entidad se mapea utilizando **Hibernate**, un framework de mapeo objeto-relacional (ORM) que facilita la interacción entre la base de datos y las clases Java.

El proyecto está diseñado con una arquitectura **Java EE 7**, utilizando **JSP** para las vistas, **CSS** y **Bootstrap** para el diseño de las interfaces, y **MySQL** como base de datos. Hibernate se encarga de la persistencia, mapeando las clases Java a tablas de la base de datos, eliminando la necesidad de escribir SQL explícito para operaciones CRUD comunes.

## Tecnologías utilizadas

- **Java 11**: Lenguaje de programación utilizado para el desarrollo del backend.
- **Java EE 7**: Framework para la creación de aplicaciones empresariales con soporte para servlets, JSP, y otros componentes.
- **JSP (JavaServer Pages)**: Tecnología para la creación de páginas dinámicas del lado del servidor.
- **CSS y Bootstrap**: Herramientas para la creación de interfaces atractivas y adaptables (responsive design).
- **MySQL**: Sistema de gestión de bases de datos utilizado para almacenar los datos de la entidad.
- **Hibernate**: Framework ORM que se encarga de mapear la entidad Java a la base de datos MySQL. Hibernate simplifica las operaciones CRUD y permite una mayor flexibilidad y menos código para la interacción con la base de datos.

## Instalación

### Requisitos previos

1. **Java 11** instalado.
2. **MySQL** instalado y en funcionamiento.
3. **Servidor de aplicaciones** compatible con Java EE 7 (como **Apache Tomcat** o **GlassFish**).
4. **IDE** como **IntelliJ IDEA**, **Eclipse**, o **NetBeans**.

### Pasos para ejecutar el proyecto

1. **Clonar el repositorio**:

   ```bash
   git clone https://github.com/zkj0n/MapeoUnaEntidad.git
   ```

2. **Configurar la base de datos**:

   Crea una base de datos en MySQL con el nombre que prefieras. Por ejemplo:

   ```sql
   CREATE DATABASE hibernate;
   ```
   Luego, ajusta el archivo `hibernate.cfg.xml` en el proyecto para que coincida con la configuración de tu base de datos (usuario, contraseña, nombre de la base de datos).

3. **Configurar el servidor**:

   Asegúrate de que el servidor de aplicaciones (por ejemplo, Tomcat o GlassFish) esté configurado correctamente para soportar aplicaciones Java EE 7.

4. **Ejecutar el proyecto**:

   Si todo está configurado correctamente, ejecuta el proyecto desde tu IDE o despliega el WAR generado en tu servidor de aplicaciones.

5. **Acceder a la aplicación**:

   Una vez que el servidor esté en funcionamiento, puedes acceder a la aplicación a través del navegador en la URL configurada, generalmente:

   ```text
   http://localhost:8080/MapeoUnaEntidad
   ```

## Características

- **CRUD completo**: Crear, leer, actualizar y eliminar registros de la entidad.
- **Mapeo de entidad con Hibernate**: La clase Java se mapea automáticamente a la base de datos, evitando la necesidad de escribir SQL manual.
- **Interfaz amigable**: Utiliza **Bootstrap** y **CSS** para proporcionar una experiencia de usuario atractiva y adaptable a distintos dispositivos.
- **Fácil de configurar**: El proyecto está listo para ser configurado con tu propia base de datos MySQL.

## Licencia

Este proyecto está bajo la licencia MIT.
