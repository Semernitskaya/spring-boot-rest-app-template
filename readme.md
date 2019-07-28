### simple java-application template with:
1. java 11
1. maven as a build tool
1. spring-boot as a base
1. simple REST endpoint
1. spring-boot-actuator endpoint 
1. lombok library
1. checkstyle settings

### run
run maven build  
```bash
mvn clean install
```

run in docker (docker-image will be created automatically in maven-build)   
```bash
docker run -P -t spring/template
```

check access to REST-endpoint with
```bash
 curl "http://localhost:8080/dataObject?id=7&description=descr"
```

run in minikube ([minikube installation](https://kubernetes.io/docs/tasks/tools/install-minikube/))
```bash
minikube start --vm-driver=none
kubectl run spring-template --image=spring/template --image-pull-policy=Never
kubectl expose deployment spring-template --type=LoadBalancer --port=8080
kubectl scale --replicas=3 deployment/spring-template
```

check minikube deployment
```bash
kubectl get deployments
kubectl get pods
kubectl get services
```
