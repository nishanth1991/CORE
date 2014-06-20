package ca.mcgill.sel.core.util;


import ca.mcgill.sel.core.COREConcern;
import ca.mcgill.sel.core.COREFeatureModel;
import ca.mcgill.sel.core.COREImpactModel;
import ca.mcgill.sel.core.COREInterface;
import ca.mcgill.sel.core.CoreFactory;
/**
 * This abstract class need to be implemented by the tool that provides concern variation interface.
 * @author oalam
 */
public abstract class AbstractConcernFactory {
    
    /**
     * creates and returns a concern with a given name. The method also
     * creates a concern interface and calls createFeatureModel and createImpactModel
     * to add feature and impact models to the created concern.
     * @param concernName the name of the concern to be created. 
     * @return the COREConcern instance that is created. 
     */
    public COREConcern createConcern(String concernName) {
        
        //create the concern
        COREConcern concern = CoreFactory.eINSTANCE.createCOREConcern();
        concern.setName(concernName);
        
        //create concern interface
        COREInterface coreinterface=CoreFactory.eINSTANCE.createCOREInterface();
        concern.setInterface(coreinterface);
        
        //adds the feature model
        COREFeatureModel fm = createFeatureModel(concern);
        concern.getModels().add(fm);
        
        //adds the impact model
        COREImpactModel im = createImpactModel(concern);
        concern.getModels().add(im);
        
        return concern;
  
    }
    
    /**
     * creates and returns the Feature Model that is created by the tool 
     * @param concern is the COREConcern that need to be passed. It is the concern that the feature model belongs to.
     * @return a feature model instance, null if none found
     */
    protected abstract COREFeatureModel createFeatureModel(COREConcern concern);
    
    /**
     * creates and returns the Impact Model that is created by the tool 
     * @param concern is the COREConcern that need to be passed. It is the concern that the impact model belongs to.
     * @return a impact model instance, null if none found
     */
    protected abstract COREImpactModel createImpactModel(COREConcern concern);
    
}
