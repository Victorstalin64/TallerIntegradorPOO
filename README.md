Nombres: Victor Calapaqui, Maria Fernanda Rodriguez
Curso/Paralelo: Programacion Orientada a Objetos - GR1 

Ejercicio 1: Crear una clase en Java que represente a un solicitante de subsidio de gasolina y determine si cumple con los requisitos establecidos por el Gobierno del Ecuador. 

Objetivo del ejercicio: 
Aplicar conceptos clave de Programación Orientada a Objetos (POO) en Java, incluyendo: 
- Atributos privados,  
- Uso de get y set 
- Encapsulamiento 
- Constructores  
- Validación de condiciones 
- Lógica condicional estructurada 

Requisitos para obtener el subsidio 
- Tener ingresos mensuales menores o iguales a $1,200. 
- No poseer más de un vehículo registrado. 
- Tener residencia en Ecuador (no aplica para residentes en el extranjero).

Ejercicio 2: Sistema Bancario con Herencia, Encapsulamiento y Polimorfismo 

Enunciado 
Un banco necesita desarrollar un sistema orientado a objetos para administrar distintos tipos de cuentas bancarias y calcular automáticamente los intereses mensuales generados. 
El banco maneja tres tipos de cuentas: 
🔹 Cuenta de Ahorros: Genera un interés del 3% anual, calculado mensualmente sobre el saldo disponible. 
🔹 Cuenta Corriente: Permite realizar sobregiros de hasta 500 USD sin generar intereses. 
🔹 Cuenta de Inversión: Genera intereses con una tasa variable según el saldo: 
  - menor a 1000 → 4% anual  
  -entre 1000 y 5000 → 5% anual  
  -mayor a 5000 → 6% anual  

Requerimientos del sistema 
Diseñar una solución aplicando Programación Orientada a Objetos que permita: 
Encapsulamiento 
Proteger los datos sensibles de cada cuenta, como: 
  -número de cuenta  
  -titular  
  -saldo  
Estos atributos deben ser privados y gestionarse mediante métodos controlados. 
Implementar validaciones para: 
  -no permitir depósitos negativos  
  -no permitir retiros inválidos  
  -controlar el sobregiro permitido  
  -evitar asignaciones directas del saldo 
