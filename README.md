# Basic Calculator (Focus: Controls, Event Handling, Simple Logic)

![Alt Text](./demo.gif)

[This](https://github.com/caiocotts/java-labtest-sample-solution/blob/308169159768cebf9c289210e89748a050b3147a/src/main/java/com/caiocotts/labtestpractice/HelloApplication.java) is the original solution I came up with within the allotted 60 minutes (~30 mins total). [This](https://github.com/caiocotts/java-labtest-sample-solution/blob/8f6e031678c6d5fbbf7eec12f2423caf05af0fce/src/main/java/com/caiocotts/labtestpractice/HelloApplication.java) version is a revision fixing an error, where inputs were being parsed to integers instead of doubles (this would have cost me real grades during the exam). Any code you see on the repo now is stuff I changed after to make the code cleaner to read and less horrible.

***

## Lab Test: Simple JavaFX Calculator

### Time Allotment: 60 minutes

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