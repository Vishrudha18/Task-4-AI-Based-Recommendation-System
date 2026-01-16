## 💬 Task 4 – AI Based Recommendation System

Company : Codtech IT Solutions Pvt Limited

Name : Vishrudha.N

Intern ID : CTIS1057

Domain : Java Programming

Duration : 4 Weeks

Mentor : Neela Santhosh

### Java | Apache Mahout | Collaborative Filtering

## 📌 Task Overview

This project implements an AI-based Recommendation System using Java and Apache Mahout.
The system recommends products or content to users based on user preferences and past ratings using User-Based Collaborative Filtering.

It analyzes rating patterns, identifies similar users, and suggests new items that a user is likely to prefer.

---

## 🎯 Objectives

- Build a recommendation engine using Java
- Use Apache Mahout for collaborative filtering
- Suggest items dynamically based on user input
- Demonstrate AI-driven decision-making using historical data

---

## 🛠️ Technology Stack

Programming Language: Java

Libraries: Apache Mahout, SLF4J, Google Guava, Apache Commons Math

IDE: VS Code

Data Source: CSV file

--- 

## 📂 Project Structure

Codtech IT Internship TASK 4/
│
├── src/
│   └── RecommendationSystem.java
│
├── data/
│   └── ratings.csv
│
├── lib/
│   ├── mahout-core-0.9.jar
│   ├── mahout-math-0.9.jar
│   ├── slf4j-api-1.7.36.jar
│   ├── slf4j-simple-1.7.36.jar
│   ├── guava-20.0.jar
│   └── commons-math3-3.2.jar
│
├── bin/
│   └── RecommendationSystem.class
│
└── README.md

---

## 📊 Sample Dataset (ratings.csv)

UserID,ItemID,Rating
1,101,5
1,102,3
1,103,2
1,105,4
2,101,4
2,102,5
2,104,3
2,105,2
3,101,2
3,103,5
3,104,4
3,106,3
4,102,4
4,103,3
4,104,5
4,106,4
5,101,3
5,102,4
5,105,5
5,106,2

---

## ⚙️ How It Works

- Reads user-item ratings from a CSV file
- Builds a DataModel using Mahout
- Computes similarity between users using Pearson Correlation
- Identifies nearest neighbor users
- Predicts and recommends unrated items
- Accepts User ID and recommendation count as runtime input

---

## ▶ How to Compile and Run

### 🔹 Step 1: Navigate to project folder
cd Codtech\ IT\ Internship\ TASK\ 4

### 🔹 Step 2: Compile
javac -cp "lib/*" -d bin src/RecommendationSystem.java

### 🔹 Step 3: Run
java -cp "lib/*;bin" RecommendationSystem

---

## 🧪 Sample Execution
Enter User ID: 1
Enter number of recommendations: 3

Recommended items for User 1:
Item ID: 104 | Score: 3.5

---

## Output

<img width="1919" height="1015" alt="Image" src="https://github.com/user-attachments/assets/c068d530-deba-4ad3-a331-d6bc78af4a12" />

---

## 🧠 Key Concepts Used

- Collaborative Filtering
- User Similarity (Pearson Correlation)
- Nearest Neighbor Algorithm
- Machine Learning–based prediction
- Data-driven recommendation logic

---

## 🚀 Applications

- E-commerce product recommendations
- Movie and music suggestion systems
- Online learning platforms
- Content personalization engines

---

## 🔮 Future Enhancements

- Item-Based Recommendation
- Database integration (MySQL / MongoDB)
- Web interface using Spring Boot
- Real-time recommendation updates
- Larger datasets for improved accuracy

---

## ✅ Conclusion

This project successfully demonstrates an AI-based recommendation system using Java and Apache Mahout.
It dynamically predicts user preferences and generates meaningful recommendations based on collaborative filtering techniques.
