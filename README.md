Shared Navigation with Decompose in Kotlin Multiplatform Project (KMP)

This project demonstrates a simple and efficient implementation of navigation using Decompose in a Kotlin Multiplatform Project (KMP). It supports both Android and iOS platforms, ensuring smooth state management and data handling between screens.


Key Features
Navigation Between Screens:


Users can type text in a TextField on Screen A and navigate to Screen B by clicking a button.
On Screen B, users can press the back button to return to Screen A.

State Preservation:
The typed text remains intact when navigating back to Screen A.
Even if the device orientation changes (e.g., portrait to landscape), the data persists, avoiding any data loss.

Decompose Integration:
Utilizes the Decompose library for managing navigation and state.
Provides a modular approach for UI and business logic separation.

KMP Advantage:
The same codebase is shared across Android and iOS platforms.
Ensures consistency and reduces development time.
Implementation Details

Navigation:
The navigation logic is built using Decompose’s component-based architecture. Each screen is treated as a separate component, and navigation between components is handled seamlessly with state preservation.

State Management:
State preservation is implemented using Decompose’s state-keeper. This ensures that the app maintains the current UI state even during configuration changes, such as screen rotation.


Data Flow:
Screen A: Allows the user to type text in a TextField and navigate to Screen B by clicking a button.
Screen B: Displays the passed data and provides a back button to return to Screen A without losing the typed data.

Orientation Handling:
The app ensures that no data is lost when the screen orientation changes. This is achieved by leveraging the state management capabilities of the Decompose library.
