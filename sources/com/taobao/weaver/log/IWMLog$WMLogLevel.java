package com.taobao.weaver.log;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum IWMLog$WMLogLevel {
    WMLogLevelError("Error"),
    WMLogLevelWarn("Warn"),
    WMLogLevelInfo("Info"),
    WMLogLevelDebug("Debug"),
    WMLogLevelVerbose("Verbose");
    
    private String description;

    IWMLog$WMLogLevel(String str) {
        this.description = str;
    }

    public String getDescription() {
        return this.description;
    }
}
