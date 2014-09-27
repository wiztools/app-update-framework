package org.wiztools.appupdate;

import java.io.InputStream;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonString;

/**
 *
 * @author subwiz
 */
class JsonConvert {
    static VersionUrl getVersionUrl(InputStream is) {
        JsonReader rdr = Json.createReader(is);
        JsonObject obj = rdr.readObject();
        Version version = new VersionImpl(obj.getJsonString("version").getString());
        String dlUrl = obj.getJsonString("dl_url").getString();
        
        final Version leastVersionRequired;
        {
            JsonString t = obj.getJsonString("least_version_required");
            leastVersionRequired = t!=null? new VersionImpl(t.getString()): null;
        }
        return new VersionUrlImpl(version, dlUrl, leastVersionRequired);
    }
}
