# IRCTC Backend (Java, Maven, JSON Database)

This is a simple **IRCTC Backend** project built using **Java (without Spring Boot)** and **Maven**. It provides functionalities to **add trains, view trains, book tickets, and view bookings** using a **local JSON file as the database**.

---

## Features 🚀
- **Add Trains** 🛤️
- **View Available Trains** 🚆
- **Book Tickets** 🎟️
- **View Bookings** 📄
- **JSON File-based Storage (No SQL required)** 💾

---

## Project Structure 📂
```
IRCTC-Backend/
│── src/
│   ├── com/irctc/
│   │   ├── dao/
│   │   │   ├── TrainDAO.java
│   │   │   ├── BookingDAO.java
│   │   ├── model/
│   │   │   ├── Train.java
│   │   │   ├── Booking.java
│   │   ├── service/
│   │   │   ├── TrainService.java
│   │   ├── IrctcBackendApplication.java (Main class)
│── trains.json  (Train data storage)
│── bookings.json (Booking data storage)
│── pom.xml (Maven dependencies)
│── README.md (This file)
```

---

## Setup Instructions 🛠️
### **1️⃣ Clone the Repository**
```sh
git clone https://github.com/your-username/IRCTC-Backend.git
cd IRCTC-Backend
```

### **2️⃣ Open in IntelliJ IDEA**
- Open IntelliJ IDEA
- Click **File > Open** and select the project folder
- Wait for **Maven** to download dependencies

### **3️⃣ Run the Application**
- Open `IrctcBackendApplication.java`
- Click **Run** ▶️ or use:
```sh
mvn compile exec:java
```

---

## Usage Instructions 🖥️
### **When you run the program, you will see:**
```
IRCTC Backend
1. Add Train
2. View Trains
3. Book Ticket
4. View Bookings
5. Exit
Enter Choice:
```
### **Example Input & Output**
#### **1️⃣ Add Train**
```
Enter Choice: 1
Train Number: 101
Train Name: Rajdhani Express
Train Seats: 50
Train added successfully!
```

#### **2️⃣ View Trains**
```
Enter Choice: 2
Train{trainNumber=101, trainName='Rajdhani Express', availableSeats=50}
```

#### **3️⃣ Book Ticket**
```
Enter Choice: 3
Train Number: 101
Passenger Name: John Doe
Booking Successful!
```

#### **4️⃣ View Bookings**
```
Enter Choice: 4
Booking{trainNumber=101, passengerName='John Doe'}
```

---

## Dependencies 📦
- **Java 8+**
- **Maven**
- **Jackson (JSON Parsing Library)**

Maven will automatically install dependencies from `pom.xml`.

---

## Contributing 🤝
1. **Fork** the repository
2. **Create a new branch** (`git checkout -b feature-name`)
3. **Commit changes** (`git commit -m 'Add feature'`)
4. **Push** to your fork (`git push origin feature-name`)
5. **Create a Pull Request**

---

## License 📜
This project is open-source and available under the **MIT License**.

---

## Author ✨
**[Syed Ayaz Ali]**  
GitHub: [SyedAyaz105800](https://github.com/SyedAyaz105800)

