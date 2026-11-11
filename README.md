## 📋 О проекте

**Redmi** — это фреймворк для автоматизированного тестирования мобильных приложений на устройствах Xiaomi / Redmi. Проект покрывает UI-тесты, smoke-проверки и регрессионные сценарии для Android-приложений.

| Параметр | Значение |
|---|---|
| 🏷️ Версия | `v1.0.0` |
| 🧪 Тип тестов | UI / Smoke / Regression |
| 📦 Стек | Python 3.11, Appium 2.x, Pytest, Allure |
| 📱 Устройства | Xiaomi Redmi Note 12 / 13, Redmi 12C |
| 🖥️ ОС | Android 12–14 |

---

## 🚀 Быстрый старт

```bash
# 1. Клонируйте репозиторий
git clone https://github.com/your-username/redmi-mobile-tests.git
cd redmi-mobile-tests

# 2. Создайте виртуальное окружение
python -m venv .venv
source .venv/bin/activate      # Linux / macOS
.venv\Scripts\activate         # Windows

# 3. Установите зависимости
pip install -r requirements.txt

# 4. Запустите тесты
pytest tests/ --alluredir=allure-results
```

---

## 🗂️ Структура проекта

```
redmi-mobile-tests/
├── 📁 config/
│   ├── capabilities.yaml     # Desired capabilities для устройств
│   └── environments.yaml     # Окружения (dev / stage / prod)
├── 📁 core/
│   ├── driver_factory.py     # Фабрика драйверов Appium
│   ├── base_page.py          # Базовый Page Object
│   └── waits.py              # Явные ожидания
├── 📁 pages/                 # Page Objects
│   ├── login_page.py
│   ├── home_page.py
│   └── settings_page.py
├── 📁 tests/
│   ├── test_login.py
│   ├── test_smoke.py
│   └── test_regression.py
├── 📁 data/
│   └── users.yaml            # Тестовые данные
├── 📄 conftest.py
├── 📄 pytest.ini
├── 📄 requirements.txt
└── 📄 README.md
```

---

## ⚙️ Конфигурация

Перед запуском настройте подключение к устройству в `config/environments.yaml`:

```yaml
dev:
  device_name: "Redmi Note 12"
  platform_version: "13.0"
  appium_server: "http://127.0.0.1:4723"
  app_package: "com.example.app"
  app_activity: ".MainActivity"
  no_reset: true

stage:
  device_name: "Redmi 12C"
  platform_version: "14.0"
  appium_server: "http://127.0.0.1:4723"
  app_package: "com.example.app.stage"
  app_activity: ".MainActivity"
  no_reset: false
```

---

## 🧪 Запуск тестов

```bash
# Все тесты
pytest tests/

# Только smoke
pytest tests/test_smoke.py -m smoke

# Параллельный запуск (pytest-xdist)
pytest tests/ -n 4

# С генерацией отчёта Allure
pytest tests/ --alluredir=allure-results
allure serve allure-results
```

---

## 📊 Отчётность

Результаты тестов агрегируются в **Allure Report**:

- 📈 графики прохождения по устройствам;
- 📸 скриншоты при падении теста;
- 🎥 видео-запись сессии (опционально);
- 🧾 логи Appium / logcat.

![Allure Report](https://your-domain.com/images/allure-report-preview.png)

---

## 🧩 Пример теста

```python
import allure
import pytest
from pages.login_page import LoginPage

@allure.feature("Авторизация")
class TestLogin:

    @allure.story("Успешный вход")
    @pytest.mark.smoke
    def test_login_success(self, driver):
        page = LoginPage(driver)
        page.login("user@example.com", "password")
        assert page.is_logged_in(), "Пользователь не авторизован"
```

---

## 🛠️ Используемые инструменты

![Appium](https://img.shields.io/badge/Appium-2.x-662D91?style=for-the-badge&logo=appium&logoColor=white)
![Pytest](https://img.shields.io/badge/Pytest-8.x-0A9EDC?style=for-the-badge&logo=pytest&logoColor=white)
![Python](https://img.shields.io/badge/Python-3.11-3776AB?style=for-the-badge&logo=python&logoColor=white)
![Allure](https://img.shields.io/badge/Allure-Report-FF6B00?style=for-the-badge&logo=allure&logoColor=white)
![Android](https://img.shields.io/badge/Android-12--14-3DDC84?style=for-the-badge&logo=android&logoColor=white)

---

## 🤝 Контрибьютинг

1. Форкните репозиторий.
2. Создайте ветку: `git checkout -b feature/my-feature`.
3. Закоммитьте изменения: `git commit -m "feat: my feature"`.
4. Запушьте: `git push origin feature/my-feature`.
5. Откройте Pull Request.

📖 Правила описаны в [CONTRIBUTING.md](https://github.com/your-username/redmi-mobile-tests/blob/main/CONTRIBUTING.md).

---

## 📄 Лицензия

Проект распространяется под лицензией **MIT**. Подробнее: [LICENSE](https://github.com/your-username/redmi-mobile-tests/blob/main/LICENSE).

---

## 📬 Контакты

- 👤 Автор: **Ваше Имя**
- ✉️ Email: `you@example.com`
- 💬 Telegram: [@your_handle](https://t.me/your_handle)
- 🐛 Issues: [GitHub Issues](https://github.com/your-username/redmi-mobile-tests/issues)
- 📚 Документация: [Wiki](https://github.com/your-username/redmi-mobile-tests/wiki)

---
