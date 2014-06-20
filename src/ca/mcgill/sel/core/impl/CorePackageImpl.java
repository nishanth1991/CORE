/**
 */
package ca.mcgill.sel.core.impl;

import ca.mcgill.sel.core.COREBinding;
import ca.mcgill.sel.core.CORECompositionSpecification;
import ca.mcgill.sel.core.COREConcern;
import ca.mcgill.sel.core.COREConfiguration;
import ca.mcgill.sel.core.COREFeature;
import ca.mcgill.sel.core.COREFeatureModel;
import ca.mcgill.sel.core.COREFeatureRelationshipType;
import ca.mcgill.sel.core.COREImpactModel;
import ca.mcgill.sel.core.COREImpactModelElement;
import ca.mcgill.sel.core.COREInterface;
import ca.mcgill.sel.core.COREMapping;
import ca.mcgill.sel.core.COREModel;
import ca.mcgill.sel.core.COREModelElement;
import ca.mcgill.sel.core.CORENamedElement;
import ca.mcgill.sel.core.COREPattern;
import ca.mcgill.sel.core.COREReuse;
import ca.mcgill.sel.core.COREStrategy;
import ca.mcgill.sel.core.CoreFactory;
import ca.mcgill.sel.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CorePackageImpl extends EPackageImpl implements CorePackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass coreModelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass coreImpactModelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass coreConcernEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass coreFeatureEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass coreBindingEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass coreModelElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass coreCompositionSpecificationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass coreMappingEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass coreNamedElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass coreStrategyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass coreInterfaceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass coreReuseEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass corePatternEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass coreImpactModelElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass coreConfigurationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass coreFeatureModelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum coreFeatureRelationshipTypeEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see ca.mcgill.sel.core.CorePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private CorePackageImpl() {
        super(eNS_URI, CoreFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link CorePackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static CorePackage init() {
        if (isInited) return (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

        // Obtain or create and register package
        CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CorePackageImpl());

        isInited = true;

        // Create package meta-data objects
        theCorePackage.createPackageContents();

        // Initialize created meta-data
        theCorePackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theCorePackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, theCorePackage);
        return theCorePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCOREModel() {
        return coreModelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOREModel_Reuses() {
        return (EReference)coreModelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOREModel_ModelElements() {
        return (EReference)coreModelEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOREModel_Realizes() {
        return (EReference)coreModelEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCOREImpactModel() {
        return coreImpactModelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCOREConcern() {
        return coreConcernEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOREConcern_Models() {
        return (EReference)coreConcernEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOREConcern_Interface() {
        return (EReference)coreConcernEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCOREFeature() {
        return coreFeatureEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOREFeature_RealizedBy() {
        return (EReference)coreFeatureEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOREFeature_Strategies() {
        return (EReference)coreFeatureEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOREFeature_Configurations() {
        return (EReference)coreFeatureEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCOREBinding() {
        return coreBindingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOREBinding_CoreMappings() {
        return (EReference)coreBindingEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCOREModelElement() {
        return coreModelElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCORECompositionSpecification() {
        return coreCompositionSpecificationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCORECompositionSpecification_Source() {
        return (EReference)coreCompositionSpecificationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCOREMapping() {
        return coreMappingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOREMapping_MappedTo() {
        return (EReference)coreMappingEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOREMapping_MappedFrom() {
        return (EReference)coreMappingEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCORENamedElement() {
        return coreNamedElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCORENamedElement_Name() {
        return (EAttribute)coreNamedElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCOREStrategy() {
        return coreStrategyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOREStrategy_Configurations() {
        return (EReference)coreStrategyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCOREInterface() {
        return coreInterfaceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOREInterface_Selectable() {
        return (EReference)coreInterfaceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOREInterface_Customizable() {
        return (EReference)coreInterfaceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOREInterface_Usable() {
        return (EReference)coreInterfaceEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOREInterface_Impacted() {
        return (EReference)coreInterfaceEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCOREReuse() {
        return coreReuseEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOREReuse_ReusedConcern() {
        return (EReference)coreReuseEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOREReuse_Compositions() {
        return (EReference)coreReuseEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOREReuse_Selected() {
        return (EReference)coreReuseEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCOREPattern() {
        return corePatternEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCOREImpactModelElement() {
        return coreImpactModelElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCOREConfiguration() {
        return coreConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOREConfiguration_ReusedConcern() {
        return (EReference)coreConfigurationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOREConfiguration_Selected() {
        return (EReference)coreConfigurationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCOREFeatureModel() {
        return coreFeatureModelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getCOREFeatureRelationshipType() {
        return coreFeatureRelationshipTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CoreFactory getCoreFactory() {
        return (CoreFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        coreModelEClass = createEClass(CORE_MODEL);
        createEReference(coreModelEClass, CORE_MODEL__REUSES);
        createEReference(coreModelEClass, CORE_MODEL__MODEL_ELEMENTS);
        createEReference(coreModelEClass, CORE_MODEL__REALIZES);

        coreImpactModelEClass = createEClass(CORE_IMPACT_MODEL);

        coreConcernEClass = createEClass(CORE_CONCERN);
        createEReference(coreConcernEClass, CORE_CONCERN__MODELS);
        createEReference(coreConcernEClass, CORE_CONCERN__INTERFACE);

        coreFeatureEClass = createEClass(CORE_FEATURE);
        createEReference(coreFeatureEClass, CORE_FEATURE__REALIZED_BY);
        createEReference(coreFeatureEClass, CORE_FEATURE__STRATEGIES);
        createEReference(coreFeatureEClass, CORE_FEATURE__CONFIGURATIONS);

        coreBindingEClass = createEClass(CORE_BINDING);
        createEReference(coreBindingEClass, CORE_BINDING__CORE_MAPPINGS);

        coreModelElementEClass = createEClass(CORE_MODEL_ELEMENT);

        coreCompositionSpecificationEClass = createEClass(CORE_COMPOSITION_SPECIFICATION);
        createEReference(coreCompositionSpecificationEClass, CORE_COMPOSITION_SPECIFICATION__SOURCE);

        coreMappingEClass = createEClass(CORE_MAPPING);
        createEReference(coreMappingEClass, CORE_MAPPING__MAPPED_TO);
        createEReference(coreMappingEClass, CORE_MAPPING__MAPPED_FROM);

        coreNamedElementEClass = createEClass(CORE_NAMED_ELEMENT);
        createEAttribute(coreNamedElementEClass, CORE_NAMED_ELEMENT__NAME);

        coreStrategyEClass = createEClass(CORE_STRATEGY);
        createEReference(coreStrategyEClass, CORE_STRATEGY__CONFIGURATIONS);

        coreInterfaceEClass = createEClass(CORE_INTERFACE);
        createEReference(coreInterfaceEClass, CORE_INTERFACE__SELECTABLE);
        createEReference(coreInterfaceEClass, CORE_INTERFACE__CUSTOMIZABLE);
        createEReference(coreInterfaceEClass, CORE_INTERFACE__USABLE);
        createEReference(coreInterfaceEClass, CORE_INTERFACE__IMPACTED);

        coreReuseEClass = createEClass(CORE_REUSE);
        createEReference(coreReuseEClass, CORE_REUSE__REUSED_CONCERN);
        createEReference(coreReuseEClass, CORE_REUSE__COMPOSITIONS);
        createEReference(coreReuseEClass, CORE_REUSE__SELECTED);

        corePatternEClass = createEClass(CORE_PATTERN);

        coreImpactModelElementEClass = createEClass(CORE_IMPACT_MODEL_ELEMENT);

        coreConfigurationEClass = createEClass(CORE_CONFIGURATION);
        createEReference(coreConfigurationEClass, CORE_CONFIGURATION__REUSED_CONCERN);
        createEReference(coreConfigurationEClass, CORE_CONFIGURATION__SELECTED);

        coreFeatureModelEClass = createEClass(CORE_FEATURE_MODEL);

        // Create enums
        coreFeatureRelationshipTypeEEnum = createEEnum(CORE_FEATURE_RELATIONSHIP_TYPE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        coreModelEClass.getESuperTypes().add(this.getCORENamedElement());
        coreImpactModelEClass.getESuperTypes().add(this.getCOREModel());
        coreConcernEClass.getESuperTypes().add(this.getCORENamedElement());
        coreFeatureEClass.getESuperTypes().add(this.getCOREModelElement());
        coreBindingEClass.getESuperTypes().add(this.getCORECompositionSpecification());
        coreModelElementEClass.getESuperTypes().add(this.getCORENamedElement());
        coreStrategyEClass.getESuperTypes().add(this.getCORENamedElement());
        corePatternEClass.getESuperTypes().add(this.getCORECompositionSpecification());
        coreImpactModelElementEClass.getESuperTypes().add(this.getCOREModelElement());
        coreConfigurationEClass.getESuperTypes().add(this.getCORENamedElement());
        coreFeatureModelEClass.getESuperTypes().add(this.getCOREModel());

        // Initialize classes and features; add operations and parameters
        initEClass(coreModelEClass, COREModel.class, "COREModel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCOREModel_Reuses(), this.getCOREReuse(), null, "reuses", null, 0, -1, COREModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCOREModel_ModelElements(), this.getCOREModelElement(), null, "modelElements", null, 0, -1, COREModel.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getCOREModel_Realizes(), this.getCOREFeature(), this.getCOREFeature_RealizedBy(), "realizes", null, 0, -1, COREModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(coreImpactModelEClass, COREImpactModel.class, "COREImpactModel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(coreConcernEClass, COREConcern.class, "COREConcern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCOREConcern_Models(), this.getCOREModel(), null, "models", null, 2, -1, COREConcern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCOREConcern_Interface(), this.getCOREInterface(), null, "interface", null, 1, 1, COREConcern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(coreFeatureEClass, COREFeature.class, "COREFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCOREFeature_RealizedBy(), this.getCOREModel(), this.getCOREModel_Realizes(), "realizedBy", null, 0, -1, COREFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCOREFeature_Strategies(), this.getCOREStrategy(), null, "strategies", null, 0, -1, COREFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCOREFeature_Configurations(), this.getCOREConfiguration(), null, "configurations", null, 0, -1, COREFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        EOperation op = addEOperation(coreFeatureEClass, null, "addFeature", 1, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEString(), "child_name", 1, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getCOREFeatureRelationshipType(), "association", 1, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(coreFeatureEClass, null, "delete", 1, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(coreFeatureEClass, null, "rename", 1, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEString(), "core_feature_name", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(coreFeatureEClass, null, "changeLink", 1, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getCOREFeatureRelationshipType(), "new_association", 1, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(coreFeatureEClass, null, "changeParent", 1, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getCOREFeature(), "feature", 1, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getCOREFeatureRelationshipType(), "new_association", 1, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(coreFeatureEClass, null, "requires", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getCOREFeature(), "feature", 1, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(coreFeatureEClass, null, "excludes", 1, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getCOREFeature(), "feature", 1, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(coreFeatureEClass, null, "removeConstraint", 1, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getCOREFeature(), "feature", 1, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(coreFeatureEClass, null, "addRealizedBy", 1, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getCOREModel(), "model", 1, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(coreBindingEClass, COREBinding.class, "COREBinding", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCOREBinding_CoreMappings(), this.getCOREMapping(), null, "coreMappings", null, 0, -1, COREBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(coreModelElementEClass, COREModelElement.class, "COREModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(coreCompositionSpecificationEClass, CORECompositionSpecification.class, "CORECompositionSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCORECompositionSpecification_Source(), this.getCOREModel(), null, "source", null, 1, 1, CORECompositionSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(coreMappingEClass, COREMapping.class, "COREMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCOREMapping_MappedTo(), this.getCOREModelElement(), null, "mappedTo", null, 1, 1, COREMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCOREMapping_MappedFrom(), this.getCOREModelElement(), null, "mappedFrom", null, 1, 1, COREMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(coreNamedElementEClass, CORENamedElement.class, "CORENamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCORENamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, CORENamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(coreStrategyEClass, COREStrategy.class, "COREStrategy", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCOREStrategy_Configurations(), this.getCOREConfiguration(), null, "configurations", null, 0, -1, COREStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(coreInterfaceEClass, COREInterface.class, "COREInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCOREInterface_Selectable(), this.getCOREFeature(), null, "selectable", null, 0, -1, COREInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCOREInterface_Customizable(), this.getCOREModelElement(), null, "customizable", null, 0, -1, COREInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCOREInterface_Usable(), this.getCOREModelElement(), null, "usable", null, 0, -1, COREInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCOREInterface_Impacted(), this.getCOREImpactModelElement(), null, "impacted", null, 0, -1, COREInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(coreReuseEClass, COREReuse.class, "COREReuse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCOREReuse_ReusedConcern(), this.getCOREConcern(), null, "reusedConcern", null, 1, 1, COREReuse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCOREReuse_Compositions(), this.getCORECompositionSpecification(), null, "compositions", null, 0, -1, COREReuse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCOREReuse_Selected(), this.getCOREFeature(), null, "selected", null, 1, -1, COREReuse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(corePatternEClass, COREPattern.class, "COREPattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(coreImpactModelElementEClass, COREImpactModelElement.class, "COREImpactModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(coreConfigurationEClass, COREConfiguration.class, "COREConfiguration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCOREConfiguration_ReusedConcern(), this.getCOREConcern(), null, "reusedConcern", null, 0, -1, COREConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCOREConfiguration_Selected(), this.getCOREFeature(), null, "selected", null, 1, -1, COREConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(coreFeatureModelEClass, COREFeatureModel.class, "COREFeatureModel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        addEOperation(coreFeatureModelEClass, this.getCOREFeature(), "getGlobalRoot", 1, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(coreFeatureModelEClass, this.getCOREFeature(), "getLocalRoot", 1, 1, IS_UNIQUE, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(coreFeatureRelationshipTypeEEnum, COREFeatureRelationshipType.class, "COREFeatureRelationshipType");
        addEEnumLiteral(coreFeatureRelationshipTypeEEnum, COREFeatureRelationshipType.OPTIONAL);
        addEEnumLiteral(coreFeatureRelationshipTypeEEnum, COREFeatureRelationshipType.MANDATORY);
        addEEnumLiteral(coreFeatureRelationshipTypeEEnum, COREFeatureRelationshipType.XOR);
        addEEnumLiteral(coreFeatureRelationshipTypeEEnum, COREFeatureRelationshipType.OR);

        // Create resource
        createResource(eNS_URI);

        // Create annotations
        // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
        createExtendedMetaDataAnnotations();
    }

    /**
     * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createExtendedMetaDataAnnotations() {
        String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
        addAnnotation
          (coreModelEClass, 
           source, 
           new String[] {
             "name", "COREFeatureModel"
           });
    }

} //CorePackageImpl
