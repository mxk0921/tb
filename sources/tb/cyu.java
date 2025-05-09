package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class cyu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f17441a = "";
    public final Map<String, Object> b = new HashMap();

    public static cyu a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cyu) ipChange.ipc$dispatch("f24104d", new Object[]{str, obj});
        }
        cyu cyuVar = new cyu();
        if (!byu.a(str) && obj != null) {
            ((HashMap) cyuVar.b).put(str, obj);
        }
        return cyuVar;
    }

    public static cyu b(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cyu) ipChange.ipc$dispatch("56de83e0", new Object[]{map});
        }
        cyu cyuVar = new cyu();
        if (map != null && !map.isEmpty()) {
            ((HashMap) cyuVar.b).putAll(map);
        }
        return cyuVar;
    }

    public static cyu c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cyu) ipChange.ipc$dispatch("d65c6f1c", new Object[]{str});
        }
        cyu cyuVar = new cyu();
        cyuVar.f17441a = str;
        return cyuVar;
    }

    public cyu d(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cyu) ipChange.ipc$dispatch("846af048", new Object[]{this, str, obj});
        }
        if (!byu.a(str) && obj != null) {
            ((HashMap) this.b).put(str, obj);
        }
        return this;
    }

    public Map<String, ?> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8550cc2c", new Object[]{this});
        }
        if (!byu.a(this.f17441a)) {
            ((HashMap) this.b).put("msg", this.f17441a);
        }
        return this.b;
    }
}
