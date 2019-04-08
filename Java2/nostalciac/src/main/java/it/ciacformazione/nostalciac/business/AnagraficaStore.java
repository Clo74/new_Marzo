/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.ciacformazione.nostalciac.business;

import it.ciacformazione.nostalciac.entity.Anagrafica;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author tss
 */
@Stateless
public class AnagraficaStore {
    
    @PersistenceContext
    EntityManager em;
    
    public Anagrafica find(Integer id){
        return em.find(Anagrafica.class, id);
    }
    
    public Anagrafica save(Anagrafica c){
        return em.merge(c);
    }
    
    public void remove(Integer id){
        em.remove(find(id));
    }
    
    public List<Anagrafica> findAll(){
        return em.createQuery("select a from Anagrafica a order by a.cognome, a.nome",Anagrafica.class)
                .getResultList();
    }
}
