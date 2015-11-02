package Ontology.impl;

import Ontology.*;

import java.util.Collection;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultCORNEAL_THICKNESS <br>
 * @version generated on Mon Nov 02 00:41:37 WAT 2015 by oyindolapo
 */
public class DefaultCORNEAL_THICKNESS extends WrappedIndividualImpl implements CORNEAL_THICKNESS {

    public DefaultCORNEAL_THICKNESS(OWLOntology ontology, IRI iri) {
        super(ontology, iri);
    }





    /* ***************************************************
     * Data Property http://www.semanticweb.org/oyindolapo/ontologies/2015/9/updated_ontology#has_corneal_thickness
     */
     
    public Collection<? extends String> getHas_corneal_thickness() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HAS_CORNEAL_THICKNESS, String.class);
    }

    public boolean hasHas_corneal_thickness() {
		return !getHas_corneal_thickness().isEmpty();
    }

    public void addHas_corneal_thickness(String newHas_corneal_thickness) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HAS_CORNEAL_THICKNESS, newHas_corneal_thickness);
    }

    public void removeHas_corneal_thickness(String oldHas_corneal_thickness) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HAS_CORNEAL_THICKNESS, oldHas_corneal_thickness);
    }


}