# Prometheus検証用

```
# ArgoCD
http://${IP_address}:30070
```

```
# API1
curl http://${IP_address}:30080/prom/greet
```

```
# API2
curl http://${IP_address}:30081/prom/greet
```