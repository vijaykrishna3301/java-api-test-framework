# Java API Test Framework 🧪

A lightweight, scalable REST API test automation framework
built with Java, RestAssured, and TestNG.

## 🛠️ Tech Stack
- Java 11+
- RestAssured 5.3
- TestNG 7.7
- Maven

## ⚙️ How to Run
1. Clone: `git clone [url]`
2. Run: `mvn test`

## 📁 Structure
src/
└── test/
└── java/
└── api/
└── UserApiTest.java

## ✅ Test Coverage
- GET /users — status 200 check
- GET /users — response body validation

## 🔜 Roadmap
- [ ] Add POST/PUT/DELETE tests
- [ ] HTML report generation
- [ ] CI/CD with GitHub Actions