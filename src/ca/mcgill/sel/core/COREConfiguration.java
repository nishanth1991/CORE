/**
 */
package ca.mcgill.sel.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CORE Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.mcgill.sel.core.COREConfiguration#getReusedConcern <em>Reused Concern</em>}</li>
 *   <li>{@link ca.mcgill.sel.core.COREConfiguration#getSelected <em>Selected</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.mcgill.sel.core.CorePackage#getCOREConfiguration()
 * @model abstract="true"
 * @generated
 */
public interface COREConfiguration extends CORENamedElement {
    /**
     * Returns the value of the '<em><b>Reused Concern</b></em>' reference list.
     * The list contents are of type {@link ca.mcgill.sel.core.COREConcern}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reused Concern</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reused Concern</em>' reference list.
     * @see ca.mcgill.sel.core.CorePackage#getCOREConfiguration_ReusedConcern()
     * @model
     * @generated
     */
    EList<COREConcern> getReusedConcern();

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
     * @see ca.mcgill.sel.core.CorePackage#getCOREConfiguration_Selected()
     * @model required="true"
     * @generated
     */
    EList<COREFeature> getSelected();

} // COREConfiguration
