# 📘 LinguaBoost

## 📌 Project Mission

LinguaBoost is a completely free and open-source Android application designed to help A2–B1 German learners improve:

* Listening comprehension
* Vocabulary retention
* Speaking fluency
* Pronunciation confidence

The project exists to provide a **serious, offline, privacy-respecting learning tool** — without ads, tracking, subscriptions, or locked features.

---

## ❤️ Philosophy

* 100% free
* 100% open source
* No ads
* No tracking
* No data collection
* Offline-first
* Community-driven

Unlike commercial apps such as Duolingo, LinguaBoost focuses on deep practice instead of gamification.

---

## 🏗 Tech Stack

* Language: Kotlin
* UI: Jetpack Compose
* Architecture: Clean Architecture + MVVM
* Database: Room (SQLite)
* Audio Playback: ExoPlayer
* Audio Recording: MediaRecorder
* Dependency Injection: Hilt
* Concurrency: Coroutines + Flow

* Minimum SDK: 24+

---

## 🧱 Architecture Overview

```id="arch01"
Presentation (Compose UI)
│
├── ViewModels
│
Domain
│
├── UseCases
├── Business Logic
│
Data
│
├── Room Database
├── Local File Storage
├── Audio Engine
```

The project is structured for:

* Maintainability
* Scalability
* Community contributions

---

## 🚀 Core Features

### 1️⃣ Listening Mode

* Offline audio playback
* Sentence-based transcript sync
* Adjustable speed (0.5x – 1.25x)
* Sentence highlighting

Transcript format:

```json id="json01"
[
  {
    "start": 0.0,
    "end": 4.5,
    "text": "Guten Morgen, wie geht es dir?"
  }
]
```

---

### 2️⃣ Shadowing Mode

* Play one sentence
* Automatic pause
* Record user voice
* Replay original + user recording
* Save recordings locally

---

### 3️⃣ Vocabulary Builder

* Tap word to save
* Add translation + example
* Spaced repetition review
* Track progress

Review intervals:

Level 1 → 1 day
Level 2 → 3 days
Level 3 → 7 days
Level 4 → 14 days
Level 5 → 30 days

---

### 4️⃣ Daily Speaking Challenge

* Topic of the day
* Guided questions
* Voice recording
* Progress tracking

---

## 💾 Offline Storage

All data stored locally:

```id="files01"
/files/audio/
/files/text/
/files/recordings/
```

Database stores:

* Vocabulary
* Lessons
* Recording metadata

No internet required.

---

## 🔐 Privacy

LinguaBoost:

* Does not collect user data
* Does not use analytics
* Does not require login
* Does not track activity

All content remains on the user’s device.

---

## 📂 Project Structure

```id="struct01"
app/
 ├── data/
 ├── domain/
 ├── ui/
 ├── audio/
 ├── di/
 └── utils/
```

---

## 📜 License

LinguaBoost is licensed under the MIT License. See [LICENSE](LICENSE) for details.

---

## 🤝 Contributing

We welcome contributions:

* Bug fixes
* UI improvements
* New lesson packs
* Performance improvements
* Accessibility enhancements

To contribute:

1. Fork repository
2. Create feature branch
3. Submit pull request

---

## 🗺 Roadmap

Phase 1:

* Core listening + transcript sync

Phase 2:

* Vocabulary SRS

Phase 3:

* Shadowing recording

Phase 4:

* UI polish + accessibility

Phase 5:

* Community content packs

---

## 🎯 Long-Term Vision

LinguaBoost aims to become:

* The best free offline German immersion tool
* A community-built alternative to paid language apps
* A serious tool for immigrants and students
