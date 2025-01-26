
# Terrarium Inventory Tracker

## Overview

The Terrarium Inventory Tracker is a web application built with Java, Spring Boot, Thymeleaf, and Bootstrap. This app allows users to manage an inventory of terrarium materials, plants, and products/packages. 
The main features include adding, updating, and deleting materials, plants, and products, associating materials with packages, and tracking inventory levels.

The app provides a user-friendly interface for managing various items required for terrariums (such as rocks, soil, plants, etc.), as well as the packaged products made from these items. 
It also includes a search functionality to filter and view specific items and products.

---

## Key Features

### Item Inventory Management

- **Add, Update, and Delete Items**: Users can add new plants and materials, update their details, and delete items from the inventory.
- **Search Functionality**: The system includes a filter feature that allows users to search for parts based on keywords.

### Product Packaging

- **Product Creation**: Users can create new products and packages by selecting a combination of available items. Each product represents a package made from individual parts.
- **Inventory Management for Products**: When a product is created, the system checks if the required items are available in the inventory. It then adjusts the inventory of the individual parts accordingly.
- **Inventory Controls**: The inventory system ensures that users cannot add more products than the available items in stock or if it would bring the item inventory count below the set minimum level

### Sell Products

- **Sell Functionality**: Products can be sold, which decreases the inventory of the product by 1.
- **Prevent Selling Out-of-Stock Products**: The system prevents the sale of products if the inventory level is 0.

### User Interface

- **Interactive UI**: The application uses Bootstrap to create a clean and responsive user interface that allows easy navigation and interaction.
- **Thymeleaf Integration**: All pages are dynamically rendered using Thymeleaf templates, which makes the application more interactive and allows for real-time updates.

---

## Technologies Used

- **Java 17**
- **Spring Boot**
- **Thymeleaf**
- **Bootstrap**
- **Spring Data JPA**
- **Maven**
- **H2 Database**

---
