package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.AlertasApiService;
import io.swagger.api.factories.AlertasApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.Alerta;
import io.swagger.model.Ubicacion;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;


@Path("/alertas")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-11-07T18:16:29.590Z[GMT]")public class AlertasApi  {
   private final AlertasApiService delegate;

   public AlertasApi(@Context ServletConfig servletContext) {
      AlertasApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("AlertasApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (AlertasApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = AlertasApiServiceFactory.getAlertasApi();
      }

      this.delegate = delegate;
   }

    @POST
    @Path("/alertarConocido")
    @Consumes({ "application/json", "application/xml" })
    
    @Operation(summary = "Alertar a conocido con ubicación del usuario y del desfibrilador", description = "", tags={ "alertas" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "405", description = "Invalid input"),
        
        @ApiResponse(responseCode = "500", description = "Error Interno") })
    public Response alertarConocido(@Parameter(description = "Información de la alerta. El campo ubicacion_desfibrilador contendrá la ubicación del desfibrilador más cercano al usuario y el conocido." ,required=true) Alerta body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.alertarConocido(body,securityContext);
    }
    @POST
    @Path("/alertar112")
    @Consumes({ "application/json", "application/xml" })
    
    @Operation(summary = "Alertar a emergencias con ubicación del usuario", description = "", tags={ "alertas" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "405", description = "Invalid input"),
        
        @ApiResponse(responseCode = "500", description = "Error Interno") })
    public Response alertarEmergencias(@Parameter(description = "Ubicación del usuario" ,required=true) Ubicacion body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.alertarEmergencias(body,securityContext);
    }
    @GET
    @Path("/cancelarAlerta")
    
    
    @Operation(summary = "Cancelar la alerta actual", description = "", tags={ "alertas" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation"),
        
        @ApiResponse(responseCode = "500", description = "Error Interno") })
    public Response cancelAlerta(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.cancelAlerta(securityContext);
    }
}
