# 🏦 Bank Account Microservice — Spring Boot

Microservice de gestion des comptes bancaires développé avec **Spring Boot**. Le projet met en pratique plusieurs approches de développement d'API : REST, Spring Data REST et GraphQL, avec une architecture organisée en couches.

## 📌 Table des matières

- [Présentation du projet](#-présentation-du-projet)
- [Objectifs pédagogiques](#-objectifs-pédagogiques)
- [Technologies utilisées](#-technologies-utilisées)
- [Architecture du projet](#-architecture-du-projet)
- [Fonctionnalités](#-fonctionnalités)
- [Installation et démarrage](#-installation-et-démarrage)
- [Tester les API REST](#-tester-les-api-rest)
- [Documentation Swagger](#-documentation-swagger)
- [Spring Data REST et projections](#-spring-data-rest-et-projections)
- [DTOs et mappers](#-dtos-et-mappers)
- [API GraphQL](#-api-graphql)
- [Tests](#-tests)
- [Travail réalisé](#-travail-réalisé)

## 📖 Présentation du projet

Ce projet consiste à concevoir un microservice bancaire permettant de gérer des comptes bancaires et leurs informations associées.

Il utilise Spring Boot pour le développement de l'application, Spring Data JPA pour la persistance des données et une base de données H2 pour faciliter les tests et le développement.

Le projet expose plusieurs interfaces d'accès aux données :

- **API REST** : gestion des comptes via des endpoints HTTP.
- **Spring Data REST** : exposition des ressources à partir des repositories.
- **GraphQL** : interrogation et manipulation des données à travers un schéma GraphQL.
- **DTOs et mappers** : séparation entre les objets métier et les données exposées par les API.
- **Couche Service** : centralisation de la logique métier.

## 🎯 Objectifs pédagogiques

- Créer une application Spring Boot avec les dépendances nécessaires.
- Modéliser une entité JPA et manipuler les données avec Spring Data.
- Implémenter et tester une couche DAO.
- Développer des services web RESTful.
- Documenter les API REST avec Swagger/OpenAPI.
- Exposer des ressources avec Spring Data REST et des projections.
- Structurer l'application avec des DTOs, des mappers et une couche métier.
- Développer une API GraphQL.
- Appliquer une architecture en couches et les bonnes pratiques de développement.

## 🛠️ Technologies utilisées

| Technologie | Utilisation |
|---|---|
| Java | Langage de programmation |
| Spring Boot | Framework principal |
| Spring Web | Création des API REST |
| Spring Data JPA | Persistance des données |
| H2 Database | Base de données de développement |
| Lombok | Réduction du code répétitif |
| Spring Data REST | Exposition des repositories |
| Spring for GraphQL | API GraphQL |
| Swagger / OpenAPI | Documentation des API REST |
| Maven | Gestion des dépendances et compilation |
| Postman | Tests des API HTTP |
| JUnit | Tests automatisés |

## 🏗️ Architecture du projet

L'application suit une architecture en couches afin de séparer les responsabilités.

```text
bank-account-service/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── ...
│   │   │       ├── entities/
│   │   │       ├── repositories/
│   │   │       ├── dtos/
│   │   │       ├── mappers/
│   │   │       ├── services/
│   │   │       ├── web/
│   │   │       └── ...
│   │   └── resources/
│   │       ├── application.properties
│   │       └── graphql/
│   │           └── schema.graphqls
│   └── test/
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

*Remarque : l'arborescence ci-dessus illustre l'organisation logique. Les noms exacts des packages et des fichiers peuvent varier selon la structure réelle du projet.*

### Rôle des principales couches

- **Entity** : représente les entités persistées dans la base de données.
- **Repository** : permet d'effectuer les opérations d'accès aux données.
- **DTO** : définit les données échangées avec les clients de l'API.
- **Mapper** : convertit les entités en DTOs et inversement.
- **Service** : contient la logique métier.
- **Web / Controller** : reçoit les requêtes HTTP et expose les endpoints REST.
- **GraphQL** : définit les opérations permettant d'interroger ou de modifier les données.

## ✨ Fonctionnalités

### 1. Gestion des comptes bancaires

- Création et consultation des comptes.
- Récupération des comptes et de leurs informations.
- Mise à jour des informations d'un compte.
- Persistance des données avec Spring Data JPA.

### 2. Gestion des clients

- Modélisation de l'entité client.
- Accès aux données des clients avec un repository dédié.
- Organisation des données clients et comptes dans la couche métier.

### 3. API REST

- Exposition des fonctionnalités via HTTP.
- Échange de données au format JSON.
- Utilisation des méthodes HTTP adaptées aux opérations CRUD.

### 4. Spring Data REST et projections

- Exposition des ressources à partir des repositories.
- Utilisation de projections pour contrôler les données retournées.
- Réduction des informations exposées selon le besoin.

### 5. DTOs et mappers

- Découplage des entités JPA et des objets exposés par l'API.
- Conversion entre entités et DTOs.
- Meilleure organisation des échanges entre les couches.

### 6. API GraphQL

- Définition d'un schéma GraphQL.
- Interrogation des données à l'aide de requêtes.
- Exposition des opérations prises en charge par les resolvers du projet.

## ⚙️ Installation et démarrage

### Prérequis

Installer les outils suivants :

- Java, dans une version compatible avec le projet.
- Git.
- Maven, facultatif si le wrapper Maven fourni est utilisé.
- Postman ou un client HTTP équivalent pour les tests.

### 1. Cloner le dépôt

```bash
git clone git@github.com:ImaneMekkaoui1/banking-microservices-spring-boot.git
cd banking-microservices-spring-boot
```

### 2. Lancer les tests

Sur macOS ou Linux :

```bash
./mvnw test
```

Sur Windows :

```powershell
.\mvnw.cmd test
```

### 3. Démarrer l'application

Sur macOS ou Linux :

```bash
./mvnw spring-boot:run
```

Sur Windows :

```powershell
.\mvnw.cmd spring-boot:run
```

Par défaut, une application Spring Boot démarre sur le port `8080`, sauf si un autre port est configuré dans `application.properties`.

L'application est alors accessible à l'adresse :

`http://localhost:8080`

## 🌐 Tester les API REST

Utiliser Postman pour envoyer des requêtes HTTP vers les endpoints définis dans les contrôleurs REST.

Les méthodes HTTP couramment utilisées sont :

| Méthode | Objectif |
|---|---|
| GET | Consulter les comptes |
| POST | Créer un compte |
| PUT | Remplacer ou mettre à jour les données d'un compte |
| PATCH | Modifier partiellement un compte, si cette opération est implémentée |
| DELETE | Supprimer un compte, si cette opération est implémentée |

Les chemins exacts et les formats des corps JSON dépendent des mappings réellement définis dans l'application.

## 📚 Documentation Swagger

Swagger/OpenAPI permet de consulter et de tester les endpoints REST depuis une interface web.

Si la dépendance Springdoc OpenAPI est configurée, l'interface Swagger UI est généralement accessible à l'adresse suivante :

`http://localhost:8080/swagger-ui/index.html`

La documentation OpenAPI brute est généralement disponible ici :

`http://
