package com.taobao.android.remoteso.index;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.index.SoIndexData;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class RemoPostIndex {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String appVersion;
    private final Map<String, SoIndexData.SoFileInfo> assets = new TreeMap();

    public String getAppVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this});
        }
        return this.appVersion;
    }

    public Map<String, SoIndexData.SoFileInfo> getAssets() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("72bbe8b5", new Object[]{this});
        }
        return this.assets;
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
        return "RemoPostIndex{appVersion='" + this.appVersion + "', assets=" + this.assets + '}';
    }
}
