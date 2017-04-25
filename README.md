Auth Sample application
---

* `cf cups oracle-db-service -p uri`

* supply the oracle connection info using the format
`oracle://$user:$password@$hostname:$port/$name`

* `cf bind-service app-name oracle-db-service`
* `cf restage app-name`