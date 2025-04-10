package org.project;

import java.util.HashMap;
import java.util.Map;

// Rq == Request
public class Rq {
    private String actionCode;
    private Map<String, String> params;

    public Rq(String cmd){
        // parsing start
        String[] cmdBits = cmd.split("\\?", 2);
        actionCode = cmdBits[0];
        params = new HashMap<>();

        String[] paramBits = cmdBits[1].split("=", 2);

        String key = paramBits[0];
        String value = paramBits[1];
        params.put(key, value);
        // parsing end
    }

    public String getActionCode(){
        return actionCode;
    }
    public Map<String, String> getParams(){
        return params;
    }

}
