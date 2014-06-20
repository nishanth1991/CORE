/**
 */
package ca.mcgill.sel.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CORE Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.mcgill.sel.core.COREModel#getReuses <em>Reuses</em>}</li>
 *   <li>{@link ca.mcgill.sel.core.COREModel#getModelElements <em>Model Elements</em>}</li>
 *   <li>{@link ca.mcgill.sel.core.COREModel#getRealizes <em>Realizes</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.mcgill.sel.core.CorePackage#getCOREModel()
 * @model abstract="true"
 *        extendedMetaData="name='COREFeatureModel'"
 * @generated
 */
public interface COREModel extends CORENamedElement {
    /**
     * Returns the value of the '<em><b>Reuses</b></em>' containment reference list.
     * The list contents are of type {@link ca.mcgill.sel.core.COREReuse}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reuses</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reuses</em>' containment reference list.
     * @see ca.mcgill.sel.core.CorePackage#getCOREModel_Reuses()
     * @model containment="true"
     * @generated
     */
    EList<COREReuse> getReuses();

    /**
     * Returns the value of the '<em><b>Model Elements</b></em>' reference list.
     * The list contents are of type {@link ca.mcgill.sel.core.COREModelElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model Elements</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model Elements</em>' reference list.
     * @see ca.mcgill.sel.core.CorePackage#getCOREModel_ModelElements()
     * @model transient="true" changeable="false" derived="true"
     * @generated
     */
    EList<COREModelElement> getModelElements();

    /**
     * Returns the value of the '<em><b>Realizes</b></em>' reference list.
     * The list contents are of type {@link ca.mcgill.sel.core.COREFeature}.
     * It is bidirectional and its opposite is '{@link ca.mcgill.sel.core.COREFeature#getRealizedBy <em>Realized By</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Realizes</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Realizes</em>' reference list.
     * @see ca.mcgill.sel.core.CorePackage#getCOREModel_Realizes()
     * @see ca.mcgill.sel.core.COREFeature#getRealizedBy
     * @model opposite="realizedBy"
     * @generated
     */
    EList<COREFeature> getRealizes();

} // COREModel
