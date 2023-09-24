## How to run project with docker compose

- cd to folder deployments and run those commands
- remember to create `.env.[dev/uat/prod/...]` file for each environment variables

### Build project
- build images: `docker-compose build`
- build images with specific env file: `docker-compose --env-file .env.dev build`
- build specific container: `docker-compose --env-file .env.dev build web_server`

### Start project
- start project: `docker-compose up -d`, option -d used to make projects run on background
- run with specific env file: `docker-compose --env-file .env.dev up -d`

- restart project: `docker-compose --env-file .env.dev restart`
- restart specific container: `docker-compose --env-file .env.dev restart [service_name: java_server]`

### Monitor project
- View list container: `docker container ls`
- View container log: `docker logs [container_name] -f`
- Access container terminal: `docker exec -it [container_name] /bin/bash`


### Stop project
- Stop all container: `docker-compose stop`
- Stop specific container: `docker-compose stop [container_name]`
- Remove all unused container: `docker container prune`
