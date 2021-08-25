Inicio Spring: model -> repository -> controller
Inicio Angular: model -> service -> component

curl -v http://localhost:8080/teste/api/clientes

curl -X POST -H "Content-Type: application/json" -d '{"nome": "matheus alves", "dataNascimento": "1990-09-07", "rua": "turmalin", "numero": 946, "bairro": "Ancuri", "uf": "CE", "cidade": "Itaitinga", "ativo": true, "tipo": 2}' http://localhost:8080/teste/api/clientes

curl -X PUT -H "Content-Type: application/json" -d '{"id": "1", "nome": "Matheus Alves", "dataNascimento": "1990-09-07", "rua": "turmalin", "numero": 946, "bairro": "Ancuri", "uf": "CE", "cidade": "Itaitinga", "ativo": true, "tipo": 2}' http://localhost:8080/teste/api/clientes

curl -X DELETE http://localhost:8080/teste/api/clientes/1