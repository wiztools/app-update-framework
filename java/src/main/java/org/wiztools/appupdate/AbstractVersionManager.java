package org.wiztools.appupdate;

import java.io.IOException;

/**
 *
 * @author subhash
 */
public abstract class AbstractVersionManager implements VersionManager{

    protected final String endpoint;
    
    public AbstractVersionManager(String endpoint) {
        this.endpoint = endpoint;
    }

    @Override
    public VersionUrl getLatestVersion() throws IOException {
        return VersionWSUtil.getLatestVersion(endpoint);
    }
    
}
