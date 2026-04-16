
<img width="1210" height="740" alt="image" src="https://github.com/user-attachments/assets/bd4bba7e-9058-4030-8dcb-8d9eec618567" />









# 🧪 Password Validator Testing

![Java](https://img.shields.io/badge/Java-21-blue)
![Maven](https://img.shields.io/badge/Maven-Project-red)
![JUnit](https://img.shields.io/badge/Testing-JUnit5-green)

---

## 📌 Descripción

Proyecto en **Java 21 + Maven** que implementa un sistema de validación de contraseñas y pruebas unitarias con **JUnit 5**.

Permite validar contraseñas según reglas de seguridad y comprobar su funcionamiento mediante tests automatizados.

---

## 🚀 Objetivo

Aplicar lógica de validación en Java y pruebas unitarias para asegurar el correcto funcionamiento del sistema.

---

## 🧱 Reglas del sistema

Una contraseña es válida si cumple con:

- ❌ No ser `null`
- 🔢 Tener al menos 8 caracteres
- 🔢 Contener al menos un número
- 🔠 Contener al menos una letra mayúscula

---

## 🧠 Lógica del sistema (PasswordValidator)

- validarNull() → control de seguridad (Arantxa Fischer)
- tieneLongitudMinima() → (Natalia Medel)
- contieneNumero() → (Cristian Diaz)
- contieneMayuscula() → (Sabrina Jeria)
- esPasswordValida() → combina todas las reglas (Cristopher Contreras)

---

## 🧪 Testing (JUnit 5)

- Tests de longitud → (Arantxa Fischer)
- Tests de números → (Natalia Medel)
- Tests de mayúsculas → (Cristian Diaz)
- Tests de validación completa → (Sabrina Jeria)
- Test de null → (Cristopher Contreras)

---

## 🔧 Correcciones y soporte

- Manuel Labrados → debugging y corrección de errores
- Diego Peña → soporte en pruebas y validaciones

---

## 📁 Estructura del proyecto

<img width="291" height="211" alt="image" src="https://github.com/user-attachments/assets/51fb71d2-b515-422c-b3e8-4efcd2a6a3cc" />


## 🖼️ Evidencia de ejecución del proyecto

A continuación se muestra el resultado al ejecutar los tests con Maven.

Esto confirma que toda la lógica del `PasswordValidator` y sus pruebas unitarias funcionan correctamente.

---

### ✅ Resultado esperado

✔ Todos los tests ejecutados correctamente  
✔ Sin fallos ni errores  
✔ BUILD SUCCESS en Maven  

---

### 📸 Captura de ejecución

<img width="926" height="236" alt="image" src="https://github.com/user-attachments/assets/7bb8d0c2-29dd-40c6-9acf-cd0949f264a9" />


---

### 🧪 Detalle del resultado

- Tests run: 9  
- Failures: 0  
- Errors: 0  
- Status: SUCCESS  
