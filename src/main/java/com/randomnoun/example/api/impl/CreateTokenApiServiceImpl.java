package com.randomnoun.example.api.impl;

import com.randomnoun.example.api.*;

import java.util.List;
import com.randomnoun.example.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.SecurityContext;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", comments = "Generator version: 7.11.0")
public class CreateTokenApiServiceImpl extends CreateTokenApiService {

	@Override
	public Response createToken(String username, String password, SecurityContext securityContext)
			throws NotFoundException {
		
		return Response.ok().entity("username=" + username + ", password=" + password).build();
		
	}
	
	
}
