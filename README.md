# Aplicación Spring Boot en Contabo VPS

Proyecto desarrollado con **Spring Boot**, empaquetado con **Apache Maven**, controlado mediante **Git** y desplegado en un servidor virtual privado (**VPS Ubuntu**) con **Java 21**.

## 🚀 Detalles del Entorno
* **Servidor VPS:** Ubuntu (IP: `13.140.209.186`)
* **Java:** Eclipse Adoptium Temurin JDK 21
* **Gestor de Dependencias:** Apache Maven
* **Puerto de Ejecución:** `8083`

---

## 🛠️ Endpoints Disponibles

La aplicación cuenta con controladores REST configurados para devolver la información de la instancia y los datos del perfil académico:

1. **Información de la Instancia**
   * **Ruta:** `/mi-instancia`
   * **Método:** `GET`
   * **Descripción:** Devuelve el mensaje de actividad y el autor de la aplicación.

2. **Perfil Académico**
   * **Ruta:** `/perfil`
   * **Método:** `GET`
   * **Descripción:** Devuelve en formato JSON los datos del estudiante:
     * **Nombre:** Jorge Emilio
     * **Carrera:** Ingeniería en Sistemas
     * **Semestre:** Noveno
     * **Institución:** Instituto Tecnológico de Oaxaca

3. **Estado del Servidor**
   * **Ruta:** `/estado`
   * **Método:** `GET`
   * **Descripción:** Confirma que el servidor está respondiendo correctamente.

---

## ⚙️ Instrucciones de Despliegue en el VPS

Para actualizar y desplegar las últimas modificaciones directamente en el servidor utilizando un flujo basado en Git, sigue estos pasos desde tu terminal SSH:

1. **Acceder a la carpeta del repositorio:**
   ```bash
   cd ~/NRJEact1_t4