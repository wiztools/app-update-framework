package org.wiztools.appupdate;

/**
 *
 * @author subwiz
 */
public interface Version {
    int getMajor();
    int getMinor();
    int getPatch();
    boolean isLessThan(Version v);
    boolean isGreaterThan(Version v);
}
