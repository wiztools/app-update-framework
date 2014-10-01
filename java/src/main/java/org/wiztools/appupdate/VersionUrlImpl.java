package org.wiztools.appupdate;

import java.util.Objects;

/**
 *
 * @author subwiz
 */
public class VersionUrlImpl implements VersionUrl {
    
    private Version version;
    private String url;
    private String releaseNotesUrl;
    private Version leastVersionRequired;

    public void setVersion(Version version) {
        this.version = version;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setReleaseNotesUrl(String releaseNotesUrl) {
        this.releaseNotesUrl = releaseNotesUrl;
    }

    public void setLeastVersionRequired(Version leastVersionRequired) {
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
    public String getReleaseNotesUrl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
