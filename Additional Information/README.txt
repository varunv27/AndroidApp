Android App to help Archelon Society in survey implementing morning surveys

The App has 3 screens implemented via fragments and their associated view model

First Screen - Login Screen which takes credentials from the user and authenticates it against the REST API provided. A REST request is built using retrorfit + moshi + okhttp client and sent via a coroutine. On successful authentication the return token is stored and passed onto the next fragment (options fragment). Credentials turn red if authentication is rejected.

Second Screen - Options Screen - On successful authentication the user is brought to this screen. The user is allowed to choose type of task. However, only morning survey is implemented but functions are provided for other tasks. Toasts displaying "Not Implemented" are added to the other tasks.

Third Screen - Morning Survey - All input fields available on the Archelon API documentation have been implemented into this screen as User input. However, the location is recorded via a fused location provider when the submit is pressed. All this functionality is handled in the view model (not in the fragment). A scroll view is implemented in the layout tag to accommodate all fields. An instance of a database is built/retrieved when the view model is created. The DB is instantiated via a coroutine and not on the main thread. Hence, it is not a blocking call. When the submit button is pressed, the collected user data for the morning survey is loaded into the database. A back button is implemented on this screen to go back to the Options screen. Navigation has been defined. The text fields are forced to accept only valid data with respect to the field (eg. When a user tries to select "Distance to Sea" he will only see a numeric keypad and can only enter numbers).

A unit test has been implemented to instantiate the database and create a morning survey, load it into the DB, retrieve it and check a value. 

Emulator Used: PIXEL 3a API 28

Local persistent storage used 








