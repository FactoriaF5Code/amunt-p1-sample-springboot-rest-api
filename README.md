# Sample SpringBoot REST Api

Este repositorio contiene el código de una API REST implementada con SpringBoot


## Instrucciones

En grupo, intentad hacer las siguientes tareas. Buscad en Google, preguntad a otros grupos y a vuestras profes y, sobre todo,
anotad los problemas que os encontráis y sus soluciones. Y recordad: Paciencia!

1. `bootRun`
    - Lanzad el servidor usando IntelliJ
    - Probad a lanzar el servidor desde línea de comandos usando el comando `bootRun` de Gradle
2. `build`
    - Lanzad los los tests del proyecto usando IntelliJ
    - Lanzad los tests del proyecto usando la línea de comandos con el comando `build` de Gradle

3. `application.properties`
    - Por defecto, SpringBoot lanza las aplicaciones en el puerto 8080. Cambiad el puerto por defecto modificando el archivo `application.properties` del proyecto.

4. API REST
    - Investigad los métodos que implementa esta API usando Postman:
        - GET `/coders` devuelve las coders que existen.
        - GET `/coder/0` devuelve la coder que tiene el id (identificador) 0. Prueba a cambiar el "0" por otros índices.
        - POST `/coders` nos permite crear una nueva coder. Nos devuelve el objeto que se ha creado en el backend incluyendo su identificador (id) autogenerado.
        - DELETE `/coders/1` borra a la coder con el id 1 del servidor. Prueba a cambiar el "1" por otros Id.
        - PUT `/coders` nos permite modificar una coder.
5. Código
    - Analizad el código de este backend
        - Qué archivos tiene el proyecto? Para qué sirven?
        - Qué archivos contienen el código del servidor? Qué archivos contienen el código de los tests?
        - Localiza en el código las siguientes anotaciones de Spring Boot: `@RestController`, `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping`. Busca su significado. Dónde se colocan estas anotacione en este código? Para qué crees que sirven? Qué ocurre si las borras?
        - Dónde se guarda la información en este backend? Utiliza una base de datos? Debería utilizarla? Por qué?


### Referencias

- https://spring.io/guides/tutorials/spring-boot-kotlin/
- https://www.baeldung.com/kotlin/spring-boot-testing