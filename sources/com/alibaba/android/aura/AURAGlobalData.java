package com.alibaba.android.aura;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.ck;
import tb.rbb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AURAGlobalData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String TAG;
    private Map<String, Object> mMap;

    static {
        t2o.a(79691797);
    }

    @Deprecated
    public AURAGlobalData() {
        this.TAG = AURAGlobalData.class.getSimpleName();
        this.mMap = new ConcurrentHashMap();
    }

    public AURAGlobalData copyOnWrite(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAGlobalData) ipChange.ipc$dispatch("b5611c49", new Object[]{this, map});
        }
        AURAGlobalData aURAGlobalData = new AURAGlobalData(this);
        if (aURAGlobalData.mMap == null) {
            aURAGlobalData.mMap = new ConcurrentHashMap();
        }
        if (map != null) {
            aURAGlobalData.mMap.putAll(map);
        }
        return aURAGlobalData;
    }

    public <T> T get(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("3e8a6d3c", new Object[]{this, str, cls});
        }
        Map<String, Object> map = this.mMap;
        if (map == null) {
            return null;
        }
        try {
            return (T) map.get(str);
        } catch (Throwable th) {
            ck.g().b(this.TAG, "get", th.getMessage());
            return null;
        }
    }

    public Map<String, Object> getMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("da2ef722", new Object[]{this});
        }
        return this.mMap;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "UMFGlobalData{map=" + this.mMap + '}';
    }

    public void update(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("843003f6", new Object[]{this, str, obj});
            return;
        }
        Map<String, Object> map = this.mMap;
        if (map == null || str == null) {
            rbb g = ck.g();
            String str2 = this.TAG;
            g.b(str2, "update", "mMap or key or value is null,key=" + str);
        } else if (obj == null) {
            map.remove(str);
        } else {
            map.put(str, obj);
        }
    }

    public AURAGlobalData(AURAGlobalData aURAGlobalData) {
        this.TAG = AURAGlobalData.class.getSimpleName();
        this.mMap = new ConcurrentHashMap();
        if (aURAGlobalData.mMap != null) {
            this.mMap = new ConcurrentHashMap(aURAGlobalData.mMap);
        }
    }
}
