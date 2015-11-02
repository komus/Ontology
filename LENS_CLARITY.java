package Ontology;

import java.util.Collection;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: LENS_CLARITY <br>
 * @version generated on Mon Nov 02 00:41:37 WAT 2015 by oyindolapo
 */

public interface LENS_CLARITY extends EVALUATION_OF_RESULTS {

    /* ***************************************************
     * Property http://www.semanticweb.org/oyindolapo/ontologies/2015/9/updated_ontology#has_clarity
     */
     
    /**
     * Gets all property values for the has_clarity property.<p>
     * 
     * @returns a collection of values for the has_clarity property.
     */
    Collection<? extends String> getHas_clarity();

    /**
     * Checks if the class has a has_clarity property value.<p>
     * 
     * @return true if there is a has_clarity property value.
     */
    boolean hasHas_clarity();

    /**
     * Adds a has_clarity property value.<p>
     * 
     * @param newHas_clarity the has_clarity property value to be added
     */
    void addHas_clarity(String newHas_clarity);

    /**
     * Removes a has_clarity property value.<p>
     * 
     * @param oldHas_clarity the has_clarity property value to be removed.
     */
    void removeHas_clarity(String oldHas_clarity);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
