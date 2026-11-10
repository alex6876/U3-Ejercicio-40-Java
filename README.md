Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Tasación de Inmuebles y Bienes Raíces (Herencia, Sobrescritura y Polimorfismo en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 🏠 Simulación de Sistema de Tasación de Inmuebles (Herencia y Polimorfismo en Java)

Este proyecto es una aplicación en Java que modela un sistema de valoración inmobiliaria, implementando una jerarquía de clases mediante herencia para administrar distintos tipos de propiedades (casas, departamentos y locales comerciales) con reglas especializadas para el cálculo de tasaciones basadas en superficies de patio, cantidad de plantas, altura de pisos, expensas, vidrieras a la calle y zonificación comercial. Pone en práctica conceptos fundamentales de la **Programación Orientada a Objetos (POO)** como la **generalización de atributos protegidos (`protected`)**, la utilización de constructores mediante `super`, la sobrescritura polimórfica de métodos (`@Override`), la evaluación de condiciones lógicas y el procesamiento agregado de valores en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase base general, sus respectivas subclases especializadas y un punto de ejecución:

* **`Inmueble`**: Clase base que centraliza los atributos y comportamientos comunes de cualquier propiedad raíz.
* **Atributos protegidos (`protected`)**: `direccion`, `superficieMetros2` y `precioBase`, permitiendo que las clases hijas accedan directamente a la información geográfica y financiera esencial.
* **Constructor**: Inicializa los datos comunes de la propiedad.
* **Métodos operativos**:
* `calcularTasacion()`: Método base que retorna simplemente el precio base del inmueble, diseñado para ser sobrescrito por las subclases.




* **`Casa`**: Extiende de `Inmueble` para modelar viviendas unifamiliares con terreno propio y múltiples niveles.
* **Atributos privados (`private`)**: `superficiePatio` y `cantidadPlantas`.
* **Constructor**: Invoca a `super(...)` para configurar los datos base y asigna las propiedades del patio y plantas.
* **Sobrescritura (`@Override`)**:
* `calcularTasacion()`: Calcula el valor integrando el precio base, la tasación del patio (por metro cuadrado) y un incremento porcentual acumulativo según la cantidad de plantas de la edificación.




* **`Departamento`**: Extiende de `Inmueble` para modelar unidades en altura sujetas a expensas y ubicación en pisos.
* **Atributos privados (`private`)**: `expensasMensuales` y `pisoUbicacion`.
* **Constructor**: Utiliza `super(...)` para inicializar los atributos heredados y configura las expensas y el piso de ubicación.
* **Sobrescritura (`@Override`)**:
* `calcularTasacion()`: Aplica un incremento al precio base basado en la altura del piso y sustrae una deducción proporcional calculada en función de las expensas anuales.




* **`LocalComercial`**: Extiende de `Inmueble` para modelar propiedades destinadas a la actividad económica y minorista.
* **Atributos privados (`private`)**: `vidrieraALaCalle` y `zonificacion`.
* **Constructor**: Utiliza `super(...)` para configurar los parámetros heredados y el perfil comercial del local.
* **Sobrescritura (`@Override`)**:
* `calcularTasacion()`: Aplica incrementos porcentuales dinámicos sobre el precio base si cuenta con vidriera a la calle y según el tipo de zonificación (comercial o mixta).




* **`Main`**: Punto de entrada del programa. Instancia una casa, un departamento y un local comercial con datos reales de prueba, invoca los métodos de tasación individuales para cada propiedad, calcula la tasación total acumulada de la cartera inmobiliaria e imprime los resultados detallados por consola.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Cálculo Polimórfico de Valoración:** Cada clase especializada implementa su propia fórmula matemática de tasación considerando factores muy diversos (como patios, expensas anuales o zonificación urbana).
2. **Reutilización Estructural con `super`:** Las subclases heredan de forma limpia los atributos geográficos y financieros de la superclase mediante el uso de constructores `super(...)`.
3. **Agregación Financiera en Memoria:** El sistema procesa de manera uniforme los distintos tipos de inmuebles para obtener tanto tasaciones individuales como un consolidado total del valor de los activos inmobiliarios.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
===== TASACION DE INMUEBLES =====
Casa: $56700000.0
Departamento: $35630000.0
Local Comercial: $90000000.0
--------------------------------
Tasacion total: $182330000.0

```

---

## 🚀 Conceptos de Programación Aplicados

* **Jerarquía Inmobiliaria:** Modelado de bienes raíces mediante una estructura limpia de herencia orientada a objetos.
* **Sobrescritura de Métodos (`@Override`):** Implementación dinámica de algoritmos de tasación especializados que extienden el comportamiento genérico de la superclase.
* **Diseño Modular:** Clara separación entre la lógica del dominio financiero-inmobiliario y la ejecución de casos de prueba simulados en el cliente (`Main`).
