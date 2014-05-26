package org.wiztools.appupdate;

/**
 *
 * @author subwiz
 */
public class VersionUrlImpl implements VersionUrl {
    
    private final Version version;
    private final String url;

    public VersionUrlImpl(Version version, String url) {
        this.version = version;
        this.url = url;
    }

    @Override
    public Version getVersion() {
        return version;
    }

    @Override
    public String getUrl() {
        return url;
    }
    
}
