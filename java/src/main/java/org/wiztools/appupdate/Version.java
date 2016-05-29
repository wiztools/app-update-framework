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
    boolean isLessThanOrEqual(Version v);
    
    boolean isGreaterThan(Version v);
    boolean isGreaterThanOrEqual(Version v);
    
    /**
     * Does a inclusive check. Current version is equal or greater than min, and equal or lesser than max.
     * @param min
     * @param max
     * @return true if conditional check is true.
     */
    boolean isWithin(Version min, Version max);
    
    /**
     * Does a exclusive check. Current version is greater than min, and lesser than max.
     * @param min
     * @param max
     * @return true if conditional check is true.
     */
    boolean isBetween(Version min, Version max);
}
