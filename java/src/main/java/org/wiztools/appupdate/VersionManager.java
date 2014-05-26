package org.wiztools.appupdate;

import java.io.IOException;

/**
 *
 * @author subwiz
 */
public interface VersionManager {
    Version getInstalledVersion();
    VersionUrl getLatestVersion() throws IOException;
}
