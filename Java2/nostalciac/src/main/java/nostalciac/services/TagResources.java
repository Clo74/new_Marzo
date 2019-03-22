/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nostalciac.services;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import nostalciac.business.TagStore;
import nostalciac.entity.Tag;

/**
 *
 * @author tss
 */
@Path("tags")
public class TagResources {
        @Inject
        TagStore store;
    @GET
    public List<Tag> findAll() {
        return store.all();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(Tag tag) {
        store.create(tag);
    }
}
