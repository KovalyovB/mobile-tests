# Проект автоматизации мобильных тестов для приложения Wikipedia

<p align="center">
  <a href="https://ru.wikipedia.org/">
    <img src="media/logo/WikiLogo.png" width="500" height="300" alt="Wikipedia"/>
  </a>
</p>

> **Википедия** — общедоступная многоязычная универсальная интернет-энциклопедия со свободным контентом, реализованная на принципах вики.

---

## 📋 Содержание

- [Технологии и инструменты](#-технологии-и-инструменты)
- [Тестовые сценарии](#-тестовые-сценарии)
- [Архитектура и подход](#-архитектура-и-подход)
- [Сборка в Jenkins](#-сборка-в-jenkins)
- [Запуск тестов из терминала](#-запуск-тестов-из-терминала)
- [Allure-отчёт](#-allure-отчёт)
- [Интеграция с Allure TestOps](#-интеграция-с-allure-testops)
- [Интеграция с Jira](#-интеграция-с-jira)
- [Уведомления в Telegram](#-уведомления-в-telegram)
- [Видеопример прохождения тестов BrowserStack](#-видеопример-прохождения-тестов-browserstack)
- [Лицензия](#-лицензия)
- [Контакты](#-контакты)

---

## 🛠 Технологии и инструменты

| Категория | Инструменты |
|-----------|-------------|
| **Язык** | Java |
| **IDE** | IntelliJ IDEA |
| **Сборка** | Gradle |
| **Тестирование** | JUnit 5, Selenide (Page Screen) |
| **Мобильная автоматизация** | Appium, Android Studio |
| **Облачная платформа** | BrowserStack |
| **Отчётность** | Allure Report, Allure TestOps |
| **CI/CD** | Jenkins |
| **Трекер задач** | Jira |
| **Уведомления** | Telegram |

<p align="center">
  <img src="media/logo/Java.svg" width="50" height="50" alt="Java"/>
  <img src="media/logo/Idea.svg" width="50" height="50" alt="IntelliJ IDEA"/>
  <img src="media/logo/GitHub.svg" width="50" height="50" alt="GitHub"/>
  <img src="media/logo/Junit5.svg" width="50" height="50" alt="JUnit 5"/>
  <img src="media/logo/Gradle.svg" width="50" height="50" alt="Gradle"/>
  <img src="media/logo/Allure.svg" width="50" height="50" alt="Allure"/>
  <img src="media/logo/Appium.svg" width="50" height="50" alt="Appium"/>
  <img src="media/logo/Browserstack.svg" width="50" height="50" alt="BrowserStack"/>
  <img src="media/logo/Jenkins.svg" width="50" height="50" alt="Jenkins"/>
  <img src="media/logo/Jira.svg" width="50" height="50" alt="Jira"/>
  <img src="media/logo/Telegram.svg" width="50" height="50" alt="Telegram"/>
  <img src="media/logo/Allure_TO.svg" width="50" height="50" alt="Allure TestOps"/>
</p>

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
