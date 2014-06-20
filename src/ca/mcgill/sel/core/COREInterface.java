/**
 */
package ca.mcgill.sel.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CORE Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.mcgill.sel.core.COREInterface#getSelectable <em>Selectable</em>}</li>
 *   <li>{@link ca.mcgill.sel.core.COREInterface#getCustomizable <em>Customizable</em>}</li>
 *   <li>{@link ca.mcgill.sel.core.COREInterface#getUsable <em>Usable</em>}</li>
 *   <li>{@link ca.mcgill.sel.core.COREInterface#getImpacted <em>Impacted</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.mcgill.sel.core.CorePackage#getCOREInterface()
 * @model
 * @generated
 */
public interface COREInterface extends EObject {
    /**
     * Returns the value of the '<em><b>Selectable</b></em>' reference list.
     * The list contents are of type {@link ca.mcgill.sel.core.COREFeature}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Selectable</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Selectable</em>' reference list.
     * @see ca.mcgill.sel.core.CorePackage#getCOREInterface_Selectable()
     * @model
     * @generated
     */
    EList<COREFeature> getSelectable();

    /**
     * Returns the value of the '<em><b>Customizable</b></em>' reference list.
     * The list contents are of type {@link ca.mcgill.sel.core.COREModelElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Customizable</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Customizable</em>' reference list.
     * @see ca.mcgill.sel.core.CorePackage#getCOREInterface_Customizable()
     * @model
     * @generated
     */
    EList<COREModelElement> getCustomizable();

    /**
     * Returns the value of the '<em><b>Usable</b></em>' reference list.
     * The list contents are of type {@link ca.mcgill.sel.core.COREModelElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Usable</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Usable</em>' reference list.
     * @see ca.mcgill.sel.core.CorePackage#getCOREInterface_Usable()
     * @model
     * @generated
     */
    EList<COREModelElement> getUsable();

    /**
     * Returns the value of the '<em><b>Impacted</b></em>' reference list.
     * The list contents are of type {@link ca.mcgill.sel.core.COREImpactModelElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Impacted</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Impacted</em>' reference list.
     * @see ca.mcgill.sel.core.CorePackage#getCOREInterface_Impacted()
     * @model
     * @generated
     */
    EList<COREImpactModelElement> getImpacted();

} // COREInterface
