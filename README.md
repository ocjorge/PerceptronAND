# PerceptronAND
Perceptron simple de AND 
# Perceptrón Simple con Menú de Inicialización

Este proyecto implementa un perceptrón simple con la capacidad de inicializar los pesos de dos maneras distintas a través de un menú interactivo.

## Descripción
El programa entrena un perceptrón para realizar la operación lógica AND utilizando el algoritmo de aprendizaje supervisado. El usuario puede elegir entre:
1. Iniciar con pesos predefinidos: `Xteta = 1`, `w1 = 0.5`, `w2 = 1.5`, `wteta = 1.5`.
2. Iniciar con pesos aleatorios para `w1` y `w2`.

Durante el proceso de aprendizaje, los pesos son ajustados en cada iteración hasta que el perceptrón aprende correctamente los patrones.

## Estructura del Código
- **Entrada de datos**: Se define un conjunto de entradas y sus respectivas salidas esperadas.
- **Inicialización de pesos**: Se realiza según la opción elegida por el usuario.
- **Entrenamiento del perceptrón**: Se actualizan los pesos en base a la regla de aprendizaje.
- **Prueba del modelo**: Se solicita al usuario ingresar valores y el perceptrón predice la salida.
- **Salida de resultados**: Se muestran los pesos finales y el total de iteraciones realizadas durante el entrenamiento.

## Requisitos
- Java 8 o superior

## Cómo Ejecutar
1. Compilar el programa con:
   ```sh
   javac PerceptronSimple.java
   ```
2. Ejecutar el programa con:
   ```sh
   java PerceptronSimple
   ```
3. Seguir las instrucciones en pantalla para seleccionar la opción de inicialización y proporcionar datos de entrada.

## Ejemplo de Salida
```
Seleccione una opción:
1. Iniciar con Xteta = 1, w1 = 0.5, w2 = 1.5, wteta = 1.5
2. Iniciar con pesos aleatorios de w1 y w2
> 1

Perceptrón AND
Factor de Aprendizaje: 0.4
Pesos Iniciales: w0 = 1.5, w1 = 0.5, w2 = 1.5
...
Pesos Finales: w0 = 1.2, w1 = 0.8, w2 = 1.3
Total de iteraciones: 5
Ingrese la entrada 1 (1,-1): 1
Ingrese la entrada 2 (1,-1): -1
La salida es: -1
```

## Autor
Este código fue desarrollado por Jorge Ortiz Ceballos para demostrar el funcionamiento de un perceptrón simple en Java.

