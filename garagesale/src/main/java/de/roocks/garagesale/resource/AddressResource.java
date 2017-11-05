package de.roocks.garagesale.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import de.roocks.garagesale.model.Address;
import de.roocks.garagesale.service.AddressService;

@Path("addresses")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AddressResource {
	
	@Autowired
	private AddressService addressService;
	
	@POST
	@Path("address")
	public void storeAddress(Address address) {
		addressService.storeAddress(address);
	}
}
