/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nostalciac.business;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import nostalciac.entity.Tag;

/**
 *
 * @author tss
 */
@Stateless
public class TagStore {
    
    @PersistenceContext()
    EntityManager em;
    
    public List<Tag> all() {
        return em.createQuery("select e From Tag e ORDER BY e.tag", Tag.class)
                .getResultList();
    }
    
    public Tag create(Tag tag) {
        return em.merge(tag);
        
    }
    
}
