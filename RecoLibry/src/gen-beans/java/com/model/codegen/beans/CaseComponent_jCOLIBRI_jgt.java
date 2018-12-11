//
// AUTOMATICALLY GENERATED from template file CaseComponent_jCOLIBRI.jgt
// 
// by the Jiowa Code Generation Framework (www.jiowa.de)
//

package com.model.codegen.beans;

import com.jiowa.template.variable.*;
import com.jiowa.template.bean.*;
import com.jiowa.template.bean.part.*;
import com.jiowa.template.variable.*;
import com.jiowa.template.variable.parser.*;
import com.jiowa.template.text.operator.*;
import java.util.*;

/**
 * AUTOMATICALLY GENERATED <br>
 *  
 * Template Bean: CaseComponent_jCOLIBRI_jgt <br>
 * Generation Timestamp: Tue Dec 11 11:39:53 CET 2018 <br>
 * JIOWA CodeGen Version: jiowa-codegen-2.1.6 
 * 
 * <p>
 * Generated by the JIOWA Code Generation Framework (<a href="http://www.jiowa.de">www.jiowa.de</a>) <br>
 * Written by <a href="http://www.mencl.de/">Robert Mencl</a> for <br>
 * JIOWA Business Solutions GmbH, Bettinastr. 30, D-60325 Frankfurt am Main, Germany.<br>
 * Download link: <a href="http://www.jiowa.de/download.html">www.jiowa.de/download.html</a> <br>
 * License: <a href="http://www.jiowa.de/license.html">www.jiowa.de/license.html</a>
 * 
 */
@SuppressWarnings("unused")
public class CaseComponent_jCOLIBRI_jgt extends TemplateBean
{   
    /*------------------------------------------------------------------------*\
     * Fields & constants:                                                    *
    \*------------------------------------------------------------------------*/
    
    /**
     * The ID for this template bean. It is used for type mapping during automatic value propagation of subtemplates.
     */
    public static final java.lang.String ID = "CaseComponent_jCOLIBRI.";            
    
    /*------------------------------------------------------------------------*\
     * Constructors:                                                          *
    \*------------------------------------------------------------------------*/

    public CaseComponent_jCOLIBRI_jgt()
    {
        initialize();
    }

    /** 
     * Something similar like a copy constructor.
     * Actually it is a 'parent constructor'.
     * During evaluation, each time a variable or subtemplate has not been set the 
     * evaluator if has been set in the parent bean.
     * If so, it takes the values from the parent bean.
     * @param parent parent template bean for value propagation
     */    
    public CaseComponent_jCOLIBRI_jgt(TemplateBean parent)
    {
        super(parent);  // 'parent constructor' similar to copy constructor. See explanation above!
        initialize();
    }
    
    /*------------------------------------------------------------------------*\
     * Static creation methods:                                               *
     * (often used while filling data into a template bean)                   *
    \*------------------------------------------------------------------------*/

    /**
     * Returns the id of this template bean (i.e. either template file name or inline subtemplate identifier.
     * @return the ID of this template bean as string value
     */
    @Override
    public java.lang.String id()
    {
        return ID; 
    }

    /*------------------------------------------------------------------------*\
     * Methods for template variables:                                        *
    \*------------------------------------------------------------------------*/

    /**
     * Returns the value of PackageName.
     * @return value of PackageName
     */
    public java.lang.String getPackageName()
    {
        return variableValue("PackageName"); 
    }
    
    /**
     * Sets the value of PackageName.
     * @param value the value of PackageName as string
     * @return the reference to the current template bean
     */
    public CaseComponent_jCOLIBRI_jgt setPackageName(java.lang.String value)
    {
        variableMap.put("PackageName", value);
        return this;
    }
    
    /**
     * Returns the value of ClassName.
     * @return value of ClassName
     */
    public java.lang.String getClassName()
    {
        return variableValue("ClassName"); 
    }
    
