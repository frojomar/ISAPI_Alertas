package io.swagger.api.factories;

import io.swagger.api.AlertasApiService;
import io.swagger.api.impl.AlertasApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-11-07T18:16:29.590Z[GMT]")public class AlertasApiServiceFactory {
    private final static AlertasApiService service = new AlertasApiServiceImpl();

    public static AlertasApiService getAlertasApi() {
        return service;
    }
}
