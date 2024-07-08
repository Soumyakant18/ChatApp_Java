# Chat Application

This Chat Application is built using Java Spring Boot for the backend and JavaScript, HTML, and CSS for the frontend. It supports real-time messaging between users using WebSocket.

## Features
- Real-time messaging with WebSockets
- User authentication and authorization
- Simple and intuitive user interface
- Message history and persistence
- Easy to set up and customize

## Demo

![Screenshot 2024-07-08 085517](https://github.com/Soumyakant18/ChatApp_Java/assets/134955001/1c62e2eb-f8dc-4432-a8ce-5db8f79df31b)

![Screenshot 2024-07-08 085405](https://github.com/Soumyakant18/ChatApp_Java/assets/134955001/ee05f1f7-569a-49f6-a298-200b01af39cf)




## Requirements
- Java 17 or higher
- Maven 3.6.0 or higher
- MySQL or any other relational database

## Installation
To install and run the Chat Application locally, follow these steps:

1. Clone the repository:
    ```bash
      git clone https://github.com/Soumyakant18/ChatApp_Java.git
    ```



2. Configure the Database:
    Update the `application.properties` file located in `src/main/resources/` with your database configuration:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/chatapp
    spring.datasource.username=root
    spring.datasource.password=yourpassword
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
    ```

3. Build the application:
    ```bash
    mvn clean install
    ```

4. Run the application:
    ```bash
    mvn spring-boot:run
    ```

The application will be accessible at `http://localhost:7070`.
## Contributing
We welcome contributions to the ChatApplication  To contribute, follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes and commit them (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Open a Pull Request.

Please ensure your code adheres to our coding standards and includes appropriate tests.


## Contact
If you have any questions or feedback, feel free to contact us:

- Email: soumykantarout@gmail.com