    /**
     * Sets the value of ClassName.
     * @param value the value of ClassName as string
     * @return the reference to the current template bean
     */
    public CaseComponent_jCOLIBRI_jgt setClassName(java.lang.String value)
    {
        variableMap.put("ClassName", value);
        return this;
    }

    /*------------------------------------------------------------------------*\
     * Classes & Methods for sub template structures:                         *
    \*------------------------------------------------------------------------*/
    
    /** 
     * Constant foreachAttribute which can be used for the data insertion process 
     */
    public final foreachAttribute foreachAttribute = new foreachAttribute(this);
    
    /**
     * This class resembles the subtemplate structure identifier 'foreachAttribute' from the 
     * template CaseComponent_jCOLIBRI.jgt.
     */
    public static class foreachAttribute
    {
        /*------------------------------------------------------------------------*\
         * ID to template bean class mapping :                                    *
        \*------------------------------------------------------------------------*/
        
        /**
         * This map delivers the corresponding template bean class for a given (sub)template identifier.
         * This ensures that (sub)template filtering works even in those cases where the user might choose
         * to obfuscate his template beans (for whatever reason).
         */
        protected static ID2ClassMap ID_2_CLASS_MAP = new ID2ClassMap();
        
        /*------------------------------------------------------------------------*\
         * Parent template bean:                                                  *
        \*------------------------------------------------------------------------*/
        
        /** 
         * Parent template bean (also used for value propagation). 
         * If values or subtemplates are not set in this template, the initializations are propagated from 
         * the parent bean. 
         */
        protected CaseComponent_jCOLIBRI_jgt parent = null;
    
        /*------------------------------------------------------------------------*\
         * Constructors:                                                          *
        \*------------------------------------------------------------------------*/
    
        /** 
         * Constructor for foreachAttribute with a reference to parent bean. 
         * The parent bean is used for automatic value propagation which works for variable values as well as for subtemplates. 
         * @param parent parent bean for value propagation
         */
        protected foreachAttribute(CaseComponent_jCOLIBRI_jgt parent)
        {
            this.parent = parent;
            if (this.parent != null)
            {
                this.parent.putID2ClassMap("foreachAttribute", ID_2_CLASS_MAP);
            }
        }    
    
        /*------------------------------------------------------------------------*\
         * Methods                                                                *
        \*------------------------------------------------------------------------*/
    
        /** 
         * Returns a reference to parent template bean. 
         * @return parent template bean
         */
        protected CaseComponent_jCOLIBRI_jgt parent()
        {
            return this.parent;        
        }
        
        /*------------------------------------------------------------------------*\
         * Nested classes for inline sub templates                                *
        \*------------------------------------------------------------------------*/
    
        /*------------------------------------------------------------------------*\
         * Public Methods for sub template structures:                            *
        \*------------------------------------------------------------------------*/
        
        /**
         * Returns all elements which have been stored for this sub template structure identifier: 'foreachAttribute'.
         * @return list of all template beans for this sub structure identifier: 'foreachAttribute'.
         */
        public TemplateBeanList getAll() 
        {
            return parent.subTemplateStructureMap().get("foreachAttribute");
        }
    
        /**
         * Sets all elements of the template bean list for the subtemplate structure identifier 'foreachAttribute'.
         * @param beanList the list of templates beans to be inserted for this substructure identifier: 'foreachAttribute'
         * @return reference to current template bean.
         */
        public CaseComponent_jCOLIBRI_jgt setAll(TemplateBeanList beanList)
        {
            parent.subTemplateStructureMap.put("foreachAttribute", beanList);
            return parent;
        }
        
        /** 
         * Creates and sets a subtemplate according to its identifier and returns a reference to this sub template instance.
         * @param subTemplateIdentifier the identifier for the subtemplate. Examples: Attribute.jgt, Arg, ... etc.
         * @return reference to this sub template
         */
        public TemplateBean setSubTemplate(java.lang.String subTemplateIdentifier)
        {
            return parent.setSubTemplate("foreachAttribute", subTemplateIdentifier);
        }
        
