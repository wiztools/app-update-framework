package org.wiztools.appupdate;

/**
 *
 * @author subwiz
 */
public class VersionUrlImpl implements VersionUrl {
    
    private final Version version;
    private final String url;
    private final Version leastVersionRequired;

    public VersionUrlImpl(Version version, String url, Version leastVersionRequired) {
        this.version = version;
        this.url = url;
        this.leastVersionRequired = leastVersionRequired;
    }

    @Override
    public Version getVersion() {
        return version;
    }

    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public Version getLeastVersionRequired() {
        return leastVersionRequired;
    }
    
}
