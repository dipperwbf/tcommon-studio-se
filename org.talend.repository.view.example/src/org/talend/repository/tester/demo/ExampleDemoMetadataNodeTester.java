// ============================================================================
//
// Copyright (C) 2006-2012 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.tester.demo;

import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.repository.metadata.tester.CoMetadataNodeTester;
import org.talend.repository.model.ExampleDemoRepositoryNodeType;

/**
 * DOC ggu class global comment. Detailled comment
 */
public class ExampleDemoMetadataNodeTester extends CoMetadataNodeTester {

    /**
     * this value is same as the attribute "properties" of extension point
     * "org.eclipse.core.expressions.propertyTesters"
     */
    private static final String IS_EXAMPLE_DEMO = "isExampleDemo"; //$NON-NLS-1$

    @Override
    protected ERepositoryObjectType findType(String property) {
        if (IS_EXAMPLE_DEMO.equals(property)) {
            return ExampleDemoRepositoryNodeType.repositoryExampleDemoType;
        }
        return null;
    }
}
