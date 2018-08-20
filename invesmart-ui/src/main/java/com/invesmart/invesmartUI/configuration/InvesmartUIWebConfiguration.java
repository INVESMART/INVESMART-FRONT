package com.invesmart.invesmartUI.configuration;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class InvesmartUIWebConfiguration {

    @SuppressWarnings("serial")
    public static Map<String, Object> getWebConfiguration() {
        return Collections.unmodifiableMap(new HashMap<String, Object>() {
            {
                put("server.port", 9081);
                put("server.servlet.context-path", "/");
            }
        });
    }

    public static String getEncoding() {
        return "UTF-8";
    }

    public static String getRestURLMapping() {
        return "/rest/*";
    }

}
