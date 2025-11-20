# Basic Calculator (Focus: Controls, Event Handling, Simple Logic)

![Alt Text](./demo.gif)

***

## Lab Test: Simple JavaFX Calculator

### Time Allotment: 60 minutes (code in this repo was created in ~30 mins. not pretty but feature complete)

### Goal: Create a simple graphical calculator application using JavaFX.

### Requirements:
1. **GUI Layout:** Use a layout pane (like `GridPane` or nested `VBox`/`HBox`) to arrange the
   components.
2. **Controls:** Include two `TextField` elements for numerical input (let's call them "Number
   1" and "Number 2").
3. **Operations:** Include four `Button` controls labeled:
   - "+" (Add)
   - "-" (Subtract)
   - "*" (Multiply)
   - "/" (Divide)
4. **Output:** Include a non-editable `TextField` or a `Label` to display the **Result**.
5. **Event Handling:** Implement an `EventHandler` for each of the four buttons. When a button is clicked:
   - Read the text from "Number 1" and "Number 2" and convert them to numeric types (e.g., `double`). Handle potential `NumberFormatException` by displaying an error message in the result field if the input is not a number.
   - Perform the corresponding arithmetic operation.
   - Display the final result in the output field.
### Key Concepts Tested
 - **Application Structure:** Extending `Application` and implementing `start(Stage)`.
 - **Controls:** `Button`, `TextField`, `Label`.
 - **Layout:** Use of a basic layout container (`GridPane` or `VBox`/`HBox`).
 - **Event Handling:** Using `.setOnAction()` with a lambda expression.
 - **Data Conversion & Error Handling:** `String` to `double` conversion and handling invalid input.