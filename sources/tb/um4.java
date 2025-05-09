package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.multitab.nativetab.NativeContainerProvider;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class um4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, rwc> f29488a = new ConcurrentHashMap();
    public static final Map<String, Class<?>> b;

    static {
        t2o.a(729809440);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        b = concurrentHashMap;
        concurrentHashMap.put(NativeContainerProvider.DX_CONTAINER, NativeContainerProvider.class);
    }

    public static rwc a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String u = vaj.u(jSONObject);
        String h = vaj.h(jSONObject);
        if (!TextUtils.isEmpty(u) && !TextUtils.isEmpty(h)) {
            String str = u + "_" + h;
            Map<String, rwc> map = f29488a;
            rwc rwcVar = (rwc) ((ConcurrentHashMap) map).get(str);
            if (rwcVar != null) {
                return rwcVar;
            }
            Class cls = (Class) ((ConcurrentHashMap) b).get(h);
            if (cls == null) {
                return null;
            }
            try {
                rwc rwcVar2 = (rwc) cls.newInstance();
                ((ConcurrentHashMap) map).put(str, rwcVar2);
                return rwcVar2;
            } catch (Exception e) {
                d9j.d("ContainerProviderFactory", "createContainerProvider error: ", e);
            }
        }
        return null;
    }
}
