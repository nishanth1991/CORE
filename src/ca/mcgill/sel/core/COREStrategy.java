/**
 */
package ca.mcgill.sel.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CORE Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.mcgill.sel.core.COREStrategy#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.mcgill.sel.core.CorePackage#getCOREStrategy()
 * @model abstract="true"
 * @generated
 */
public interface COREStrategy extends CORENamedElement {
    /**
     * Returns the value of the '<em><b>Configurations</b></em>' reference list.
     * The list contents are of type {@link ca.mcgill.sel.core.COREConfiguration}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Configurations</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Configurations</em>' reference list.
     * @see ca.mcgill.sel.core.CorePackage#getCOREStrategy_Configurations()
     * @model
     * @generated
     */
    EList<COREConfiguration> getConfigurations();

} // COREStrategy
