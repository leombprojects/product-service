# Product Service

## Description

The Product Service is responsible for retrieving food and beverage product data. It provides REST APIs to facilitate seamless integration with other microservices or applications.

## Technologies

- Java 17 with Spring Boot
- Java Database Connection (JDBC)
- JPA (with Hibernate)
- Spring Security (Azure AD for RestAPI Authentication)
- PostgreSQL (Azure Cosmos DB)
- OpenAPI

## Setup Instructions

1. Clone the repository: `git clone https://github.com/leombprojects/product-service.git`
2. Navigate to the `product-service` directory.
3. Configurations could be done in the boot module on the resources directory (`application-[env].yml`).
4. Build and run the service using your preferred IDE or `mvn spring-boot:run`.

## REST API Endpoints

- `GET /product/list/:course`: Retrieve a list of products by course (`'STARTERS'`, `'MAINS'`, or `'DRINKS'`).

## Features

- **Azure DevOps Integration:**
  - Pipelines Ready
  - Releases Ready

- **Azure Cloud Services Compatibility:**
  - ACR (Azure Container Registry) Ready
  - AKS (Azure Kubernetes Service) Ready

- **Azure Cloud Identity and Access Compatibility:**
  - AD (Azure Active Directory) Ready - OAuth2 RestAPI Authentication

## Usage Notes

- Ensure that you configure the appropriate environment-specific properties in the `application-[env].yml` file.
- The service follows OpenAPI standards for documentation.