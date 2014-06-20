/**
 */
package ca.mcgill.sel.core.impl;

import ca.mcgill.sel.core.COREConfiguration;
import ca.mcgill.sel.core.COREFeature;
import ca.mcgill.sel.core.COREFeatureRelationshipType;
import ca.mcgill.sel.core.COREModel;
import ca.mcgill.sel.core.COREStrategy;
import ca.mcgill.sel.core.CorePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CORE Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.mcgill.sel.core.impl.COREFeatureImpl#getRealizedBy <em>Realized By</em>}</li>
 *   <li>{@link ca.mcgill.sel.core.impl.COREFeatureImpl#getStrategies <em>Strategies</em>}</li>
 *   <li>{@link ca.mcgill.sel.core.impl.COREFeatureImpl#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class COREFeatureImpl extends COREModelElementImpl implements COREFeature {
    /**
     * The cached value of the '{@link #getRealizedBy() <em>Realized By</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRealizedBy()
     * @generated
     * @ordered
     */
    protected EList<COREModel> realizedBy;

    /**
     * The cached value of the '{@link #getStrategies() <em>Strategies</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStrategies()
     * @generated
     * @ordered
     */
    protected EList<COREStrategy> strategies;

    /**
     * The cached value of the '{@link #getConfigurations() <em>Configurations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfigurations()
     * @generated
     * @ordered
     */
    protected EList<COREConfiguration> configurations;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected COREFeatureImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CorePackage.Literals.CORE_FEATURE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<COREModel> getRealizedBy() {
        if (realizedBy == null) {
            realizedBy = new EObjectWithInverseResolvingEList.ManyInverse<COREModel>(COREModel.class, this, CorePackage.CORE_FEATURE__REALIZED_BY, CorePackage.CORE_MODEL__REALIZES);
        }
        return realizedBy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<COREStrategy> getStrategies() {
        if (strategies == null) {
            strategies = new EObjectContainmentEList<COREStrategy>(COREStrategy.class, this, CorePackage.CORE_FEATURE__STRATEGIES);
        }
        return strategies;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<COREConfiguration> getConfigurations() {
        if (configurations == null) {
            configurations = new EObjectContainmentEList<COREConfiguration>(COREConfiguration.class, this, CorePackage.CORE_FEATURE__CONFIGURATIONS);
        }
        return configurations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void addFeature(String child_name, COREFeatureRelationshipType association) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void delete() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void rename(String core_feature_name) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void changeLink(COREFeatureRelationshipType new_association) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void changeParent(COREFeature feature, COREFeatureRelationshipType new_association) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void requires(COREFeature feature) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void excludes(COREFeature feature) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void removeConstraint(COREFeature feature) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void addRealizedBy(COREModel model) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
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
            case CorePackage.CORE_FEATURE__REALIZED_BY:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealizedBy()).basicAdd(otherEnd, msgs);
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
            case CorePackage.CORE_FEATURE__REALIZED_BY:
                return ((InternalEList<?>)getRealizedBy()).basicRemove(otherEnd, msgs);
            case CorePackage.CORE_FEATURE__STRATEGIES:
                return ((InternalEList<?>)getStrategies()).basicRemove(otherEnd, msgs);
            case CorePackage.CORE_FEATURE__CONFIGURATIONS:
                return ((InternalEList<?>)getConfigurations()).basicRemove(otherEnd, msgs);
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
            case CorePackage.CORE_FEATURE__REALIZED_BY:
                return getRealizedBy();
            case CorePackage.CORE_FEATURE__STRATEGIES:
                return getStrategies();
            case CorePackage.CORE_FEATURE__CONFIGURATIONS:
                return getConfigurations();
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
            case CorePackage.CORE_FEATURE__REALIZED_BY:
                getRealizedBy().clear();
                getRealizedBy().addAll((Collection<? extends COREModel>)newValue);
                return;
            case CorePackage.CORE_FEATURE__STRATEGIES:
                getStrategies().clear();
                getStrategies().addAll((Collection<? extends COREStrategy>)newValue);
                return;
            case CorePackage.CORE_FEATURE__CONFIGURATIONS:
                getConfigurations().clear();
                getConfigurations().addAll((Collection<? extends COREConfiguration>)newValue);
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
            case CorePackage.CORE_FEATURE__REALIZED_BY:
                getRealizedBy().clear();
                return;
            case CorePackage.CORE_FEATURE__STRATEGIES:
                getStrategies().clear();
                return;
            case CorePackage.CORE_FEATURE__CONFIGURATIONS:
                getConfigurations().clear();
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
            case CorePackage.CORE_FEATURE__REALIZED_BY:
                return realizedBy != null && !realizedBy.isEmpty();
            case CorePackage.CORE_FEATURE__STRATEGIES:
                return strategies != null && !strategies.isEmpty();
            case CorePackage.CORE_FEATURE__CONFIGURATIONS:
                return configurations != null && !configurations.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //COREFeatureImpl