        /** 
         * Creates and sets a subtemplate according to its identifier and returns a reference to this sub template instance.
         * @param subTemplateIdentifier the identifier for the subtemplate. Examples: Attribute.jgt, Arg, ... etc.
         * @param parentBean reference to parent bean for automatic value propagation
         * @return reference to this sub template
         */
        public TemplateBean setSubTemplate(java.lang.String subTemplateIdentifier, TemplateBean parentBean)
        {
            return parent.setSubTemplate("foreachAttribute", subTemplateIdentifier, parentBean); 
        }
    
        /** 
         * Clears all data that has been stored for subtemplate structure identifier 'foreachAttribute'
         */
        public void clear()   
        {
            parent.subTemplateStructureMap().put("foreachAttribute", new TemplateBeanList()); 
        }
        
        /*------------------------------------------------------------------------*\
         * Methods for sub templates of this inline sub template:                 *
         * (inclusion of inline and external sub templates)                       *
        \*------------------------------------------------------------------------*/
    
        /**
         * Add this subtemplate to ID & class mapping.
         */
        static
        {
            ID_2_CLASS_MAP.put("Argument.", Argument_jgt.class);
        }
        
        /** 
         * Prepends the bean to the list of beans for foreachAttribute. 
         * @param bean the bean to inserted at the beginning the template bean list.
         * @return reference to current template bean.
         */
        public CaseComponent_jCOLIBRI_jgt prepend(Argument_jgt bean)
        {
            parent.subTemplateStructureMap.prepend("foreachAttribute", bean);    
            return parent;
        }
        
        /** 
         * Creates and prepends a bean Argument_jgt to foreachAttribute and returns a reference to this bean. 
         * @return reference to current template bean.
         */
        public Argument_jgt prepend_Argument_jgt()
        {
            TemplateBean parentBean = parent;
            Argument_jgt bean = new Argument_jgt(parentBean); 
            prepend(bean);
            return bean;
        }
        
        /** 
         * Creates and prepends a bean Argument_jgt to foreachAttribute and sets a reference to a parent bean.
         * @param parentBean the reference to parent template bean for value propagation
         * @return reference to current templat bean
         */
        public Argument_jgt prepend_Argument_jgt(TemplateBean parentBean)
        {
            Argument_jgt bean = new Argument_jgt(parentBean); 
            prepend(bean);
            return bean;
        }
        
        /** 
         * Appends the bean to the list of beans for foreachAttribute. 
         * @param bean the bean to be added to the list
         * @return reference to current template bean
         */
        public CaseComponent_jCOLIBRI_jgt append(Argument_jgt bean)
        {
            parent.subTemplateStructureMap.append("foreachAttribute", bean);    
            return parent;
        }
        
        /** 
         * Creates and appends a bean Argument_jgt to foreachAttribute and returns a reference to this bean. 
         * @return the reference to the created bean of type Argument_jgt
         */
        public Argument_jgt append_Argument_jgt()
        {
            TemplateBean parentBean = parent;
            Argument_jgt bean = new Argument_jgt(parentBean); 
            append(bean);
            return bean;
        }
        
        /** 
         * Creates and appends a bean Argument_jgt to foreachAttribute and initializes its values with the given TemplateBean and returns a reference to this bean. 
         * @param parentBean reference to parent template bean for value propagation.
         * @return the reference to the created bean of type Argument_jgt
         */
        public Argument_jgt append_Argument_jgt(TemplateBean parentBean)
        {
            Argument_jgt bean = new Argument_jgt(parentBean); 
            append(bean);
            return bean;
        }
        
