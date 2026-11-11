# Проект автоматизации мобильных тестов для приложения Wikipedia

<p align="center">
  <a href="https://ru.wikipedia.org/">
    <img src="src/test/java/images/wiki.png" width="500" height="300" alt="Wikipedia"/>
  </a>
</p>

> **Википедия** — общедоступная многоязычная универсальная интернет-энциклопедия со свободным контентом, реализованная на принципах вики.

---

## 📋 Содержание

- [Технологии и инструменты](#-технологии-и-инструменты)
- [Тестовые сценарии](#-тестовые-сценарии)
- [Архитектура и подход](#-архитектура-и-подход)
- [Сборка в Jenkins](#-сборка-в-jenkins)
- [Интеграция с Allure](#-интеграция-с-allure)
- [Интеграция с Allure TestOps](#-интеграция-с-allure-testops)
- [Интеграция с Jira](#-интеграция-с-jira)
- [Уведомления в Telegram](#-уведомления-в-telegram)
- [Видеопример прохождения тестов BrowserStack](#-видеопример-прохождения-тестов-browserstack)
- [Лицензия](#-лицензия)
- [Контакты](#-контакты)

---

## 🛠 Технологии и инструменты

| | Инструмент | Назначение |
|:---:|------------|------------|
| <img src="src/test/java/images/Java.svg" width="40" height="40" alt="Java"/> | **Java** | Язык разработки |
| <img src="src/test/java/images/Idea.svg" width="40" height="40" alt="IntelliJ IDEA"/> | **IntelliJ IDEA** | IDE |
| <img src="src/test/java/images/Gradle.svg" width="40" height="40" alt="Gradle"/> | **Gradle** | Сборка проекта |
| <img src="src/test/java/images/Junit5.svg" width="40" height="40" alt="JUnit 5"/> | **JUnit 5** | Тестовый фреймворк |
| <img src="src/test/java/images/Appium.svg" width="40" height="40" alt="Appium"/> | **Appium** | Мобильная автоматизация |
| <img src="src/test/java/images/Browserstack.svg" width="40" height="40" alt="BrowserStack"/> | **BrowserStack** | Облачная платформа для запуска |
| <img src="src/test/java/images/Allure.svg" width="40" height="40" alt="Allure"/> | **Allure Report** | Отчётность |
| <img src="src/test/java/images/Allure_TO.svg" width="40" height="40" alt="Allure TestOps"/> | **Allure TestOps** | Управление тестами |
| <img src="src/test/java/images/Jenkins.svg" width="40" height="40" alt="Jenkins"/> | **Jenkins** | CI/CD |
| <img src="src/test/java/images/Jira.svg" width="40" height="40" alt="Jira"/> | **Jira** | Трекер задач |
| <img src="src/test/java/images/Telegram.svg" width="40" height="40" alt="Telegram"/> | **Telegram** | Уведомления |
| <img src="src/test/java/images/GitHub.svg" width="40" height="40" alt="GitHub"/> | **GitHub** | Хранение кода |

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

<a id="jenkins"></a>
## <img src="src/test/java/images/Jenkins.svg" width="25" height="25"/> Сборка в [Jenkins](https://jenkins.autotests.cloud/job/021-Melnikov-Wikipedia_mobile_autotests/)

<p align="center">
<img src="media/screen/jenkins_main.png" alt="Jenkins Page" width="1000" height="350">
</p>

---

<a id="console"></a>
## :rocket: Команды для запуска

### Локальный запуск (через эмулятор)

```bash
gradle clean local_test -Dhost=local
```

> Для запуска локальных тестов требуются следующие установленные программы на компьютере: Appium Server, Appium и Android Studio
<p align="center">  
<img title="AppiumService" src="media/screen/appium_server.png" width="850">  
</p> 
Пример запуска Appium сервера, с созданием локального порта.

### Удаленный запуск (через browserstack)

```bash
gradle clean browserstack_test -Dhost=browserstack
```

---

<a id="allureReport"></a>
## <img alt="Allure" height="25" src="media/logo/Allure.svg" width="25"/> </a>Интеграция с <a target="_blank" href="https://jenkins.autotests.cloud/job/021-Melnikov-Wikipedia_mobile_autotests/allure/">Allure Report</a>

## 🖨️ Основная страница отчёта

<p align="center">  
<img title="Allure Overview Dashboard" src="media/screen/allure_main.png" width="850">  
</p>  

## 📄 Тест-кейсы

<p align="center">  
<img title="Allure Tests" src="media/screen/allure_suits.png" width="850">   
</p>

---

<a id="allure"></a>
## <img alt="Allure_TO" height="25" src="media/logo/Allure_TO.svg" width="25"/> </a>Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/3844/dashboards">Allure TestOps</a>

## 🖨️ Основная страница отчёта

<p align="center">  
<img title="Allure TestOps Dashboard" src="media/screen/allure_to_boards.png" width="850">  
</p>  
На *Dashboard* в <code>Allure TestOps</code> видна статистика количества тестов: сколько из них добавлены и проходятся вручную, сколько автоматизированы. Новые тесты, а так же результаты прогона приходят по интеграции при каждом запуске сборки.


## 📄 Авто и Ручные тест-кейсы

<p align="center">  
<img title="Allure Tests" src="media/screen/allure_to_manual.png" width="850">  
</p>

---

<a id="jira"></a>

## <img src="media/logo/Jira.svg" width="25" height="25"/> Интеграция с [Jira](https://jira.autotests.cloud/browse/HOMEWORK-978)

Реализована интеграция <code>Allure TestOps</code> с <code>Jira</code>, в тикете отображается, какие тест-кейсы были написаны в рамках задачи и результат их прогона.
