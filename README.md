# framework-auto

## Tools and Libraries
- **Java**
- **Oracle JDK 23.0.1**
- **Junit 5**
- **Cucumber**: Gherkin test case
- **RestAssured**: API Testing
- **Selenium**: Web UI Testing
- **Gradle 8.11**: Build
- **Google Chrome**

## Struktur Proyek
- `src/test/java/api`: API Test Logic
- `src/test/java/web`: Web UI Test Logic

## Cara Menjalankan Test
- Jalankan semua tes API:
- masuk terminal ketik :
- ./gradlew testApi 
- ./gradlew testWeb

## NOTE
saya tidak menggunakan website dummy.io karena tidak dapat menemukan/membuat app-id
untuk digunakan dalam membuat framework menggunakan restassured
jadi saya ganti mengunakan website reqres.in untuk testing api seperti tutor di video menggunakan restassured
