CREATE TABLE Users (
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       name VARCHAR(100) NOT NULL,
                       email VARCHAR(100) NOT NULL UNIQUE,
                       address VARCHAR(255),
                       password VARCHAR(255) NOT NULL,
                       phone_number VARCHAR(20),
                       created_at TIMESTAMP
);