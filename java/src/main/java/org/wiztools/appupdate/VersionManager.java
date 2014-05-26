package org.wiztools.appupdate;

/**
 *
 * @author subwiz
 */
public interface VersionManager {
    Version getInstalledVersion();
    VersionUrl getLatestVersion();
    VersionUrl getLatestVersionIfNewerAvailable();
}
