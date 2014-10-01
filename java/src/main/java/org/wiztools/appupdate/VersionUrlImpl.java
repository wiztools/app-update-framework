package org.wiztools.appupdate;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.version);
        hash = 83 * hash + Objects.hashCode(this.url);
        hash = 83 * hash + Objects.hashCode(this.leastVersionRequired);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final VersionUrlImpl other = (VersionUrlImpl) obj;
        if (!Objects.equals(this.version, other.version)) {
            return false;
        }
        if (!Objects.equals(this.url, other.url)) {
            return false;
        }
        if (!Objects.equals(this.leastVersionRequired, other.leastVersionRequired)) {
            return false;
        }
        return true;
    }
    
}
