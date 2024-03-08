# Guía de Despliegue de la Aplicación

Esta guía proporciona instrucciones sobre cómo desplegar la aplicación utilizando XAMPP y Docker.


## Despliegue con XAMPP

1. Inicie XAMPP y asegúrese de que los servicios de Apache y MySQL estén en ejecución.

2. Clone el repositorio de la aplicación en su máquina local.

3. Cree una base de datos con el nombre *db_example*

4. Inicie la aplicación

5. Acceda a la aplicación en su navegador web utilizando la URL especificada.

POST: http://localhost:8080/person

```JSON
{
    "name": "pedro",
    "email": "pedro@emai.com",
    "password": "123456"
}
```

## Despliegue con Docker

1. Instale Docker en su máquina.

2. Clone el repositorio de la aplicación en su máquina local.

3. Genera el archivo empaquetado 

```bash
./mvnw clean package -DskipTests
```

4. Construya la imagen de Docker utilizando el Dockerfile proporcionado. Ejecute el siguiente comando en el directorio raíz del proyecto:

    ```bash
    docker compose build web 
    ```

4. Ejecute el contenedor de Docker utilizando la imagen construida:

    ```bash
    docker compose up 
    ```

