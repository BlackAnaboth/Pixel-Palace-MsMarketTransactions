CREATE DATABASE IF NOT EXISTS pixelPalace;

USE pixelPalace;

CREATE TABLE IF NOT EXISTS Users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    username VARCHAR(50) UNIQUE,
    password VARCHAR(100),
    email VARCHAR(100),
    product_list TEXT,
    birthdate DATE
);

CREATE TABLE IF NOT EXISTS Products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    price DECIMAL(10, 2)
);

CREATE TABLE IF NOT EXISTS Categories (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    description TEXT
);

CREATE TABLE IF NOT EXISTS Platforms (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    description TEXT
);

CREATE TABLE IF NOT EXISTS ProductCategories (
    id INT AUTO_INCREMENT PRIMARY KEY,
    product_id INT,
    category_id INT,
    FOREIGN KEY (product_id) REFERENCES Products(id),
    FOREIGN KEY (category_id) REFERENCES Categories(id)
);

CREATE TABLE IF NOT EXISTS ProductPlatforms (
    id INT AUTO_INCREMENT PRIMARY KEY,
    product_id INT,
    platform_id INT,
    FOREIGN KEY (product_id) REFERENCES Products(id),
    FOREIGN KEY (platform_id) REFERENCES Platforms(id)
);

CREATE TABLE IF NOT EXISTS Transactions (
    id INT AUTO_INCREMENT PRIMARY KEY,
    status VARCHAR(50),
    code VARCHAR(50),
    user_id INT,
    product_id INT,
    platform_id INT,
    FOREIGN KEY (user_id) REFERENCES Users(id),
    FOREIGN KEY (product_id) REFERENCES Products(id),
    FOREIGN KEY (platform_id) REFERENCES Platforms(id)
);