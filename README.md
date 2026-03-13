# Spring Using Java Based Configuration

This repository contains multiple examples demonstrating **Spring Framework concepts using Java-Based Configuration** instead of XML configuration.

The goal of this project is to understand how Spring manages **beans, dependency injection, and application configuration using Java classes and annotations.**

---

## 🚀 Technologies Used

- Java
- Spring Framework
- Maven
- IntelliJ IDEA

---

## 📂 Project Structure

Each folder in this repository represents a **separate Spring concept**.

```
SpringUsingJavaBasedConfig
│
├── SpringusingJavaConfig
│   └── Basic Java-based configuration example
│
├── SpringBeanNameinJavaConfig
│   └── Understanding default and custom bean names
│
├── SpringAutowireUsingJavaConfig
│   └── Demonstrates how @Autowired works
│
├── SpringAutowireAnnotationUsingjavaconfig
│   └── Dependency injection using @Autowired annotation
│
├── SpringQualifierandPrimaryAnnotations
│   └── Resolving multiple beans using @Qualifier and @Primary
│
├── SpringComponentStereotypeAnnotation
│   └── Using @Component and component scanning
│
└── SpringScopeUsingJavaConfig
    └── Demonstrates bean scopes like prototype
```

---

## 📚 Concepts Covered

This repository demonstrates the following **Spring Core concepts**:

- Java-Based Configuration
- `@Configuration`
- `@Bean`
- `@Component`
- `@ComponentScan`
- `@Autowired`
- `@Qualifier`
- `@Primary`
- `@Scope`

---

## ⚙️ Example Java Configuration

```java
@Configuration
@ComponentScan("com.aryan")
public class JavaConfig {

    @Bean
    public Alien alien() {
        Alien obj = new Alien();
        obj.setAge(24);
        return obj;
    }
}
```

---

## 🎯 Purpose of This Repository

This project was created while learning **Spring Core concepts using Java Configuration** to better understand how Spring handles **Dependency Injection and Bean Lifecycle** without XML configuration.

---

## 👨‍💻 Author

**Aryan Sohani**

If you found this helpful, feel free to ⭐ the repository.
