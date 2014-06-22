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
package org.talend.designer.runprocess;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.talend.core.model.process.ITargetExecutionConfig;

/**
 * DOC nrousseau class global comment. Detailled comment
 */
public interface IEclipseProcessor {

    // to use "debug", the code must be generated first.
    // (for compatibility, if the code has never been generated, it will generated once)
    public ILaunchConfiguration debug() throws ProcessorException;

    public void setTargetExecutionConfig(ITargetExecutionConfig serverConfiguration);
}
