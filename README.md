# FizzBuzz - TDD en Java

> Este repositorio consiste en un mini proyecto desarrollado como práctica de Test-Driven Development (TDD) usando Java y JUnit 5.

**Autora:** María Paula Sánchez Macías

---

## ¿Qué es TDD?

> TDD (Test-Driven Development) es una metodología de desarrollo donde las pruebas se escriben **antes** que el código.

El ciclo se repite en tres pasos:

> **Red** — Se escribe una prueba mínima inicial que falla porque aún no existe el código.
>
> **Green** — Se escribe el código mínimo necesario para que la prueba hecha anteriormente pase.
>
> **Refactor** — Luego se refactriza/mejora el código sin romper las pruebas.

De esta manera, usando este flujo, garantiza que cada línea de código tenga una razón de existir y esté respaldada por una prueba.

---

## Problema: FizzBuzz

> FizzBuzz es un ejercicio clásico que consiste en evaluar un número y retornar:
> - `"Fizz"` si es múltiplo de 3
> - `"Buzz"` si es múltiplo de 5
> - `"FizzBuzz"` si es múltiplo de 3 y 5
> - El número como texto si no cumple ninguna condición

---

## Tecnologías usadas

- Java 11
- JUnit 5
- Maven

---

## Estructura del proyecto

```
FizzBuzz-TDD/
├── src/
│   ├── main/java/
│   │   └── FizzBuzz.java        # Lógica principal
│   └── test/java/
│       └── FizzBuzzTest.java    # Pruebas unitarias
└── pom.xml
```

---

## Pruebas escritas

> Cada prueba fue escrita antes de implementar la funcionalidad correspondiente, siguiendo el ciclo Red-Green-Refactor.

| Prueba | Entrada | Resultado esperado |
|--------|---------|-------------------|
| Número sin múltiplos | 1, 11 | `"1"`, `"11"` |
| Múltiplo de 3 | 3, 9 | `"Fizz"` |
| Múltiplo de 5 | 5, 10 | `"Buzz"` |
| Múltiplo de 3 y 5 | 15 | `"FizzBuzz"` |

---

## Cómo ejecutar

Correr las pruebas:

```bash
mvn test
```

Compilar el proyecto:

```bash
mvn compile
```

---

## Lo que aprendí

> TDD obliga a pensar en el comportamiento esperado antes de pensar en la implementación. Esto hace que el código sea más claro, más fácil de mantener y menos propenso a errores.
