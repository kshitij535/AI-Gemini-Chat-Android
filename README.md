# 🤖 Gemini AI Chat Assistant (with Voice Support)

A modern Android application demonstrating the integration of **Generative AI** and **Speech-to-Text** capabilities. This project highlights advanced error handling through a custom fallback engine.

---

## 🌟 Key Features
- **Gemini 1.5 Flash Integration**: Real-time conversational AI processing.
- **Voice-to-Text**: Hands-free interaction using `RecognizerIntent`.
- **Intelligent Fallback Engine**: A custom logic layer that ensures the app remains functional even during API outages or quota limits.
- **Modern UI/UX**: Built with `ViewBinding`, `RecyclerView`, and smooth scroll-to-bottom mechanics for a seamless chat experience.

---

## 🛠 Tech Stack
- **Language**: Kotlin
- **AI SDK**: Google Generative AI SDK
- **Architecture**: Jetpack Components (Lifecycle, ViewBinding)
- **Concurrency**: Kotlin Coroutines (`lifecycleScope`)
- **Networking**: RESTful API communication via Google's AI Client

---

## 🏗 System Architecture & Fallback Flow
The app is designed with a "Security First" mindset. The API key is managed via environment variables (removed in public repo), and the interaction flow includes a robust `try-catch` mechanism.



---
## 📸 Screenshots 
| 1st - Welcome | 2nd - User Query | 3rd - AI Response |
| :---: | :---: | :---: |
| <img src="./screenshots/1st image.jpg" width="200"> | <img src="./screenshots/2nd image.jpg" width="200"> | <img src="./screenshots/3rd image.jpg" width="200"> |

| 4th - Voice Input | 5th - Error Handling | 6th - Detailed Chat |
| :---: | :---: | :---: |
| <img src="./screenshots/4th image.jpg" width="200"> | <img src="./screenshots/5th image.jpg" width="200"> | <img src="./screenshots/6th image.jpg" width="200"> |

---

## 👨‍💻 Engineering Highlights (For Recruiters)
- **Graceful Degradation**: If the API fails, the app uses pattern matching to provide relevant local responses.
- **Resource Management**: Efficient use of Coroutines to ensure the Main Thread is never blocked during AI generation.
- **UX Optimization**: Implemented `LayoutChangeListeners` to handle keyboard visibility and auto-scroll behavior.
