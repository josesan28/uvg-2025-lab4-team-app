# TeamApp - Ejercicio de GitHub con Android y Compose

## 🎯 Objetivo
Este ejercicio tiene como objetivo practicar **colaboración con Git y GitHub** dentro de un proyecto Android nativo con **Kotlin y Jetpack Compose**.  
Los estudiantes trabajarán en equipo, utilizando ramas, commits, Pull Requests y revisiones de código, simulando un flujo de trabajo real.

## 🚀 Instrucciones
1. Crea un fork del repositorio de GitHub y clonalo en tu computadora.
2. Crea una rama con tu nombre o con el nombre de la funcionalidad que te corresponda (ejemplo: `feature/nombre-lista`).
3. Implementa la parte del proyecto que te fue asignada (modelo, repositorio, UI, etc.).
4. Haz commits pequeños y descriptivos de tus cambios.
5. Abre un Pull Request (PR) hacia la rama `develop`. Otro compañero debe revisarlo antes de hacer merge.
6. Una vez que todas las *features* estén integradas en `develop`, el equipo debe abrir un PR final hacia `main` del repositorio original.
7. El repositorio debe incluir:
    - Capturas de pantalla de la app corriendo (lista y detalle).
    - Evidencias de los PRs y revisiones de código.
    - Una breve reflexión en este README sobre lo aprendido.

## 📂 Estructura del proyecto
- `MainActivity.kt`: Contiene la pantalla inicial con un mensaje de bienvenida.
- `develop` branch: Rama donde se integrarán las features antes de pasar a `main`.

## 📝 Entrega
Al finalizar:
- Agrega en este README:
    - Capturas de pantalla de la app funcionando.
    - Explicación de cómo resolvieron los conflictos y organizaron el flujo de trabajo.
    - Reflexión del equipo sobre lo aprendido.

# Grupo 3

## 📱 Descripción de la App
Aplicación Android desarrollada en Kotlin con Jetpack Compose que muestra un listado de los integrantes del equipo y permite ver detalles básicos de cada uno.

## 🧑‍💻 Integrantes del Equipo
- **Integrante 1**: Daniel Sandoval - Data Class TeamMember
- **Integrante 2**: José Sanchez - FakeTeamRepository  
- **Integrante 3**: Juan Gualim - TeamListScreen

## 🚀 Funcionalidades Implementadas
-  Data Class `TeamMember` en package `model/`
-  `FakeTeamRepository` con datos de ejemplo
-  `TeamListScreen` con LazyColumn
-  Navegación a `TeamDetailScreen`
-  Flujo completo de Git con feature branches y PRs

## 📸 Capturas de Pantalla

### Pantalla de Lista de Miembros

![Imagen de WhatsApp 2025-08-29 a las 08 04 07_3b0b6ea0](https://github.com/user-attachments/assets/f61641fb-7f06-4dab-998b-76890dedbf56)

### Pantalla de Detalle de Miembro 

![Imagen de WhatsApp 2025-08-29 a las 08 04 32_92c82435](https://github.com/user-attachments/assets/de57bed9-6e3a-43ed-b859-89ccdf4eb91e)

## 🔄 Organización del Flujo de Trabajo con PRs

### 📋 Estrategia de Desarrollo
Se implementó un **flujo de feature branches** con integración continua hacia la rama `develop`. Durante el proceso no existieron conflictos gracias a la utilización de las diferentes ramas y los Pull Requests.

### 🏗️ Estructura de Ramas
```bash
main
└── develop
    ├── team_member                         # Integrante 1
    ├── feature/fake-team-repository        # Integrante 2  
    └── screens                             # Integrante 3