        /** 
         * Sets the list of beans of foreachAttribute to exactly one bean. 
         * @param bean the bean which is inserted into the template bean list as one and only element.
         * @return reference to current template bean 
         */
        public CaseComponent_jCOLIBRI_jgt set(Argument_jgt bean)
        {
            parent.subTemplateStructureMap.put("foreachAttribute", bean);
            return parent;
        }
        
        /** 
         * Sets a bean Argument_jgt for foreachAttribute and returns a reference to this bean.
         * @return reference to created template bean.
         */
        public Argument_jgt set_Argument_jgt()
        {
            TemplateBean parentBean = parent;
            Argument_jgt bean = new Argument_jgt(parentBean); 
            set(bean);
            return bean;
        }
        
        /** 
         * Sets a bean Argument_jgt for foreachAttribute, sets its parent template bean and returns a reference the created bean. 
         * @param parentBean the parent template bean for value propagation.
         * @return reference to created template bean
         */
        public Argument_jgt set_Argument_jgt(TemplateBean parentBean)
        {
            Argument_jgt bean = new Argument_jgt(parentBean); 
            set(bean);
            return bean;
        }
        
        /**
         * Add this subtemplate to ID & class mapping.
         */
        static
        {
            ID_2_CLASS_MAP.put("Attribute.", Attribute_jgt.class);
        }
        
        /** 
         * Prepends the bean to the list of beans for foreachAttribute. 
         * @param bean the bean to inserted at the beginning the template bean list.
         * @return reference to current template bean.
         */
        public CaseComponent_jCOLIBRI_jgt prepend(Attribute_jgt bean)
        {
            parent.subTemplateStructureMap.prepend("foreachAttribute", bean);    
            return parent;
        }
        
        /** 
         * Creates and prepends a bean Attribute_jgt to foreachAttribute and returns a reference to this bean. 
         * @return reference to current template bean.
         */
        public Attribute_jgt prepend_Attribute_jgt()
        {
            TemplateBean parentBean = parent;
            Attribute_jgt bean = new Attribute_jgt(parentBean); 
            prepend(bean);
            return bean;
        }
        
        /** 
         * Creates and prepends a bean Attribute_jgt to foreachAttribute and sets a reference to a parent bean.
         * @param parentBean the reference to parent template bean for value propagation
         * @return reference to current templat bean
         */
        public Attribute_jgt prepend_Attribute_jgt(TemplateBean parentBean)
        {
            Attribute_jgt bean = new Attribute_jgt(parentBean); 
            prepend(bean);
            return bean;
        }
        
        /** 
         * Appends the bean to the list of beans for foreachAttribute. 
         * @param bean the bean to be added to the list
         * @return reference to current template bean
         */
        public CaseComponent_jCOLIBRI_jgt append(Attribute_jgt bean)
        {
            parent.subTemplateStructureMap.append("foreachAttribute", bean);    
            return parent;
        }
        
        /** 
         * Creates and appends a bean Attribute_jgt to foreachAttribute and returns a reference to this bean. 
         * @return the reference to the created bean of type Attribute_jgt
         */
        public Attribute_jgt append_Attribute_jgt()
        {
            TemplateBean parentBean = parent;
            Attribute_jgt bean = new Attribute_jgt(parentBean); 
            append(bean);
            return bean;
        }
        
        /** 
         * Creates and appends a bean Attribute_jgt to foreachAttribute and initializes its values with the given TemplateBean and returns a reference to this bean. 
         * @param parentBean reference to parent template bean for value propagation.
         * @return the reference to the created bean of type Attribute_jgt
         */
        public Attribute_jgt append_Attribute_jgt(TemplateBean parentBean)
        {
            Attribute_jgt bean = new Attribute_jgt(parentBean); 
            append(bean);
            return bean;
        }
        
        /** 
         * Sets the list of beans of foreachAttribute to exactly one bean. 
         * @param bean the bean which is inserted into the template bean list as one and only element.
         * @return reference to current template bean 
         */
        public CaseComponent_jCOLIBRI_jgt set(Attribute_jgt bean)
        {
            parent.subTemplateStructureMap.put("foreachAttribute", bean);
            return parent;
        }
        
