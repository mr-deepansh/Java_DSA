# DevOps and Deploy Project Structure

## Project Root

```plaintext
project-root/
├── website1-repo/          # Repository for Website 1
│   ├── Dockerfile          # Dockerfile for Website 1
│   ├── package.json        # package.json for Website 1
│   ├── src/                # Source code for Website 1
│   │   ├── components/     # React components (agar React use kar rahe ho)
│   │   ├── pages/          # Pages for routing
│   │   ├── styles/         # CSS/SASS files
│   │   └── ...             # Any other folders as needed
│   ├── .github/            # GitHub Actions configuration for Website 1
│   │   └── workflows/
│   │       └── deploy.yml  # CI/CD workflow for Website 1
│   └── README.md           # Documentation for Website 1
│
├── website2-repo/          # Repository for Website 2
│   ├── Dockerfile          # Dockerfile for Website 2
│   ├── package.json        # package.json for Website 2
│   ├── src/                # Source code for Website 2
│   │   ├── components/     # React components (agar React use kar rahe ho)
│   │   ├── pages/          # Pages for routing
│   │   ├── styles/         # CSS/SASS files
│   │   └── ...             # Any other folders as needed
│   ├── .github/            # GitHub Actions configuration for Website 2
│   │   └── workflows/
│   │       └── deploy.yml  # CI/CD workflow for Website 2
│   └── README.md           # Documentation for Website 2
│
├── nginx-config-repo/      # Central Nginx Configuration Repository
│   ├── nginx.conf          # Nginx configuration file for multiple websites
│   ├── docker-compose.yml  # Docker Compose file to run Nginx and link websites
│   ├── ssl/                # SSL certificates for HTTPS
│   │   ├── website1.crt    # SSL certificate for Website 1
│   │   ├── website1.key    # SSL key for Website 1
│   │   ├── website2.crt    # SSL certificate for Website 2
│   │   └── website2.key    # SSL key for Website 2
│   ├── .github/            # GitHub Actions configuration for Nginx
│   │   └── workflows/
│   │       └── nginx-deploy.yml  # CI/CD workflow for Nginx
│   └── README.md           # Documentation for Nginx configuration
```
