# Pun Prompt

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.1-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Java](https://img.shields.io/badge/Java-17-orange.svg)](https://openjdk.org/)
[![Maven](https://img.shields.io/badge/Maven-3.9.9-blue.svg)](https://maven.apache.org/)
[![GraalVM](https://img.shields.io/badge/GraalVM-Native-red.svg)](https://www.graalvm.org/)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

A fun terminal-based application that brightens your day with random jokes! Built with Spring Boot and Spring Shell.
```
 /$$$$$$$                            /$$$$$$$                                               /$$    
| $$__  $$                          | $$__  $$                                             | $$    
| $$  \ $$ /$$   /$$ /$$$$$$$       | $$  \ $$ /$$$$$$   /$$$$$$  /$$$$$$/$$$$   /$$$$$$  /$$$$$$  
| $$$$$$$/| $$  | $$| $$__  $$      | $$$$$$$//$$__  $$ /$$__  $$| $$_  $$_  $$ /$$__  $$|_  $$_/  
| $$____/ | $$  | $$| $$  \ $$      | $$____/| $$  \__/| $$  \ $$| $$ \ $$ \ $$| $$  \ $$  | $$    
| $$      | $$  | $$| $$  | $$      | $$     | $$      | $$  | $$| $$ | $$ | $$| $$  | $$  | $$ /$$
| $$      |  $$$$$$/| $$  | $$      | $$     | $$      |  $$$$$$/| $$ | $$ | $$| $$$$$$$/  |  $$$$/
|__/       \______/ |__/  |__/      |__/     |__/       \______/ |__/ |__/ |__/| $$____/    \___/  
                                                                               | $$                
                                                                               | $$                
                                                                               |__/                
```

## 📹 Demo

https://github.com/VidyasagarYadav499/pun-prompt/raw/main/demo/pun-prompt-test.mp4

## ✨ Features

- Generates random jokes on demand
- Simple and intuitive command-line interface
- Native executable support via GraalVM
- Lightweight and easy to use

## 🛠️ Prerequisites

- Java 17 or higher
- Maven
- GraalVM (for native image generation)

## 🔧 Tech Stack

- **Spring Boot**: Powers the application core, auto configs and dependency management
- **Spring Shell**: Provides the interactive command-line interface
- **GraalVM**: Enables native image (e.g., .exe files on Windows OS) compilation for faster startup and lower memory footprint

## 🏗️ Build & Run

### 1. Clone the repository
```
git clone https://github.com/VidyasagarYadav499/pun-prompt.git
cd pun-prompt
```

### 2. Build and Run Options

#### JVM Version
Run with Maven:
```
mvn spring-boot:run
```
Or with Maven wrapper:
```
./mvnw spring-boot:run
```

#### Native Version (requires GraalVM)
Build:
```
mvn -Pnative native:compile
```
Or with Maven wrapper:
```
./mvnw -Pnative native:compile
```

Run:
```
./target/pun-prompt.exe
```

### Available Commands
Once the shell starts, you can use these commands and more:
- `joke` - Display a random joke
- `help` - Show all available commands
- `exit` - Exit the application

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

1. Fork the project
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🙏 Acknowledgments

- Built with [Spring Boot](https://spring.io/projects/spring-boot) and [Spring Shell](https://spring.io/projects/spring-shell)
- Native image support by [GraalVM](https://www.graalvm.org/)