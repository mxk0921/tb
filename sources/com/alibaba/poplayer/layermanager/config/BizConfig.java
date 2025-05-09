package com.alibaba.poplayer.layermanager.config;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class BizConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, ConfigItem> mConfigs = new ConcurrentHashMap();

    static {
        t2o.a(625999959);
    }

    public ConfigItem findConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConfigItem) ipChange.ipc$dispatch("6324300", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.mConfigs.get(str);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("{");
        for (String str : this.mConfigs.keySet()) {
            if (!TextUtils.isEmpty(str)) {
                sb.append("{");
                sb.append(str);
                sb.append(":");
                sb.append(this.mConfigs.get(str).toString());
                sb.append("}");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
