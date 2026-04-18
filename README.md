# Java API Test Framework 🧪

A scalable REST API test automation framework
built with Java, RestAssured, and TestNG.

## 🛠️ Tech Stack
- Java 25+
- RestAssured 5.3
- TestNG 7.7
- Maven

## 📁 Structure
src/
└── test/
    └── java/
        └── api/
            ├── BaseTest.java       ← base config
            ├── UserApiTest.java    ← GET tests
            └── PostApiTest.java    ← POST/PUT/DELETE tests

## ✅ Test Coverage
- GET /users — status, body, nested fields, list size
- POST /posts — create with body validation
- PUT /posts — update validation
- DELETE /posts — delete validation

## ⚙️ How to Run
1. Clone: `git clone [https://github.com/vijaykrishna3301/java-api-test-framework.git]`
2. Open in IntelliJ
3. Right click any test file → Run
   OR
4. Maven panel → Lifecycle → test

## 🔜 Roadmap
- [ ] HTML report generation
- [ ] GitHub Actions CI/CD
- [ ] Auth header handling