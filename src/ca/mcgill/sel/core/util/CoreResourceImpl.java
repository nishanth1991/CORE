/**
 */
package ca.mcgill.sel.core.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see ca.mcgill.sel.core.util.CoreResourceFactoryImpl
 * @generated
 */
public class CoreResourceImpl extends XMIResourceImpl {
    /**
     * Creates an instance of the resource.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param uri the URI of the new resource.
     * @generated
     */
    public CoreResourceImpl(URI uri) {
        super(uri);
    }
    
    @Override
    protected boolean useUUIDs() {
        return true;
    }


} //CoreResourceImpl
