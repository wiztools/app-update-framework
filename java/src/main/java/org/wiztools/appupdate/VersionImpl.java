package org.wiztools.appupdate;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author subwiz
 */
public class VersionImpl implements Version {
    
    private static final String regex = "^([0-9]+)(\\.([0-9]+))?(\\.([0-9]+))?$";
    
    private final String stringRepresentation;
    private final int major;
    private final int minor;
    private final int patch;
    
    public VersionImpl(String vStr) {
        stringRepresentation = vStr;
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(vStr);
        if(m.matches()) {
            major = Integer.parseInt(m.group(1));
            
            String minorStr = m.group(3);
            if(minorStr != null && !minorStr.equals("")) {
                minor = Integer.parseInt(minorStr);
            }
            else {
                minor = 0;
            }
            
            String patchStr = m.group(5);
            if(patchStr != null && !patchStr.equals("")) {
                patch = Integer.parseInt(patchStr);
            }
            else {
                patch = 0;
            }
        }
        else {
            throw new IllegalArgumentException("Invalid version string: " + vStr);
        }
    }
    
    @Override
    public String toString() {
        return stringRepresentation;
    }

    @Override
    public int getMajor() {
        return major;
    }

    @Override
    public int getMinor() {
        return minor;
    }

    @Override
    public int getPatch() {
        return patch;
    }

    @Override
    public boolean isLessThan(Version v) {
        if(this.getMajor() < v.getMajor()) {
            return true;
        }
        else if(this.getMajor() == v.getMajor()) {
            if(this.getMinor() < v.getMinor()) {
                return true;
            }
            else if(this.getMinor() == v.getMinor()) {
                if(this.getPatch() < v.getPatch()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean isGreaterThan(Version v) {
        if(this.getMajor() > v.getMajor()) {
            return true;
        }
        else if(this.getMajor() == v.getMajor()) {
            if(this.getMinor() > v.getMinor()) {
                return true;
            }
            else if(this.getMinor() == v.getMinor()) {
                if(this.getPatch() > v.getPatch()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean isLessThanOrEqual(Version v) {
        return isLessThan(v) || equals(v);
    }

    @Override
    public boolean isGreaterThanOrEqual(Version v) {
        return isGreaterThan(v) || equals(v);
    }

    @Override
    public boolean isWithin(Version min, Version max) {
        return isGreaterThanOrEqual(min) && isLessThanOrEqual(max);
    }

    @Override
    public boolean isBetween(Version min, Version max) {
        return isGreaterThan(min) && isLessThan(max);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.stringRepresentation);
        hash = 97 * hash + this.major;
        hash = 97 * hash + this.minor;
        hash = 97 * hash + this.patch;
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
        final VersionImpl other = (VersionImpl) obj;
        if (!Objects.equals(this.stringRepresentation, other.stringRepresentation)) {
            return false;
        }
        if (this.major != other.major) {
            return false;
        }
        if (this.minor != other.minor) {
            return false;
        }
        if (this.patch != other.patch) {
            return false;
        }
        return true;
    }
}
