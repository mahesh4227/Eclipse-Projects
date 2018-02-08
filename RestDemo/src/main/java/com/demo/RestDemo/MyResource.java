package com.demo.RestDemo;

import java.util.Arrays;
import java.util.List;

import javax.swing.text.html.parser.Entity;
import javax.ws.rs.*;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.demo.RestDemo.model.Test;
import com.demo.RestDemo.model.service.TestService;
import com.google.gson.Gson;


@Path("myresource")
public class MyResource {
	TestService ts=new TestService();
  /* @RequestMapping(value = "/employees", produces = MediaType.APPLICATION_JSON,  method = RequestMethod.GET)
   public String getAllEmployeesJSON(Entity entity)
   {
       entity.addAttribute("employees", getEmployees());
       return "jsonTemplate";
   }
   private static void getEmployees()
   {
       final String uri = "http://localhost:8086/spring/createEmployee";
        
       RestTemplate restTemplate = new RestTemplate();
        
       HttpHeaders headers = new HttpHeaders();
       headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
       HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
        
       ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
        
       System.out.println(result);
   }
  */
    //@Produces(MediaType.APPLICATION_XML)
    //  @Produces("application/json")
     // @Produces(MediaType.TEXT_PLAIN)
   //@Produces(MediaType.APPLICATION_XML)
   @GET
   @Path("getit")
    public Response getIt() {
    	//System.out.println("hello");
        //return "Hello World!";
	  // RestTemplate restTemplate = new RestTemplate();
	   Gson g=new Gson();
	   String l=g.toJson(TestService.getIt());
	   System.out.println();
	   return Response.status(200).entity(l).build();
	
    }
   @POST
   @Path("post")
   @Consumes(MediaType.APPLICATION_JSON)
  // @Produces(MediaType.TEXT_PLAIN)
   public Response postIt() { 
	   Gson g=new Gson();
       String result =g.toJson(TestService.postIt());
       return Response.status(201).entity(result).build(); 
   }
   
   @PUT
   @Path("/{param}")
   public Response putMsg(@PathParam("param") String msg) {
       String output = "PUT: Jersey say : " + msg;
       return Response.status(200).entity(output).build();
   }

   @DELETE
   @Path("/{param}")
   public Response deleteMsg(@PathParam("param") String msg) {
       String output = "DELETE:Jersey say : " + msg;
       return Response.status(200).entity(output).build();
   }
}
