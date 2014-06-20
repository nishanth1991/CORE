/**
 */
package ca.mcgill.sel.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CORE Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.mcgill.sel.core.COREFeature#getRealizedBy <em>Realized By</em>}</li>
 *   <li>{@link ca.mcgill.sel.core.COREFeature#getStrategies <em>Strategies</em>}</li>
 *   <li>{@link ca.mcgill.sel.core.COREFeature#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.mcgill.sel.core.CorePackage#getCOREFeature()
 * @model abstract="true"
 * @generated
 */
public interface COREFeature extends COREModelElement {
    /**
     * Returns the value of the '<em><b>Realized By</b></em>' reference list.
     * The list contents are of type {@link ca.mcgill.sel.core.COREModel}.
     * It is bidirectional and its opposite is '{@link ca.mcgill.sel.core.COREModel#getRealizes <em>Realizes</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Realized By</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Realized By</em>' reference list.
     * @see ca.mcgill.sel.core.CorePackage#getCOREFeature_RealizedBy()
     * @see ca.mcgill.sel.core.COREModel#getRealizes
     * @model opposite="realizes"
     * @generated
     */
    EList<COREModel> getRealizedBy();

    /**
     * Returns the value of the '<em><b>Strategies</b></em>' containment reference list.
     * The list contents are of type {@link ca.mcgill.sel.core.COREStrategy}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Strategies</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Strategies</em>' containment reference list.
     * @see ca.mcgill.sel.core.CorePackage#getCOREFeature_Strategies()
     * @model containment="true"
     * @generated
     */
    EList<COREStrategy> getStrategies();

    /**
     * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
     * The list contents are of type {@link ca.mcgill.sel.core.COREConfiguration}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Configurations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Configurations</em>' containment reference list.
     * @see ca.mcgill.sel.core.CorePackage#getCOREFeature_Configurations()
     * @model containment="true"
     * @generated
     */
    EList<COREConfiguration> getConfigurations();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model child_nameRequired="true" associationRequired="true"
     * @generated
     */
    void addFeature(String child_name, COREFeatureRelationshipType association);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    void delete();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    void rename(String core_feature_name);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model new_associationRequired="true"
     * @generated
     */
    void changeLink(COREFeatureRelationshipType new_association);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model featureRequired="true" new_associationRequired="true"
     * @generated
     */
    void changeParent(COREFeature feature, COREFeatureRelationshipType new_association);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model featureRequired="true"
     * @generated
     */
    void requires(COREFeature feature);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model featureRequired="true"
     * @generated
     */
    void excludes(COREFeature feature);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model featureRequired="true"
     * @generated
     */
    void removeConstraint(COREFeature feature);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model modelRequired="true"
     * @generated
     */
    void addRealizedBy(COREModel model);

} // COREFeature
