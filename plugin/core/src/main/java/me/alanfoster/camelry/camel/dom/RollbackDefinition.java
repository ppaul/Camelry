//
// Note - This file was automatically generated
// Generation spawned by 'class me.alanfoster.camelry.codegen.ScalateGenerator$'
// Creation Date - 16 August 2013
// Please do not manually modify this class.
//
package me.alanfoster.camelry.camel.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.*;
import java.util.List;


/**
 * @author Alan
 */
//@SubTag("rollback")
public interface RollbackDefinition extends NoOutputDefinition, DomElement  {
                    @NotNull
        @Attribute("markRollbackOnly")
        GenericAttributeValue<Boolean> getMarkRollbackOnly();
                    @NotNull
        @Attribute("markRollbackOnlyLast")
        GenericAttributeValue<Boolean> getMarkRollbackOnlyLast();
                    @NotNull
        @Attribute("message")
        GenericAttributeValue<String> getMessage();
    
    
    }