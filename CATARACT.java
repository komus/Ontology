package Ontology;

import java.util.Collection;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: CATARACT <br>
 * @version generated on Mon Nov 02 00:41:37 WAT 2015 by oyindolapo
 */

public interface CATARACT extends DECISIONS {

    /* ***************************************************
     * Property http://www.semanticweb.org/oyindolapo/ontologies/2015/9/updated_ontology#has_cataract
     */
     
    /**
     * Gets all property values for the has_cataract property.<p>
     * 
     * @returns a collection of values for the has_cataract property.
     */
    Collection<? extends WrappedIndividual> getHas_cataract();

    /**
     * Checks if the class has a has_cataract property value.<p>
     * 
     * @return true if there is a has_cataract property value.
     */
    boolean hasHas_cataract();

    /**
     * Adds a has_cataract property value.<p>
     * 
     * @param newHas_cataract the has_cataract property value to be added
     */
    void addHas_cataract(WrappedIndividual newHas_cataract);

    /**
     * Removes a has_cataract property value.<p>
     * 
     * @param oldHas_cataract the has_cataract property value to be removed.
     */
    void removeHas_cataract(WrappedIndividual oldHas_cataract);


    /* ***************************************************
     * Property http://www.semanticweb.org/oyindolapo/ontologies/2015/9/updated_ontology#has_comorbid
     */
     
    /**
     * Gets all property values for the has_comorbid property.<p>
     * 
     * @returns a collection of values for the has_comorbid property.
     */
    Collection<? extends WrappedIndividual> getHas_comorbid();

    /**
     * Checks if the class has a has_comorbid property value.<p>
     * 
     * @return true if there is a has_comorbid property value.
     */
    boolean hasHas_comorbid();

    /**
     * Adds a has_comorbid property value.<p>
     * 
     * @param newHas_comorbid the has_comorbid property value to be added
     */
    void addHas_comorbid(WrappedIndividual newHas_comorbid);

    /**
     * Removes a has_comorbid property value.<p>
     * 
     * @param oldHas_comorbid the has_comorbid property value to be removed.
     */
    void removeHas_comorbid(WrappedIndividual oldHas_comorbid);


    /* ***************************************************
     * Property http://www.semanticweb.org/oyindolapo/ontologies/2015/9/updated_ontology#has_glaucoma
     */
     
    /**
     * Gets all property values for the has_glaucoma property.<p>
     * 
     * @returns a collection of values for the has_glaucoma property.
     */
    Collection<? extends WrappedIndividual> getHas_glaucoma();

    /**
     * Checks if the class has a has_glaucoma property value.<p>
     * 
     * @return true if there is a has_glaucoma property value.
     */
    boolean hasHas_glaucoma();

    /**
     * Adds a has_glaucoma property value.<p>
     * 
     * @param newHas_glaucoma the has_glaucoma property value to be added
     */
    void addHas_glaucoma(WrappedIndividual newHas_glaucoma);

    /**
     * Removes a has_glaucoma property value.<p>
     * 
     * @param oldHas_glaucoma the has_glaucoma property value to be removed.
     */
    void removeHas_glaucoma(WrappedIndividual oldHas_glaucoma);


    /* ***************************************************
     * Property http://www.semanticweb.org/oyindolapo/ontologies/2015/9/updated_ontology#has_none
     */
     
    /**
     * Gets all property values for the has_none property.<p>
     * 
     * @returns a collection of values for the has_none property.
     */
    Collection<? extends WrappedIndividual> getHas_none();

    /**
     * Checks if the class has a has_none property value.<p>
     * 
     * @return true if there is a has_none property value.
     */
    boolean hasHas_none();

    /**
     * Adds a has_none property value.<p>
     * 
     * @param newHas_none the has_none property value to be added
     */
    void addHas_none(WrappedIndividual newHas_none);

    /**
     * Removes a has_none property value.<p>
     * 
     * @param oldHas_none the has_none property value to be removed.
     */
    void removeHas_none(WrappedIndividual oldHas_none);


    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
