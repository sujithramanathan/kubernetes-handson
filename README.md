# kubernetes-handson


## Pre-Requisites
  - Install kind, kubernetes in local.

 
This is an example of accessing the URL outside kubernetes cluster using nodePort.
Please refer kind-cluster.yml, api.yml


Local URL:- http://localhost:8080/save/file?data=Hello World


## Output
A new file will be created as current timestamp and saved under /tmp/api/
Later trying to update this with Persistent storage.