/**
 */
package ca.mcgill.sel.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import ca.mcgill.sel.core.COREConcern;
import ca.mcgill.sel.core.COREConfiguration;
import ca.mcgill.sel.core.COREFeature;
import ca.mcgill.sel.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CORE Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.mcgill.sel.core.impl.COREConfigurationImpl#getReusedConcern <em>Reused Concern</em>}</li>
 *   <li>{@link ca.mcgill.sel.core.impl.COREConfigurationImpl#getSelected <em>Selected</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class COREConfigurationImpl extends CORENamedElementImpl implements COREConfiguration {
    /**
     * The cached value of the '{@link #getReusedConcern() <em>Reused Concern</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReusedConcern()
     * @generated
     * @ordered
     */
    protected EList<COREConcern> reusedConcern;

    /**
     * The cached value of the '{@link #getSelected() <em>Selected</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSelected()
     * @generated
     * @ordered
     */
    protected EList<COREFeature> selected;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected COREConfigurationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CorePackage.Literals.CORE_CONFIGURATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<COREConcern> getReusedConcern() {
        if (reusedConcern == null) {
            reusedConcern = new EObjectResolvingEList<COREConcern>(COREConcern.class, this, CorePackage.CORE_CONFIGURATION__REUSED_CONCERN);
        }
        return reusedConcern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<COREFeature> getSelected() {
        if (selected == null) {
            selected = new EObjectResolvingEList<COREFeature>(COREFeature.class, this, CorePackage.CORE_CONFIGURATION__SELECTED);
        }
        return selected;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CorePackage.CORE_CONFIGURATION__REUSED_CONCERN:
                return getReusedConcern();
            case CorePackage.CORE_CONFIGURATION__SELECTED:
                return getSelected();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case CorePackage.CORE_CONFIGURATION__REUSED_CONCERN:
                getReusedConcern().clear();
                getReusedConcern().addAll((Collection<? extends COREConcern>)newValue);
                return;
            case CorePackage.CORE_CONFIGURATION__SELECTED:
                getSelected().clear();
                getSelected().addAll((Collection<? extends COREFeature>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case CorePackage.CORE_CONFIGURATION__REUSED_CONCERN:
                getReusedConcern().clear();
                return;
            case CorePackage.CORE_CONFIGURATION__SELECTED:
                getSelected().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case CorePackage.CORE_CONFIGURATION__REUSED_CONCERN:
                return reusedConcern != null && !reusedConcern.isEmpty();
            case CorePackage.CORE_CONFIGURATION__SELECTED:
                return selected != null && !selected.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //COREConfigurationImpl
