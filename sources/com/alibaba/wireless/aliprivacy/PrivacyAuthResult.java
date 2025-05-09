package com.alibaba.wireless.aliprivacy;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PrivacyAuthResult implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, AuthStatus> permissions;
    private String sceneCode;

    public Map<String, AuthStatus> getPermissions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("961fe24a", new Object[]{this});
        }
        return this.permissions;
    }

    public String getSceneCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8fb44f6", new Object[]{this});
        }
        return this.sceneCode;
    }

    public void setPermissions(Map<String, AuthStatus> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbade1c", new Object[]{this, map});
        } else {
            this.permissions = map;
        }
    }

    public void setSceneCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98ab15a8", new Object[]{this, str});
        } else {
            this.sceneCode = str;
        }
    }
}
