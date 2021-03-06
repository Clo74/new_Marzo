/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.ciacformazione.nostalciac.services;

import it.ciacformazione.nostalciac.business.CorsoStore;
import it.ciacformazione.nostalciac.business.SedeStore;
import it.ciacformazione.nostalciac.entity.Sede;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author tss
 */
public class SedeResource {

    private final CorsoStore corsoStore;
    private final SedeStore store;
    private final Integer id;

    public SedeResource(CorsoStore corsoStore, SedeStore store, Integer id) {
        this.corsoStore = corsoStore;
        this.store = store;
        this.id = id;
    }

    @GET
    public Sede find() {
        return store.find(id);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void update(Sede s) {
        s.setId(id);
        store.save(s);
    }

    @DELETE
    public void delete() {
        store.remove(id);
    }

    @Path("/corsi")
    public CorsiResource getCorsi() {
        return new CorsiResource(corsoStore, store, id);
    }
}
