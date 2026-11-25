LABORATORIO 5 - POLIMORFISMO EN JAVA

PROYECTO: PolimorfismoLab

ESTRUCTURA

PolimorfismoLab/
|-- src/
|   |-- modelo/
|   |   |-- Animal.java
|   |   |-- Perro.java
|   |   |-- Gato.java
|   |   |-- Figura.java
|   |   |-- Circulo.java
|   |   |-- Rectangulo.java
|   |-- main/
|       |-- Main.java
|-- PolimorfismoLab.code-workspace
|-- ejecutar.bat
|-- README.txt

CONTENIDO RESUELTO

PARTE 2: LABORATORIO GUIADO
- Animal es la clase base.
- Perro y Gato heredan de Animal mediante extends.
- Perro y Gato sobrescriben hacerSonido() utilizando @Override.
- Main crea referencias de tipo Animal que apuntan a objetos Animal, Perro y Gato.

PARTE 3: DESAFIO
- Figura es una clase abstracta.
- calcularArea() es un método abstracto.
- Circulo y Rectangulo extienden Figura y sobrescriben calcularArea().
- Main crea un arreglo Figura[] con objetos de ambas clases derivadas.
- El ciclo recorre el arreglo y calcula cada área mediante la referencia de tipo Figura.

DATOS UTILIZADOS EN EL DESAFIO
- Circulo: radio 3.0.
- Rectangulo: base 4.0 y altura 5.0.
- Circulo: radio 2.5.
- Rectangulo: base 6.0 y altura 3.0.

Estos valores son ejemplos de prueba porque la guía no proporciona medidas específicas.

COMO ABRIR EN VISUAL STUDIO CODE
1. Extrae la carpeta PolimorfismoLab.
2. Abre el archivo PolimorfismoLab.code-workspace con Visual Studio Code.
3. Comprueba que esté instalada la extension Extension Pack for Java.
4. Abre src/main/Main.java y presiona Run.

COMO EJECUTAR EN WINDOWS
1. Abre la carpeta PolimorfismoLab.
2. Haz doble clic en ejecutar.bat.

Tambien puedes abrir una terminal en la carpeta del proyecto y ejecutar:

mkdir out
javac -encoding UTF-8 -d out src\modelo\Animal.java src\modelo\Perro.java src\modelo\Gato.java src\modelo\Figura.java src\modelo\Circulo.java src\modelo\Rectangulo.java src\main\Main.java
java -cp out main.Main

El codigo utiliza sintaxis compatible con Java 8 o versiones posteriores.

RESULTADO ESPERADO (LOS DECIMALES PUEDEN VARIAR SEGUN LA CONFIGURACION REGIONAL)

=== PARTE 2: USO DEL POLIMORFISMO CON ANIMALES ===
El animal hace un sonido.
El perro ladra: ¡Guau!
El gato maúlla: ¡Miau!

=== PARTE 3: DESAFIO DE FIGURAS ===
Area de la figura 1: 28.27
Area de la figura 2: 20.00
Area de la figura 3: 19.63
Area de la figura 4: 18.00
