/**
 */
package ca.mcgill.sel.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ca.mcgill.sel.core.COREFeature;
import ca.mcgill.sel.core.COREModel;
import ca.mcgill.sel.core.COREModelElement;
import ca.mcgill.sel.core.COREReuse;
import ca.mcgill.sel.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CORE Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.mcgill.sel.core.impl.COREModelImpl#getReuses <em>Reuses</em>}</li>
 *   <li>{@link ca.mcgill.sel.core.impl.COREModelImpl#getModelElements <em>Model Elements</em>}</li>
 *   <li>{@link ca.mcgill.sel.core.impl.COREModelImpl#getRealizes <em>Realizes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class COREModelImpl extends CORENamedElementImpl implements COREModel {
    /**
     * The cached value of the '{@link #getReuses() <em>Reuses</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReuses()
     * @generated
     * @ordered
     */
    protected EList<COREReuse> reuses;

    /**
     * The cached value of the '{@link #getModelElements() <em>Model Elements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModelElements()
     * @generated
     * @ordered
     */
    protected EList<COREModelElement> modelElements;

    /**
     * The cached value of the '{@link #getRealizes() <em>Realizes</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRealizes()
     * @generated
     * @ordered
     */
    protected EList<COREFeature> realizes;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected COREModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CorePackage.Literals.CORE_MODEL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<COREReuse> getReuses() {
        if (reuses == null) {
            reuses = new EObjectContainmentEList<COREReuse>(COREReuse.class, this, CorePackage.CORE_MODEL__REUSES);
        }
        return reuses;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<COREModelElement> getModelElements() {
        if (modelElements == null) {
            modelElements = new EObjectResolvingEList<COREModelElement>(COREModelElement.class, this, CorePackage.CORE_MODEL__MODEL_ELEMENTS);
        }
        return modelElements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<COREFeature> getRealizes() {
        if (realizes == null) {
            realizes = new EObjectWithInverseResolvingEList.ManyInverse<COREFeature>(COREFeature.class, this, CorePackage.CORE_MODEL__REALIZES, CorePackage.CORE_FEATURE__REALIZED_BY);
        }
        return realizes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CorePackage.CORE_MODEL__REALIZES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealizes()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CorePackage.CORE_MODEL__REUSES:
                return ((InternalEList<?>)getReuses()).basicRemove(otherEnd, msgs);
            case CorePackage.CORE_MODEL__REALIZES:
                return ((InternalEList<?>)getRealizes()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CorePackage.CORE_MODEL__REUSES:
                return getReuses();
            case CorePackage.CORE_MODEL__MODEL_ELEMENTS:
                return getModelElements();
            case CorePackage.CORE_MODEL__REALIZES:
                return getRealizes();
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
            case CorePackage.CORE_MODEL__REUSES:
                getReuses().clear();
                getReuses().addAll((Collection<? extends COREReuse>)newValue);
                return;
            case CorePackage.CORE_MODEL__REALIZES:
                getRealizes().clear();
                getRealizes().addAll((Collection<? extends COREFeature>)newValue);
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
            case CorePackage.CORE_MODEL__REUSES:
                getReuses().clear();
                return;
            case CorePackage.CORE_MODEL__REALIZES:
                getRealizes().clear();
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
            case CorePackage.CORE_MODEL__REUSES:
                return reuses != null && !reuses.isEmpty();
            case CorePackage.CORE_MODEL__MODEL_ELEMENTS:
                return modelElements != null && !modelElements.isEmpty();
            case CorePackage.CORE_MODEL__REALIZES:
                return realizes != null && !realizes.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //COREModelImpl