        /** 
         * Sets a bean Attribute_jgt for foreachAttribute and returns a reference to this bean.
         * @return reference to created template bean.
         */
        public Attribute_jgt set_Attribute_jgt()
        {
            TemplateBean parentBean = parent;
            Attribute_jgt bean = new Attribute_jgt(parentBean); 
            set(bean);
            return bean;
        }
        
        /** 
         * Sets a bean Attribute_jgt for foreachAttribute, sets its parent template bean and returns a reference the created bean. 
         * @param parentBean the parent template bean for value propagation.
         * @return reference to created template bean
         */
        public Attribute_jgt set_Attribute_jgt(TemplateBean parentBean)
        {
            Attribute_jgt bean = new Attribute_jgt(parentBean); 
            set(bean);
            return bean;
        }
        
        /**
         * Add this subtemplate to ID & class mapping.
         */
        static
        {
            ID_2_CLASS_MAP.put("AttributeInit.", AttributeInit_jgt.class);
        }
        
        /** 
         * Prepends the bean to the list of beans for foreachAttribute. 
         * @param bean the bean to inserted at the beginning the template bean list.
         * @return reference to current template bean.
         */
        public CaseComponent_jCOLIBRI_jgt prepend(AttributeInit_jgt bean)
        {
            parent.subTemplateStructureMap.prepend("foreachAttribute", bean);    
            return parent;
        }
        
        /** 
         * Creates and prepends a bean AttributeInit_jgt to foreachAttribute and returns a reference to this bean. 
         * @return reference to current template bean.
         */
        public AttributeInit_jgt prepend_AttributeInit_jgt()
        {
            TemplateBean parentBean = parent;
            AttributeInit_jgt bean = new AttributeInit_jgt(parentBean); 
            prepend(bean);
            return bean;
        }
        
        /** 
         * Creates and prepends a bean AttributeInit_jgt to foreachAttribute and sets a reference to a parent bean.
         * @param parentBean the reference to parent template bean for value propagation
         * @return reference to current templat bean
         */
        public AttributeInit_jgt prepend_AttributeInit_jgt(TemplateBean parentBean)
        {
            AttributeInit_jgt bean = new AttributeInit_jgt(parentBean); 
            prepend(bean);
            return bean;
        }
        
        /** 
         * Appends the bean to the list of beans for foreachAttribute. 
         * @param bean the bean to be added to the list
         * @return reference to current template bean
         */
        public CaseComponent_jCOLIBRI_jgt append(AttributeInit_jgt bean)
        {
            parent.subTemplateStructureMap.append("foreachAttribute", bean);    
            return parent;
        }
        
        /** 
         * Creates and appends a bean AttributeInit_jgt to foreachAttribute and returns a reference to this bean. 
         * @return the reference to the created bean of type AttributeInit_jgt
         */
        public AttributeInit_jgt append_AttributeInit_jgt()
        {
            TemplateBean parentBean = parent;
            AttributeInit_jgt bean = new AttributeInit_jgt(parentBean); 
            append(bean);
            return bean;
        }
        
        /** 
         * Creates and appends a bean AttributeInit_jgt to foreachAttribute and initializes its values with the given TemplateBean and returns a reference to this bean. 
         * @param parentBean reference to parent template bean for value propagation.
         * @return the reference to the created bean of type AttributeInit_jgt
         */
        public AttributeInit_jgt append_AttributeInit_jgt(TemplateBean parentBean)
        {
            AttributeInit_jgt bean = new AttributeInit_jgt(parentBean); 
            append(bean);
            return bean;
        }
        
