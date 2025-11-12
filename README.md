Essai de CICD complete, avec déploiement automatisé lors d'un push sur main ou d'une pull request vers main.

Déploiement sur l'ECR, avec une task Fargate qui pointe sur la version latest.
Dans le ci.yml, aws ecs update-service sert à update ce service.

En temps normal, Le service est scaled à 1, et est exposé à internet par un load balancer via un target group.
J'ai créé deux security groups, un pour l'ALB (sgForMyAlb), un pour la task (SgForMyFargateTask)

Quand je ne travaille pas sur le projet, je scale le service à 0, et je supprime l'ALB, pour éviter d'être facturé.
Donc pour relancer :
- Scale à 1 le service
- Recréer l'ALB en utilisant sgForMyAlb