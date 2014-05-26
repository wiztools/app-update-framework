package org.wiztools.appupdate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author subwiz
 */
public class VersionImpl implements Version {
    
    private static final String regex = "^([0-9]+)(\\.([0-9]+))?(\\.([0-9]+))?$";
    
    private final int major;
    private final int minor;
    private final int patch;
    
    public VersionImpl(String vStr) {
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
    
}
