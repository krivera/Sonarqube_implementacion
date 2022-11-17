# Sonarqube
![sonarqube]()

_ _ _ _ _ _

## Requirements

- docker v17.12.0+
- docker-compose v1.25+

_ _ _ _ _ _

## Quick Start

For execute sonarqube container you should following steps.

- Clone or download this repository.
- Move to directory.
- Execute docker-compose

    ```bash
      docker-compose up -d
    ```

_ _ _ _ _ _

## Access to sonarqube

in your browser open the following url:
<http://localhost:9000>
<br>
Note: when open sonarqube for firsttime, user and password are admin.
change password "admin" by "admin1", then the credentials for next logins are:

- username = admin
- password = admin1

In the projects put in sonar.property file the following lines:

- sonar.login=admin
- sonar.password=admin1

_ _ _ _ _ _

## References

[![docker hub](https://img.shields.io/badge/docker-hub-lightgrey)](https://hub.docker.com/_/sonarqube)
