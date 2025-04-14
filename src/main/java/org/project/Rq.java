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

        if(cmdBits.length == 1){
            return;
        }

        String[] paramBits = cmdBits[1].split("=", 2);

        String key = paramBits[0];
        String value = paramBits[1];
        params.put(key, value);
        // parsing end
    }

    public String getActionCode(){
        return actionCode;
    }
    public String getParams(String key){
        return params.get(key);
    }

    public int getIntParams(String key, int defaultValue) {
        try{
            return Integer.parseInt(getParams(key));
        }
        catch (NumberFormatException e){
        }
        return defaultValue;
    }
}
