package org.ml.gteway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class GtewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GtewayApplication.class, args);
	}


	// --------------------------CONFIGURATION DYNAMIQUE ----------------------------
	// @Bean
    // public RouteLocator routes(RouteLocatorBuilder builder){
    //     return builder.routes()
    //             .route(r->r.path("/customerses/**").uri("http://localhost:8082/"))
    //             .route(r->r.path("/productses/**").uri("http://localhost:8081/"))
    //             .build();
    // }
	// @Bean
    public RouteLocator routes(RouteLocatorBuilder builder){
        return builder.routes()
                //dans notre repository
                .route(r->r.path("/customerses/**").uri("lb://CUSTOMER-SERVICE"))
                .route(r->r.path("/productses/**").uri("lb://INVENTORY-SERVICE"))
                .build();
    }

    // http://localhost:8088/INVENTORY-SERVICE/productses
    // http://localhost:8088/CUSTOMER-SERVICE/customerses
    @Bean
    public DiscoveryClientRouteDefinitionLocator dynamicRute(ReactiveDiscoveryClient rdc, DiscoveryLocatorProperties dlp){
        return new DiscoveryClientRouteDefinitionLocator(rdc, dlp);
    }

}
