package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class miv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f24069a = new HashMap(5);

    static {
        t2o.a(468714319);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            ((HashMap) this.f24069a).clear();
        }
    }

    public Map<String, Object> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4e340d88", new Object[]{this});
        }
        return this.f24069a;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        return ((HashMap) this.f24069a).isEmpty();
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc84be8f", new Object[]{this, str})).booleanValue();
        }
        return ((HashMap) this.f24069a).containsKey(str);
    }

    public void e(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afb083a7", new Object[]{this, str, str2, new Boolean(z)});
        } else if (z) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", (Object) 2);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("type", (Object) str2.toLowerCase());
            }
            ((HashMap) this.f24069a).put(str, jSONObject);
        } else {
            ((HashMap) this.f24069a).remove(str);
        }
    }
}
