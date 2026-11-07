# Aplicación Spring Boot 
Nunez Reyes Jorge Emilio

Se realizaron los controladores utilizando los conocimientos aprendidos en el video
Curso completo de Java Spring Boot desde cero
https://youtube.com/playlist?list=PL2Z95CSZ1N4EWw14HZ0NFD3woFcn6uiCm



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

Instancia: http://13.140.209.186:8083/mi-instancia

Perfil: http://13.140.209.186:8083/perfil

Estado: http://13.140.209.186:8083/estado