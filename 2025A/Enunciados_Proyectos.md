# Miniproyectos JavaFX – Algoritmos y Programación 2, 2025A
## Diego Loaiza, Universidad Santiago de Cali

Cada proyecto debe desarrollarse en 5 semanas. Se espera aplicar conceptos de POO como encapsulamiento, herencia, abstracción, polimorfismo, interfaces y patrones de diseño.

---

## Proyecto 1: Agenda de Contactos Inteligente

### Enunciado
Crea una aplicación para gestionar contactos personales. El usuario podrá registrar, editar, eliminar y buscar contactos. Además, debe permitirse clasificar los contactos por etiquetas (familia, trabajo, amigos, etc.).

### Entidades Principales
- `Contacto`: nombre, teléfono, correo, nota, etiqueta
- `Agenda`: lista de contactos y operaciones sobre ella

### Funcionalidades
- Agregar, editar y eliminar contactos
- Buscar contactos por nombre o etiqueta
- Guardar y cargar contactos desde archivo (JSON o CSV)
- Interfaz visual con `TableView` y formularios

### Entregables por Semana
1. Modelado de clases y boceto de interfaz
2. CRUD básico y listado en tabla
3. Implementación de búsqueda y filtrado
4. Persistencia de datos con archivo
5. Mejoras visuales, validaciones y presentación

---

## Proyecto 2: Gestor de Tareas Personales

### Enunciado
Crea una aplicación donde el usuario registre tareas con nombre, prioridad, fecha límite y estado (pendiente, en proceso, completada).

### Entidades
- `Tarea`: nombre, descripción, prioridad, estado, fecha límite
- `GestorTareas`: lista de tareas y operaciones

### Funcionalidades
- Agregar, editar y eliminar tareas
- Filtrar por estado y ordenarlas por prioridad o fecha
- Persistencia en archivo local
- Aplicar patrón Strategy para ordenar

### Entregables por Semana
1. Diseño del modelo de clases e interfaz inicial
2. CRUD de tareas con `ObservableList`
3. Implementación de filtros y estrategias de ordenamiento
4. Guardado/carga en archivo (JSON o binario)
5. Validaciones, estética y documentación

---

## Proyecto 3: Simulador de Cajero Automático

### Enunciado
Simula un cajero automático donde los usuarios pueden registrarse, iniciar sesión y realizar operaciones bancarias básicas.

### Entidades
- `Usuario`: nombre, cédula, PIN, saldo
- `Cuenta`: historial de transacciones
- `Transacción`: tipo, monto, fecha

### Funcionalidades
- Registro e inicio de sesión
- Consultar saldo, retirar y consignar dinero
- Mostrar historial de transacciones
- Validaciones y manejo de errores

### Entregables por Semana
1. Modelado de usuarios y transacciones
2. Interfaz para login y menú principal
3. Funcionalidades de operaciones y seguridad básica
4. Persistencia en archivo local por usuario
5. Validaciones, diseño y pruebas

---

## Proyecto 4: Biblioteca Virtual

### Enunciado
Desarrolla una biblioteca virtual con préstamo de libros. Los usuarios podrán buscar libros, solicitar un préstamo y devolverlo.

### Entidades
- `Libro`: título, autor, ISBN, estado
- `Usuario`: nombre, ID, lista de préstamos
- `Biblioteca`: catálogo y usuarios

### Funcionalidades
- Búsqueda de libros
- Préstamo y devolución (máximo 3 libros por usuario)
- Registro de usuarios
- Mostrar libros disponibles y prestados
- Uso del patrón Abstract Factory para distintos tipos de libros

### Entregables por Semana
1. Modelado de clases y estructura del catálogo
2. Registro y autenticación de usuarios
3. Lógica de préstamo y devolución
4. Uso de patrones y persistencia de estado
5. Revisión, mejora visual y presentación

---

## Proyecto 5: Juego de Memoria (Memory Game)

### Enunciado
Desarrolla el juego clásico donde los jugadores hacen clic para destapar pares de cartas e intentan memorizar su posición.

### Entidades
- `Carta`: imagen, estado (oculta/visible)
- `Tablero`: matriz de cartas
- `Juego`: lógica general

### Funcionalidades
- Interfaz gráfica con cartas volteables
- Verificación automática de coincidencias
- Contador de intentos y reinicio
- Uso de herencia para distintos tipos de carta

### Entregables por Semana
1. Diseño gráfico y lógica de cartas
2. Mecánica de volteo y comparación
3. Implementación del tablero dinámico
4. Contador, reinicio y control de flujo
5. Mejoras, animaciones y evaluación final

## Herrramientas para prototipado de UI:
| Herramienta | Tipo | Ventajas | Enlace |
|-------------|------|----------|--------|
| **Figma** | Basado en navegador | Colaboración en tiempo real, diseño vectorial, prototipos interactivos. Tiene plan gratuito muy completo. | [figma.com](https://www.figma.com) |
| **Penpot** | Open source y online | Alternativa libre a Figma, colaboración, exportación SVG/HTML. Ideal para educación y proyectos comunitarios. | [penpot.app](https://penpot.app) |
| **Draw.io (diagrams.net)** | Herramienta de diagramación | Ideal para wireframes rápidos, compatible con SVG. Muy liviano. | [draw.io](https://draw.io) |
| **Balsamiq Wireframes (cloud)** | Wireframing (estilo sketch) | Muy intuitivo para prototipos rápidos. Versión de prueba gratis. | [balsamiq.com](https://balsamiq.com) |
| **Pencil Project** | Escritorio (open source) | Libre y multiplataforma. Buena para mockups rápidos. | [pencil.evolus.vn](https://pencil.evolus.vn) |
