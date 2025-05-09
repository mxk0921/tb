package com.taobao.android.remoteso.index;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SoIndexAdvanced {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String appVersion = null;
    private final Map<String, SoInfo2> infoMap = new ConcurrentHashMap();

    public String getAppVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this});
        }
        String str = this.appVersion;
        if (str == null) {
            return "";
        }
        return str;
    }

    public Map<String, SoInfo2> getInfoMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("71240614", new Object[]{this});
        }
        return this.infoMap;
    }

    public void setAppVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cefab34a", new Object[]{this, str});
        } else {
            this.appVersion = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SoIndexAdvanced{appVersion='" + this.appVersion + "', infoMap=" + this.infoMap.size() + '}';
    }
}
