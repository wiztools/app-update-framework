package org.wiztools.appupdate;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author subwiz
 */
public final class VersionWSUtil {

    private VersionWSUtil() {}
    
    public static VersionUrl getLatestVersion(String endpoint) throws IOException {
        URL url = new URL(endpoint);
        URLConnection con = url.openConnection();
        con.addRequestProperty("Accept", "application/json");
        con.connect();
        try(InputStream is = con.getInputStream();) {
            return new JsonConvert().getVersionUrl(is);
        }
    }
    
}
