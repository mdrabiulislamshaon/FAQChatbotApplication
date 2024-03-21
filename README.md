
# Simple FAQ Chatbot Application

This Java application implements a simple FAQ chatbot with a graphical user interface using Swing.

## Description

The chatbot provides predefined responses based on user input. Key features include:

- **Graphical User Interface (GUI)**:
  - The GUI consists of a panel containing text areas for dialog and user input, with scrolling functionality provided by a JScrollPane.

- **Chat Bot Responses**:
  - Responses are stored in a 2D array named `chatBot`, where each row contains pairs of user queries and corresponding bot responses.

- **Event Handling**:
  - Keyboard events are used to handle user input via the `KeyListener` interface. 

- **Response Generation**:
  - User input is compared with predefined queries in the `chatBot` array to generate responses. 

- **Utility Methods**:
  - Utility methods are provided for adding text to the dialog and checking if a string is present in an array.

## Usage

1. Clone the repository.
2. Compile and run the `SimpleFAQChatbotApplication.java` file.
3. Enter questions in the input field and press Enter to get responses from the chatbot.

## Improvements

- Modularize the code into smaller methods for better readability and maintenance.
- Implement error handling for unexpected user input or system errors.
- Explore natural language processing techniques for smarter responses.
- Enhance the graphical interface for a more user-friendly experience.

## Contributors

- Author: Md Rabiul Islam Shaon
- Email: mdrabiulislamshaonn@gmail.com

## License

This project is licensed under the [MIT License](LICENSE).