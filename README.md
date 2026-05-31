# SprintRecap

Multi-tenant sprint retrospective platform with trend detection.

Engineering teams submit feedback at the end of each sprint across three categories (what went well, what didn't, what to improve). The system surfaces recurring patterns and themes across sprints using semantic similarity.

## Stack

Java 21 · Spring Boot 3 · Spring Security + JWT · Spring Data JPA · Spring Batch · Apache Kafka · PostgreSQL · React + TypeScript · Docker

## Services

| Service | Port | Responsibility |
|---|---|---|
| API Gateway | 8080 | JWT validation, request routing |
| User Service | 8081 | Auth, orgs, teams, roles |
| Retro Service | 8082 | Sessions, feedback, voting, action items |
| Analytics Service | 8083 | Trend detection, embeddings, batch processing |

## Running locally

```bash
docker compose up -d
```

This starts all infrastructure (3 Postgres instances, Kafka, Zookeeper). Application services are run individually during development.

## Build order

1. Docker Compose infrastructure ✅
2. User Service
3. API Gateway
4. Retro Service
5. Analytics Service
6. Frontend