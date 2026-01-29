# FitMind AI 🧠🏃‍♀️

FitMind AI is a fitness-focused AI platform designed for **both kids and adults**.
It provides personalized fitness guidance, habit tracking, and age-appropriate recommendations using AI-driven insights.

## 🚀 Tech Stack
- Java 17
- Spring Boot
- Maven
- REST APIs
- (Planned) AI/ML Integration
- (Planned) AWS Deployment

## 🎯 Features (Planned)
- User onboarding (Kids / Adults)
- Fitness goal tracking
- AI-based activity recommendations
- Parent-friendly dashboards for kids
- Secure & scalable backend

## ✨ Current Features
- Create users (Kids / Adults) with validation rules
- Age-based business logic enforcement
- AI-based fitness recommendations using Strategy Pattern
- Clean REST APIs with proper error handling

## 🧠 Architecture Highlights
- Layered architecture (Controller, Service, Domain, DTO)
- Strategy Pattern for AI recommendations
- Global exception handling using @ControllerAdvice
- Thread-safe in-memory ID generation

## 📡 Sample API

POST /api/fitness/users

Request:
{
"name": "Aarav",
"age": 10,
"userType": "kid"
}

Response:
{
"id": 1,
"name": "Aarav",
"userType": "KID",
"recommendation": "Fun activities: jumping jacks, skipping rope, and outdoor play (30 mins)"
}


## 📦 Project Status
🚧 In active development (January 2026)

## 👩‍💻 Author
Madhu Dharmaraj
