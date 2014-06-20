/**
 */
package ca.mcgill.sel.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CORE Reuse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.mcgill.sel.core.COREReuse#getReusedConcern <em>Reused Concern</em>}</li>
 *   <li>{@link ca.mcgill.sel.core.COREReuse#getCompositions <em>Compositions</em>}</li>
 *   <li>{@link ca.mcgill.sel.core.COREReuse#getSelected <em>Selected</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.mcgill.sel.core.CorePackage#getCOREReuse()
 * @model
 * @generated
 */
public interface COREReuse extends EObject {
    /**
     * Returns the value of the '<em><b>Reused Concern</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reused Concern</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reused Concern</em>' reference.
     * @see #setReusedConcern(COREConcern)
     * @see ca.mcgill.sel.core.CorePackage#getCOREReuse_ReusedConcern()
     * @model required="true"
     * @generated
     */
    COREConcern getReusedConcern();

    /**
     * Sets the value of the '{@link ca.mcgill.sel.core.COREReuse#getReusedConcern <em>Reused Concern</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reused Concern</em>' reference.
     * @see #getReusedConcern()
     * @generated
     */
    void setReusedConcern(COREConcern value);

    /**
     * Returns the value of the '<em><b>Compositions</b></em>' reference list.
     * The list contents are of type {@link ca.mcgill.sel.core.CORECompositionSpecification}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Compositions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Compositions</em>' reference list.
     * @see ca.mcgill.sel.core.CorePackage#getCOREReuse_Compositions()
     * @model
     * @generated
     */
    EList<CORECompositionSpecification> getCompositions();

    /**
     * Returns the value of the '<em><b>Selected</b></em>' reference list.
     * The list contents are of type {@link ca.mcgill.sel.core.COREFeature}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Selected</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Selected</em>' reference list.
     * @see ca.mcgill.sel.core.CorePackage#getCOREReuse_Selected()
     * @model required="true"
     * @generated
     */
    EList<COREFeature> getSelected();

} // COREReuse
