# Primer Parcial Práctico – Programación I

## Versión A

**Lenguaje:** Java  
**Modalidad:** Individual  
**Duración total:** 60 minutos  
**Valor:** 100 puntos  
**Temas:** arreglos unidimensionales, arreglos bidimensionales, ciclos, condicionales, contadores y acumuladores.

---

## Indicaciones generales

- Desarrolle los dos ejercicios en Java y desde consola.
- Cada ejercicio debe resolverse en un archivo independiente.
- Toda la solución debe estar dentro del método `main`.
- Puede utilizar `Scanner`, arreglos, matrices, ciclos y condicionales.
- No se permite utilizar `ArrayList`, colecciones, `Stream`, métodos de ordenamiento automático ni métodos creados por el estudiante.
- Los datos deben ser solicitados al usuario; no deben quedar escritos directamente en el código.
- Los resultados deben mostrarse de forma clara e identificable.
- Si se presenta un empate, debe reportarse la primera posición encontrada.

---

# Ejercicio 1 – Consumo de agua por sectores

**Tiempo sugerido:** 30 minutos  
**Valor:** 50 puntos

Una empresa de servicios públicos registró el consumo diario de agua de **10 sectores** de la ciudad. La información se expresa en metros cúbicos enteros y debe almacenarse en un arreglo unidimensional.

Construya un programa que:

1. Cree un arreglo de 10 posiciones.
2. Solicite el consumo de cada sector y valide que no sea negativo. Si el dato es inválido, debe solicitarlo nuevamente.
3. Calcule y muestre:
   - El consumo total de los 10 sectores.
   - El promedio de consumo.
   - El número del sector con el mayor consumo.
   - Cuántos sectores tuvieron un consumo superior al promedio.
   - La racha más larga de sectores consecutivos cuyo consumo fue superior al promedio.
4. Muestre el listado final con el número de cada sector y su consumo registrado.

## Aclaraciones

- Los sectores se numeran del 1 al 10, aunque las posiciones del arreglo comiencen en 0.
- Una racha es una secuencia de posiciones consecutivas. Por ejemplo, si los sectores 3, 4 y 5 superan el promedio, existe una racha de longitud 3.
- Para determinar cuáles consumos superan el promedio será necesario recorrer nuevamente el arreglo después de calcularlo.

## Criterios de evaluación

| Criterio | Puntaje |
|---|---:|
| Lectura, almacenamiento y validación de los 10 consumos | 10 |
| Cálculo correcto del total y del promedio | 10 |
| Identificación del sector con mayor consumo | 10 |
| Conteo de sectores por encima del promedio | 8 |
| Cálculo correcto de la racha más larga | 8 |
| Claridad de la salida y organización del código | 4 |

---

# Ejercicio 2 – Control de producción semanal

**Tiempo sugerido:** 30 minutos  
**Valor:** 50 puntos

Una pequeña fábrica cuenta con **4 máquinas** y registra durante **5 días** la cantidad de piezas producidas por cada una. La información debe almacenarse en una matriz de 4 filas por 5 columnas:

- Cada fila representa una máquina.
- Cada columna representa un día de trabajo.

Construya un programa que:

1. Cree una matriz de `4 x 5`.
2. Solicite la producción de cada máquina durante cada día y valide que ningún valor sea negativo.
3. Calcule y muestre:
   - El total producido por cada máquina.
   - El total producido en cada día, sumando las cuatro máquinas.
   - La máquina con la mayor producción acumulada.
   - El día con la menor producción total.
   - Cuántos registros de la matriz fueron inferiores a 20 piezas.
4. Muestre la matriz completa, organizada por máquinas y días.

## Aclaraciones

- Las máquinas se numeran del 1 al 4 y los días del 1 al 5.
- Si dos máquinas tienen el mismo total máximo, se reporta la primera.
- Si dos días tienen el mismo total mínimo, se reporta el primero.
- No es necesario crear arreglos adicionales para resolver el ejercicio, aunque puede utilizarlos si lo considera conveniente.

## Criterios de evaluación

| Criterio | Puntaje |
|---|---:|
| Lectura, almacenamiento y validación de la matriz | 10 |
| Cálculo del total de cada máquina | 10 |
| Cálculo del total de cada día | 10 |
| Identificación de la máquina mayor y el día menor | 10 |
| Conteo de registros inferiores a 20 | 6 |
| Presentación de la matriz y organización del código | 4 |

---

## Entrega

Entregue los dos archivos `.java`, debidamente nombrados y capaces de compilar y ejecutarse sin errores.

**Antes de escribir código, identifique las entradas, el proceso y las salidas. El compilador detecta errores de sintaxis; la lógica todavía corre por cuenta del programador.**

Ejercicio 1

1.Tenemos que guardar los primero 10 valores del arreglo, donde podemos guardar varios datos de un mismo dato
2.luego le pedimos al usuario ingresar el consumo de cada sector, cuando llegue a 10 termina.
3.Usamos un while por si el usuario ingresa un numero se menor que 0, lo vuelva pedir.
4.calculamos el consumo total sumando los 10 consumos.
5.calculamos el promedio con total/cantidad de sectores y utilizamos un double por que tiene que ser en decimales.
6.buscamos el sector con mayor consumo
7.buscamos que sector tiene la racha mas larga

EJERCICIO 2

1.utilizamos una matriz por que el arreglo no es de una sola dimension.
2.utilizamos dos for, uno para que recorra las maquinas y otro para los dias
3.despues validamos que no hayan negativos con while,
4.ahora sumamos cada fila para poder optener el total de cada maquina, despues el for para que pase por siguiente maquina.
5.comparamos todos los totales para saber cual es la maquina con mayor produccion.
6.ahora recorremos las columnas y sumamos 
7.buscamos el dia con menor produccion comparando los totales de los 5 dias
8.finalmente tenemos que mirar los datos de la matriz para los menores de 20 con dos for.