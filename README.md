# Java-Springboot-microservices-k8s
The goal is to demonstrate running Java Springboot microservices in Kubernetes.
There are two services service 1 and service 2. The gateway service communicates with the two services via grpc endpoints over 9090 port and expose them externally on port 8080.
The gateway exposes two rest endpoints
1. /service1
2. /service2

## Deploy services
1. Build jar files
`./gradlew build`
2. Build docker images \
`docker build -t service1:0.1 ./service1` \
`docker build -t service1:0.1 ./service2` \
`docker build -t service1:kube ./gwservice`
3. Start minikube
`minikube start`
4. Apply deployment \
`kubectl apply -f deployment.yaml`
5. Test
Run `kubectl get all` to see the host machine port for gwservice. \
`localhost:<host port>/service1` should show "Hello from service 1" in a browser.
