CREATE TABLE IF NOT EXISTS tutor (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nome TEXT,
    telefone TEXT
);

CREATE TABLE IF NOT EXISTS animal (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nome TEXT,
    especie TEXT,
    tutor_id INTEGER,
    FOREIGN KEY (tutor_id) REFERENCES tutor(id)
);