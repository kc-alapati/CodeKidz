# CodeKidz - Learning Management System

## Project Description
CodeKidz is a cutting-edge Learning Management System (LMS) developed to facilitate effective online education and training. It caters to two types of users: Trainers and Students. Trainers can create and manage courses, lessons, and topics, while Students can browse and purchase courses, access their purchased content, and engage with peers through comments and queries.

## Abstract
CodeKidz aims to bridge the gap between trainers and students in the digital learning era by providing a user-friendly interface and efficient functionalities. Trainers can create and organize courses, and students can easily browse, purchase, and access their courses. The payment gateway integration using Razorpay ensures secure and seamless transactions. The platform also includes a comments section to foster interactive learning and knowledge sharing among students.

## Technologies Used
- **Front-end:** HTML, CSS, JavaScript
- **Back-end:** Java Spring, Spring Boot
- **Database:** MySQL

## Project Workflow
```plaintext
[User] -> [Login/Register] -> [Home Page]
                                   |
                     |---------------------------------|
                     |                                 |
             [Instructor Home Page]           [Learner Home Page]
          |         |         |                 |              |
          |         |         |                 |              |
        [Create, Add, View Lessons]       [Purchase Courses] [My Courses]
                                                 |
                                            [Lesson List]

```
## Features:

***Trainer Module:***

- Registration and Login: Trainers can register and log in using unique credentials.
- Course Management: Create new courses, add lessons, and view existing courses.
- Lesson Management: Add lessons to courses and view linked lessons.

***Student Module:***

- Registration and Login: Students can register and log in using unique credentials.
- Course Browsing: Browse available courses and view course details.
- Course Purchase: Securely purchase courses using the Razorpay payment gateway.
- Access Purchased Courses: View purchased courses and access lessons.
- Comments Section: Post comments and queries related to lessons and engage with peers.

**Key Responsibilities**

- Developed robust and scalable backend code using Java Spring and Spring Boot frameworks.
- Implemented secure authentication and authorization mechanisms to safeguard user data.
- Integrated front-end components with the back end to ensure seamless user interactions.
- Conducted rigorous testing to identify and resolve performance bottlenecks or bugs.
- Collaborated with database administrators to optimize database queries and enhance system responsiveness.

**Key Achievements**

- Successfully delivered CodeKidz within the stipulated timeframe, meeting all project milestones.
- Received positive feedback from team members for the efficiency and quality of the backend implementation.
- Implemented additional features, such as real-time progress tracking and user engagement analytics, to enhance the platform's functionality.

## Getting Started
To run this project locally, follow these steps:

**Prerequisites**

- JDK 8 or higher

- MySQL Server

- Maven

- A web browser

**Installation**

#### 1. Clone the repository:

*bash:* 
```
git clone https://github.com/yourusername/CodeKidz.git
cd CodeKidz
```

#### 2. Set up the database:

- Create a new database in MySQL.

Import the SQL schema located in the ***database*** directory.

#### 3. Configure the application:

- Modify the `application.properties` file in the `src/main/resources` directory to connect to your MySQL database.

#### 4. Build and run the application:

*bash:* 
```
mvn clean install
mvn spring-boot:run
```

#### 5. Open your browser and go to http://localhost:9090 to access the application.
 

### Instructions:
- Remember to replace `yourusername` in the Git clone URL with your actual GitHub username.
- You can adjust any sections as needed to fit your preferences!

