# CarrenoRangel-post2-u12

Pipeline CI/CD con GitHub Actions y Docker Hub.

## Secrets requeridos
- DOCKERHUB_USERNAME
- DOCKERHUB_TOKEN

## Pipeline CI/CD
1. Compilar con Maven y ejecutar pruebas (JaCoCo)
2. Publicar reporte como artefacto
3. Construir imagen Docker y publicar en Docker Hub

## Imagen Docker
docker pull <usuario>/mi-spring-app:latest

## Evidencias
Capturas ubicadas en img/:

### Checkpoint 1 - ACTIONS
![Secrets](img/Captura%20de%20Pantalla%202026-05-14%20a%20la%28s%29%204.25.43%20p.m..png)

### Checkpoint 2 - BUILD
![Actions](img/Captura%20de%20Pantalla%202026-05-14%20a%20la%28s%29%204.26.47%20p.m..png)

### Checkpoint 3 - Docker Hub
![Docker Hub](img/Captura%20de%20Pantalla%202026-05-14%20a%20la%28s%29%204.31.35%20p.m..png)
