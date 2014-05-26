package org.wiztools.appupdate;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

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
            JsonReader rdr = Json.createReader(is);
            JsonObject obj = rdr.readObject();
            Version version = new VersionImpl(obj.getJsonString("version").getString());
            String dlUrl = obj.getJsonString("dl_url").getString();
            
            return new VersionUrlImpl(version, dlUrl);
        }
    }
    
}
