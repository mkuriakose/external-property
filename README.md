# external-property
This POC demonstrates how to externalize property file and how changes in the property file
is dynamically pushed to client applications.

The POC uses the below technologies:

Spring Cloud Config: Provides centralized, externalized secured easy-to-reach source of application configuration.
Spring Cloud Bus: Provides simple way to notify clients to configuration changes.
Spring cloud Netflix Erureka: Service discovery - allows application to register themselves and clients.

Part 1 - The Broker
   1. Download Rabbit MQ
   2. Launch Rabbit MQ and leave it running.
Part 2 - The Server
   3. Open Collection-Server project
   4. Open applicaton.yml. Change spring.cloud.config.server.git.uri to your own personal git repository.
   5. Run DemoApplication
Part 3 - The Repository
   6. Within your Git repository create a collection-client.yml file
   7. Add properties name and values to the file
Part 4. - The client
   6. Open Collection-Server project
   7. Run DemoApplication
Part 5 - Browser
   8. In the browser type type url http://localhost:8002/collection
         - The property values from collection-client.yml will be displayed on the browser.
   9. Now Change some values in the Collection-client.yml
  10. Make a POST request to http://localhost:8001/actuator/bus-refresh using the below curl command
        curl --request POST http://localhost:8001/actuator/bus-refresh
  11. Refresh the browser, the new property values will be displayed.
