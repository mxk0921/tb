package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class gto {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f20224a;
    public final Map<String, String> b = new HashMap();
    public boolean c = false;

    static {
        t2o.a(962593335);
    }

    public gto(String str, Map<String, String> map, Map<String, String> map2) {
        HashMap hashMap = new HashMap();
        this.f20224a = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
        a(map2);
    }

    public final void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc3d00ad", new Object[]{this, map});
        } else if (map == null || map.size() <= 0) {
            this.c = false;
        } else {
            this.b.putAll(map);
            this.c = true;
        }
    }

    public Map<String, String> getSceneProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d23b3ae5", new Object[]{this});
        }
        return this.f20224a;
    }

    public void updateProperties(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d573d7c2", new Object[]{this, map});
        } else if (map != null) {
            ((HashMap) this.f20224a).putAll(map);
        }
    }

    public void updatePropertiesByRule(Map<String, String> map) {
        Map<String, String> map2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("434975cf", new Object[]{this, map});
        } else if (!this.c || map == null || map.size() < 1 || (map2 = this.b) == null || ((HashMap) map2).size() < 1) {
            this.c = false;
        } else {
            for (Map.Entry entry : ((HashMap) this.b).entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    String str3 = map.get(str);
                    if (!TextUtils.isEmpty(str3)) {
                        ((HashMap) this.f20224a).put(str2, str3);
                    }
                }
            }
            this.c = false;
        }
    }

    public void updateTmpProperties(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4656731d", new Object[]{this, map});
        } else if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!((HashMap) this.f20224a).containsKey(key)) {
                    Map<String, String> map2 = this.f20224a;
                    ((HashMap) map2).put(zj4.UT_TMP_ARGS_KEY + key, value);
                }
            }
        }
    }
}