        /** 
         * Sets the list of beans of foreachAttribute to exactly one bean. 
         * @param bean the bean which is inserted into the template bean list as one and only element.
         * @return reference to current template bean 
         */
        public CaseComponent_jCOLIBRI_jgt set(AttributeInit_jgt bean)
        {
            parent.subTemplateStructureMap.put("foreachAttribute", bean);
            return parent;
        }
        
        /** 
         * Sets a bean AttributeInit_jgt for foreachAttribute and returns a reference to this bean.
         * @return reference to created template bean.
         */
        public AttributeInit_jgt set_AttributeInit_jgt()
        {
            TemplateBean parentBean = parent;
            AttributeInit_jgt bean = new AttributeInit_jgt(parentBean); 
            set(bean);
            return bean;
        }
        
        /** 
         * Sets a bean AttributeInit_jgt for foreachAttribute, sets its parent template bean and returns a reference the created bean. 
         * @param parentBean the parent template bean for value propagation.
         * @return reference to created template bean
         */
        public AttributeInit_jgt set_AttributeInit_jgt(TemplateBean parentBean)
        {
            AttributeInit_jgt bean = new AttributeInit_jgt(parentBean); 
            set(bean);
            return bean;
        }
        
        /**
         * Add this subtemplate to ID & class mapping.
         */
        static
        {
            ID_2_CLASS_MAP.put("Getter.", Getter_jgt.class);
        }
        
        /** 
         * Prepends the bean to the list of beans for foreachAttribute. 
         * @param bean the bean to inserted at the beginning the template bean list.
         * @return reference to current template bean.
         */
        public CaseComponent_jCOLIBRI_jgt prepend(Getter_jgt bean)
        {
            parent.subTemplateStructureMap.prepend("foreachAttribute", bean);    
            return parent;
        }
        
        /** 
         * Creates and prepends a bean Getter_jgt to foreachAttribute and returns a reference to this bean. 
         * @return reference to current template bean.
         */
        public Getter_jgt prepend_Getter_jgt()
        {
            TemplateBean parentBean = parent;
            Getter_jgt bean = new Getter_jgt(parentBean); 
            prepend(bean);
            return bean;
        }
        
        /** 
         * Creates and prepends a bean Getter_jgt to foreachAttribute and sets a reference to a parent bean.
         * @param parentBean the reference to parent template bean for value propagation
         * @return reference to current templat bean
         */
        public Getter_jgt prepend_Getter_jgt(TemplateBean parentBean)
        {
            Getter_jgt bean = new Getter_jgt(parentBean); 
            prepend(bean);
            return bean;
        }
        
        /** 
         * Appends the bean to the list of beans for foreachAttribute. 
         * @param bean the bean to be added to the list
         * @return reference to current template bean
         */
        public CaseComponent_jCOLIBRI_jgt append(Getter_jgt bean)
        {
            parent.subTemplateStructureMap.append("foreachAttribute", bean);    
            return parent;
        }
        
        /** 
         * Creates and appends a bean Getter_jgt to foreachAttribute and returns a reference to this bean. 
         * @return the reference to the created bean of type Getter_jgt
         */
        public Getter_jgt append_Getter_jgt()
        {
            TemplateBean parentBean = parent;
            Getter_jgt bean = new Getter_jgt(parentBean); 
            append(bean);
            return bean;
        }
        
        /** 
         * Creates and appends a bean Getter_jgt to foreachAttribute and initializes its values with the given TemplateBean and returns a reference to this bean. 
         * @param parentBean reference to parent template bean for value propagation.
         * @return the reference to the created bean of type Getter_jgt
         */
        public Getter_jgt append_Getter_jgt(TemplateBean parentBean)
        {
            Getter_jgt bean = new Getter_jgt(parentBean); 
            append(bean);
            return bean;
        }
        
        /** 
         * Sets the list of beans of foreachAttribute to exactly one bean. 
         * @param bean the bean which is inserted into the template bean list as one and only element.
         * @return reference to current template bean 
         */
        public CaseComponent_jCOLIBRI_jgt set(Getter_jgt bean)
        {
            parent.subTemplateStructureMap.put("foreachAttribute", bean);
            return parent;
        }
        
