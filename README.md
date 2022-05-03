# spring-cloud-contract-with-pact-sample

# Configuring the Pact Broker locally

In order to run the `Pact Broker` locally, you can start it with:
* `make pact-broker-up`
* `make pact-broker-down`

This will start a local pact-broker server with `sqlite` database, for testing purposes only.

You will be able to access it using the port `9292`:
* [http://localhost:9292/](http://localhost:9292/)

## Postman Collection

In order to simulate a Client published pact, there is a `Postman` collection in the root folder
with the `Publish Pact` requests. The `Spring Cloud Contract` will use this contract to verify
it against the Demo Project Service.

Basically, the contract will be:

`request`
```json
{
  "method": "get",
  "path": "/greeting"
}

```

`response`

```json
{
  "status": 200,
  "body": {
    "message": "Greetings!"
  }
}
```
