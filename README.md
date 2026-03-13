# Spring Using Java Based Configuration

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring](https://img.shields.io/badge/Spring_Framework-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=ApacheMaven&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&logo=intellijidea&logoColor=white)

A collection of small projects demonstrating **Spring Framework concepts using Java-Based Configuration instead of XML**.

This repository contains multiple examples showing how core Spring features like **Dependency Injection, Bean Configuration, Autowiring, Qualifiers, Scope, and Stereotype Annotations** work in practice.

---

# 📂 Project Structure

```
SpringUsingJavaBasedConfig
│
├── SpringusingJavaConfig
│   └── Basic Java configuration example
│
├── SpringBeanNameinJavaConfig
│   └── Understanding default and custom bean names
│
├── SpringAutowireUsingJavaConfig
│   └── Demonstrates how @Autowired works
│
├── SpringAutowireAnnotationUsingjavaconfig
│   └── Dependency injection using @Autowired and @Qualifier
│
├── SpringComponentStereotypeAnnotation
│   └── Using @Component and @ComponentScan
│
├── SpringPrimaryAnnotation
│   └── Demonstrates the use of @Primary annotation
│
├── SpringQualifierandPrimaryAnnotations
│   └── Resolving multiple beans using @Qualifier and @Primary
│
├── SpringScopeUsingJavaConfig
│   └── Demonstrates bean scopes like prototype
│
├── SpringScopeandValueAnnotation
│   └── Demonstrates @Scope and @Value annotation usage
```

---

# 📚 Concepts Covered

- Java-Based Configuration  
- `@Configuration`
- `@Bean`
- `@Component`
- `@ComponentScan`
- `@Autowired`
- `@Qualifier`
- `@Primary`
- `@Scope`
- `@Value`

---

# ⚙️ Example Java Configuration

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

# 🎯 Purpose of This Repository

This project was created while learning **Spring Core concepts using Java Configuration** to better understand how Spring handles **Dependency Injection and Bean Lifecycle** without XML configuration.

---

# 👨‍💻 Author

**Aryan Sohani**

If you found this helpful, feel free to ⭐ star the repository.
