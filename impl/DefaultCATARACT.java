package Ontology.impl;

import Ontology.*;

import java.util.Collection;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultCATARACT <br>
 * @version generated on Mon Nov 02 00:41:37 WAT 2015 by oyindolapo
 */
public class DefaultCATARACT extends WrappedIndividualImpl implements CATARACT {

    public DefaultCATARACT(OWLOntology ontology, IRI iri) {
        super(ontology, iri);
    }





    /* ***************************************************
     * Object Property http://www.semanticweb.org/oyindolapo/ontologies/2015/9/updated_ontology#has_cataract
     */
     
    public Collection<? extends WrappedIndividual> getHas_cataract() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_CATARACT,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasHas_cataract() {
	   return !getHas_cataract().isEmpty();
    }

    public void addHas_cataract(WrappedIndividual newHas_cataract) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_CATARACT,
                                       newHas_cataract);
    }

    public void removeHas_cataract(WrappedIndividual oldHas_cataract) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_CATARACT,
                                          oldHas_cataract);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/oyindolapo/ontologies/2015/9/updated_ontology#has_comorbid
     */
     
    public Collection<? extends WrappedIndividual> getHas_comorbid() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_COMORBID,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasHas_comorbid() {
	   return !getHas_comorbid().isEmpty();
    }

    public void addHas_comorbid(WrappedIndividual newHas_comorbid) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_COMORBID,
                                       newHas_comorbid);
    }

    public void removeHas_comorbid(WrappedIndividual oldHas_comorbid) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_COMORBID,
                                          oldHas_comorbid);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/oyindolapo/ontologies/2015/9/updated_ontology#has_glaucoma
     */
     
    public Collection<? extends WrappedIndividual> getHas_glaucoma() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_GLAUCOMA,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasHas_glaucoma() {
	   return !getHas_glaucoma().isEmpty();
    }

    public void addHas_glaucoma(WrappedIndividual newHas_glaucoma) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_GLAUCOMA,
                                       newHas_glaucoma);
    }

    public void removeHas_glaucoma(WrappedIndividual oldHas_glaucoma) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_GLAUCOMA,
                                          oldHas_glaucoma);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/oyindolapo/ontologies/2015/9/updated_ontology#has_none
     */
     
    public Collection<? extends WrappedIndividual> getHas_none() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_NONE,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasHas_none() {
	   return !getHas_none().isEmpty();
    }

    public void addHas_none(WrappedIndividual newHas_none) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_NONE,
                                       newHas_none);
    }

    public void removeHas_none(WrappedIndividual oldHas_none) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_NONE,
                                          oldHas_none);
    }


}
