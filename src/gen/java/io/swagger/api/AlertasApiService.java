package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Alerta;
import io.swagger.model.Ubicacion;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-11-07T18:16:29.590Z[GMT]")public abstract class AlertasApiService {
    public abstract Response alertarConocido(Alerta body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response alertarEmergencias(Ubicacion body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response cancelAlerta(SecurityContext securityContext) throws NotFoundException;
}
