# Проект автоматизации мобильных тестов для приложения Wikipedia

<p align="center">
  <a href="https://ru.wikipedia.org/">
    <img src="docs/images/wiki.png" width="500" height="300" alt="Wikipedia"/>
  </a>
</p>

> **Википедия** — общедоступная многоязычная универсальная интернет-энциклопедия со свободным контентом, реализованная на принципах вики.

---

## 📋 Содержание

- [Технологии и инструменты](#-технологии-и-инструменты)
- [Тестовые сценарии](#-тестовые-сценарии)
- [Архитектура и подход](#-архитектура-и-подход)
- [Сборка в Jenkins](#-сборка-в-jenkins)
- [Allure отчет](#allure)
- [Видеопример прохождения тестов BrowserStack](#movie)

---

## 🛠 Технологии и инструменты

| | Инструмент | Назначение |
|:---:|------------|------------|
| <img src="docs/images/Java.svg" width="40" height="40" alt="Java"/> | **Java** | Язык разработки |
| <img src="docs/images/Idea.svg" width="40" height="40" alt="IntelliJ IDEA"/> | **IntelliJ IDEA** | IDE |
| <img src="docs/images/Gradle.svg" width="40" height="40" alt="Gradle"/> | **Gradle** | Сборка проекта |
| <img src="docs/images/Junit5.svg" width="40" height="40" alt="JUnit 5"/> | **JUnit 5** | Тестовый фреймворк |
| <img src="docs/images/Appium.svg" width="40" height="40" alt="Appium"/> | **Appium** | Мобильная автоматизация |
| <img src="docs/images/Browserstack.svg" width="40" height="40" alt="BrowserStack"/> | **BrowserStack** | Облачная платформа для запуска |
| <img src="docs/images/Allure.svg" width="40" height="40" alt="Allure"/> | **Allure Report** | Отчётность |
| <img src="docs/images/Allure_TO.svg" width="40" height="40" alt="Allure TestOps"/> | **Allure TestOps** | Управление тестами |
| <img src="docs/images/Jenkins.svg" width="40" height="40" alt="Jenkins"/> | **Jenkins** | CI/CD |
| <img src="docs/images/Jira.svg" width="40" height="40" alt="Jira"/> | **Jira** | Трекер задач |
| <img src="docs/images/Telegram.svg" width="40" height="40" alt="Telegram"/> | **Telegram** | Уведомления |
| <img src="docs/images/GitHub.svg" width="40" height="40" alt="GitHub"/> | **GitHub** | Хранение кода |

---

## ✅ Тестовые сценарии

- ✔️ Проверка стартовой страницы при запуске приложения
- ✔️ Проверка функции поиска в Википедии
- ✔️ Проверка загрузки целевой страницы и всех ожидаемых блоков wiki

---

## 🏗 Архитектура и подход

- **Язык:** Java
- **Фреймворк:** Selenide с паттерном **Page Screens**
- **Сборщик:** Gradle
- **Тестовый фреймворк:** JUnit 5
- **Запуск:** Android Studio, BrowserStack, драйвер Appium
- **Отчётность:** Allure Report — для каждого удалённого теста прикреплено видео прохождения

---

## ⚙️ Сборка [Jenkins](https://jenkins.qa.guru/view/java_students/job/42_kovalyov_qa_guru_mobile_tests/3/)
## <img src="docs/images/Jenkins.svg" width="25" height="25"/> Сборка в Jenkins

<p align="center">
<img src="docs/images/jenkins_mobile.png" alt="Jenkins Page" width="800" height="350">
</p>

---

<a id="console"></a>
## :rocket: Команды для запуска

### Локальный запуск (через эмулятор)

```bash
gradle clean test -Dhost=local 
```

> Для запуска локальных тестов требуются следующие установленные программы на компьютере: Appium Server, Appium и Android Studio
<p align="center">  
<img title="AppiumService" src="docs/images/appium.png" width="850">  
</p> 
Пример запуска Appium сервера, с созданием локального порта.

### Удаленный запуск (через browserstack)

```bash
clean test -DdeviceHost=browserstack
```

---

<a id="allure"></a>
## 📊 [Allure](https://jenkins.qa.guru/view/java_students/job/42_kovalyov_qa_guru_mobile_tests/3/allure/) отчет
## <img alt="Allure" height="25" src="docs/images/Allure.svg" width="25"/> Интеграция с Allure Report

## 🖨️ Основная страница отчёта

<p align="center">  
<img title="Allure Overview Dashboard" src="docs/images/allure_mobile.png" width="850">  
</p>  

## 📄 Тест-кейсы

<p align="center">  
<img title="Allure Tests" src="docs/images/allure_mob_test.png" width="850">   
</p>

---

<a id="movie"></a>
## <img alt="Browserstack" height="25" src="docs/images/Browserstack.svg" width="25"/></a> Видеопример выполнения теста c Browserstack


<p align="center">
<img title="Browserstack Video" src="docs/images/browserstk.gif" width="300" height="500"  alt="video">   
</p>
