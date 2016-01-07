package com.controlsjs.controls4j.teavmsupport;

import java.util.HashSet;
import java.util.Set;
import org.teavm.classlib.ResourceSupplier;
import org.teavm.classlib.ResourceSupplierContext;
import org.teavm.model.ListableClassReaderSource;

/**
 *
 * @author Controls.js Team
 */
public class ControlsJSResourceSupplier implements ResourceSupplier {
    public String[] supplyResources(ResourceSupplierContext context) {
        Set<String> resources = new HashSet<>();
        ListableClassReaderSource classSource = context.getClassSource();
        for (String className : classSource.getClassNames()) {
            String resourceName = className.replace('.', '/') + ".ng";
            resources.add(resourceName);
        }

        return resources.toArray(new String[0]);
    }
}

