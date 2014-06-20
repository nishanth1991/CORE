/**
 */
package ca.mcgill.sel.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ca.mcgill.sel.core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "core";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://cs.mcgill.ca/sel/core/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "core";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CorePackage eINSTANCE = ca.mcgill.sel.core.impl.CorePackageImpl.init();

    /**
     * The meta object id for the '{@link ca.mcgill.sel.core.impl.CORENamedElementImpl <em>CORE Named Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ca.mcgill.sel.core.impl.CORENamedElementImpl
     * @see ca.mcgill.sel.core.impl.CorePackageImpl#getCORENamedElement()
     * @generated
     */
    int CORE_NAMED_ELEMENT = 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_NAMED_ELEMENT__NAME = 0;

    /**
     * The number of structural features of the '<em>CORE Named Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_NAMED_ELEMENT_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link ca.mcgill.sel.core.impl.COREModelImpl <em>CORE Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ca.mcgill.sel.core.impl.COREModelImpl
     * @see ca.mcgill.sel.core.impl.CorePackageImpl#getCOREModel()
     * @generated
     */
    int CORE_MODEL = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_MODEL__NAME = CORE_NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Reuses</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_MODEL__REUSES = CORE_NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Model Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_MODEL__MODEL_ELEMENTS = CORE_NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Realizes</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_MODEL__REALIZES = CORE_NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>CORE Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_MODEL_FEATURE_COUNT = CORE_NAMED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link ca.mcgill.sel.core.impl.COREImpactModelImpl <em>CORE Impact Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ca.mcgill.sel.core.impl.COREImpactModelImpl
     * @see ca.mcgill.sel.core.impl.CorePackageImpl#getCOREImpactModel()
     * @generated
     */
    int CORE_IMPACT_MODEL = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_IMPACT_MODEL__NAME = CORE_MODEL__NAME;

    /**
     * The feature id for the '<em><b>Reuses</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_IMPACT_MODEL__REUSES = CORE_MODEL__REUSES;

    /**
     * The feature id for the '<em><b>Model Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_IMPACT_MODEL__MODEL_ELEMENTS = CORE_MODEL__MODEL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Realizes</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_IMPACT_MODEL__REALIZES = CORE_MODEL__REALIZES;

    /**
     * The number of structural features of the '<em>CORE Impact Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_IMPACT_MODEL_FEATURE_COUNT = CORE_MODEL_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link ca.mcgill.sel.core.impl.COREConcernImpl <em>CORE Concern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ca.mcgill.sel.core.impl.COREConcernImpl
     * @see ca.mcgill.sel.core.impl.CorePackageImpl#getCOREConcern()
     * @generated
     */
    int CORE_CONCERN = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_CONCERN__NAME = CORE_NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Models</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_CONCERN__MODELS = CORE_NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Interface</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_CONCERN__INTERFACE = CORE_NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>CORE Concern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_CONCERN_FEATURE_COUNT = CORE_NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link ca.mcgill.sel.core.impl.COREModelElementImpl <em>CORE Model Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ca.mcgill.sel.core.impl.COREModelElementImpl
     * @see ca.mcgill.sel.core.impl.CorePackageImpl#getCOREModelElement()
     * @generated
     */
    int CORE_MODEL_ELEMENT = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_MODEL_ELEMENT__NAME = CORE_NAMED_ELEMENT__NAME;

    /**
     * The number of structural features of the '<em>CORE Model Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_MODEL_ELEMENT_FEATURE_COUNT = CORE_NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link ca.mcgill.sel.core.impl.COREFeatureImpl <em>CORE Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ca.mcgill.sel.core.impl.COREFeatureImpl
     * @see ca.mcgill.sel.core.impl.CorePackageImpl#getCOREFeature()
     * @generated
     */
    int CORE_FEATURE = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_FEATURE__NAME = CORE_MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Realized By</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_FEATURE__REALIZED_BY = CORE_MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Strategies</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_FEATURE__STRATEGIES = CORE_MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_FEATURE__CONFIGURATIONS = CORE_MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>CORE Feature</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_FEATURE_FEATURE_COUNT = CORE_MODEL_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link ca.mcgill.sel.core.impl.CORECompositionSpecificationImpl <em>CORE Composition Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ca.mcgill.sel.core.impl.CORECompositionSpecificationImpl
     * @see ca.mcgill.sel.core.impl.CorePackageImpl#getCORECompositionSpecification()
     * @generated
     */
    int CORE_COMPOSITION_SPECIFICATION = 6;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_COMPOSITION_SPECIFICATION__SOURCE = 0;

    /**
     * The number of structural features of the '<em>CORE Composition Specification</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_COMPOSITION_SPECIFICATION_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link ca.mcgill.sel.core.impl.COREBindingImpl <em>CORE Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ca.mcgill.sel.core.impl.COREBindingImpl
     * @see ca.mcgill.sel.core.impl.CorePackageImpl#getCOREBinding()
     * @generated
     */
    int CORE_BINDING = 4;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_BINDING__SOURCE = CORE_COMPOSITION_SPECIFICATION__SOURCE;

    /**
     * The feature id for the '<em><b>Core Mappings</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_BINDING__CORE_MAPPINGS = CORE_COMPOSITION_SPECIFICATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>CORE Binding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_BINDING_FEATURE_COUNT = CORE_COMPOSITION_SPECIFICATION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link ca.mcgill.sel.core.impl.COREMappingImpl <em>CORE Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ca.mcgill.sel.core.impl.COREMappingImpl
     * @see ca.mcgill.sel.core.impl.CorePackageImpl#getCOREMapping()
     * @generated
     */
    int CORE_MAPPING = 7;

    /**
     * The feature id for the '<em><b>Mapped To</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_MAPPING__MAPPED_TO = 0;

    /**
     * The feature id for the '<em><b>Mapped From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_MAPPING__MAPPED_FROM = 1;

    /**
     * The number of structural features of the '<em>CORE Mapping</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_MAPPING_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link ca.mcgill.sel.core.impl.COREStrategyImpl <em>CORE Strategy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ca.mcgill.sel.core.impl.COREStrategyImpl
     * @see ca.mcgill.sel.core.impl.CorePackageImpl#getCOREStrategy()
     * @generated
     */
    int CORE_STRATEGY = 9;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_STRATEGY__NAME = CORE_NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Configurations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_STRATEGY__CONFIGURATIONS = CORE_NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>CORE Strategy</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_STRATEGY_FEATURE_COUNT = CORE_NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link ca.mcgill.sel.core.impl.COREInterfaceImpl <em>CORE Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ca.mcgill.sel.core.impl.COREInterfaceImpl
     * @see ca.mcgill.sel.core.impl.CorePackageImpl#getCOREInterface()
     * @generated
     */
    int CORE_INTERFACE = 10;

    /**
     * The feature id for the '<em><b>Selectable</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_INTERFACE__SELECTABLE = 0;

    /**
     * The feature id for the '<em><b>Customizable</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_INTERFACE__CUSTOMIZABLE = 1;

    /**
     * The feature id for the '<em><b>Usable</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_INTERFACE__USABLE = 2;

    /**
     * The feature id for the '<em><b>Impacted</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_INTERFACE__IMPACTED = 3;

    /**
     * The number of structural features of the '<em>CORE Interface</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_INTERFACE_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link ca.mcgill.sel.core.impl.COREReuseImpl <em>CORE Reuse</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ca.mcgill.sel.core.impl.COREReuseImpl
     * @see ca.mcgill.sel.core.impl.CorePackageImpl#getCOREReuse()
     * @generated
     */
    int CORE_REUSE = 11;

    /**
     * The feature id for the '<em><b>Reused Concern</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_REUSE__REUSED_CONCERN = 0;

    /**
     * The feature id for the '<em><b>Compositions</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_REUSE__COMPOSITIONS = 1;

    /**
     * The feature id for the '<em><b>Selected</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_REUSE__SELECTED = 2;

    /**
     * The number of structural features of the '<em>CORE Reuse</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_REUSE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link ca.mcgill.sel.core.impl.COREPatternImpl <em>CORE Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ca.mcgill.sel.core.impl.COREPatternImpl
     * @see ca.mcgill.sel.core.impl.CorePackageImpl#getCOREPattern()
     * @generated
     */
    int CORE_PATTERN = 12;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_PATTERN__SOURCE = CORE_COMPOSITION_SPECIFICATION__SOURCE;

    /**
     * The number of structural features of the '<em>CORE Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_PATTERN_FEATURE_COUNT = CORE_COMPOSITION_SPECIFICATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link ca.mcgill.sel.core.impl.COREImpactModelElementImpl <em>CORE Impact Model Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ca.mcgill.sel.core.impl.COREImpactModelElementImpl
     * @see ca.mcgill.sel.core.impl.CorePackageImpl#getCOREImpactModelElement()
     * @generated
     */
    int CORE_IMPACT_MODEL_ELEMENT = 13;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_IMPACT_MODEL_ELEMENT__NAME = CORE_MODEL_ELEMENT__NAME;

    /**
     * The number of structural features of the '<em>CORE Impact Model Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_IMPACT_MODEL_ELEMENT_FEATURE_COUNT = CORE_MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link ca.mcgill.sel.core.impl.COREConfigurationImpl <em>CORE Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ca.mcgill.sel.core.impl.COREConfigurationImpl
     * @see ca.mcgill.sel.core.impl.CorePackageImpl#getCOREConfiguration()
     * @generated
     */
    int CORE_CONFIGURATION = 14;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_CONFIGURATION__NAME = CORE_NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Reused Concern</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_CONFIGURATION__REUSED_CONCERN = CORE_NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Selected</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_CONFIGURATION__SELECTED = CORE_NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>CORE Configuration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_CONFIGURATION_FEATURE_COUNT = CORE_NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link ca.mcgill.sel.core.impl.COREFeatureModelImpl <em>CORE Feature Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ca.mcgill.sel.core.impl.COREFeatureModelImpl
     * @see ca.mcgill.sel.core.impl.CorePackageImpl#getCOREFeatureModel()
     * @generated
     */
    int CORE_FEATURE_MODEL = 15;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_FEATURE_MODEL__NAME = CORE_MODEL__NAME;

    /**
     * The feature id for the '<em><b>Reuses</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_FEATURE_MODEL__REUSES = CORE_MODEL__REUSES;

    /**
     * The feature id for the '<em><b>Model Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_FEATURE_MODEL__MODEL_ELEMENTS = CORE_MODEL__MODEL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Realizes</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_FEATURE_MODEL__REALIZES = CORE_MODEL__REALIZES;

    /**
     * The number of structural features of the '<em>CORE Feature Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_FEATURE_MODEL_FEATURE_COUNT = CORE_MODEL_FEATURE_COUNT + 0;


    /**
     * The meta object id for the '{@link ca.mcgill.sel.core.COREFeatureRelationshipType <em>CORE Feature Relationship Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ca.mcgill.sel.core.COREFeatureRelationshipType
     * @see ca.mcgill.sel.core.impl.CorePackageImpl#getCOREFeatureRelationshipType()
     * @generated
     */
    int CORE_FEATURE_RELATIONSHIP_TYPE = 16;

    /**
     * Returns the meta object for class '{@link ca.mcgill.sel.core.COREModel <em>CORE Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CORE Model</em>'.
     * @see ca.mcgill.sel.core.COREModel
     * @generated
     */
    EClass getCOREModel();

    /**
     * Returns the meta object for the containment reference list '{@link ca.mcgill.sel.core.COREModel#getReuses <em>Reuses</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Reuses</em>'.
     * @see ca.mcgill.sel.core.COREModel#getReuses()
     * @see #getCOREModel()
     * @generated
     */
    EReference getCOREModel_Reuses();

    /**
     * Returns the meta object for the reference list '{@link ca.mcgill.sel.core.COREModel#getModelElements <em>Model Elements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Model Elements</em>'.
     * @see ca.mcgill.sel.core.COREModel#getModelElements()
     * @see #getCOREModel()
     * @generated
     */
    EReference getCOREModel_ModelElements();

    /**
     * Returns the meta object for the reference list '{@link ca.mcgill.sel.core.COREModel#getRealizes <em>Realizes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Realizes</em>'.
     * @see ca.mcgill.sel.core.COREModel#getRealizes()
     * @see #getCOREModel()
     * @generated
     */
    EReference getCOREModel_Realizes();

    /**
     * Returns the meta object for class '{@link ca.mcgill.sel.core.COREImpactModel <em>CORE Impact Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CORE Impact Model</em>'.
     * @see ca.mcgill.sel.core.COREImpactModel
     * @generated
     */
    EClass getCOREImpactModel();

    /**
     * Returns the meta object for class '{@link ca.mcgill.sel.core.COREConcern <em>CORE Concern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CORE Concern</em>'.
     * @see ca.mcgill.sel.core.COREConcern
     * @generated
     */
    EClass getCOREConcern();

    /**
     * Returns the meta object for the reference list '{@link ca.mcgill.sel.core.COREConcern#getModels <em>Models</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Models</em>'.
     * @see ca.mcgill.sel.core.COREConcern#getModels()
     * @see #getCOREConcern()
     * @generated
     */
    EReference getCOREConcern_Models();

    /**
     * Returns the meta object for the containment reference '{@link ca.mcgill.sel.core.COREConcern#getInterface <em>Interface</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Interface</em>'.
     * @see ca.mcgill.sel.core.COREConcern#getInterface()
     * @see #getCOREConcern()
     * @generated
     */
    EReference getCOREConcern_Interface();

    /**
     * Returns the meta object for class '{@link ca.mcgill.sel.core.COREFeature <em>CORE Feature</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CORE Feature</em>'.
     * @see ca.mcgill.sel.core.COREFeature
     * @generated
     */
    EClass getCOREFeature();

    /**
     * Returns the meta object for the reference list '{@link ca.mcgill.sel.core.COREFeature#getRealizedBy <em>Realized By</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Realized By</em>'.
     * @see ca.mcgill.sel.core.COREFeature#getRealizedBy()
     * @see #getCOREFeature()
     * @generated
     */
    EReference getCOREFeature_RealizedBy();

    /**
     * Returns the meta object for the containment reference list '{@link ca.mcgill.sel.core.COREFeature#getStrategies <em>Strategies</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Strategies</em>'.
     * @see ca.mcgill.sel.core.COREFeature#getStrategies()
     * @see #getCOREFeature()
     * @generated
     */
    EReference getCOREFeature_Strategies();

    /**
     * Returns the meta object for the containment reference list '{@link ca.mcgill.sel.core.COREFeature#getConfigurations <em>Configurations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Configurations</em>'.
     * @see ca.mcgill.sel.core.COREFeature#getConfigurations()
     * @see #getCOREFeature()
     * @generated
     */
    EReference getCOREFeature_Configurations();

    /**
     * Returns the meta object for class '{@link ca.mcgill.sel.core.COREBinding <em>CORE Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CORE Binding</em>'.
     * @see ca.mcgill.sel.core.COREBinding
     * @generated
     */
    EClass getCOREBinding();

    /**
     * Returns the meta object for the reference list '{@link ca.mcgill.sel.core.COREBinding#getCoreMappings <em>Core Mappings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Core Mappings</em>'.
     * @see ca.mcgill.sel.core.COREBinding#getCoreMappings()
     * @see #getCOREBinding()
     * @generated
     */
    EReference getCOREBinding_CoreMappings();

    /**
     * Returns the meta object for class '{@link ca.mcgill.sel.core.COREModelElement <em>CORE Model Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CORE Model Element</em>'.
     * @see ca.mcgill.sel.core.COREModelElement
     * @generated
     */
    EClass getCOREModelElement();

    /**
     * Returns the meta object for class '{@link ca.mcgill.sel.core.CORECompositionSpecification <em>CORE Composition Specification</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CORE Composition Specification</em>'.
     * @see ca.mcgill.sel.core.CORECompositionSpecification
     * @generated
     */
    EClass getCORECompositionSpecification();

    /**
     * Returns the meta object for the reference '{@link ca.mcgill.sel.core.CORECompositionSpecification#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source</em>'.
     * @see ca.mcgill.sel.core.CORECompositionSpecification#getSource()
     * @see #getCORECompositionSpecification()
     * @generated
     */
    EReference getCORECompositionSpecification_Source();

    /**
     * Returns the meta object for class '{@link ca.mcgill.sel.core.COREMapping <em>CORE Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CORE Mapping</em>'.
     * @see ca.mcgill.sel.core.COREMapping
     * @generated
     */
    EClass getCOREMapping();

    /**
     * Returns the meta object for the reference '{@link ca.mcgill.sel.core.COREMapping#getMappedTo <em>Mapped To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Mapped To</em>'.
     * @see ca.mcgill.sel.core.COREMapping#getMappedTo()
     * @see #getCOREMapping()
     * @generated
     */
    EReference getCOREMapping_MappedTo();

    /**
     * Returns the meta object for the reference '{@link ca.mcgill.sel.core.COREMapping#getMappedFrom <em>Mapped From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Mapped From</em>'.
     * @see ca.mcgill.sel.core.COREMapping#getMappedFrom()
     * @see #getCOREMapping()
     * @generated
     */
    EReference getCOREMapping_MappedFrom();

    /**
     * Returns the meta object for class '{@link ca.mcgill.sel.core.CORENamedElement <em>CORE Named Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CORE Named Element</em>'.
     * @see ca.mcgill.sel.core.CORENamedElement
     * @generated
     */
    EClass getCORENamedElement();

    /**
     * Returns the meta object for the attribute '{@link ca.mcgill.sel.core.CORENamedElement#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see ca.mcgill.sel.core.CORENamedElement#getName()
     * @see #getCORENamedElement()
     * @generated
     */
    EAttribute getCORENamedElement_Name();

    /**
     * Returns the meta object for class '{@link ca.mcgill.sel.core.COREStrategy <em>CORE Strategy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CORE Strategy</em>'.
     * @see ca.mcgill.sel.core.COREStrategy
     * @generated
     */
    EClass getCOREStrategy();

    /**
     * Returns the meta object for the reference list '{@link ca.mcgill.sel.core.COREStrategy#getConfigurations <em>Configurations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Configurations</em>'.
     * @see ca.mcgill.sel.core.COREStrategy#getConfigurations()
     * @see #getCOREStrategy()
     * @generated
     */
    EReference getCOREStrategy_Configurations();

    /**
     * Returns the meta object for class '{@link ca.mcgill.sel.core.COREInterface <em>CORE Interface</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CORE Interface</em>'.
     * @see ca.mcgill.sel.core.COREInterface
     * @generated
     */
    EClass getCOREInterface();

    /**
     * Returns the meta object for the reference list '{@link ca.mcgill.sel.core.COREInterface#getSelectable <em>Selectable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Selectable</em>'.
     * @see ca.mcgill.sel.core.COREInterface#getSelectable()
     * @see #getCOREInterface()
     * @generated
     */
    EReference getCOREInterface_Selectable();

    /**
     * Returns the meta object for the reference list '{@link ca.mcgill.sel.core.COREInterface#getCustomizable <em>Customizable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Customizable</em>'.
     * @see ca.mcgill.sel.core.COREInterface#getCustomizable()
     * @see #getCOREInterface()
     * @generated
     */
    EReference getCOREInterface_Customizable();

    /**
     * Returns the meta object for the reference list '{@link ca.mcgill.sel.core.COREInterface#getUsable <em>Usable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Usable</em>'.
     * @see ca.mcgill.sel.core.COREInterface#getUsable()
     * @see #getCOREInterface()
     * @generated
     */
    EReference getCOREInterface_Usable();

    /**
     * Returns the meta object for the reference list '{@link ca.mcgill.sel.core.COREInterface#getImpacted <em>Impacted</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Impacted</em>'.
     * @see ca.mcgill.sel.core.COREInterface#getImpacted()
     * @see #getCOREInterface()
     * @generated
     */
    EReference getCOREInterface_Impacted();

    /**
     * Returns the meta object for class '{@link ca.mcgill.sel.core.COREReuse <em>CORE Reuse</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CORE Reuse</em>'.
     * @see ca.mcgill.sel.core.COREReuse
     * @generated
     */
    EClass getCOREReuse();

    /**
     * Returns the meta object for the reference '{@link ca.mcgill.sel.core.COREReuse#getReusedConcern <em>Reused Concern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Reused Concern</em>'.
     * @see ca.mcgill.sel.core.COREReuse#getReusedConcern()
     * @see #getCOREReuse()
     * @generated
     */
    EReference getCOREReuse_ReusedConcern();

    /**
     * Returns the meta object for the reference list '{@link ca.mcgill.sel.core.COREReuse#getCompositions <em>Compositions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Compositions</em>'.
     * @see ca.mcgill.sel.core.COREReuse#getCompositions()
     * @see #getCOREReuse()
     * @generated
     */
    EReference getCOREReuse_Compositions();

    /**
     * Returns the meta object for the reference list '{@link ca.mcgill.sel.core.COREReuse#getSelected <em>Selected</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Selected</em>'.
     * @see ca.mcgill.sel.core.COREReuse#getSelected()
     * @see #getCOREReuse()
     * @generated
     */
    EReference getCOREReuse_Selected();

    /**
     * Returns the meta object for class '{@link ca.mcgill.sel.core.COREPattern <em>CORE Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CORE Pattern</em>'.
     * @see ca.mcgill.sel.core.COREPattern
     * @generated
     */
    EClass getCOREPattern();

    /**
     * Returns the meta object for class '{@link ca.mcgill.sel.core.COREImpactModelElement <em>CORE Impact Model Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CORE Impact Model Element</em>'.
     * @see ca.mcgill.sel.core.COREImpactModelElement
     * @generated
     */
    EClass getCOREImpactModelElement();

    /**
     * Returns the meta object for class '{@link ca.mcgill.sel.core.COREConfiguration <em>CORE Configuration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CORE Configuration</em>'.
     * @see ca.mcgill.sel.core.COREConfiguration
     * @generated
     */
    EClass getCOREConfiguration();

    /**
     * Returns the meta object for the reference list '{@link ca.mcgill.sel.core.COREConfiguration#getReusedConcern <em>Reused Concern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Reused Concern</em>'.
     * @see ca.mcgill.sel.core.COREConfiguration#getReusedConcern()
     * @see #getCOREConfiguration()
     * @generated
     */
    EReference getCOREConfiguration_ReusedConcern();

    /**
     * Returns the meta object for the reference list '{@link ca.mcgill.sel.core.COREConfiguration#getSelected <em>Selected</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Selected</em>'.
     * @see ca.mcgill.sel.core.COREConfiguration#getSelected()
     * @see #getCOREConfiguration()
     * @generated
     */
    EReference getCOREConfiguration_Selected();

    /**
     * Returns the meta object for class '{@link ca.mcgill.sel.core.COREFeatureModel <em>CORE Feature Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CORE Feature Model</em>'.
     * @see ca.mcgill.sel.core.COREFeatureModel
     * @generated
     */
    EClass getCOREFeatureModel();

    /**
     * Returns the meta object for enum '{@link ca.mcgill.sel.core.COREFeatureRelationshipType <em>CORE Feature Relationship Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>CORE Feature Relationship Type</em>'.
     * @see ca.mcgill.sel.core.COREFeatureRelationshipType
     * @generated
     */
    EEnum getCOREFeatureRelationshipType();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    CoreFactory getCoreFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link ca.mcgill.sel.core.impl.COREModelImpl <em>CORE Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ca.mcgill.sel.core.impl.COREModelImpl
         * @see ca.mcgill.sel.core.impl.CorePackageImpl#getCOREModel()
         * @generated
         */
        EClass CORE_MODEL = eINSTANCE.getCOREModel();

        /**
         * The meta object literal for the '<em><b>Reuses</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CORE_MODEL__REUSES = eINSTANCE.getCOREModel_Reuses();

        /**
         * The meta object literal for the '<em><b>Model Elements</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CORE_MODEL__MODEL_ELEMENTS = eINSTANCE.getCOREModel_ModelElements();

        /**
         * The meta object literal for the '<em><b>Realizes</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CORE_MODEL__REALIZES = eINSTANCE.getCOREModel_Realizes();

        /**
         * The meta object literal for the '{@link ca.mcgill.sel.core.impl.COREImpactModelImpl <em>CORE Impact Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ca.mcgill.sel.core.impl.COREImpactModelImpl
         * @see ca.mcgill.sel.core.impl.CorePackageImpl#getCOREImpactModel()
         * @generated
         */
        EClass CORE_IMPACT_MODEL = eINSTANCE.getCOREImpactModel();

        /**
         * The meta object literal for the '{@link ca.mcgill.sel.core.impl.COREConcernImpl <em>CORE Concern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ca.mcgill.sel.core.impl.COREConcernImpl
         * @see ca.mcgill.sel.core.impl.CorePackageImpl#getCOREConcern()
         * @generated
         */
        EClass CORE_CONCERN = eINSTANCE.getCOREConcern();

        /**
         * The meta object literal for the '<em><b>Models</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CORE_CONCERN__MODELS = eINSTANCE.getCOREConcern_Models();

        /**
         * The meta object literal for the '<em><b>Interface</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CORE_CONCERN__INTERFACE = eINSTANCE.getCOREConcern_Interface();

        /**
         * The meta object literal for the '{@link ca.mcgill.sel.core.impl.COREFeatureImpl <em>CORE Feature</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ca.mcgill.sel.core.impl.COREFeatureImpl
         * @see ca.mcgill.sel.core.impl.CorePackageImpl#getCOREFeature()
         * @generated
         */
        EClass CORE_FEATURE = eINSTANCE.getCOREFeature();

        /**
         * The meta object literal for the '<em><b>Realized By</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CORE_FEATURE__REALIZED_BY = eINSTANCE.getCOREFeature_RealizedBy();

        /**
         * The meta object literal for the '<em><b>Strategies</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CORE_FEATURE__STRATEGIES = eINSTANCE.getCOREFeature_Strategies();

        /**
         * The meta object literal for the '<em><b>Configurations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CORE_FEATURE__CONFIGURATIONS = eINSTANCE.getCOREFeature_Configurations();

        /**
         * The meta object literal for the '{@link ca.mcgill.sel.core.impl.COREBindingImpl <em>CORE Binding</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ca.mcgill.sel.core.impl.COREBindingImpl
         * @see ca.mcgill.sel.core.impl.CorePackageImpl#getCOREBinding()
         * @generated
         */
        EClass CORE_BINDING = eINSTANCE.getCOREBinding();

        /**
         * The meta object literal for the '<em><b>Core Mappings</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CORE_BINDING__CORE_MAPPINGS = eINSTANCE.getCOREBinding_CoreMappings();

        /**
         * The meta object literal for the '{@link ca.mcgill.sel.core.impl.COREModelElementImpl <em>CORE Model Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ca.mcgill.sel.core.impl.COREModelElementImpl
         * @see ca.mcgill.sel.core.impl.CorePackageImpl#getCOREModelElement()
         * @generated
         */
        EClass CORE_MODEL_ELEMENT = eINSTANCE.getCOREModelElement();

        /**
         * The meta object literal for the '{@link ca.mcgill.sel.core.impl.CORECompositionSpecificationImpl <em>CORE Composition Specification</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ca.mcgill.sel.core.impl.CORECompositionSpecificationImpl
         * @see ca.mcgill.sel.core.impl.CorePackageImpl#getCORECompositionSpecification()
         * @generated
         */
        EClass CORE_COMPOSITION_SPECIFICATION = eINSTANCE.getCORECompositionSpecification();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CORE_COMPOSITION_SPECIFICATION__SOURCE = eINSTANCE.getCORECompositionSpecification_Source();

        /**
         * The meta object literal for the '{@link ca.mcgill.sel.core.impl.COREMappingImpl <em>CORE Mapping</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ca.mcgill.sel.core.impl.COREMappingImpl
         * @see ca.mcgill.sel.core.impl.CorePackageImpl#getCOREMapping()
         * @generated
         */
        EClass CORE_MAPPING = eINSTANCE.getCOREMapping();

        /**
         * The meta object literal for the '<em><b>Mapped To</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CORE_MAPPING__MAPPED_TO = eINSTANCE.getCOREMapping_MappedTo();

        /**
         * The meta object literal for the '<em><b>Mapped From</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CORE_MAPPING__MAPPED_FROM = eINSTANCE.getCOREMapping_MappedFrom();

        /**
         * The meta object literal for the '{@link ca.mcgill.sel.core.impl.CORENamedElementImpl <em>CORE Named Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ca.mcgill.sel.core.impl.CORENamedElementImpl
         * @see ca.mcgill.sel.core.impl.CorePackageImpl#getCORENamedElement()
         * @generated
         */
        EClass CORE_NAMED_ELEMENT = eINSTANCE.getCORENamedElement();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CORE_NAMED_ELEMENT__NAME = eINSTANCE.getCORENamedElement_Name();

        /**
         * The meta object literal for the '{@link ca.mcgill.sel.core.impl.COREStrategyImpl <em>CORE Strategy</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ca.mcgill.sel.core.impl.COREStrategyImpl
         * @see ca.mcgill.sel.core.impl.CorePackageImpl#getCOREStrategy()
         * @generated
         */
        EClass CORE_STRATEGY = eINSTANCE.getCOREStrategy();

        /**
         * The meta object literal for the '<em><b>Configurations</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CORE_STRATEGY__CONFIGURATIONS = eINSTANCE.getCOREStrategy_Configurations();

        /**
         * The meta object literal for the '{@link ca.mcgill.sel.core.impl.COREInterfaceImpl <em>CORE Interface</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ca.mcgill.sel.core.impl.COREInterfaceImpl
         * @see ca.mcgill.sel.core.impl.CorePackageImpl#getCOREInterface()
         * @generated
         */
        EClass CORE_INTERFACE = eINSTANCE.getCOREInterface();

        /**
         * The meta object literal for the '<em><b>Selectable</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CORE_INTERFACE__SELECTABLE = eINSTANCE.getCOREInterface_Selectable();

        /**
         * The meta object literal for the '<em><b>Customizable</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CORE_INTERFACE__CUSTOMIZABLE = eINSTANCE.getCOREInterface_Customizable();

        /**
         * The meta object literal for the '<em><b>Usable</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CORE_INTERFACE__USABLE = eINSTANCE.getCOREInterface_Usable();

        /**
         * The meta object literal for the '<em><b>Impacted</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CORE_INTERFACE__IMPACTED = eINSTANCE.getCOREInterface_Impacted();

        /**
         * The meta object literal for the '{@link ca.mcgill.sel.core.impl.COREReuseImpl <em>CORE Reuse</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ca.mcgill.sel.core.impl.COREReuseImpl
         * @see ca.mcgill.sel.core.impl.CorePackageImpl#getCOREReuse()
         * @generated
         */
        EClass CORE_REUSE = eINSTANCE.getCOREReuse();

        /**
         * The meta object literal for the '<em><b>Reused Concern</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CORE_REUSE__REUSED_CONCERN = eINSTANCE.getCOREReuse_ReusedConcern();

        /**
         * The meta object literal for the '<em><b>Compositions</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CORE_REUSE__COMPOSITIONS = eINSTANCE.getCOREReuse_Compositions();

        /**
         * The meta object literal for the '<em><b>Selected</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CORE_REUSE__SELECTED = eINSTANCE.getCOREReuse_Selected();

        /**
         * The meta object literal for the '{@link ca.mcgill.sel.core.impl.COREPatternImpl <em>CORE Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ca.mcgill.sel.core.impl.COREPatternImpl
         * @see ca.mcgill.sel.core.impl.CorePackageImpl#getCOREPattern()
         * @generated
         */
        EClass CORE_PATTERN = eINSTANCE.getCOREPattern();

        /**
         * The meta object literal for the '{@link ca.mcgill.sel.core.impl.COREImpactModelElementImpl <em>CORE Impact Model Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ca.mcgill.sel.core.impl.COREImpactModelElementImpl
         * @see ca.mcgill.sel.core.impl.CorePackageImpl#getCOREImpactModelElement()
         * @generated
         */
        EClass CORE_IMPACT_MODEL_ELEMENT = eINSTANCE.getCOREImpactModelElement();

        /**
         * The meta object literal for the '{@link ca.mcgill.sel.core.impl.COREConfigurationImpl <em>CORE Configuration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ca.mcgill.sel.core.impl.COREConfigurationImpl
         * @see ca.mcgill.sel.core.impl.CorePackageImpl#getCOREConfiguration()
         * @generated
         */
        EClass CORE_CONFIGURATION = eINSTANCE.getCOREConfiguration();

        /**
         * The meta object literal for the '<em><b>Reused Concern</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CORE_CONFIGURATION__REUSED_CONCERN = eINSTANCE.getCOREConfiguration_ReusedConcern();

        /**
         * The meta object literal for the '<em><b>Selected</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CORE_CONFIGURATION__SELECTED = eINSTANCE.getCOREConfiguration_Selected();

        /**
         * The meta object literal for the '{@link ca.mcgill.sel.core.impl.COREFeatureModelImpl <em>CORE Feature Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ca.mcgill.sel.core.impl.COREFeatureModelImpl
         * @see ca.mcgill.sel.core.impl.CorePackageImpl#getCOREFeatureModel()
         * @generated
         */
        EClass CORE_FEATURE_MODEL = eINSTANCE.getCOREFeatureModel();

        /**
         * The meta object literal for the '{@link ca.mcgill.sel.core.COREFeatureRelationshipType <em>CORE Feature Relationship Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ca.mcgill.sel.core.COREFeatureRelationshipType
         * @see ca.mcgill.sel.core.impl.CorePackageImpl#getCOREFeatureRelationshipType()
         * @generated
         */
        EEnum CORE_FEATURE_RELATIONSHIP_TYPE = eINSTANCE.getCOREFeatureRelationshipType();

    }

} //CorePackage
