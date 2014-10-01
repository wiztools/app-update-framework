package org.wiztools.appupdate;

/**
 *
 * @author subwiz
 */
public interface VersionUrl {
    Version getVersion();
    String getDlUrl();
    String getReleaseNotesUrl();
    Version getLeastVersionRequired();
}