        /** 
         * Sets a bean Getter_jgt for foreachAttribute and returns a reference to this bean.
         * @return reference to created template bean.
         */
        public Getter_jgt set_Getter_jgt()
        {
            TemplateBean parentBean = parent;
            Getter_jgt bean = new Getter_jgt(parentBean); 
            set(bean);
            return bean;
        }
        
        /** 
         * Sets a bean Getter_jgt for foreachAttribute, sets its parent template bean and returns a reference the created bean. 
         * @param parentBean the parent template bean for value propagation.
         * @return reference to created template bean
         */
        public Getter_jgt set_Getter_jgt(TemplateBean parentBean)
        {
            Getter_jgt bean = new Getter_jgt(parentBean); 
            set(bean);
            return bean;
        }
    }

    /*------------------------------------------------------------------------*\
     * Creates the bean parts of this template bean that are used by the      *
     * super class for the toString() method.                                 *
    \*------------------------------------------------------------------------*/

    /** 
     * Initializer for variables and subtemplate structures
     * and for the data structures (i.e. bean parts) which prepare the bean data for the
     * toString() method.
     */
    protected void initialize()
    {
        // variables:
        variables.add("PackageName");
        variables.add("ClassName");        
        // subtemplates:
        subTemplateStructureIdentifiers.add("foreachAttribute");        
        // bean parts for toString() method:
        partList.add(new TextPart("package ",0));
        partList.add(new VariablePart("PackageName","<<PackageName>>",8));
        partList.add(new TextPart(";\n\nimport es.ucm.fdi.gaia.jcolibri.cbrcore.Attribute;\nimport es.ucm.fdi.gaia.jcolibri.cbrcore.CaseComponent;\n\npublic class ",27));
        partList.add(new VariablePart("ClassName","<<ClassName>>",13));
        partList.add(new TextPart(" implements CaseComponent {\n\n    ",30));
        partList.add(new SubTemplateStructurePart("foreachAttribute",4,"Attribute."));
        partList.add(new TextOperatorPart(new DeleteTrailingWhitespaceLinesOperator(null)));
        partList.add(new TextPart(" \n    \n    ",44));
        partList.add(new TextPart("/**\n     * Constructor with all attributes.\n     */\n    public ",0));
        partList.add(new VariablePart("ClassName","<<ClassName>>",11));
        partList.add(new TextPart("(",24));
        partList.add(new SubTemplateStructurePart("foreachAttribute",29,"Argument."));
        partList.add(new TextOperatorPart(new DeleteTrailingWhitespaceLinesOperator(",")));
        partList.add(new TextPart(")  \n    {\n        ",140));
        partList.add(new SubTemplateStructurePart("foreachAttribute",8,"AttributeInit."));
        partList.add(new TextOperatorPart(new DeleteTrailingWhitespaceLinesOperator(null)));
        partList.add(new TextPart("\n    }\n    ",48));
        partList.add(new TextOperatorPart(new DeleteTrailingWhitespaceLinesOperator(null)));
        partList.add(new TextPart("\n    \n    public Attribute getIdAttribute() {\n        return new Attribute(\"id\", ",37));
        partList.add(new VariablePart("ClassName","<<ClassName>>",35));
        partList.add(new TextPart(".class);\n    }\n\n    ",52));
        partList.add(new SubTemplateStructurePart("foreachAttribute",4,"Getter."));
        partList.add(new TextOperatorPart(new DeleteTrailingWhitespaceLinesOperator(null)));
        partList.add(new TextPart("\n    \n    // {{ProtectedRegionStart::ManuallyWrittenCode}}    \n        // ...\n        // insert your customized code here!        \n        // ... \n    // {{ProtectedRegionEnd}}\n    \n}\n",41));
    }
}


