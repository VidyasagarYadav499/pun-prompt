# pun-prompt

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

## 🏗️ Build

1. Clone the repository:
```
git clone https://github.com/VidyasagarYadav499/pun-prompt.git
cd pun-prompt
```

2. Build the project (JVM version):
```
mvn clean install
```
Alternatively :
if you do not have maven installed on your system, you can use the maven wrapper (mvnw) provided with the project itself.
```
./mvnw clean install
```
3. Build native image (requires GraalVM):
```
mvn -Pnative native:compile
```
Alternatively :
```
./mvnw -Pnative native:compile
```

## 🚀 Run

You can run the application in two ways:

### JVM Mode (using the generated jar file)
```
java -jar target/pun-prompt.jar
```

### Native Mode (using the executable file)
```
./target/pun-prompt.exe
```

Once the shell starts, you can use the following commands and more:
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