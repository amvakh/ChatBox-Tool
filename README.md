# Chat Box Tool 💬

A basic Java-based client-server chat application featuring modular components, placeholder GUI, and RSA encryption setup. This version is a scaffolded rewrite of the original Chat-Tool project, designed to behave similarly with brand new code and structure.

---

## 🚀 Features

- 🔗 **Client-Server Architecture** – Simulates message flow between clients through a central server.
- 🛡️ **RSA Encryption Placeholder** – Generates RSA keys for secure communication (stub implementation).
- 🖥️ **GUI Modules (Stub)** – Structured classes for client and server GUIs using `System.out` as placeholder.
- 🧱 **Modular Structure** – Cleanly separated logic for client, server, common message structures, and config.

---

## 📁 Project Structure

RewrittenChatTool/
├── client/
│ ├── ClientMain.java # Starts the client
│ ├── ClientGUI.java # GUI placeholder
│ └── EncryptionUtil.java # RSA key pair generator
├── server/
│ ├── ServerMain.java # Starts the server
│ ├── ServerGUI.java # GUI placeholder
│ └── ClientHandler.java # Handles individual client connections (stub)
├── common/
│ └── Message.java # Shared message object
└── resources/
└── config.properties # Basic config (e.g., port number)


---

## 🛠️ Getting Started

1. **Clone or unzip this project**  
git clone <your-link>
or unzip ChatBoxTool.zip


2. **Compile the project**
javac client/.java server/.java common/*.java


3. **Run the server**
java server.ServerMain


4. **Run the client**
java client.ClientMain


> Note: Actual chat and GUI functions are placeholders. Replace `System.out.println()` with GUI logic and socket connections for real functionality.

---

## 🔒 Security

This project includes a basic RSA setup using Java's security libraries:
- KeyPair generation
- Public key retrieval
- Placeholder for encryption logic

---

## 📌 Future Improvements

- Implement actual socket connections for real-time chat
- Build GUIs using JavaFX or Swing
- Add message encryption and file transfers
- Support for multiple clients and chat rooms

---

## 📄 License

This project is provided for educational and learning purposes. Modify freely.
